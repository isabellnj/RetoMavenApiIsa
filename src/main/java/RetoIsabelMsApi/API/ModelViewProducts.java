package RetoIsabelMsApi.API;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ModelViewProducts {
    
    @GetMapping("/productoshtml")
    public ModelAndView products(){
        ModelAndView modelo=new ModelAndView("listProducts");
        modelo.addObject("products", ProductsController.listado);
        modelo.addObject("order", OrdersController.orderById(1));
       
        return modelo;
    }

   
    


}
