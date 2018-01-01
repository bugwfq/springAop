package cn.et.aop.springAop.bean_xml;

import org.aspectj.lang.ProceedingJoinPoint;

//����ʹ��ע��@Component
public class MyAgency {
	public void before(){
		System.out.println("ǰ��֪ͨ");
	}
	public void after(){
		System.out.println("����֪ͨ");
	}
	public void throwing(){
		System.out.println("�����쳣֪ͨ");
	}
	public void returning(){
		System.out.println("���÷���֪ͨ");
	}
	/**
	 * ע�⻷��Ҫ������� ProceedingJoinPoint pjp 
	 * �����Ҫִ��ԭ�����Ļ���Ҫ���� pjp.proceed();
	 * @param pjp
	 * @throws Throwable
	 */
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����ǰ");
		pjp.proceed();
		System.out.println("���ƺ�");
	}
}
