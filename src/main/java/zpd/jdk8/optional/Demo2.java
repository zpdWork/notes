package zpd.jdk8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Optional类 解析
 *
 * Created by Ada on 2017-9-28.
 */
public class Demo2 {

    public static void main(String[] args) {
        testOf();
        System.out.println("-----------------------");
        testOfNullable();
        System.out.println("-----------------------");
        testIsPresent();
        System.out.println("-----------------------");
//        testOrElse();
        System.out.println("-----------------------");
        testOrElse();
        System.out.println("-----------------------");
        testMap();
    }

    private static void testOf() {
//        String str = null;
//        Optional.of(str); // 传入的参数如果为null，NullPointerException

        String str = "ada";
        Optional optional = Optional.of(str);
        System.out.println(optional.get());
    }

    private static void testOfNullable() {
//        String str = null;
//        Optional optional = Optional.ofNullable(str);
//        System.out.println(optional.get()); // java.util.NoSuchElementException: No value present
    }

    /**
     * isPresent是否存在，存在true
     */
    private static void testIsPresent() {
        String str = null;
        Optional optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        List list = new ArrayList();
        Optional optional2 = Optional.ofNullable(list);
        System.out.println(optional2.isPresent());

    }

    /**
     * 如果Optional实例有值，调用ifPresent()可以接受接口段或lambda表达式。
     */
    private static void testIfPresent() {
        String str = null;
        Optional o1 = Optional.ofNullable(str);
        o1.ifPresent(System.out::println);
    }

    private static void testOrElse() {
        String str1 = "啊啊啊";
        Optional o1 = Optional.ofNullable(str1);
        System.out.println(o1.orElse("asd")); // 啊啊啊
        String str2 = null;
        Optional o2 = Optional.ofNullable(str2);
        System.out.println(o2.orElse("sss")); // sss
    }

    private static void testMap() {
        String str = null;
        Optional o1 = Optional.ofNullable(str);
        Optional o2 = o1.map((s) -> Optional.of(s.toString()));
        if (o2.isPresent()) {
            System.out.println(o2.get());
        }
    }

    /**
     * 全部用一遍，复制的
     */
    private static void testAll() {

        //创建Optional实例，也可以通过方法返回值得到。
        Optional<String> name = Optional.of("Sanaulla");

        //创建没有值的Optional实例，例如值为'null'
        Optional empty = Optional.ofNullable(null);

        //isPresent方法用来检查Optional实例是否有值。
        if (name.isPresent()) {
            //调用get()返回Optional值。
            System.out.println(name.get());
        }

        try {
            //在Optional实例上调用get()抛出NoSuchElementException。
            System.out.println(empty.get());
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
        }

        //ifPresent方法接受lambda表达式参数。
        //如果Optional值不为空，lambda表达式会处理并在其上执行操作。
        name.ifPresent((value) -> {
            System.out.println("The length of the value is: " + value.length());
        });

        //如果有值orElse方法会返回Optional实例，否则返回传入的错误信息。
        System.out.println(empty.orElse("There is no value present!"));
        System.out.println(name.orElse("There is some value!"));

        //orElseGet与orElse类似，区别在于传入的默认值。
        //orElseGet接受lambda表达式生成默认值。
        System.out.println(empty.orElseGet(() -> "Default Value"));
        System.out.println(name.orElseGet(() -> "Default Value"));

//        try {
//            //orElseThrow与orElse方法类似，区别在于返回值。
//            //orElseThrow抛出由传入的lambda表达式/方法生成异常。
//            empty.orElseThrow(ValueAbsentException::new);
//        } catch (Throwable ex) {
//            System.out.println(ex.getMessage());
//        }

        //map方法通过传入的lambda表达式修改Optonal实例默认值。
        //lambda表达式返回值会包装为Optional实例。
        Optional<String> upperName = name.map((value) -> value.toUpperCase());
        System.out.println(upperName.orElse("No value found"));

        //flatMap与map（Funtion）非常相似，区别在于lambda表达式的返回值。
        //map方法的lambda表达式返回值可以是任何类型，但是返回值会包装成Optional实例。
        //但是flatMap方法的lambda返回值总是Optional类型。
        upperName = name.flatMap((value) -> Optional.of(value.toUpperCase()));
        System.out.println(upperName.orElse("No value found"));

        //filter方法检查Optiona值是否满足给定条件。
        //如果满足返回Optional实例值，否则返回空Optional。
        Optional<String> longName = name.filter((value) -> value.length() > 6);
        System.out.println(longName.orElse("The name is less than 6 characters"));

        //另一个示例，Optional值不满足给定条件。
        Optional<String> anotherName = Optional.of("Sana");
        Optional<String> shortName = anotherName.filter((value) -> value.length() > 6);
        System.out.println(shortName.orElse("The name is less than 6 characters"));
    }

}
