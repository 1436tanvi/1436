

public class control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean completed ;
		stackImplementation stackI = new stackImplementation(7);
		
		stackI.displyStack();
		
		stackI.pushS(5);
		stackI.pushS(7);
		stackI.pushS(6);
		stackI.pushS(4);
		stackI.pushS(3);
		stackI.pushS(1);
		stackI.pushS(9);
		completed =stackI.pushS(9);
		if(completed==false){
			System.out.println("Stack is full");
		}
		stackI.displyStack();
		completed=stackI.popS();
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackI.displyStack();
		
		stackUsingList stackList = new stackUsingList();
		System.out.println("Stack implementation using Array list");
		stackList.disply();
		stackList.pushIn(4);
		stackList.pushIn(5);
		stackList.pushIn(7);
		stackList.pushIn(9);
		stackList.disply();
		
		completed =stackList.popOut();
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackList.disply();
		
		
		
		
		
		stackUsingLinkedList stackLink = new stackUsingLinkedList();
		System.out.println("Stack implementation using link list");
		stackLink.disply();
		stackLink.addS(4);
		stackLink.addS(5);
		stackLink.disply();
		completed =stackLink.removeS();
		
		if(completed==false){
			System.out.println("Stack is empty");
		}
		stackLink.disply();
	}

}

