package org.example;

public class Override1 {
    public void Sout() {
        System.out.println("parent text");
    }
}

class ChildOverride extends Override1 {
    @Override
    public void Sout() {
        System.out.println("from Child");
    }
}

class MainOver {
    public static void main(String[] args) {
        Override1 override1 = new Override1();
        ChildOverride childOverride = new ChildOverride();

        override1.Sout();
        childOverride.Sout();
    }
}
