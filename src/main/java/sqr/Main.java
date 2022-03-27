package sqr;

public class Main {
    public static void main(String[] args) {
        int min = 200;
        int max = 300;

        int count = 0;
        int sqri;
        for (int i = 10; i < 100; i++) {
            sqri = i * i;
            if (sqri >= min && sqri <= max) {
                count++;
            }
        }
        System.out.println(count);

    }
}
