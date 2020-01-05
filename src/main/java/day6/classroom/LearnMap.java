package day6.classroom;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.collections4.Get;

public class LearnMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Rajkumar";
		char[] charArray = name.toCharArray();
		Map<Character,Integer> exMap = new LinkedHashMap<Character,Integer>();
		for (char c : charArray) {
			if(exMap.containsKey(c)) {
				int count = exMap.get(c)+1;
				//exMap.put(c, exMap.get(c)+1);	
				exMap.put(c, count);
			}
			else {
				exMap.put(c, 1);
			}
		}
		System.out.println(exMap);
	}

}
