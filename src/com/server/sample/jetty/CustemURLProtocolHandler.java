package com.server.sample.jetty;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/**
 * 创建自定义的URL协议处理器，可用于Stub测试客户端时，替换连接进行单元测试
 * 另外一种方法是使用嵌入式的轻量服务器模拟服务器资源
 * 客户端-连接-服务端，在这样的结构下，利用stub替换策略大致就分替换连接和替换服务两种。
 * 
 * 模拟方法是调用URL的setURLStreamHandlerFactory方法，并传入一个自定义的URLStreamHandlerFactory;
 * 无论何时调用URL的openConnection,都会调用这个工厂类返回一个handler对象。
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
		//实例化客户端，并检测客户端是否能正确处理服务器相应
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


