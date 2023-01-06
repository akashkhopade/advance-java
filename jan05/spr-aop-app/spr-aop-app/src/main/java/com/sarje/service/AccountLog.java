package com.sarje.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AccountLog {
	
	@Pointcut("execution(* com.sarje.dao.AccountDao.create(..))")
	public void pointCut1() {
		
	}
	
	@Before("pointCut1()")
	public void beforeAdvice() {
		System.out.println("before advice called");
	}
	
	@Pointcut("execution(* com.sarje.dao.AccountDao.deposite(..))")
	public void pointCut2() {
		
	}
	
	@After("pointCut2()")
	public void afterAdvice() {
		System.out.println("after advice called");
	}
	
	@Pointcut("execution(* com.sarje.dao.AccountDao.withdraw(..))")
	public void pointCut3() {
		
	}
	
	@Around("pointCut3()")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before around advice called");
		pjp.proceed();
		System.out.println("after around advice called");
	}
	
	@Pointcut("execution(* com.sarje.dao.AccountDao.detail(..))")
	public void pointCut4() {
		
	}
	
	@AfterReturning("pointCut4()")
	public void afterReturningAdvice() {
		System.out.println("after returing advice called");
	}
	
	@Pointcut("execution(* com.sarje.dao.AccountDao.block(..))")
	public void pointCut5() {
		
	}
	
	@AfterThrowing("pointCut5()")
	public void afterThrowingAdvice() {
		System.out.println("after exception advice called");
	}
}
