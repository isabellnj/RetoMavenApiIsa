package RetoIsabelMsApi.MODEL;

import java.util.ArrayList;
import java.util.HashMap;

import RetoIsabelMsApi.MODEL.Order.estados;



//import com.example.RetoIsabelMS.MODEL.Order.estados;

public class ProductFull {
    
   



   /// private static int count=0;
    
    private String Date; 
    private String Name; 
    private estados State;
    private HashMap<Integer, Integer> productos;

    

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public estados getState() {
        return State;
    }

    public void setState(estados state) {
        State = state;
    }

    public HashMap<Integer, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Integer, Integer> productos) {
        this.productos = productos;
    }

    
    

 

	

}