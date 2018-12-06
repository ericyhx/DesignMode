package com.kc.observerpattern.example4;

import java.util.EventListener;
import java.util.EventObject;

/**
 * @Description:监听器接口
 * @author: yuhongxi
 * @date:2018/10/6
 */
public interface DemoListener extends EventListener {
    /**
     * 事件处理
     * @param event
     */
    void handleEvent(EventObject event);
}
