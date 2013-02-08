package asynchTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		AsynchService asynchService = ac.getBean(AsynchService.class);
		asynchService.synchTest();
		asynchService.nameTest();
		asynchService.noNameTest();
		
	}

}
