package com.base.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberKit {

	 /**
	   * 判断是否为数字类型
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
	   * 判断是否为整型
	   * @param num String
	   * @return boolean
	   */
	  public static boolean isInt(String num) {
	    Pattern pattern = Pattern.compile("^\\d*$");
	    Matcher matcher = pattern.matcher(num.toString());
	    return matcher.matches() ? true : false;
	  }

}
