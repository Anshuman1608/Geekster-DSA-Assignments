package March;

import java.io.*;
import java.lang.*;
import java.util.*;
public class SegregatePrime {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
    static void segregatePrimeNonPrime(int arr[], int N)
    {
        int left = 0, right = N - 1;
        while (left < right) {
            while (isPrime(arr[left]))
                left++;
            while (!isPrime(arr[right]))
                right--;
            if (left < right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
        int arr[] = {1,4,23,78,54,13,89};
        int N = arr.length;
        segregatePrimeNonPrime(arr, N);
    }
}
