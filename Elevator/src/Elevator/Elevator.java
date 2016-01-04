package Elevator;


	public class Elevator extends Main{
		private int floorLocation = 0;
		private int[] floor;

		public Elevator(){
		floor = new int[5];
		}

		public Elevator(int i){
		floor = new int[i];
		}
		/*makes sure that i can't be below levels 0 and cant be above levels that the elevator cant reach*/

		public void setFloor(int i){
		if(i < floor.length){
		this.floorLocation = i;
		}
		}
		public  int getFloor(){
		return this.floorLocation;
		
		}



}
