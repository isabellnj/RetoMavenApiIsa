package RetoIsabelMsApi.API;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import RetoIsabelMsApi.MODEL.OrderProductFull;
import RetoIsabelMsApi.MODEL.ProductCantidad;
@Controller
public class ModelViewProducts {
    
    @GetMapping("/productoshtml")
    public ModelAndView products(){
        ModelAndView modelo=new ModelAndView("listProducts");
        OrderProductFull order = OrdersController.orderById(1);
        ArrayList<Integer> ids = new ArrayList<Integer>();
        
        for (final ProductCantidad producto: order.getProducts()){
            ids.add(producto.getProduct().getId());
        }

        modelo.addObject("products", ProductsController.listado);
        modelo.addObject("order", order);
        modelo.addObject("ids", ids);
        return modelo;
    }

   
    


}
