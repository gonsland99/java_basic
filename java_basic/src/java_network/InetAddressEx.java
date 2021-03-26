package java_network;

import java.net.*;

public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress iadr;
		iadr = InetAddress.getLocalHost();
		System.out.println("로컬호스트 이름: "+iadr.getHostName());
		System.out.println("로컬호스트 IP주소: "+iadr.getHostAddress());
		
		iadr = InetAddress.getByName("en.wikipedia.org");
		System.out.println("위키호스트 이름: "+iadr.getHostName());
		System.out.println("위키호스트 IP주소: "+iadr.getHostAddress());
		
		byte[] addr = new byte[4];
		addr[0] = (byte)121;		
		addr[1] = (byte)189;		
		addr[2] = (byte)40;		
		addr[3] = (byte)10;	
		iadr = InetAddress.getByAddress(addr);
		System.out.println("줌호스트 이름: "+iadr.getHostName());
		System.out.println("줌호스트 이름: "+iadr.getCanonicalHostName());
		System.out.println("줌호스트 IP주소: "+iadr.getHostAddress());
		
		InetAddress iadrArray[];
		iadrArray = InetAddress.getAllByName("www.naver.com");
		for(InetAddress seq : iadrArray) {
			System.out.println("줌호스트 이름: "+seq.getHostName());
			System.out.println("줌호스트 IP주소: "+seq.getHostAddress());
		}
	}
}
