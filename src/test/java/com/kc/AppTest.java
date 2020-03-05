package com.kc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.beans.Introspector;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String helloWorld = Introspector.decapitalize("HelloWorld");
        System.out.println(helloWorld);
        System.out.println(AppTest.class.getTypeName());
    }
}
