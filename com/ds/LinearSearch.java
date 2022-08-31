package com.ds;

public class LinearSearch {

    public static void main(String[] args) {
        int array[] = {2,6,3,8,5};
        //length of the array
        int length = array.length;
        //element to be found
        int x = 3;
        int result = search(array, length, x);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element present at location: "+result);
        }
    }
    public static int search(int array[], int length, int x) {
        //Iterate through the loop and find the variable
        for(int i=0;i<length;i++){
            if(array[i]==x){
                return i;
            }
        }
        return -1;
    }
}
