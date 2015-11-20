/**
 * 
 */
package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author nchinthakindi
 *
 */
@Aspect
public class LogginAspect {

	
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint)
	{

		Object args[] = joinPoint.getArgs();
		System.out.println("Enter into "+joinPoint.toLongString());
		
		for (Object obj : args) 
		{
			
			System.out.println("Args : "+obj);
		}
	}
	
	@Around("@annotation(aspect.Loogable)")
	public Object myaroundAdvice(ProceedingJoinPoint proceedingJoinPoint)
	{
		Object object = null;
		try 
		{
		 System.out.println("Before advice");
		 object = proceedingJoinPoint.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return object;
	}
	
	@After("allCircleMethods()")
	public void pointCut(JoinPoint joinPoint)
	{
		System.out.println("Exit from "+joinPoint.toLongString());
	}
	
	@Pointcut("execution( * model.*.get*(..))")
	public void allGetter(){}
	
	@Pointcut("within(model.Circle)")
	public void allCircleMethods(){}
	
}
