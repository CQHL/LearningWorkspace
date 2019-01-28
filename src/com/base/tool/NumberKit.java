package com.base.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberKit {

	 /**
	   * �ж��Ƿ�Ϊ��������
	   * @param num
	   * @return
	   */
	
	  public static boolean isNumber(String num) {
		    try {
		      Double.parseDouble(num);
		    }
		    catch (NumberFormatException ex) {
		      return false;
		    }
		    return true;
		  }
	  /**
	   * �ж��Ƿ�Ϊ����
	   * @param num String
	   * @return boolean
	   */
	  public static boolean isInt(String num) {
	    Pattern pattern = Pattern.compile("^\\d*$");
	    Matcher matcher = pattern.matcher(num.toString());
	    return matcher.matches() ? true : false;
	  }

}
