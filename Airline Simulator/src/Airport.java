import java.util.ArrayList;

public class Airport {

	private String city;
	private int type;
	ArrayList<Deliverable> jobs;
	ArrayList<Plane> planes;

	public Airport(ArrayList<Plane> planes, ArrayList<Deliverable> jobs,String city, int type) {
		this.city =city;
		this.type=type;
		this.jobs = jobs;
		this. planes= planes;


	}

	public void loadPlane(int ID , int jobIndex) {

		planes.get(ID).addDeliverable(jobs.get(jobIndex));
		jobs.remove(jobIndex);

	}

	public void departPlane(Airport destination,Plane plane) {

		destination.addPlane(plane);
		
		for(int  i=0; i< plane.getDeliverable().size(); i++) {
			
			if(plane.getDeliverable().get(i).getDestination().equals(destination.getName())) {
				// add money to bank account
				plane.getDeliverable().remove(i);
				i--;
				
			}
			
			
		}
		
		
		
		this.removePlane(plane);


	}

	public void addPlane(Plane plane) {

		planes.add(plane);

	}

	public void removePlane(Plane plane) {

		planes.remove(plane);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return city;
	}

	public String toString() {

		String result= city +":"+type + "\n Jobs>" ;

		for(Deliverable item:jobs) {

			result+=item.toString()+">";

		}
		 result+="\n";
		 for(Plane plane:planes) {

				result+=plane.toString()+">";

			}
		return result;
		 

	}
	
	
	public ArrayList<Plane> getPlanes(){
		
		
		return planes ;
	}


}
