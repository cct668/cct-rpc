package com.cct.rpc.common.utils;

import com.cct.AppTest;
import junit.framework.TestCase;

import java.lang.reflect.Method;

public class ReflectionUtilsTest extends TestCase {

    public void testNewInstance() {
        AppTest t=ReflectionUtils.newInstance(AppTest.class);
        assertNotNull(t);
    }

    public void testGetPublicMethods() {
        Method[] methods=ReflectionUtils.getPublicMethods(AppTest.class);
        assertEquals(1, methods.length);
        String mname=methods[0].getName();
        assertEquals("b",mname);
    }

    public void testInvoke() {
        Method[] methods=ReflectionUtils.getPublicMethods(AppTest.class);
        Method b=methods[0];
        AppTest t=new AppTest();
        Object r=  ReflectionUtils.invoke(t,b);
        assertEquals("b",r);
    }
}