public class App {
    public static void main(String[] args) throws Exception {
        // String[] colors;

        String[] colors = {
                "red",
                "green",
                "blue",
                "yellow",
                "purple"
        };

        // System.out.println(colors[0]);
        // System.out.println(colors.length);

        // int[] numbers = { 1, 2, 3, 4, 5 };

        // // 2D array
        // int[][] twoDArray = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };
        // // Accessing elements in a 2D array
        // System.out.println(twoDArray[0][0]); // Output: 1
        // System.out.println(twoDArray[1][1]); // Output: 5

        // // 3D array
        // int[][][] threeDArray = {
        // {
        // { 1, 2, 3 },
        // { 4, 5, 6 }
        // },
        // {
        // { 7, 8, 9 },
        // { 10, 11, 12 }
        // }
        // };
        // // Accessing elements in a 3D array
        // System.out.println(threeDArray[0][0][0]); // Output: 1
        // System.out.println(threeDArray[1][1][2]); // Output: 12

        // Accessing array through a for loop
        // for (int i = 0; i < colors.length; i++) {
        // System.out.println("Color at index " + i + ": " + colors[i]);
        // }

        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equalsIgnoreCase("blue")) {
                System.out.println("Found blue at index " + i);
                // break;
            }
        }
    }
}
