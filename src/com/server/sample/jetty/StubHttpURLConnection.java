package com.server.sample.jetty;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

/**
 * HttpURLConnection��һ������Ĺ����࣬��û��ʵ��һ���ӿڣ����Կ��Լ̳���д��Ҫ�滻�ķ���
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
