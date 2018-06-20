package com.example.scope;


// Variables of the most Narrow scope are used in Java. Thus local variables are used before class or global vars.
// Java works its way back from the current block of code to the most recent enclosing blocks.

public class ScopeCheck {
    // scope = class
    public int publicVar = 0;
    // scope = class
    private int privateVar = 1;


    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);

    }

    public int getPrivateVar() {
        return privateVar;
    }

    // the this keyword can be used in java to tell the compiler to use a class variable rather than a local one.

    public void timesTwo() {
        // scope of this privateVar is local to the timesTwo method and will be used within the method.
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateVar);

            //to use the class privateVar
            //System.out.println(i + " times two is " + i * this.privateVar);
        }
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);

        }

        public void timesTwo() {
            // In this case the times two method will ues the privateVar from the InnerClass declared above.

            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * privateVar);

                // to use the privateVar from the ScopeCheck class we need to use ScopeCheck.this.privateVar.
                //System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
                // This would use the privateVar with a value of 1 rather than 3 or 2. 

            }

        }

    }
}
