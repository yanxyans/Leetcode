package solution;

import java.util.Arrays;

public class QuickSort {
	public void sort(int[] arr) {
		int n = arr.length;
		sort(arr, 0, n);
	}
	
	public void sort(int[] arr, int start, int end) {
		if (start >= end) return;
		int pivot = end - 1;
		int mid = start;
		for (int i = start; i < end - 1; i++) {
			if (arr[i] < arr[pivot]) {
				swap(arr, i, mid++);
			}
		}
		swap(arr, pivot, mid);
		sort(arr, start, mid);
		sort(arr, mid + 1, end);
	}
	
	public void swap(int[] arr, int i, int j) {
		if (arr[i] != arr[j]) {
			arr[i] ^= arr[j];
			arr[j] ^= arr[i];
			arr[i] ^= arr[j];
		}
	}
}
