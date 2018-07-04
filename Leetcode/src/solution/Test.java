package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		/*CanJump2 cj = new CanJump2();
		System.out.println(cj.canJump(new int[]{2,3,4,1,1,4}));
		System.out.println(cj.canJump(new int[]{3,2,1,0,4}));*/
		
		/*CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		System.out.println(linkedList.remove().val);
		System.out.println(linkedList.remove().val);
		System.out.println(linkedList.remove().val);
		linkedList.add(4);
		System.out.println(linkedList.remove().val);
		System.out.println(linkedList.remove());*/
		
		/*CustomHashMap map = new CustomHashMap();
		for (int i = 0; i < 20; i++) {
			map.put(i, i);
		}
		int ret = map.get(5);
		System.out.println(ret);
		System.out.println(map.size());
		map.put(40, 40);
		System.out.println(map.get(40));
		System.out.println(map.get(0));
		System.out.println(map.toString());*/
		
		/*AppleStand appleStand = new AppleStand();
		System.out.println(appleStand.buyApples(3000, 80000, 20));
		System.out.println(appleStand.buyApples(6000, 15000, 10));
		System.out.println(appleStand.buyApples(17000, 20000, 10));
		
		System.out.println(appleStand.sellApples(18000, 5));
		System.out.println(appleStand.sellApples(30000, 10));*/
		
		long[] nums = new long[] {222231231, 911, 9112, 55551023, 12, 13, 123, 133, 134, 1345};
		OrderPhoneBook orderPhoneBook = new OrderPhoneBook();
		System.out.println(Arrays.toString(orderPhoneBook.orderPhoneBook2(nums)));
		
		/*int i = 1;
		boolean b = true;
		System.out.println(i);
		System.out.println(b);
		test(i, b);
		System.out.println(i);
		System.out.println(b);*/
	}
	
	public static void test(int index, boolean bool) {
		index++;
		System.out.println(index);
		bool = false;
		System.out.println(bool);
	}
}
