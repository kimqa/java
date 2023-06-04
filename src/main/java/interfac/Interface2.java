package interfac;

public interface Interface2 extends Interface {
    void method4();
    void method5();
    @Override
    void method1();
    @Override
    default String method3(String s) {
        return s;
    }
}
