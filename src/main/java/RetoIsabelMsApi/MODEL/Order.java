package RetoIsabelMsApi.MODEL;

public class Order {
    
   


    public enum estados {
        ACEPPTADO,
        CANCELADO,
        ENCURSO,
        ENTREGADO,
        ENVIADO;

      }



    private static int count=0;
    private int id; 
    private String Date; 
    private String Name; 
    private estados State;
    
    public Order(final String _date, final String _name, final estados _state){
        super();
        this.id = count++;
        this.Date = _date; 
        this.Name = _name; 
        this.State = _state;
    }

 

	

    public Order (Order order){

       
        this.id = count++;
        this.Date = order.Date;
        this.Name = order.Name; 
        this.State = order.State;


    }
	

    public Order() {
	}





	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    

    public estados getState() {
        return State;
    }

    public void setState(estados state) {
        State = state;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Order [Date=" + Date + ", Name=" + Name + ", State=" + State + ", id=" + id + "]";
    }

    
    
    



}
