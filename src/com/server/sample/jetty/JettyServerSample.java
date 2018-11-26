package com.server.sample.jetty;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.servlet.ServletContextHandler.Context;

/**
 * Jetty ��һ��Ƕ��ʽ����������������ʹ��java����Ϳ�������һ��������
 * �������ڲ��Ե�ʱ��ģ����������Կͻ���
 * ���ʾ�������ǵͰ汾�� jetty7.6�ģ�����͸߰汾��̫һ����
 * Include:
 * 		<jetty-all-7.6.21.jar> ���Լ����ϵ�jetty jar��
 * 		<servlet-api-2.5.jar>  �Ƚ�ͨ�õ�jsp������Ҫʹ��Http���class
 *
 * �����ѡ jetty�汾 �ο��������ӣ�https://blog.csdn.net/qq_37878579/article/details/78404931
 * ����JAR�ļ� ���ӣ�http://www.eclipse.org/jetty/
 * @author Administrator
 *
 */
public class JettyServerSample {
	public static void main(String[] args) throws Exception{
		Server server = new Server(8081);
		server.setHandler(new HelloWorld());
		server.start();
		server.join();
	}
	
}

 class HelloWorld extends AbstractHandler{
	@Override 
	public void handle(String target, 
			Request baseRequest,  
            HttpServletRequest request,   
            HttpServletResponse response) throws IOException, ServletException  
	{  
		 response.setContentType("text/html;charset=utf-8");  
		 response.setStatus(HttpServletResponse.SC_OK);  
		 baseRequest.setHandled(true);  
		 response.getWriter().println("<h1>Hello World</h1>");  
	}
}
