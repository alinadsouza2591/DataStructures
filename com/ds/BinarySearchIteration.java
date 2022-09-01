package com.ds;

public class BinarySearchIteration {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int length = arr.length;
        int x = 1;
        int l = 0;
        int h = length-1;
        int result = binarySearch(arr, l, h, x);
        if(result==-1)
            System.out.println("Elelment not found");
        else
            System.out.println("Element found at index "+result);

    }

    public static int binarySearch(int[] arr, int l, int h, int x) {

        if(l<=h){
            int mid = (l + h) /2;

            if(arr[mid] == x)
                return mid;
            else if(arr[mid] < x)
                return binarySearch(arr,mid+1,h,x);
            else
                return binarySearch(arr,l,mid-1,x);
        }
        return -1;
    }
}
