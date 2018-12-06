package com.kc.singleton;

import com.kc.singleton.example.Singleton5;

/**
 * @Description:
 * @author: yuhongxi
 * @date:2018/10/2
 */
public class Client {
    public static void main(String[] args) {
        Singleton5.uniqueInstance.method();
    }
}
