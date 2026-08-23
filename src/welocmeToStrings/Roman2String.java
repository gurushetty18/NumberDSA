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
		for (int i = roman.length() - 2; i >= 0; i--) {
			
			if (map.get(roman.charAt(i)) < map.get(roman.charAt(i+1))) {
				res -= map.get(roman.charAt(i)) ;
			}
			else {
				res += map.get(roman.charAt(i)) ;
			}
		}
		res +=map.get(roman.charAt(roman.length()-1));
		return res ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String roman = "III" ;
System.out.println(romanToInteger(roman));;
	}

}
