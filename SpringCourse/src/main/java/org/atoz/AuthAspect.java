package org.atoz;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {
    @Pointcut("within(org.atoz..*)")
    public void authenticatingPointCut() {
        System.out.println("authenticating pointcut");
    }

    @Pointcut("within(org.atoz..*)")
    public void authorizingPointCut() {
        System.out.println("authorizing pointcut");
    }

    @Before("authenticatingPointCut() && authorizingPointCut()")
    public void authenticate() {
        System.out.println("Authenticated");
    }
}
