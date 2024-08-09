package com.Tarak.knowledge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MapInList {
	public static void main(String[] args) {
		Map<Integer ,List<Integer>> map =new HashMap<Integer, List<Integer>>();
		map.put(12, Arrays.asList(15,12,13));
		map.put(13, Arrays.asList(18,13,37));
		map.put(16, Arrays.asList(14,25,36));
		Map<Integer, List<Integer>> eligibleMarks = new HashMap<Integer, List<Integer>>();
		for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
			 int rollNo = entry.getKey();
			 List<Integer> marks =entry.getValue();
		List<Integer> marksGreaterThen15 = new ArrayList<Integer>();
		for(int mark : marks ) {
			if(mark>15) {
				marksGreaterThen15.add(mark);
			}
		}
			if(!marksGreaterThen15.isEmpty()) {
				eligibleMarks.put(rollNo, marksGreaterThen15);
			}
		}
		for(Map.Entry<Integer,List<Integer>> entry1 : eligibleMarks.entrySet()) {
			int rollNo = entry1.getKey();
			List<Integer> marks =entry1.getValue();
			System.out.println("rollNo :" + rollNo + " marks :"+ marks);
		}
		}
	}
