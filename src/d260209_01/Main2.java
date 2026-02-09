package d260209_01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//Map<K, V> map
		//K=key, V=value
		//arp -a
		/*
		Map<String, Socket> map=new HashMap<String, Socket>();
		map.put("172.16.15.53", new Socket("172.16.15.53", 8080));
		map.put("172.16.15.54", new Socket("172.16.15.54", 8080));
		map.put("172.16.15.55", new Socket("172.16.15.55", 8080));
		map.put("172.16.15.57", new Socket("172.16.15.57", 8080));
		System.out.println(map);
		System.out.println(map.get("172.16.15.54"));
		*/
		Map<String, Socket> map2=new HashMap<String, Socket>();
		map2.put("acom", new Socket("172.16.15.53", 8080));
		map2.put("bcom", new Socket("172.16.15.54", 8080));
		map2.put("ccom", new Socket("172.16.15.55", 8080));
		map2.put("dcom", new Socket("172.16.15.57", 8080));
		System.out.println(map2.get("ccom").getRemoteSocketAddress());
		System.out.println(map2.size());
		map2.remove("ccom");
		System.out.println(map2.size());
		
	}

}
