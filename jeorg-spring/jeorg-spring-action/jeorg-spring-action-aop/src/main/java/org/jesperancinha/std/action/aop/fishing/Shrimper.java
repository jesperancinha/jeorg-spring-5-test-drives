package org.jesperancinha.std.action.aop.fishing;

import org.jesperancinha.std.action.aop.model.Shrimp;

public class Shrimper extends Fisher {

    private  Long id = (long)(Math.random()+1000L);

    public Shrimp harvest() {
        return null;
    }

    public void secretHarvest(){

    }

    public Long getId() {
        return id;
    }
}
