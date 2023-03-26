package com.cct.rpc.codec;

/**
 * 序列化（对象转为二进制数组）
 */
public interface Encoder {
    byte[] encode(Object obj);
}
