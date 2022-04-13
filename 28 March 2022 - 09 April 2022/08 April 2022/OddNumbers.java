package March;
public class OddNumbers {

    static int odd(int num1, int num2)
    {
        if(num1>num2)
            return 0;
        System.out.printf(num1+" ");
        return odd(num1+2,num2);
    }
    public static void main(String[] args) {
        int num1=1,num2;
        num2=31;
        odd(num1,num2);
    }
}
