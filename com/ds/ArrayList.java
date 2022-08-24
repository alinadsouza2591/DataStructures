package com.ds;

public class ArrayList<T> {

    Object[] arr;
    int s;
    int capacity;

    public ArrayList(){
        capacity=10;
        s=0;
        arr = new Object[capacity];
    }

    public ArrayList(int c){
        capacity=c;
        s=0;
        arr = new Object[capacity];
    }

    public void add(T data) {
        if(s==capacity){
            Object brr[]= new Object[s];
            for(int i=0;i<s;i++) brr[i]=arr[i];
            capacity = capacity*3/2+1;
            arr = new Object[capacity];
            for(int i=0;i<s;i++) arr[i]=brr[i];
        }
        arr[s++] = data;
    }

    public T get(int index){
        return (T)arr[index];
    }

    public int size(){
        return s;
    }

    public boolean isEmpty(){
        return s==0?true:false;
    }

    public int currentCapacity(){
        return capacity;
    }

    public void remove(int index){
        Object brr[]= new Object[s];

        int j=0;
        while(j<(s-index)-1) {
            arr[index+j] = arr[index + (j+1)];
            j++;
        }
        arr[s-1] = null;
        s--;
        for(int i=0;i<s;i++) brr[i]=arr[i];
        capacity=10;
        if(!((s-1)==capacity)) {
            while (s > capacity) {
                capacity = capacity * 3 / 2 + 1;
            }
        }

        arr = new Object[capacity];
        for(int i=0;i<s;i++) arr[i]=brr[i];


    }
}
