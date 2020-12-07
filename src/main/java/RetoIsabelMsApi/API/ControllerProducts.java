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
        new Product("avena", 3, "avena.jpg" )
    ));


    
}
