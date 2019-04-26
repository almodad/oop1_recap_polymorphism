/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author AMutinda
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ClassName objectname = new ClassName()
        A obj1 = new A();
        obj1.where();
        obj1 = new B(); //Dynamic binding
        obj1.where(); //Dynamic method dispatch
        B obj2 = new C();
        obj2.where();
    }
    
}
