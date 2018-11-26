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
 * Jetty 是一个嵌入式的轻量级服务器，使用java代码就可以启动一个服务器
 * 可以用于测试的时候模拟服务器测试客户端
 * 这个示例代码是低版本的 jetty7.6的，代码和高版本不太一样；
 * Include:
 * 		<jetty-all-7.6.21.jar> 我自己整合的jetty jar包
 * 		<servlet-api-2.5.jar>  比较通用的jsp包，需要使用Http相关class
 *
 * 如何挑选 jetty版本 参考博文链接：https://blog.csdn.net/qq_37878579/article/details/78404931
 * 下载JAR文件 链接：http://www.eclipse.org/jetty/
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
