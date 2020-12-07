package RetoIsabelMsApi.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle.Control;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import RetoIsabelMsApi.MODEL.Order;
import RetoIsabelMsApi.MODEL.Order.estados;






@RestController
public class ControllerOrders {
    

    public static List<Order>listado = new ArrayList<Order>(Arrays.asList(
        new Order("20/11/2020", "isabel", estados.CANCELADO),
        new Order("01/11/2020", "pilar", estados.ACEPPTADO ),
        new Order("01/11/2020", "nuria", estados.CANCELADO )
    ));





    //Ejercicio3 --> sacar lista
    @GetMapping("/orders")
    public List<Order> getall(){

        return listado;
    }


  
  
   






   
}