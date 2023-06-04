package interfac;

public class Main {
    public static void main(String[] args) {
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.method1();
        interfaceImpl.method2();
        System.out.println(interfaceImpl.method3("TESTER"));

        Interface2Impl interface2 = new Interface2Impl();
        interface2.method3("Text");
    }
}
