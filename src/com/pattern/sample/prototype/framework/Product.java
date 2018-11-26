package com.pattern.sample.prototype.framework;

/**
 * Cloneable ����Ϊ��ǽӿڣ�������Ƿ����ʹ��clone����
 * clone����ʵ����������Object�࣬���Ǳ���ǵ���ſ���ʹ�á�
 * field-to-field-cloneǳ���ƣ�ֻ�����ֶ�ֵ������ָ��ֵ�ᱻ���ƣ�ָ��ͬһ����ַ�����׵��´���
 * @author Administrator
 *
 */
public interface Product extends Cloneable{

	public abstract void use(String s);
	public abstract Product createClone();
	
}