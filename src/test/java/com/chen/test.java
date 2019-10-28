package com.chen;

import org.junit.Test;

public class test {
    @Test
    public void t() throws CloneNotSupportedException {
        A aa=new A();

        A bb=(A) aa.clone();
        aa.x=111;
        System.out.println(aa.x);
        System.out.println(bb.x);
    }
}
class A implements Cloneable{
    int x=100;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}