package com.server.sample.jetty;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/**
 * �����Զ����URLЭ�鴦������������Stub���Կͻ���ʱ���滻���ӽ��е�Ԫ����
 * ����һ�ַ�����ʹ��Ƕ��ʽ������������ģ���������Դ
 * �ͻ���-����-����ˣ��������Ľṹ�£�����stub�滻���Դ��¾ͷ��滻���Ӻ��滻�������֡�
 * 
 * ģ�ⷽ���ǵ���URL��setURLStreamHandlerFactory������������һ���Զ����URLStreamHandlerFactory;
 * ���ۺ�ʱ����URL��openConnection,���������������෵��һ��handler����
 * @author Administrator
 * {@link }
 *
 */
public class CustemURLProtocolHandler {
	public static void main(String[] args){
		//@beforclass
		CustemURLProtocolHandler example = new CustemURLProtocolHandler();
		URL.setURLStreamHandlerFactory(example.new StubStreamHandlerFactory() );
		//@test
		//ʵ�����ͻ��ˣ������ͻ����Ƿ�����ȷ�����������Ӧ
//		WebClient client = new WebClient();
//		String result = client.getContent(new URL("http://localhost"));
//		assertEquals("It works", result);
	}
	
	private class StubStreamHandlerFactory implements URLStreamHandlerFactory{
		public URLStreamHandler createURLStreamHandler(String protocol){
			return new StubHttpURLStreamHandler();
		}
	}
	private class StubHttpURLStreamHandler extends URLStreamHandler{
		public StubHttpURLStreamHandler() {
			// TODO Auto-generated constructor stub
		}

		protected URLConnection openConnection(URL url) throws IOException{
			return new StubHttpURLConnection(url);
		}
	}
}


