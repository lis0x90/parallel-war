package nc.tests.splitwars.war;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.jboss.logging.Logger;

import nc.tests.splitwars.ejb.SampleServiceBean;

@WebListener
public class ApplicationLifecycleListener implements ServletContextListener {
	private static Logger log = Logger.getLogger(ApplicationLifecycleListener.class);

	@Inject
	SampleServiceBean simpleService;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		log.info(">>>> Start Web1 Module");
		
		simpleService.hello("Web1");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
}
