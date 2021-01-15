package com.testpackage.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.testpackage.dto.ThreeDShow;

public class AspectClass {
	
	public void beforeShow(JoinPoint jp) {
		System.out.println("####################################################################");
		System.out.println("BEFORE SHOW");
		System.out.println("Show Name:"+((ThreeDShow)jp.getArgs()[0]).getName());
		System.out.println("Take Ticket Before:"+jp.getSignature().getName());
	}	
		
	public void afterShow(JoinPoint jp) {
		System.out.println("####################################################################");
		System.out.println("AFTER SHOW");
		System.out.println("Show Name:"+((ThreeDShow)jp.getArgs()[0]).getName());
		System.out.println("Please Visit Again After:"+jp.getSignature().getName());
	}
	
	public void aroundShow(ProceedingJoinPoint  pjp) throws Throwable {
		System.out.println("####################################################################");
		System.out.println("AROUND BEFORE SHOW");
		System.out.println("Show Name:"+((ThreeDShow)pjp.getArgs()[0]).getName());
		System.out.println("Please Take you 3D Glasses Before the Show");
		pjp.proceed();
		System.out.println("####################################################################");
		System.out.println("Show Name:"+((ThreeDShow)pjp.getArgs()[0]).getName());
		System.out.println("AROUND AFTER SHOW");
		System.out.println("Please Submit Back your 3D Glasses After the Show");
	}
	
	public void afterThrowingShow(JoinPoint jp,Exception exception) {
		System.out.println("####################################################################");
		System.out.println("AFTER THROWING SHOW");
		System.out.println("Show Name:"+((ThreeDShow)jp.getArgs()[0]).getName());
		System.out.println("PLease Make Sure you have Enough Funds ,So as to avoid "+exception.getMessage());
		
	}
	
	public void afterReturningShow(JoinPoint jp,Object returnObject) {
		System.out.println("####################################################################");
		System.out.println("AFTER RETURNING SHOW");
		System.out.println("Show Name:"+((ThreeDShow)jp.getArgs()[0]).getName());
		System.out.println("PLease give Feedback for ur Showtime"+(String)returnObject);
		
	}
	

}
