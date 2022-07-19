package tech.vladflore.java17;

public class PrivateMethod {

    public static void main(String[] args) {
        new InterfaceImpl().d();
        Interface.s();
        // new InterfaceImpl().p();
        // Interface.ps();
    }
}

interface Interface {

    default void d() {
        p();
    }

    static void s() {
        ps();
    }

    private void p() {
    }

    private static void ps() {
    }
}

class InterfaceImpl implements Interface {

}
