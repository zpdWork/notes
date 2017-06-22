package zpd.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ad on 2016-11-07.
 */
public class Ada {

	/**
	 * 比较两个字符串，并返回字符串中第一个字母ASCII的差值.
	 */
	private static void compareToStr() {
		String str1 = "Hello Ada";
		String str2 = "hello ada";
		Object obj = str1;
		System.out.println("compareToStr:" + str1.compareTo(str2));
		System.out.println("compareToStr:" + str1.compareToIgnoreCase(str2)); // 不区分大小写
		System.out.println("compareToStr:" + str1.compareTo(obj.toString()));
	}

	/**
	 * 查找字符串最后一次出现的位置.
	 */
	private static void lastInedxOfStr() {
		// String str = "zhangpengdong";
		// System.out.println("lastInedxOfStr:" + str.lastIndexOf("n"));
		String strSearch = "This is the string in which you have to search for a substring.";
		String substring = "substring";
		System.out.println("lastInedxOfStr:" + strSearch.lastIndexOf(substring));
	}

	/**
	 * 删除指定字符、截取字符串.
	 */
	private static void substringStr() {
		String str = "this is java";
		System.out.println("substringStr:" + str.substring(0, 3) + str.substring(3 + 1, str.length()));
	}

	/**
	 * 替换字符串.
	 */
	private static void replaceStr() {
		String str = "this is java";
		System.out.println("replaceStr:" + str.replace("is", "ii"));
		System.out.println("replaceStr:" + str.replaceFirst("is", "ss"));
		System.out.println("replaceStr:" + str.replaceAll("is", "aa"));
	}

	/**
	 * 反转字符串
	 */
	private static void reverseStr() {
		// String str = "who are you";
		String str = "public static void";

		System.out.println("反转前：" + str);
		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println("reverseStr：" + reverse);

		System.out.println("reverseStr2:" + reverseStr2(str));
		System.out.println("reverseStr3:" + reverseStr3(str));
		System.out.println("reverseStr4:" + reverseStr4(str));
		System.out.println("reverseStr5:" + reverseStr5(str));
		System.out.println("reverseStr6:" + reverseStr6(str)); // 按单次反转
		System.out.println("reverseStr7:" + reverseStr7(str)); // 同上

	}

	public static String reverseStr2(String s) {
		int length = s.length();
		if (length <= 1) {
			return s;
		}
		String left = s.substring(0, length / 2);
		String right = s.substring(length / 2, length);
		return reverseStr2(right) + reverseStr2(left);
	}

	public static String reverseStr3(String s) {
		String reverse = "";
		for (int i = 0; i < s.length(); i++) {
			reverse = s.charAt(i) + reverse;
		}
		return reverse;
	}

	public static String reverseStr4(String s) {
		char[] array = s.toCharArray();
		String reverse = "";
		for (int i = array.length - 1; i >= 0; i--)
			reverse += array[i];

		return reverse;
	}

	public static String reverseStr5(String orig) {
		char[] s = orig.toCharArray();
		int n = s.length - 1;
		int halfLength = n / 2;
		for (int i = 0; i <= halfLength; i++) {
			char temp = s[i];
			s[i] = s[n - i];
			s[n - i] = temp;
		}
		return new String(s);
	}

	public static String reverseStr6(String orig) {
		List<String> list = Arrays.asList(orig.split(" "));
		Collections.reverse(list);
		String str = "";
		for (String s : list) {
			str += s + " ";
		}
		Collections.swap(list, 0, list.size()-1);
		for (String s : list) {
			System.out.println(s + "");
		}
		return str;
	}

	public static String reverseStr7(String str) {
		char[] arr = str.toCharArray();
		swap(arr, 0, arr.length - 1);
		int begin = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == ' ') {
				swap(arr, begin, i - 1);
				begin = i + 1;
			}
		}
		swap(arr, begin, arr.length - 1);
		return new String(arr);
	}

	public static void swap(char[] arr, int begin, int end) {
		while (begin < end) {
			char temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			begin++;
			end--;
		}
	}

	/**
	 * 查找子字符串出现的位置，如过存在返回字符串出现的位置（第一位为0），如果不存在返回 -1.
	 */
	private static void indexOfStr() {
		String str = "hello ada";
		System.out.println("indexOfStr:" + (str.indexOf("i") > -1));
	}

	/**
	 * 分割字符换；.号需要转义\\.
	 */
	private static void splitStr() {
		String str = "1,2,3,4,5,6";
		System.out.println("splitStr:" + str.split(","));
	}

	/**
	 * 连接字符串比较.
	 */
	private static void lianjieStr() {
		Long s1 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			String result = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";
		}
		System.out.println("lianjieStr - string:" + (System.currentTimeMillis() - s1) + "ms");

		Long s2 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append("This is");
			sb.append("testing the");
			sb.append("difference");
			sb.append("between");
			sb.append("String");
			sb.append("and");
			sb.append("StringBuffer");
		}
		System.out.println("lianjieStr - StringBuffer:" + (System.currentTimeMillis() - s2) + "ms");

		Long s3 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("This is");
			sb.append("testing the");
			sb.append("difference");
			sb.append("between");
			sb.append("String");
			sb.append("and");
			sb.append("StringBuffer");
		}
		System.out.println("lianjieStr - StringBuilder:" + (System.currentTimeMillis() - s3) + "ms");
	}

	public static void main(String[] args) {
		compareToStr();
		lastInedxOfStr();
		substringStr();
		replaceStr();
		reverseStr();
		indexOfStr();
		lianjieStr();
	}

}
