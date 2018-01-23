public class ViewNumbers {

    public static void main(String[] args) {
        double i = 0;
        double z = 0.1;

        while (i <= 3) {
            System.out.println(i);
            i = i + z;
        }

        double a = 0;
        double b = 0.1;

        do {
            System.out.println(a);
            a = a + b;
        } while (a <= 3);
    }
}
