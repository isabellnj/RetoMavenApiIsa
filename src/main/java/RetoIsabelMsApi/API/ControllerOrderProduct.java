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
public class ControllerOrderProduct {
  
    public static List<OrderProduct> listado = new ArrayList<OrderProduct>(Arrays.asList(
        new OrderProduct(ControllerOrders.listado.get(0), ControllerProducts.listado.get(0), 4),
        new OrderProduct(ControllerOrders.listado.get(1), ControllerProducts.listado.get(1), 40),
        new OrderProduct(ControllerOrders.listado.get(0), ControllerProducts.listado.get(1), 400),
        new OrderProduct(ControllerOrders.listado.get(1), ControllerProducts.listado.get(0), 444)
    ));

   

    

   
    

    


   
    
}
