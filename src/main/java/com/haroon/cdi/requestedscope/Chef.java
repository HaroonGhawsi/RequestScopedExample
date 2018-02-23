package com.haroon.cdi.requestedscope;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class Chef {

    @Inject
    private Soup soup;

    public Soup prepareSoup() {
        return soup;
    }
}
