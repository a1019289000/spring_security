package com.chen;

//import ch.qos.logback.core.net.SyslogOutputStream;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.mgt.DefaultSecurityManager;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.realm.SimpleAccountRealm;
//import org.apache.shiro.subject.Subject;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class AppTest {
    public static void main(String[] args){
        Map map=new HashMap();
        Runnable r=()-> System.out.println();
    }

//    public static void main(String[] args) {
//        DefaultSecurityManager securityManager = new DefaultSecurityManager();
//        SimpleAccountRealm simpleAccountRealm=new SimpleAccountRealm();
//        simpleAccountRealm.addAccount("chen","1234565","admin","user");
//        securityManager.setRealm(simpleAccountRealm);
//        SecurityUtils.setSecurityManager(securityManager);
//        Subject subject=SecurityUtils.getSubject();
//        UsernamePasswordToken token=new UsernamePasswordToken("chen","123456");
//        System.out.println();
//
//        try {
//            subject.login(token);
//            System.out.println(subject.hasRole("admin"));
//        }catch (Exception e){
//            System.out.println(e);
//        }
//               // System.out.println(e);
//
//
//    }
}