package asynchTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({"classpath:/META-INF/spring/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AsynchTest {

	@Autowired    
    private AsynchService asynchService;
	
	@Test
	public void test() {
		asynchService.synchTest();
		asynchService.noNameTest();
		asynchService.nameTest();
	}

}
