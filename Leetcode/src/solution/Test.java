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
		
		CustomHashMap map = new CustomHashMap();
		for (int i = 0; i < 20; i++) {
			map.put(i, i);
		}
		int ret = map.get(5);
		System.out.println(ret);
		System.out.println(map.size());
		map.put(40, 40);
		System.out.println(map.get(40));
		System.out.println(map.get(0));
		System.out.println(map.toString());
	}
}
