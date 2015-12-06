package proxy2;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
	
	public static Object getProxy(Object target) throws Exception{
		MyInvokationHandler handler = new MyInvokationHandler();
		handler.setTarget(target);
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
	}

}
