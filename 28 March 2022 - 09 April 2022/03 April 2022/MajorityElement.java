package March;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class MajorityElement{

    public static void main(String args[]) {
        MajorityElement d=new MajorityElement();

        int[] arr={2,2,2,3,3,3,3,1};
        int res=d.majorityElement(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){

            if(res==arr[i]){
                count++;
            }
        }
        if(count>(arr.length/2)){
            System.out.println(arr[res]);
        }else{
            System.out.println("No element ");
        }

    }

    public static int majorityElement(int[] arr){
        int temp=1;
        int index=0;
        int res=0;
        for(int i=0;i<arr.length;i++){

            if(arr[index]==arr[i]){
                temp++;
            }else{
                temp--;
                if(temp==0){
                    index=i;
                    temp=1;
                }
            }
        }
        return arr[index];
    }

}
