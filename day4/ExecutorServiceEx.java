package day4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class RunnableTask1 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}
public class ExecutorServiceEx {

	public static void main(String[] args) {
		int n= Runtime.getRuntime().availableProcessors();
		System.out.println(n);
		ExecutorService service = Executors.newFixedThreadPool(n);// no.of Threads
		for(int i=1;i<=1000;i++) // task
			service.submit(new RunnableTask1());
		// no.of threads if fixed
		// n no. of task--> Non-Blocking queue
		// no RejectionHandlerException
	}

}
