package org.example;

public class LoopTopic {
    public  void forLoop() {
        for( int i=1; i < 9; i++) {
            System.out.println("Int i = " + i);
        }
    }
    public void whileLoop(int i) {
        System.out.println("WHILE");
        while (i > 0) {
            System.out.println("i="+i);
            i--;
        }
    }

    public void breakContinue() {
        System.out.println("BREAK");
        int i=1;
        for (; i < 20; i++)
        if (i/5 > 2) {
            System.out.println("Continue");
            continue;
        }
        else if (i>=15) {
            System.out.println("break");
            break;
        }
        else {
            System.out.println("I = " + i);
        }
    }
}
