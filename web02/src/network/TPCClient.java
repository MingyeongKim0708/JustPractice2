package network;

import java.net.Socket;

public class TPCClient {

	public static void main(String[] args) throws Exception{
		for (int i = 0; i < 1000; i++) {
			// 서버 ip + port 연결해줘
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트가 서버로 요청을 보냄");
		}

	}

}
