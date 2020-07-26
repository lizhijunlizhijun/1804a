package com.lizhijun.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class MyTest {

	public static void main(String[] args) {
		String str = "HTTP server";
		String[] split = str.split("");
		Map<String,Integer> map = new HashMap<String, Integer>();
		for (String string : split) {
			if(map.get(string)!=null){
				map.put(string, map.get(string)+1);
			}else{
				map.put(string,1);
			}
		}
		
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getKey().matches("[a-zA-Z]+")){
				System.out.println(entry.getKey()+""+entry.getValue());
			}
		}
		
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			if(string.matches("[a-zA-Z]+")){
				System.out.println(string+""+map.get(string));
			}
		}
		
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			if(key.matches("[a-zA-Z]+")){
				System.out.println(key+""+map.get(key));
			}
		}
		
		Set<Entry<String,Integer>> entrySet2 = map.entrySet();
		for (Entry<String, Integer> entry : entrySet2) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}
}
