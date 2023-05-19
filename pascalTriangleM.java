// java program for Pascal Triangle (memorization)

import java.util.HashMap;
import java.util.Map; 

public class pascalTriangleM {

    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int numRows = 9;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= row; col++) {
                int coefficient = calculateCoefficient(row, col);
                System.out.print(coefficient + " ");
            }
            System.out.println();
        }
    }

    public static int calculateCoefficient(int n, int k) {
        String key = n + "," + k;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (k == 0 || k == n) {
            return 1;
        }

        int coefficient = calculateCoefficient(n - 1, k - 1) + calculateCoefficient(n - 1, k);
        memo.put(key, coefficient);
        return coefficient;
    }
}
