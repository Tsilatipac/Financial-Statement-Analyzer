package com.lcy.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegUtils {
	/**
	 * 匹配一个结果的正则表达式
	 * @param pattern 表达式
	 * @param target 目标文本
	 * @return 匹配到的第一个结果
	 */
	public static String parseOne(String pattern, String target) {
		Pattern reg = Pattern.compile(pattern);
		Matcher matcher = reg.matcher(target);
		if(matcher.find()) {
			return matcher.group();
		}else {
			return null;
		}
	}
}
