public class strings {
    public static void main(String[] args) {
        String greeting = "Hello Good Day";
        System.out.println(greeting);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.indexOf("G"));
        System.out.println(greeting + ", " + txt);
        System.out.println(greeting.concat(txt));
        System.out.println("I love programming and \n to all tech subjects");

        boolean isJavaFun = true;
        boolean isNotFun = false;
        System.out.println(isJavaFun);
        System.out.println(isNotFun);

        int number = 10;
        System.out.println(number == 10);

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);
    }
}
