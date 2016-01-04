
public class Keyboard extends Floors {
	 public static void ElevatorUp()
	    {
	        System.out.println("The elevator is on it's way up...");

	        for (person = choice1; choice1>=floor; floor++)

	            System.out.println(floor);

	        System.out.println("The elevator has arrived");
	    }

	    public static void ElevatorDown()
	    {
	        System.out.println("The elevator is on it's way down...");
	        for (person = choice1; choice1<=floor; floor--)

	            System.out.println(floor);

	        System.out.println("the elevator has arrived:");
	    }

		public static int readInt() {
			// TODO Auto-generated method stub
			return 0;
		}
}
