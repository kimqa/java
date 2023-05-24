package org.example;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        LoopTopic loopTopic = new LoopTopic();
        loopTopic.forLoop();
        loopTopic.whileLoop(3);
        loopTopic.breakContinue();

    }
}