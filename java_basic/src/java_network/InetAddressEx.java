package java_network;

import java.net.*;

public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress iadr;
		iadr = InetAddress.getLocalHost();
		System.out.println("����ȣ��Ʈ �̸�: "+iadr.getHostName());
		System.out.println("����ȣ��Ʈ IP�ּ�: "+iadr.getHostAddress());
		
		iadr = InetAddress.getByName("en.wikipedia.org");
		System.out.println("��Űȣ��Ʈ �̸�: "+iadr.getHostName());
		System.out.println("��Űȣ��Ʈ IP�ּ�: "+iadr.getHostAddress());
		
		byte[] addr = new byte[4];
		addr[0] = (byte)121;		
		addr[1] = (byte)189;		
		addr[2] = (byte)40;		
		addr[3] = (byte)10;	
		iadr = InetAddress.getByAddress(addr);
		System.out.println("��ȣ��Ʈ �̸�: "+iadr.getHostName());
		System.out.println("��ȣ��Ʈ �̸�: "+iadr.getCanonicalHostName());
		System.out.println("��ȣ��Ʈ IP�ּ�: "+iadr.getHostAddress());
		
		InetAddress iadrArray[];
		iadrArray = InetAddress.getAllByName("www.naver.com");
		for(InetAddress seq : iadrArray) {
			System.out.println("��ȣ��Ʈ �̸�: "+seq.getHostName());
			System.out.println("��ȣ��Ʈ IP�ּ�: "+seq.getHostAddress());
		}
	}
}
