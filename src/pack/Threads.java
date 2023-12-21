package pack;

public class Threads {

	public static void main(String[] args) {
		
		Thread myThead = new Thread(t1);
		myThead.start();
		
		new Thread(t2).start();
		
	}
	
	public static Runnable t1 = new Runnable() {
		
		@Override
		public void run() {
			
		System.out.println("t1");
			
		}
	};
	
	public static Runnable t2 = new Runnable() {
		
		@Override
		public void run() {
			
			System.out.println("t2");
			
		}
	};
	
}
