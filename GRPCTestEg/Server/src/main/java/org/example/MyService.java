package org.example;

public class MyService {
    private static String staticField = "Static Field";
    private String instanceField;

    public MyService(String instanceField) {
        this.instanceField = instanceField;
    }

    public String performOperation() {
        return "Performing operation with instanceField: " + instanceField;
    }

     static String staticMethod() {
        return "Static Method";
    }

    private String privateMethod() {
        return "Private Method";
    }
     public final String finalMethod(){
        return "Final Method";
    }
}
