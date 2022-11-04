package org.atoz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    // * = wildcard for any return type
    @Before("execution(* org.atoz.ShoppingCart.checkout(..))")
    public void preCheckout(JoinPoint jp) {
        System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("logger before checkout(), arg = " + arg);
    }

    // any return type, any package, any class of which checkout() method is called
    @After("execution(* *.*.*.checkout(..))")
    public void postCheckout() {
        System.out.println("logger after checkout()");
    }

    @Pointcut("execution(* org.atoz.ShoppingCart.quantity(..))")
    public void afterReturnPointCut() {

    }

    @AfterReturning(pointcut = "afterReturnPointCut()", returning = "retVal")
//    @After("afterReturnPointCut()")
    public void afterReturn(/*String retVal*/) {
        System.out.println("After Return: ");
//        System.out.println("After Return: " + retVal);
    }
}
