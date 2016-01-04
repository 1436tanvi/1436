

public class Main {

	public class main{
		public void main(String[] args) {
			
		
		Elevator ev = new Elevator();
		Elevator ev1 = new Elevator(10);
		Elevator ev2 = new Elevator(23);
		ev.setFloor(2);
		ev1.setFloor(8);
		ev2.setFloor(12);
		System.out.println("You are on the " + ev.getFloor() + " floor");
		System.out.println("You are on the " + ev1.getFloor() + " floor");
		System.out.println("You are on the " + ev2.getFloor() + " floor");

		}
	}
}
		/*I will attempt to use arrays for keeping track of each and every floor per elevator object*/

		
