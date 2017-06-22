package zpd.staticDemo;

/**
 * static、extends加载顺序.
 */
public class A {

    B b = new B();

    static {
        System.out.println("A - static");
    }

    A() {
        System.out.println("A - ()");
    }

    public static void main(String[] args) {
        /**
         * 1.先加载main方法所在的类。·
         * 2.先静态、再构造、先父级、后子级。
         * 3.类中的静态方法，永远只会再一开始加载一次，之后不会再加载。
         * 4.所以顺序为：先加载A类 - A类静态 - C类静态 - （继承A - new B实例 - B构造 - A构造） - 继承输出完毕后，返回当前实例 - 同样new b实例 - B构造 - C构造
         */
        new C();
    }
}

class B {
    B() {
        System.out.println("B - ()");
    }
}

class C extends A {
    B b = new B();

    static {
        System.out.println("C - static");
    }

    C() {
        System.out.println("C - ()");
    }
}
