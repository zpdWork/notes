package zpd.xiancheng.wangluo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by Ad on 2016-11-22.
 */
public class SocketClient {

	public static void main(String[] args) {

		try {
			Socket client = new Socket("127.0.0.1", 9006);

			OutputStream out = client.getOutputStream();

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			writer.write("啊大测试 ada-test");
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
