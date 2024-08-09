package com.Tarak.knowledge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ExamplesOfMap { 
	public static void main(String [] args) {
		Map <String,String> map =new HashMap<>();
		map.put("Ap","Amaravathi");
		map.put("Mp", "Bhopal");
		map.put("Up", "Lucknow");
		map.put("Tg", "Hyderabad");
		map.put("Arunachal", "Impal");
		map.put("Tamilnadu", "Chennai");
		map.put("Karnataka", "Bangalore");
		  List<String> keys =new ArrayList<>(map.keySet());
		  Collections.sort(keys);
		  System.out.println(keys); 
		  for(String key : keys) {
			  if(key.startsWith("A")) {
				  System.out.println("key :" + key + ", value :" +map.get(key));
			  }
		 }
		  for(int i=0;i<keys.size();i++) {
			  String key =keys.get(i);
			  if(key.endsWith("p")) {
			        System.out.println("key :" + key + ", value :" + map.get(key));
			    }
			}		
	}
}
