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
import RetoIsabelMsApi.MODEL.OrderFull;
import RetoIsabelMsApi.MODEL.OrderProduct;
import RetoIsabelMsApi.MODEL.OrderProductFull;
import RetoIsabelMsApi.MODEL.Product;
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


  

    //Devuelve la información de un pedido concreto y sus productos asociados a través del ID del pedido.

   
   @GetMapping("/order/{id}")
   public static OrderProductFull orderById(@PathVariable("id") final int id) {
      OrderProduct o1= new OrderProduct();
      int cant = 0;
       for (final Order order: listado){
           if (order.getId() == id){
               ArrayList<Product> products= new ArrayList<Product>();
               
               for (final OrderProduct orderProduct : ControllerOrderProduct.listado) {
                   if (orderProduct.getOrder().getId() == id) {
                       

                       products.add(orderProduct.getProduct());
                       cant = orderProduct.getQuantity();
                       
                    
                   }
               }
               return new OrderProductFull(order, products, cant );
               
           }
        }

        throw new ElementNotFound();
       
   }



   //-	Permite insertar un pedido con los productos y la cantidad de cada producto deseada. Se tendrá que devolver, 
   //al menos, el ID en la petición para poder comprobar que toda la información se ha insertado correctamente.

   @PostMapping("/orderp")
   public int add(@RequestBody OrderFull order) {
       Order o = new Order(order.getDate(), order.getName(), order.getState());
       listado.add(o);
       for (Map.Entry<Integer, Integer> producto : order.getProductos().entrySet()) {
           Product p = ControllerProducts.getById(producto.getKey());
           OrderProduct op = new OrderProduct(o, p, producto.getValue());
           ControllerOrderProduct.listado.add(op);
       }

      return o.getId();
   }


   //-	Permite eliminar un pedido. Al eliminar un pedido también se eliminarán los productos vinculados a ese pedido.

   @DeleteMapping("/orders/{id}")
   public static Order getById(@PathVariable("id") final int id) {
       for (Order order : listado) {
           if (order.getId() == id) {
               for (int i = 0; i < ControllerOrderProduct.listado.size(); i++) {
                   OrderProduct orderProduct = ControllerOrderProduct.listado.get(i);
                   if (orderProduct.getOrder().getId() == id) {
                       ControllerOrderProduct.listado.remove(orderProduct);
                   }
               }
               listado.remove(order);
               return null;
           }
       }

       return null;
   }


   ///-	En caso de que se proporcione un ID que no exista o haya algún error, 
   //la petición debería devolver un error HTTP que identifique adecuadamente este error.

   @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "id no existe")
   public static class ElementNotFound extends RuntimeException{

   }
  
   






   
}