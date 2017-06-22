package zpd.string;

/**
 * StringBuffer - HashTable - synchronized
 * StringBuilder - HashMap
 * 速度：StringBuilder > StringBuffer > String
 * <p/>
 * Created by Ada on 2016-06-15.
 */
public class StringBufferStringBuilder {

	public static void main(String[] args) {

		StringBuffer sbf_1 = new StringBuffer(); // HashTable 线程安全 synchronized.....
		StringBuilder sbl_2 = new StringBuilder(); // HashMap

	}

}
