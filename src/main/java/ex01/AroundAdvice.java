package ex01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor{
	
	@Override
	public Object invoke(MethodInvocation invo) throws Throwable{
		Object obj=null;
		System.out.println("I am AroundAdvice1: "+invo.getMethod()+" ȣ�� �� =============");
		obj=invo.proceed();// �޼��尡 ����
		System.out.println("I am AroundAdvice2: "+invo.getMethod()+" ȣ�� �� =============");
		return obj;
		
	}
	
	
}
