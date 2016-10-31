package mycxf;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server1 {
	public static final String address = "http://192.168.10.24:9999/cxf0519_server";
	public static void main(String[] args) {
		JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
		jaxWsServerFactoryBean.setAddress(address);
		jaxWsServerFactoryBean.setServiceClass(FirstCxfImpl.class);
		Server create = jaxWsServerFactoryBean.create();
		create.start();
	}
	
}
