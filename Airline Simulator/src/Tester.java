import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<Deliverable> jobs=new ArrayList<Deliverable>();
		jobs.add(new Passenger(100, "NYC" , "Bob"));
		jobs.add(new Passenger(200, "LAX" , "Mike"));
		jobs.add(new Passenger(100, "NYC" , "Nate"));
		
		ArrayList<Plane> planes = new ArrayList<Plane>();
		planes.add(new Plane(0,"2-seater",0,2, new ArrayList<Deliverable>()));
		
		Airport SFO = new Airport(planes, jobs, "SFO", 1);
		
		
		SFO.loadPlane(0, 1);
		SFO.loadPlane(0, 0);
		
		System.out.println(SFO);
		Airport NYC = new Airport(new ArrayList<Plane>(), new ArrayList<Deliverable>(),"NYC",1 );		
		
		SFO.departPlane(NYC, SFO.getPlanes().get(0));
		System.out.println(NYC);
	}

}
