package solution;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (n < m) {
        	int[] nums3 = nums1; nums1 = nums2; nums2 = nums3;
        	int o = m; m = n; n = o;
        }
        
        int iMin = 0, iMax = m, c = (m + n + 1) / 2;
        while (iMin <= iMax) {
        	int i = (iMin + iMax) / 2, j = c - i;
        	
        	if (i > iMin && nums1[i - 1] > nums2[j]) {
        		iMax = i - 1;
        	} else if (i < iMax && nums2[j - 1] > nums1[i]) {
        		iMin = i + 1;
        	} else {
        		double maxLeft;
        		if (j == 0) {
        			maxLeft = nums1[i - 1];
        		} else if (i == 0) {
        			maxLeft = nums2[j - 1];
        		} else {
        			maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
        		}
        		
        		if ((m + n) % 2 == 1) {
        			return maxLeft;
        		}
        		
        		double minRight;
        		if (i == m) {
        			minRight = nums2[j];
        		} else if (j == n) {
        			minRight = nums1[i];
        		} else {
        			minRight = Math.min(nums1[i], nums2[j]);
        		}
        		
        		return (maxLeft + minRight) / 2.0;
        	}
        }
        return 0.0;
    }
}
