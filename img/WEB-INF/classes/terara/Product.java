package terara;

import java.io.Serializable;

public class Product implements Serializable{
	private String name;
	private String price;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}
}