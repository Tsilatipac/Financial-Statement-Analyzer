package com.lcy.test;

import java.util.ArrayList;
import java.util.List;

import com.lcy.utils.AnnouncementDownloader;

public class Alpha {
	public static void main(String[] args) {
		List<String> codes = new ArrayList<String>();
		codes.add("600690");
		codes.add("600519");
		codes.add("000651");
		codes.add("002027");
		codes.add("000333");
		codes.add("603288");
		codes.add("002027");
		codes.add("600887");
		AnnouncementDownloader.downloadByStockCode(codes);
	}
}
