// java program for Pascal Triangle (Iterations)

import java.util.ArrayList;
import java.util.List;

public class pascalTriangleI {
    public static void main(String[] args) {
        int numRows = 7;
        List<List<Integer>> triangle = generateTriangle(numRows);

        // Print Pascal's triangle
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        } 
    }

    public static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            if (i > 0) {
                List<Integer> prevRow = triangle.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }

    
}
