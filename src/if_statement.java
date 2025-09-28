public class if_statement {
    public static void main(String[] args) throws Exception {
        // if (20 > 18) {
        // System.out.println("Hello World!");
        // }

        // int number1 = 20, number2 = 18;
        // if (number1 > number2) {
        // System.out.println("Hello World!");
        // }

        // if (number1 < number2) {
        // System.out.println("Hello World!");
        // } else {
        // System.out.println("Hello Programming");
        // }

        // int time = 22;
        // if (time < 10) {
        // System.out.println("Good morning");
        // } else if (time < 18) {
        // System.out.println("Good day");
        // } else {
        // System.out.println("Good evening");
        // }

        /** && is logical AND, || is logical OR, ! is logical NOT **/
        // int age = 11;
        // if (age <= 18 && age >= 13) {
        // System.out.println("You are a teenager");
        // } else {
        // System.out.println("You are not a teenager");
        // }

        // int timestamp = 20;
        // String result = (timestamp < 18) ? "Good day" : "Good evening";
        // System.out.println(result);

        String username = "MikE";
        if (username.equalsIgnoreCase("mike")) {
            System.out.print("Hello, Welcome!");
        } else {
            System.out.print("Not a valid user!");
        }
    }
}
