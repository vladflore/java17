public class PrivateMethod {
    public static void main(String[] args) {

    }

    interface I1 {
        default int m1() {
            return sum(1, 2);
        }

        default int m2() {
            return sum(2, 3);
        }

        private int sum(int a, int b) {
            return a + b;
        }
    }

}
