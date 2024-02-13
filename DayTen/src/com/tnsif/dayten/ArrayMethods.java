package com.tnsif.dayten;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		int arr[]= {3,5,6,2,7,9};
		System.out.println("Original Array : "+Arrays.toString(arr));
		
		//sort
		Arrays.sort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		
		//Binary Search
		int key=6;
		System.out.println(key+" found at index "+Arrays.binarySearch(arr, key));

	}

}
