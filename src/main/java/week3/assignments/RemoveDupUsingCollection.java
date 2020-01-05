package week3.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDupUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "PayPal India";
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (char c : ch) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			
		}
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
			
			if(entry.getValue()==1) {
				System.out.print(entry.getKey());
			}
			
		}
		
		
		
		
		
		
		
		
		/*String replace = str.replace(" ", "");
		char[] charArray = replace.toCharArray();
		List<Character> lis = new ArrayList<Character>();
		for(int i=0; i < charArray.length; i++)
		{
			lis.add(charArray[i]);
		}
		System.out.println(lis);
		for (int i = 0; i < lis.size(); i++) {
			for (int j = 0; j < lis.size(); j++) {
				if(lis.get(i).equals(lis.get(j))) {
					lis.remove(i);
				}
			}
		}
		System.out.println(lis);
				*/
	}
}
									