package cn.et.aop.springAop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect//ָ����ǰ��Ϊ������
public class MyAgency {
	@Pointcut("execution(* cn.et.aop.springAop.annotation.*.*(..))")
	public void pointCut(){
		
	}
	@Before("pointCut()")
	public void before(){
		System.out.println("ǰ��֪ͨ");
	}
	@After("pointCut()")
	public void after(){
		System.out.println("����֪ͨ");
	}
	@AfterThrowing("pointCut()")
	public void throwing(){
		System.out.println("�����쳣֪ͨ");
	}
	@AfterReturning("pointCut()")
	public void returning(){
		System.out.println("���÷���֪ͨ");
	}
	/**
	 * ע�⻷��Ҫ������� ProceedingJoinPoint pjp 
	 * �����Ҫִ��ԭ�����Ļ���Ҫ���� pjp.proceed();
	 * @param pjp
	 * @throws Throwable
	 */
	@Around("pointCut()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����ǰ");
		pjp.proceed();
		System.out.println("���ƺ�");
	}
}
