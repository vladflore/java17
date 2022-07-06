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
