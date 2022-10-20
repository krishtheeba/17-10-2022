package day4;

class RunnableTask implements Runnable{

	@Override
	public void run() {//task
		System.out.println("Begin");
		for(int i=1; i<=10;i++)
		System.out.println("Data "+i);
		
		System.out.println("Done");
	}
	
}

public class ThreadEx extends Thread{
	@Override
	public void run() {//task
		System.out.println("Begin");
		for(int i=1; i<=10;i++)
		System.out.println("Data "+i);
		
		System.out.println("Done");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread");
	//	Thread t1 = new Thread(new threadIpl());
		//t1.run();
	//	t1.start();
		Thread t1 = new Thread(new ThreadEx());
		t1.start();
		for(int i=1; i<=10;i++)
			System.out.println("Line number "+i);
		
		System.out.println("End of Main");
		
		/* interface runnable{
		 * run()}
		 * 
		 * class Thread implements runnable
		 * 
		 * class A extends Thread
		 * 
		 */
		
	}

}
