package March;

public class BoundarySum {
    public static int N = 4;


    static void diagonalBoundarySum(int arr[][]){
        int requiredSum = 0;


        for (int i = 0; i < N; i++) {


            for (int j = 0; j < N; j++) {

                if (i == j || (i + j) == N - 1) {
                    requiredSum += arr[i][j];
                }


                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
                    requiredSum += arr[i][j];
                }
            }
        }


        System.out.println(requiredSum);
    }


    public static void main(String args[])
    {
        int arr[][] = { { 1, 2, 3, 4 },{ 1, 2, 3, 4 },
                { 1, 2, 3, 4 },{ 1, 2, 3, 4 } };

        diagonalBoundarySum(arr);

    }
}
