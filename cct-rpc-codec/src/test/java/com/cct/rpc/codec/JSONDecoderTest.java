package com.cct.rpc.codec;

import junit.framework.TestCase;

public class JSONDecoderTest extends TestCase {

    public void testDecode() {
        Encoder encoder = new JSONEncoder();
        TestBean bean = new TestBean();
        bean.setName("cct");
        bean.setAge(18);
        byte[] bytes = encoder.encode(bean);
        Decoder decoder=new JSONDecoder();
        TestBean bean1=decoder.decode(bytes, TestBean.class);
        assertEquals(bean.getName(),bean1.getName());
        assertEquals(bean.getAge(),bean1.getAge());
    }
}