package com.kc.bridge;

/**
 * @Description:两个方向的扩展，一个是具体的方向，一个是类型的方向扩展，这两个方向可能会有一定的交错，形成各种各样的组合
 * 桥接模式：子类会在两个维度上进行排列组合
 * @author: yuhongxi
 * @date:2018/10/27
 */
public class Gift {
    /**
     * 使用聚合代替了继承
     */
    GiftImpl giftImpl;
}
