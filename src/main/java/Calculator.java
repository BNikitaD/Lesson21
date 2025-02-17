public class Calculator {

    public Calculator() {
    }

    public int sum(int x, int y) {
        System.out.println("summa");
        return x + y;
    }

    public int minus(int q, int w) {
        System.out.println("minus");
        return q - w;
    }

    public int divide(int e, int r) {
        System.out.println("divide");
        if (r == 0) {
            System.out.println("Message: division by zero");
            return 0;
        }
        return e / r;
    }


    public int multiplicaion(int a, int b) {
        System.out.println("multiplication");
        return a * b;
    }
}
