
public class stackImplementation {
	
	private int n;
	
	private int top = -1 ;
	private int Storage[];
		
	public stackImplementation(int n) {
		super();
		this.n = n;
		Storage = new int[n] ;
	}
	
	

	public boolean pushS(int num){

		if(top == (n - 1)){
			return false;
		}
		else{
			Storage[++top]=num;
		}
			
		
		return true;
	}
	
	
	public  boolean popS(){
		
		if(top == -1){
			return false;
			
		}
		else{
			top--;
		
		}
		return true;
	}
	
		
		public void  displayStack(){
			
			
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	