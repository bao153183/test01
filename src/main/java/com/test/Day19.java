package com.test;

public class Day19 {



    private  Day19(){};

    //e汉式
    private static Day19 d = new Day19();
    //懒汉式
  //  private static Day19 d = null;
    public static Day19 findDay19(){
        //懒汉式
     //  d=new Day19();
        return  d ;
    }


}
