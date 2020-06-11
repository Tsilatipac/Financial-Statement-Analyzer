package com.lcy.utils;

import java.text.DecimalFormat;
import java.text.ParseException;

public class MyFormatUtils {
	public static Double parseDouble(String doubleStr) {
		if(doubleStr==null) {
			return 0.0;
		}
		Double d = null;
		DecimalFormat format = new DecimalFormat(",#.#");
		try {
			d = format.parse(doubleStr).doubleValue();
		} catch (ParseException e) {
			
		}
		return d;
	}
}
