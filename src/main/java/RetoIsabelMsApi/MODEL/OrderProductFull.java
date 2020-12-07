package RetoIsabelMsApi.MODEL;

import java.util.ArrayList;
import java.util.HashMap;

//import com.example.RetoIsabelMS.MODEL.Order.estados;

public class OrderProductFull {



    

   /// private static int count=0;
    
  
   private Order order;
   private ArrayList<Product>products;
   private int cantidad;


   public OrderProductFull() {
    }


   
    public OrderProductFull(Order order, ArrayList<Product> products, int i) {
        this.order = order;
        this.products = products;
        this.cantidad = i;
    }
   



   public Order getOrder() {
       return order;
   }

   public void setOrder(Order order) {
       this.order = order;
   }

   public ArrayList<Product> getProducts() {
       return products;
   }

   public void setProductos(ArrayList<Product> products) {
       this.products = products;
   }

   public int getCantidad() {
       return cantidad;
   }

   public void setCantidad(int cantidad) {
       this.cantidad = cantidad;
   }

 
  


   


   
   


    
}
