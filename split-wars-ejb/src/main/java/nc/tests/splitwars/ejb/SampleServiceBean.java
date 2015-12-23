package nc.tests.splitwars.ejb;

import javax.ejb.Local;
import javax.ejb.Stateless;

import org.jboss.logging.Logger;

@Local
@Stateless
public class SampleServiceBean {
	private static final Logger log = Logger.getLogger(SampleServiceBean.class);
	public void hello(String name) {
		log.info("Hello " + name + "!");
	}
}
