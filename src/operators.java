public class operators {
    public static void main(String[] args) throws Exception {
        int addition = 5 + 5;
        System.out.println(addition);
        int addon = addition + 5;
        System.out.println(addon);
        int solve = addon + addon;
        System.out.println(solve);
        System.out.println(++solve);
        System.out.println(--solve);

        int x = 5;
        int y = 3;
        System.out.println(x > y);
        System.out.println(x > 3 && x < 10);
        System.out.println(x > 3 || x < 10);
    }
}
