import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] exampleOne = new int[]{1, 2, 3};
        int[] exampleTwo = new int[]{4, 3, 2, 1};
        int[] exampleThree = new int[]{9};

        System.out.println("Example One : " + Arrays.toString(solution.plusOne(exampleOne)));
        System.out.println("Example Two : " + Arrays.toString(solution.plusOne(exampleTwo)));
        System.out.println("Example Three : " + Arrays.toString(solution.plusOne(exampleThree)));
    }
}
