package welocmeToStrings;

import java.util.HashMap;
import java.util.Iterator;

public class Isomorphic {
	
	public static boolean isIsomorphic(String s , String t) {
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if (hm.containsKey(c1)) {
				if (hm.get(c1) != c2) {
					
					return false;
				}
				
				}
				else
				{
					hm.put(c1, c2);
				}
				
			}
//			if (hm.containsKey(c2)) {
//				if (hm.get(c2) != c1) {
//					return false;
//				}
//				else
//					hm.put(c2, c1);
//			}
//			
//		}
		return true;
		
	}
public static void main(String[] args) {
	
	String s = "add";
	String t = "egg";
	
	System.out.println(isIsomorphic(s,t));
	
}
}
