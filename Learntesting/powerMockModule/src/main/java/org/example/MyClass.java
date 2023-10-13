package org.example;

public class MyClass {
     static String myStaticMethod(){
        return "OriginalValue";
    }

    private String myPrivateMethod(){return "Private Method";}

    public String myPrivateMethodEg(){
         return myPrivateMethod();
    }

    private int add(int a, int b) {
        return a + b;
    }

}
