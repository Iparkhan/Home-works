package kz.kaznu.ipara.HW2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        // 1 задание
       int[] arr= new int[7];
       for (int i = 0; i <arr.length ; i++) {
           System.out.println("Good day!");
       }


        // 2 задание
        int[] prefilledArr={2,6,8,9,1,1};
        int sum=0;
        for (int i = 0; i < prefilledArr.length; i++) {
            if(prefilledArr[i]>5) {
                sum+=prefilledArr[i];
            }

        }
        System.out.println(sum);
        // 3 задание
        int[] array =new int[4];
        for (int i = 0; i <array.length; i++) {
            array[i]=3;
        }
        System.out.println(Arrays.toString(array));
        // 4 задание
        int [] arr1={5,4,3,2};
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] += 2;
        }
        System.out.println(Arrays.toString(arr1));

     // 5 задание
        int[] arr2={-3,7,2,4,5,-8,3,1};
        int sum1=0;
        int sum2=0;
        for (int i = 0; i <arr2.length /2 ; i++) {
            sum1 +=arr2[i];
        }
        for (int i = arr2.length /2; i <arr2.length ; i++) {
            sum2 +=arr2[i];
        }
        System.out.println(sum1>sum2 ? "Первая половина больше" :
                (sum1<sum2 ? "Вторая половина больше" : "Половины равны"));
        }

    }





