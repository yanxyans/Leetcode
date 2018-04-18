package solution;

public class MergeSort {
	public void sort(int[] arr) {
		int n = arr.length;
		sort(arr, 0, n);
	}
	
	public void sort(int[] arr, int begin, int end) {
		if (end - begin < 2) return;
		
		int mid = (begin + end) / 2;
		sort(arr, begin, mid);
		sort(arr, mid, end);
		
		// merge
		int n = end - begin;
		int[] tmp = new int[n];
		int a = begin;
		int b = mid;
		for (int i = 0; i < n; i++) {
			 if (a >= mid) tmp[i] = arr[b++];
			 else if (b >= end) tmp[i] = arr[a++];
			 else if (arr[a] < arr[b]) tmp[i] = arr[a++];
			 else tmp[i] = arr[b++];
		}
		for (int i = begin; i < end; i++) {
			arr[i] = tmp[i - begin];
		}
	}
}
