package zpd.shujvjiegou;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Ad on 2016-11-15.
 */
public class Ada {

	/**
	 * 得到LinkedList的第一位和最后一位.
	 */
	public static void getLinkedListFirstAndLast() {
		LinkedList ll = new LinkedList();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(55);
		System.out.println("getLinkedListFirstAndLast:First-" + ll.getFirst());
		System.out.println("getLinkedListFirstAndLast:Last-" + ll.getLast());
	}

	public static void addLinkedListFirstAndLast() {
		LinkedList ll = new LinkedList();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(55);
		System.out.println("addLinkedListFirstAndLast:" + ll);
		ll.addFirst(00);
		System.out.println("addLinkedListFirstAndLast:首位添加-" + ll);
		ll.addLast(66);
		System.out.println("addLinkedListFirstAndLast:末尾添加-" + ll);
	}
    /**
     * 得到LinkedList的第一位和最后一位.
     */
    public static void removeLinkedListFirstAndLast() {
        LinkedList ll = new LinkedList();
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
        ll.add(55);
        System.out.println("removeLinkedListFirstAndLast:First-" + ll.removeFirst());
        System.out.println("removeLinkedListFirstAndLast:First-1-" + ll.removeFirst());
    }

	private static String initStr;
	private static Integer initInteger;
	private static int initInt;
	private static Long initLong;
	private static long initlong;
	private static Boolean initBoolean;
	private static boolean initboolean;

	/**
	 * 查看初始化数据类型默认值(String,包装类都是null，基本类都是默认0/false).
	 */
	public static void initShuJv() {
		System.out.println(initStr);
		System.out.println(initInteger);
		System.out.println(initInt);
		System.out.println(initLong);
		System.out.println(initlong);
		System.out.println(initBoolean);
		System.out.println(initboolean);
	}

	/**
	 * 得到LinkedList的最大和最小.
	 */
	public static void getLinkedListMaxAndMin() {
		LinkedList ll = new LinkedList();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(55);

		System.out.println("getLinkedListMaxAndMin:Max-" + Collections.max(ll));
		System.out.println("getLinkedListMaxAndMin:Min-" + Collections.min(ll));
	}

	/**
	 * 得到LinkedList的指定元素的位置.
	 */
	public static void getLinkedListIndex() {
		LinkedList ll = new LinkedList();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		ll.add(55);

		System.out.println("getLinkedListIndex:" + Collections.binarySearch(ll, 44));
		System.out.println("getLinkedListIndex:" + ll.indexOf(44));
	}

	public static void main(String[] args) {
		getLinkedListFirstAndLast();
		addLinkedListFirstAndLast();
		initShuJv();
		getLinkedListMaxAndMin();
		getLinkedListIndex();
        removeLinkedListFirstAndLast();

	}

}
