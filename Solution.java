public class Solution {

    private static final int MAX_SUM = 5;

    private static int numberOfWays = 0;

    private static void recurse(int sum) {
        if (sum == MAX_SUM) {
            numberOfWays++;
        } else if (sum < MAX_SUM) {
            for (int i = 1; i < MAX_SUM; i++) {
                recurse(sum + i);
            }
        }
    }

    public static void main(String[] args) {
        recurse(0);
        System.out.println(numberOfWays);
    }

}