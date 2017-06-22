package zpd.jihe;

import java.util.*;

/**
 * Created by Ad on 2016-11-16.
 */
public class Ada {

	/**
	 * 数组集合互转.
	 */
	public static void shuzuListHuzhuan() {
		String[] str = { "z", "p", "d" };
		// System.out.println(Arrays.asList(str) instanceof List);

		List list = new ArrayList();
		list.add("z");
		list.add("p");
		list.add("d");
		Object[] objArray = list.toArray(); // 不带参数
		String[] listArray = new String[list.size()];
		list.toArray(listArray); // 指定返回类型
	}

	/**
	 * 得到集合中的老大和老小，根据字符串
	 */
	public static void getListMaxAndMinByString() {
		ArrayList list = new ArrayList();
		list.add("zhang");
		list.add("peng");
		list.add("dong");
		System.out.println("getListMaxAndMinByString:" + Collections.max(list));
		System.out.println("getListMaxAndMinByString:" + Collections.max(list, String.CASE_INSENSITIVE_ORDER));
	}

	/**
	 * map输出.
	 */
	static void mapSout() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);

		for (String s : map.keySet()) {
			System.out.println("mapSout-keySet:" + " Key:" + s + " value:" + map.get(s));
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("mapSout-entrySet:" + " Key:" + entry.getKey() + " value:" + map.get(entry.getKey()));
		}

		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println("mapSout-keySet-iterator:" + " Key:" + obj + " value:" + map.get(obj));
		}

		Collection co = map.values();
		Iterator coIt = co.iterator();
		while (coIt.hasNext()) {
			System.out.println(coIt.next());
		}

	}

	/**
	 * TreeMap输出.
	 */
	static void TreeMapSout() {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("a", 1);
		tm.put("b", 2);
		tm.put("c", 3);
		tm.put("d", 4);
		System.out.println("TreeMapSout:" + " firstKey:" + tm.firstKey() + " firstValue:" + tm.get(tm.firstKey()));
		System.out.println("TreeMapSout:" + " lastKey:" + tm.lastKey() + " lastValue:" + tm.get(tm.lastKey()));
		for (String s : tm.keySet()) {
			System.out.println("TreeMapSout-keySet:" + " Key:" + s + " Value:" + tm.get(s));
		}
		for (Map.Entry<String, Integer> stringIntegerEntry : tm.entrySet()) {
			System.out.println("TreeMapSout-entrySet:" + " Key:" + stringIntegerEntry.getKey() + " Value:"
					+ tm.get(stringIntegerEntry.getKey()));
		}
	}

	/**
	 * hashTable输出.
	 */
	static void hashTableSout() {
		Hashtable ht = new Hashtable();

	}

	/**
	 * list输出.
	 */
	static void listSout() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("listSout:" + list);
	}

	/**
	 * 设置集合只读.
	 */
	static void setJiheOnlyRead() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list = Collections.unmodifiableList(list);
		try {
			list.add("d");
		} catch (Exception e) {
			System.out.println("setJiheOnlyRead异常:" + e.getMessage());
		}

	}

	/**
	 * list反转.
	 */
	static void reverseList() {
		List list = new ArrayList();
		list.add("z");
		list.add("p");
		list.add("d");
		System.out.println("reverseList反转前:" + list);
		Collections.reverse(list);
		System.out.println("reverseList反转后:" + list);
	}

	/**
	 * 重洗list，因为list原本是有序的.
	 */
	static void shuffleList() {
		List list = new ArrayList();
		list.add("z");
		list.add("p");
		list.add("d");
		System.out.println("shuffleList洗牌前:" + list);
		Collections.shuffle(list);
		System.out.println("shuffleList洗牌后:" + list);
	}

	/**
	 * 移动list里的元素.
	 */
	private static void rotateList() {
		List list = Arrays.asList("one Two three Four five six".split(" "));
		System.out.println("rotateList移动前：" + list);
		Collections.rotate(list, 2);
		System.out.println("rotateList移动后：" + list);
	}

	/**
	 * 测试map放值后的返回值。
	 */
	public static void mapPutTest() {
		HashMap map = new HashMap();
		System.out.println("mapPutTest:" + map.put(1, 11)); // 返回null
		System.out.println("mapPutTest:" + map.put(1, 22)); // 返回11，证明在给同一个key放值时，会返回他之前他内容。
	}

	public static void main(String[] args) {
		shuzuListHuzhuan();
		getListMaxAndMinByString();
		mapSout();
		TreeMapSout();
		listSout();
		setJiheOnlyRead();
		reverseList();
		shuffleList();
		rotateList();
		mapPutTest();
	}

}
