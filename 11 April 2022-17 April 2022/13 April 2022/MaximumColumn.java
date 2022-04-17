package March;

public class MaximumColumn {
    public static void largestInColumn(int cols, int[][] arr)
    {

        for (int i = 0; i < cols; i++) {


            int maxm = arr[0][i];
            for (int j = 1; j < arr[i].length; j++)
                if (arr[j][i] > maxm)
                    maxm = arr[j][i];

            System.out.println(maxm);
        }
    }


    public static void main(String[] args)
    {
        int[][] arr = new int[][] { { 3, 4, 1, 8 },
                { 1, 4, 9, 11 },
                { 76, 34, 21, 1 },
                { 2, 1, 4, 5 } };

        largestInColumn(3, arr);
    }

}
