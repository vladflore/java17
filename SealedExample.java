public class SealedExample {
    public static void main(String[] args) {

    }
}

sealed class Employee permits SoftwareEngineer, Tester, DevOps {
}

non-sealed class SoftwareEngineer extends Employee {
}

class JavaSoftwareEngineer extends SoftwareEngineer {
}

final class Tester extends Employee {
}

final class DevOps extends Employee {
}

sealed class A permits A1, A2 {
}

final class A1 extends A {
}

sealed class A2 extends A permits B {
}

non-sealed class B extends A2 {
}

class X extends B {
}

sealed interface I permits J {
}

sealed interface J extends I permits C, D {
}

final class C implements J {
}

record D() implements J {
}