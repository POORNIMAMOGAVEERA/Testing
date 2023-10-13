package org.example;

public class Calculator {
    public int add(int a ,int b){
        return a+b;
    }

    public double divide(int a,int b){
        if(b==0){
           throw new ArithmeticException("Cannot be divided b Zero!!");
        }else {
            return (double)a/b;
        }
    }
}
