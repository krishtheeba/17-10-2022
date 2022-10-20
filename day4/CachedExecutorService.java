package day4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedExecutorService {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();// no no. of thread
		// infinite thread based on task
		
		for(int i=1;i<=1000;i++) // task
			service.submit(new RunnableTask1());
		// io intensive operation
		//cpu intensive oprn
	}

}
