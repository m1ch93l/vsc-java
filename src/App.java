public class App {
    public static void main(String[] args) throws Exception {
        if (20 > 18) {
            System.out.println("Hello World!");
        }

        int number1 = 20, number2 = 18;
        if (number1 > number2) {
            System.out.println("Hello World!");
        }

        if (number1 < number2) {
            System.out.println("Hello World!");
        } else {
            System.out.println("Hello Programming");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning");
        } else if (time < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        int timestamp = 20;
        String result = (timestamp < 18) ? "Good day" : "Good evening";
        System.out.println(result);
    }
}
