package OOPTest;

public class Book {
	private String name;
	private double price;
	private int qty;
Book(String name,double price,int qty){
	this.name=name;
	this.price=price*qty;
	this.qty=qty;	
}
public void showb() {
	System.out.print("Book : "+name+"\nPrice : "+price+"\nQTY : "+qty);
}
}
