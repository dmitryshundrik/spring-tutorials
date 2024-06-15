package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AgentDecoratorAspect {
    @Pointcut("execution(public * org.example.model.Agent.speak())")
    public void decoratorPointcut() {
    }

    @Before("decoratorPointcut()")
    public void decorating(JoinPoint joinPoint) {
        System.out.print("James ");
    }
}
