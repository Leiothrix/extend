package com.paprika.extend;

/**
 * @author adam
 * @date 2019/5/28
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
class Super {
    String name;
    /**
     * 子类初始化时，先调用父类的构造方法，只有初始化之后才能调用类里的非静态方法
     * 一个类只要有父类，实例化的时候，一定是从顶级的父类开始创建
     * 没有祖宗何来后代，祖宗的一些东西都没准备好，后代怎么继承使用
     * 一个类如果显式定义了一个带参构造函数，而没有定义显式定义无参构造函数，那么无参构造函数就被取代了
     */
//    public Super(){
//
//    }
//    public Super(String name){
//        this.name = name;
//    }
    public void fun1(){
        System.out.println("this is class Super!" + name);
    }
}
class Sub extends Super{
    //    public Sub(String name){
//        this.name = name;
//    }
    @Override
    public void fun1(){
        System.out.println("this is class Sub!" + name);
    }
}
class SuerTest{
    public static void main(String[] args) {
        Super s = new Sub();
//        s.fun1();
    }
}
