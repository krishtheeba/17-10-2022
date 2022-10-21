package day5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx {

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());

		//service.schedule(new Task(), 10, TimeUnit.SECONDS);// once
		
		service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);// again and again 
		// 15----T(15)---T(15)
		service.scheduleWithFixedDelay(new Task(), 15, 10, null);
		//   15---iter(1)---10 ----iter(2)_---10
		// shutdown(),await
		// 
	}

}

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
}