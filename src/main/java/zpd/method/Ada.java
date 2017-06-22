package zpd.method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ad on 2016-11-09.
 */
public class Ada {

	/**
	 * instanceof 判断当前对象是不是指定类.
	 * 
	 * @param o
	 */
	private static void instanceofObj(Object o) {
		if (o instanceof ArrayList) {
			System.out.println("instanceofObj:ArrayList");
		} else if (o instanceof HashMap) {
			System.out.println("instanceofObj:HashMap");
		}
	}

	// void asd(){} //默认只能包内访问.

	public static void main(String[] args) {
		Map obj = new HashMap();
		instanceofObj(obj);

	}

}
