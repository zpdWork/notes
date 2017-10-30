package zpd.xunhuan.remove;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ada on 2017-10-30.
 */
public class ForAndForEach {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        removeFor(list);
        removeForEach(list);

    }

    /**
     * 如果就这么直接移除，那么会有部分数据没有操作到。因为i是一直循环下去的（增加），list的长度又一直在变化（减少）；
     */
    private static void removeFor(List list) {
        print(list);
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
//            i--; // 加上这个以后，可以保证永远都是0，永远都只移除list的第一个元素.
        }
        print(list);
    }

    /**
     * 会报错(Exception in thread "main" java.util.ConcurrentModificationException
     * at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
     * at java.util.ArrayList$Itr.next(ArrayList.java:851)).
     * 原因:是因为forEach是将集合交给迭代器去搞，然而迭代器会有一个长度，每次操作都是hashNext长度不匹配就报错，可以使用迭代器去处理.
     */
    private static void removeForEach(List list) {
        print(list);
        for (Object o : list) {
            list.remove(o);
        }
        print(list);
    }

    private static void print(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("-----------------");
    }

}
