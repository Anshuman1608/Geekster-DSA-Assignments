package March;

public class April16_2022 {


    public static void main(String[] args) {
        int [] A=  { 3,5,7,1,0,1,2,-2,-1,-3};
        int i = A.length;
        int m=0;
        int sum=0;

        // System.out.println(maxElement(A, i));
        sumElement(A, i,sum,m);

        negativeNumbers(A,i, m);

        int n=1234;

        print(n);


    }

    public static void print(int n)
    {
        if(n<10){
            System.out.println(n);
            return;


        }
        else{

            System.out.print(n%10);
            print(n/10);


        }


    }
    private static void negativeNumbers(int[] a,int i,int m) {
        if(i==m) {
            return;
        }
        else {
            if(a[m]<0)
                System.out.println(a[m]+" ");
            m++;
            negativeNumbers(a,i, m);

        }
    }


    private static void sumElement(int[] a, int i,int sum,int m) {

        if(i==m) {
            System.out.println(sum);
            return;
        }else {
            sum=sum+a[m];
            m++;
            sumElement(a,i,sum,m);
        }


    }


    public static int maxElement(int []A,int i) {

        if(i == 1)
            return A[0];

        return Math.max(A[i-1], maxElement(A, i-1));

    }

}
