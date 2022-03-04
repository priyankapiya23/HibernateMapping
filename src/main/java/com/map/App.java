package com.map;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Item i1=new Item();
        Item i2=new Item();
        i1.setItem_id(1);
        i1.setItem_price(45);
        i1.setItem_desc("shoe");
        i2.setItem_id(2);
        i2.setItem_price(46);
        i2.setItem_desc("tshirt");
        
        Cart c1=new Cart();
        Cart c2=new Cart();  
        c1.setCart_id(2);
        c1.setCart_total(3);
        c2.setCart_id(5);
        c2.setCart_total(5);
        
        List<Cart> list1=new ArrayList<Cart>();
        List<Item> list2=new ArrayList<Item>();
        list1.add(c1);
        list1.add(c2);
        list2.add(i1);
        list2.add(i2);
        i1.setC1(list1);
        c1.setI1(list2);
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        s.save(i1);s.save(i2);s.save(c1);s.save(c2);
        tx.commit();
        s.close();
        factory.close();
        
    }
}
