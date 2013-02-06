package asynchTest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsynchService {

	public void synchTest(){
		System.out.println("Ran synch.");
	}
	@Async
	public void noNameTest(){
		System.out.println("Ran asynch with out name set");
	}
	
	@Async(value="myExecutor")
	public void nameTest(){
		System.out.println("Ran asynch with out name set");
	}
}
