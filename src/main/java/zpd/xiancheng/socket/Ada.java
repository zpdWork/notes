package zpd.xiancheng.socket;

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Map;

/**
 * Created by Ad on 2016-11-22.
 */
public class Ada {

	private static void getIp() {
		try {
			InetAddress address = InetAddress.getByName("www.waiqin.com.cn");
			System.out.println(address.getHostName() + " " + address.getHostAddress() + " " + address.getAddress());

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	private static void pingAddress() {
		try {
			InetAddress address;
			// Socket socket = new Socket("www.waiqin.com.cn", 80);
			// Socket socket = new Socket("www.bigtree.cn", 80);
			Socket socket = new Socket("agent.bigtree.cn", 80);
			System.out.println("pingAddress连接：" + socket.getInetAddress());
		} catch (IOException e) {
			System.out.println("pingAddress连接异常：" + e.getMessage());
		}
	}

	private static void urlTest() {
		try {
			// URL url = new
			// URL("http://www.w3cschool.cc/html/html-tutorial.html"); // Server
			// [Tengine]
			URL url = new URL("http://www.waiqin.com.cn/mts/main/localInit.ds");
			System.out.println("urlTest-地址：" + url.toString());
			System.out.println("urlTest-协议：" + url.getProtocol());
			System.out.println("urlTest-文件名" + url.getFile());
			System.out.println("urlTest-主机：" + url.getHost());
			System.out.println("urlTest-路径：" + url.getPath());
			System.out.println("urlTest-端口号：" + url.getPort());
			System.out.println("urlTest-默认端口：" + url.getDefaultPort());

			// 响应头信息
			URLConnection con = url.openConnection();
			Map<String, List<String>> headerMap = con.getHeaderFields();
			for (String s : headerMap.keySet()) {
				System.out.println("urlTest响应头[" + s + " " + headerMap.get(s) + "]");
			}

			// 抓取页面
			// url.openStream()
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter("d://url_zhuaqu.html"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
			reader.close();
			writer.flush();
			writer.close();
		} catch (MalformedURLException e) {
			System.out.println("urlTest异常：" + e.getMessage());
		} catch (IOException e) {
			System.out.println("urlTest连接异常：" + e.getMessage());
		}
	}

	public static void getLocIpAndLocName() {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			System.out.println(
					"getLocIpAndLocName本机名称：" + inetAddress.getHostName() + " 本机IP：" + inetAddress.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	public static void isUsePort(int port) {
		try {
			Socket socket = new Socket("localhost", port);
			System.out.println("isUsePort:" + port + "已被使用");
		} catch (ConnectException e1) {
			System.out.println("isUsePort:" + port + "未被使用");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getIp();
		pingAddress();
		urlTest();
		getLocIpAndLocName();
		isUsePort(8080);
	}

}
