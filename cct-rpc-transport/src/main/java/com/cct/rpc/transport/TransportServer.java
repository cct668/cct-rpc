package com.cct.rpc.transport;

/**
 * 1、启动、监听
 * 2、接受请求
 * 3、关闭监听
 */
public interface TransportServer {
    void start();
    void stop();

}
