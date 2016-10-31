package mycxf;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
	public static final String address = "http://192.168.10.24:9999/cxf0519_server";
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress(address);
		jaxWsProxyFactoryBean.setServiceClass(Say2.class);
		Say2 create = (Say2) jaxWsProxyFactoryBean.create();
		String sayYes = create.say2("bbb");
		System.out.println(sayYes);
	}
}
