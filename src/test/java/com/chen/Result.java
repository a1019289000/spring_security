package com.chen;

import org.junit.Test;

import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Result {
    @Test
    public void t(){
        b x=new b();
        x.o();
    }
}
class a{
    int a=100;


    void print() {
        System.out.println("aaa");
    }
    void o(){
        this.print();
    }

}
class b extends a{
    void print(){
    }
}
