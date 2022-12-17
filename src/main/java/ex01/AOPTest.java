package ex01;

import org.springframework.aop.framework.ProxyFactory;

public class AOPTest {

	public static void main(String[] args) {
		// 1. �ٽ� ������ ���� ��ü => Target
		ServiceImpl target=new ServiceImpl();
		
		// 2. ���� ���ɻ��� => Advice
		AroundAdvice advice = new AroundAdvice();
		
		// 3. Proxy��ü ��� ==> Target�� ��ü������ ���ΰ� �ִ� ��ü�� Proxy��� �Ѵ�.
		//    Proxy�� ���������� Target�� ȣ��������, �߰��� �ʿ��� ���ɻ��׵��� ���ļ� Target�� ȣ���ϵ��� �ۼ��ȴ�.
		//    Proxy�� ������ aop�����ӟp���� �ڵ����� �����Ǵ� ���(auto-proxy)����� ����Ѵ�

		ProxyFactory pf=new ProxyFactory();
		pf.setTarget(target);
		pf.addAdvice(advice);
		
		ServiceImpl proxy=(ServiceImpl)pf.getProxy();
		proxy.sayHello("����","ö��","�ϴ�","����");
	}

}
