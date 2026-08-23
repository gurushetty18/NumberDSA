package welocmeToStrings;

import java.util.HashMap;

public class Roman2String {
	
	public static int romanToInteger(String roman) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int res = 0 ;
		int previous = 0 ;
		for (int i = roman.length()-1; i >= 0; i--) {
			
			int value = map.get(roman.charAt(i));
			if (value < previous) {
				res-=value;
			}
			else {
				res += value;
			}
			previous=value;
		}
		return res ;
	}

	public static void main(String[] args) {
		
		 String roman1 = "III";
	        String roman2 = "LVIII";
	        String roman3 = "MCMXCIV";

	        System.out.println(romanToInteger(roman1)); 
	        System.out.println(romanToInteger(roman2)); 
	        System.out.println(romanToInteger(roman3));
	}

}
