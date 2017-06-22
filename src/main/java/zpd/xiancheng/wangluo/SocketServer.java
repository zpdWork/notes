package zpd.xiancheng.wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Ad on 2016-11-22.
 */
public class SocketServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9006);
			System.out.println("服务端启动...");
			Socket client = server.accept();
			System.out.println("客户端：" + client.getInetAddress().getLocalHost() + "成功连接");

			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String str = reader.readLine();
            System.out.println("客户端发送："+str);


        } catch (IOException e) {
			e.printStackTrace();
		}

	}

}
