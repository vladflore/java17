public class RecordExample {
    public static void main(String[] args) {
        var employee = new Employee("Vlad Flore", 36);
        System.out.println(employee);
    }

    record Employee(String name, int age) {
    }
}
