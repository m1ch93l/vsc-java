public class App {
    public static void main(String[] args) throws Exception {
        int number = 0;

        while (number <= 5) {
            System.out.println(number);
            number++;
            Thread.sleep(500);
        }
        System.out.println("Loop finished.");

        // do {
        // System.out.println("This will always execute at least once.");
        // number++;
        // } while (number < 5);
        // System.out.println("Loop finished.");

        // while (number < 10) {
        // System.out.println(number);
        // number++;
        // if (number == 4) {
        // break;
        // }
        // }

        // while (number < 10) {
        // if (number == 4) {
        // number++;
        // continue;
        // }
        // System.out.println(number);
        // number++;
        // }
    }
}
