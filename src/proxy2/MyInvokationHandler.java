package proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvokationHandler implements InvocationHandler {
	
	//��Ҫ������Ķ���
	private Object target;
	
	public void setTarget(Object target){
		this.target = target;
	}

	//ִ�ж�̬�����������з���ʱ�����ᱻ�滻��ִ�����µ�invke����
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		TxUtil tx = new TxUtil();
		tx.beginTx();
		Object result = method.invoke(target, args);
		tx.endTx();
		return result;
	}

}
