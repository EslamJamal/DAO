package task;
//import java.sql.DriverManager;
//import java.sql.Connection;

public class Product {
	private String Product_id;
	private String Type;
	private String Manufacturer;
	private String Prod_date;
	private String Exp_date;
	
	Product(String id){
		this.Product_id = id;		
	}
	
	public void setType(String type){
		this.Type = type;
	}
	
	public void setMan(String man){
		this.Manufacturer = man;
	}
	
	public void setPro(String prodate){
		this.Prod_date = prodate;
	}
	
	public void setExp(String expdate){
		this.Exp_date = expdate;
	}
	
	public String getID(){
		return(this.Product_id);
	}
	
	public String getType(){
		return(this.Type);
	}
	
	public String getMan(){
		return(this.Manufacturer);
	}
	
	public String getExp(){
		return(this.Exp_date);
	}
	
	public String getPro(){
		return(this.Prod_date);
	}

}
