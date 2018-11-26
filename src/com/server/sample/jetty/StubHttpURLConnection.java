package com.server.sample.jetty;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/**
 * HttpURLConnection是一个抽象的公有类，并没有实现一个接口，所以可以继承重写需要替换的方法
 * @author Administrator
 *
 */
public class StubHttpURLConnection extends HttpURLConnection {
	private boolean isInput = true;

	protected StubHttpURLConnection(URL u) {
		super(u);
		// TODO Auto-generated constructor stub
	}
	
	public InputStream getInputStream() throws IOException {
		if(!isInput){
			throw new ProtocolException("Cannot read from URLConnection"+
						" if doInput=false(call setDoInput(true)");
		}
		ByteArrayInputStream bais = new ByteArrayInputStream(
				new String ("It Works").getBytes());
		return bais;
	}
	public void disconnect() { }
	public void connect() throws IOException {	}
	public boolean usingProxy() {
		return false;
	}
}
