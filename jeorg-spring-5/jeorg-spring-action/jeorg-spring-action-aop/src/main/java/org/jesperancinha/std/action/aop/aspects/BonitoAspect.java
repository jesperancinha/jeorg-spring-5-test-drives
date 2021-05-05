package org.jesperancinha.std.action.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.jesperancinha.std.action.aop.beans.Bonito1Service;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Aspect("perthis(execution(public void org.jesperancinha.std.action.aop.methods.BonitoCatcher.catchByHandExtra()))")
//@Aspect
@Component
@Scope("prototype")
public class BonitoAspect {

    private final Bonito1Service bonito1Service;

    public BonitoAspect(Bonito1Service bonito1Service) {
        this.bonito1Service = bonito1Service;
    }

    /**
     * This advice won't executed
     * It is not included in the @Aspect value, which filters all its advices and pointcuts
     */
    @Before("execution(public org.jesperancinha.std.action.aop.model.Bonito org.jesperancinha.std.action.aop.methods.BonitoCatcher.catchByHand())")
    public void waitForFishCatch() {
        bonito1Service.waitForFishCatch();
    }

    @Before("execution(public void org.jesperancinha.std.action.aop.methods.BonitoCatcher.catchByHandExtra())")
    public void waitForFishNoCatch() {
        bonito1Service.waitForFishNoCatch();
    }
}
