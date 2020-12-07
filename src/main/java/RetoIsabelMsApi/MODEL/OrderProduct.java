package RetoIsabelMsApi.MODEL;

import java.util.ArrayList;
import java.util.List;

public class OrderProduct {
    public Order order;
    public Product product;
    private int quantity;
    private static int count=0;
    private int id; 


    public OrderProduct() {
	}

    
    //Constructor
    public OrderProduct(Order _order, Product _product, int _quantity){
        this.id = count++;
        this.order = _order;
        this.product = _product;
        this.quantity = _quantity;
       
    }








	public Order getOrder() {
        return order;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    

    public void setOrder(Order order) {
        this.order = order;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
