package zpd.suanfa;

/**
 * 合并2个有序数组为一个有序数组.
 *
 * Created by Ada on 2017-12-11.
 */
public class MergeArray {

    private static int[] i1 = {1, 3, 5, 7, 8};
    private static int[] i2 = {2, 4, 6, 8, 10};

    /**
     * 1.简单的思路就是先放到一个新的数组中，再排序。但是这样的没体现任何算法，这里考的不是快速排序等排序算法。
     * ☆☆☆ 关键应该是如何利用 有序已知这个条件。
     * 2.可以这样想，假设两个源数组的长度不一样，那么假设其中短的数组用完了，即全部放入到新数组中去了，那么长数组中剩下的那一段就可以直接拿来放入到新数组中去了。
     * ☆☆☆ 其中用到的思想是：归并排序思想
     * ☆☆☆ 先当两个数组都有元素的时候填充大的到末尾，如果有一个数组的数用完了，说明剩下的那个数组的所有数都小于当前填充的位置：
     */
    private static void method1() {
        int[] result = new int[i1.length + i2.length];
        int i = i1.length - 1;
        int j = i2.length - 1;
        int k = result.length - 1;
        while (i >= 0 && j >= 0) {
//            // 不去重
//            if (i1[i] > i2[j]) {
//                result[k--] = i1[i--];
//            } else {
//                result[k--] = i2[j--];
//            }
            // 去重,如果有重复的话，那result这个数组就会＞实际大小，空着的部分会默认为0
            if (i1[i] > i2[j]) {
                result[k--] = i1[i--];
            } else if (i1[i] == i2[j]) {
                result[k--] = i1[i];
                i--;
                j--;
            } else {
                result[k--] = i2[j--];
            }
        }

        while (i >= 0) {
            result[k--] = i1[i--];
        }

        while (j >= 0) {
            result[k--] = i2[j--];
        }

        for (int i3 : result) {
            System.out.println(i3);
        }
    }

    public static void main(String[] args) {
        method1();
    }

}
