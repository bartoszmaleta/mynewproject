package org.experiments2;


import java.net.ServerSocket;

public class NewClass
{
    public static void main(String[] args)
    {
        //MyFirstClass kaka = null;
        //System.out.println(kaka.toString());
        //pojawi się "Null Pointer Exception




        MyFirstClass myFirstClass = new MyFirstClass();

        System.out.println(myFirstClass.toString());

        AnotherClass anotherClass = new AnotherClass();

        System.out.println(anotherClass.toString());

        MyFirstClass myFirstClassCopy = myFirstClass;

        System.out.println(myFirstClassCopy.toString());

        myFirstClass.setNumber(10);
        System.out.println(myFirstClass.getNumber());

        System.out.println(myFirstClassCopy.getNumber());
    }
}
