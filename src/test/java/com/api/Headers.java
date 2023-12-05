package com.api;

import java.util.HashMap;

public class Headers {

	public static HashMap<String, String> createRecordHeader() {
		HashMap<String, String> header = new HashMap<>();
		header.put("Content-Type", "application/json");
		header.put("X-Tenant-Id", "5");
		header.put("X-User-Name", "govardhan_analyst");
		header.put("X-User-Role", "maker");
		return header;
	}
}
