package cn.et.aop.springAop.bean_xml;

import org.aspectj.lang.ProceedingJoinPoint;

//可以使用注解@Component
public class MyAgency {
	public void before(){
		System.out.println("前置通知");
	}
	public void after(){
		System.out.println("后置通知");
	}
	public void throwing(){
		System.out.println("后置异常通知");
	}
	public void returning(){
		System.out.println("后置返回通知");
	}
	/**
	 * 注意环绕要传入参数 ProceedingJoinPoint pjp 
	 * 如果需要执行原方法的话需要调用 pjp.proceed();
	 * @param pjp
	 * @throws Throwable
	 */
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕前");
		pjp.proceed();
		System.out.println("环绕后");
	}
}
