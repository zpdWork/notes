package zpd.shuzu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ad on 2016-11-07.
 */
public class Ada {

	/**
	 * 反转.
	 */
	private static void reverseShuZu() {
		String[] str = { "z", "h", "a", "n", "g" };
		for (String s : str) {
			System.out.println("reverseShuZu反转前：" + s);
		}
		System.out.println(str);
		Collections.reverse(Arrays.asList(str));
		for (String s : str) {
			System.out.println("reverseShuZu反转后：" + s);
		}
	}

	/**
	 * 获取最大、最小值.
	 */
	private static void getMaxOrMin() {
		Integer[] i = { 1992, 4, 9, 1992, 3, 7 };
		System.out.println("max:" + Collections.max(Arrays.asList(i)));
		System.out.println("min:" + Collections.min(Arrays.asList(i)));
	}

	/**
	 * 数组合并.
	 */
	private static void shuzuHeBing() {
		String[] str1 = { "zhang", "peng" };
		String[] str2 = { "dong" };
		List list1 = new ArrayList(Arrays.asList(str1));
		list1.addAll(Arrays.asList(str2));
		System.out.println("shuzuHeBing:" + list1.toString());
	}

	/**
	 * 更改数组指定位置的内容.
	 */
	public static void fillShuZu() {
		int[] i = new int[6];
		Arrays.fill(i, 6);
		for (int i1 : i) {
			System.out.println(i1);
		}
		System.out.println("-----------");
		Arrays.fill(i, 4, 6, 7);
		for (int i1 : i) {
			System.out.println(i1);
		}
		System.out.println("-----------");
	}

	/**
	 * 通过removeAll，得到2个集合的差集.
	 */
	private static void removeAllList() {
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		l1.add("1");
		l1.add("2");
		l1.add("3");
		l1.add("4");
		l1.add("5");
		l2.add("1");
		l2.add("2");
		l2.add("3");
		System.out.println("removeAllList:" + l1);
		System.out.println("removeAllList:" + l2);
        l1.removeAll(l2);
		System.out.println("removeAllList:" + l1.toString());
	}

    /**
     * 通过retainAll，得到2个集合的交集.
     */
    private static void retainAllList() {
        List l1 = new ArrayList();
        List l2 = new ArrayList();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("4");
        l1.add("5");
        l2.add("1");
        l2.add("2");
        l2.add("3");
        System.out.println("retainAllList:" + l1);
        System.out.println("retainAllList:" + l2);
        l1.retainAll(l2);
        System.out.println("retainAllList:" + l1.toString());
    }

    /**
     * 通过set不重复唯一性，挨个往里添加.
     */
    private static void bingjiList() {
    }

    /**
     * 通过contains，查看指定内容是否存在.
     */
    private static void containsList() {
        List l1 = new ArrayList();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        l1.add("4");
        l1.add("5");
        System.out.println("containsList:" + l1);
        System.out.println("containsList:" + l1.contains("2"));
    }



	public static void main(String[] args) {
		reverseShuZu();
		getMaxOrMin();
		shuzuHeBing();
		fillShuZu();
		removeAllList();
        retainAllList();
        bingjiList();
        containsList();
	}

}
