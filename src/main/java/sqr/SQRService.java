package sqr;

public class SQRService {

    public long counter(int min, int max) {
        long count = 0;
        for (int i = 10; i < 100; i++) {
            int sqri = i * i;
            if (sqri >= min && sqri <= max) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
