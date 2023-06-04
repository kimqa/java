package interfac;

public interface Interface {
    public void method1();
    public void method2();
    public default String method3(String s) {
        return "String";
    }
}
