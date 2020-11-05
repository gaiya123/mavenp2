package com.pradeepk.mvn;

import com.pradeepk.mvn1.MyCal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Hi Im in Class 2" );

        MyCal m = new MyCal(100,50);
        System.out.println("Valllll isss  "+ m.sumValue());
    }
}
