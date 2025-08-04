package TwoPointers;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=23;
        rotateArray(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k);
        reverse(arr,k,n-1);
    }
    public static void reverse(int[] arr,int s,int e){
        while (s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
//brute tc=O(n) and sc= O(n);
//    public static void brute(int[] arr, int k){
//        int n=arr.length;
//        if(k>n){
//            k=k%n;
//        }
//        int[] res = new int[n];
//        int j=0;
//        for(int i=n-k;i<n;i++){
//            res[j] = arr[i];
//            j++;
//        }
//        for(int i=0;i<n-k;i++){
//            res[i+k] = arr[i];
//        }
//        System.out.println(Arrays.toString(res));
//    }
