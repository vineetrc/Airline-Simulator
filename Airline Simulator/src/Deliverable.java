
public abstract class Deliverable {

	private int payment;
	private String destination;
	private String name;


	public Deliverable (int pay,String destination, String name) {
		this.name =name;
		this.destination = destination;
		payment = pay;



	}
	
	public int getPayment() {
		
		return payment;
		
	}
	
	public String getDestination() {
		
		return destination;
		
	}

	public String getName() {
		
		return name;
		
	}
	
	public String toString() {
		
		return name + ":" + destination+":"+payment+"$";
	}
	


}
