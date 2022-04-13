package March;

public class MaximumNumbers {
    public static int findRowIndex(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return 0;
        }

        int row = -1;
        int i = 0, j = mat[0].length - 1;

        while (i <= mat.length - 1 && j >= 0)
        {

            if (mat[i][j] == 1)
            {
                j--;
                row = i;
            }

            else {
                i++;
            }
        }
        return row + 1;
    }

    public static void main(String[] args)
    {
        int[][] mat =
                {
                        { 0, 0, 0, 1, 1 },
                        { 0, 0, 1, 1, 1 },
                        { 0, 0, 0, 0, 0 },
                        { 0, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 1 }
                };

        int rowIndex = findRowIndex(mat);


        if (rowIndex != 0) {
            System.out.print("The maximum 1's are present in the row " + rowIndex);
        }
    }
}
