package aop;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AOPAnnotation {
	public void before() {
		System.out.println("------------->AOP before<------------");
	}

	public void after() {
		System.out.println("------------->AOP after<------------");
	}

}
