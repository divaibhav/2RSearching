package main;

import implementation.Searching;

public class MyMain {
    public static void main(String[] args) {
        int[] arr = new int[]{30,20,3,86,42,48,9,42};
        Searching obj = new Searching();
        System.out.println(obj.search(arr, 42));
        System.out.println("2nd index of 42 = " + obj.findIndex(arr, 42));
        int[] brr = {10,15,18,19,25,29,36,48,52,74,78,79,200};
        Searching obj2 = new Searching(brr);
        boolean result = obj2.binarySearch(52, 0, brr.length - 1);
        System.out.println("element found --> " + result);
    }
}
//Find the index of nth occurrence of searchElement,
// if not present or only have less  occurrence, return -1