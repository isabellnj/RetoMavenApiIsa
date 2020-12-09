package RetoIsabelMsApi.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import RetoIsabelMsApi.MODEL.OrderProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class OrderProductController {
  
    public static List<OrderProduct> listado = new ArrayList<OrderProduct>(Arrays.asList(
        new OrderProduct(OrdersController.listado.get(0), ProductsController.listado.get(0), 4),
        new OrderProduct(OrdersController.listado.get(1), ProductsController.listado.get(1), 40),
        new OrderProduct(OrdersController.listado.get(0), ProductsController.listado.get(1), 400),
        new OrderProduct(OrdersController.listado.get(1), ProductsController.listado.get(0), 444)
    ));

   

    

         //Ejercicio3 --> sacar lista
    @GetMapping("/ordersProducts")
    public List<OrderProduct> getall(){

        return listado;
    }
    

    


   
    
}
