package solution;

import java.util.Arrays;
import java.util.Comparator;

public class OrderPhoneBook {
	public long[] orderNums(long[] nums) {
		Long[] nums2 = new Long[nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}
		Arrays.sort(nums2, new Comparator<Long>() {
			public int compare(Long a, Long b) {
				String c = Long.toString(a);
				String d = Long.toString(b);
				if (c.charAt(0) < d.charAt(0)) {
					return -1;
				} else if (c.charAt(0) > d.charAt(0)) {
					return 1;
				} else {
					String e = c.substring(1);
					String f = d.substring(1);
					if (e.length() == 0) {
						return -1;
					} else if (f.length() == 0) {
						return 1;
					}
					return compare(Long.parseLong(e), Long.parseLong(f));
				}
			}
		});
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums2[i];
		}
		return nums;
	}
}
