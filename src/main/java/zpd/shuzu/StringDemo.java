package zpd.shuzu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ad on 2016-09-04.
 */
public class StringDemo {


    public static void main(String[] args) {

        String[] str1 = {"1", "2", "3", "4", "5", "3", "3", "2"};
        System.out.println("长度：" + str1.length);
        System.out.println("------------------------------");
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        for (String s : str1) {
            if (!l1.contains(s)) {
                l1.add(s);
            } else {
                l2.add(s);
            }
        }
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("------------------------------");

        Map<String, Integer> m1 = new HashMap<String, Integer>();
        Map<String, Integer> m2 = new HashMap<String, Integer>();
        for (String s : str1) {
            if (!m1.containsKey(s)) {
                m1.put(s, 1);
            } else {
                m2.put(s, null != m2.get(s) ? m2.get(s) + 1 : 1);
            }
        }

        System.out.println("不重复：" + m1);
        System.out.println("重复：" + m2);
        System.out.println("------------------------------");



    }


}
