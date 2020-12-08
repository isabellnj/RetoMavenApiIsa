package RetoIsabelMsApi.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import RetoIsabelMsApi.MODEL.Product;



@RestController
public class ControllerProducts {
    public static ArrayList<Product>listado = new ArrayList<Product>(Arrays.asList(
        new Product("helado", 2, "helado.jpg"),
        new Product("avena", 3, "avena.jpg" ),
        new Product("yogur de avena", 4, "avena.jpg"),
        new Product("yogur de helado", 5, "helado.jpg"),
        new Product("helado de avena", 5, "helado.jpg")
    ));


    //Ejercicio3 --> sacar lista
    @GetMapping("/products")
    public List<Product> getall(){

        return listado;
    }

    @GetMapping("/producto/{id}")
    public static Product getById(@PathVariable("id") final int id) {
        for (final Product producto: listado){
            if (producto.getId() == id){
                return producto;                
            }
        }
        return null;
    }
    
}
