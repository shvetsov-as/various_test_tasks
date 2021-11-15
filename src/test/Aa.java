/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author User
 */
public class Aa {
    {
       System.out.println ("1");
    }
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Double i3 = 10d;
        Double i4 = 10d;
        
        System.out.println (i1 == i2);
        System.out.println (i3 == i4);
        
        class Clazz{
            int x = 1;
            int getx(){
                return x;
            }
        }
        
        class Subclass extends Clazz{
            int x = 2;
            @Override
            int getx(){
                return x;
            }
        }
        
        Clazz c = new Subclass();
        
        System.out.println(c.x +"  "+ c.getx());
        
    }
    static{
       System.out.println ("3");
       
    }
            
}
