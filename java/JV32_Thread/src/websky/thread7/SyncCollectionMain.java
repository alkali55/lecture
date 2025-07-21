package websky.thread7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncCollectionMain {

	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 2; i++) {
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					
					while(true) {
						synchronized (list) {
//							list.clear();
							list.add(100);
							System.out.println("add 후");
							list.remove(0);
							System.out.println("remove 후");
						}
					}
				}
			});
		}
		
	}

}
