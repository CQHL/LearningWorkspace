package com.base.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateKit {

	  /**
	   * 验证小时分钟秒 00:00:00
	   * @param time String
	   * @return boolean
	   */
	  public static boolean validTime(String time) {
	    if (time == null || time.equals("")) {
	      return false;
	    }
	    Pattern pattern = Pattern.compile(
	        "^([0-1][0-9]|2[0-3])(:[0-5][0-9]){2}|([0-1][0-9]|2[0-3])(:[0-5][0-9]):60|([0-1][0-9]|2[0-3]):60:00|24:00:00");
	    Matcher matcher = pattern.matcher(time);
	    return matcher.matches() ? true : false;
	  }
}
