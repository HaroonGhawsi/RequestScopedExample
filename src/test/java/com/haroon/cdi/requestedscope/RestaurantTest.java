package com.haroon.cdi.requestedscope;

import static org.junit.Assert.assertEquals;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RestaurantTest {

    private static String TOMATO_SOUP = "Tomato Soup";
    private static final String POTATO_SOUP = "Potato Soup";
    private EJBContainer container;

    @EJB
    private Waiter joe;

    @Before
    public void startContainer() throws Exception {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
    }

    @Test
    public void orderSoup(){
        String soup = joe.orderSoup(TOMATO_SOUP);
        assertEquals(TOMATO_SOUP, soup);
        soup = joe.orderSoup(POTATO_SOUP);
        assertEquals(POTATO_SOUP, soup);
    }

    @After
    public void closeContainer() throws Exception {
        container.close();
    }
}
