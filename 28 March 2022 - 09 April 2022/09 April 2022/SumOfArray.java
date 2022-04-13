package March;

public class SumOfArray {
    private static int calculateSum(int arr[], int n) {

        if (n <= 0) {
            return 0;
        }
        return calculateSum(arr, n-1 ) + arr[n-1];
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 5, 10};
        int sum = calculateSum(arr, arr.length);

        System.out.println(sum);
    }

}
