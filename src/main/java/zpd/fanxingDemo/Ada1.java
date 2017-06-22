package zpd.fanxingDemo;

/**
 * http://www.runoob.com/java/java-generics.html.
 *
 * Created by Ad on 2016-09-29.
 */
public class Ada1 {

    public static <E> void soutE(E[] array) {
        for (E e : array) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        String[] str = {"str1", "str2", "str3"};
        Integer[] i = {1, 2, 3};

        soutE(str);

        soutE(i);

    }
}
