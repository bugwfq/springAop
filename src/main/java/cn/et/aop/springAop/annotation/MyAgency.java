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
@Aspect//指定当前类为切面类
public class MyAgency {
	@Pointcut("execution(* cn.et.aop.springAop.annotation.*.*(..))")
	public void pointCut(){
		
	}
	@Before("pointCut()")
	public void before(){
		System.out.println("前置通知");
	}
	@After("pointCut()")
	public void after(){
		System.out.println("后置通知");
	}
	@AfterThrowing("pointCut()")
	public void throwing(){
		System.out.println("后置异常通知");
	}
	@AfterReturning("pointCut()")
	public void returning(){
		System.out.println("后置返回通知");
	}
	/**
	 * 注意环绕要传入参数 ProceedingJoinPoint pjp 
	 * 如果需要执行原方法的话需要调用 pjp.proceed();
	 * @param pjp
	 * @throws Throwable
	 */
	@Around("pointCut()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕前");
		pjp.proceed();
		System.out.println("环绕后");
	}
}
