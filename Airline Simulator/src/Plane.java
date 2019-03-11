import java.util.ArrayList;

public class Plane {

	private int ID;
	private String type;
	private int cargoCapacity;
	private int passengerCapacity;
	private ArrayList<Deliverable> items;
	
	public Plane(int ID,String type,int cC,int cP,ArrayList<Deliverable> items) {
		
		this.ID =ID;
		this.cargoCapacity = cC;
		this.passengerCapacity = cP;
		this.items = items;
		this.type =type;
		
		
	}
	
	public void addDeliverable(Deliverable job) {
		
		if(items.size()<=this.passengerCapacity-1) {
			
			items.add(job);
		}
		else {
			
			System.out.println("Out of Space");
		}
		
	}
	
	
	public String toString() {
		
		String result =ID + ":"  + type+": Jobs>";
		for(Deliverable item:items) {
			
			result+=item.toString()+">";
			
		}
		return result;
		
	}

	public ArrayList<Deliverable> getDeliverable() {
		// TODO Auto-generated method stub
		return items ;
	}
	
	
	
	
	
	
}
