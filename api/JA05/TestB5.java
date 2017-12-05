package JA05;

import java.util.HashSet;
import java.util.Random;

public class TestB5 {
	public static void main(String[] args) {
		Random r = new Random();
		
		
		HashSet<Character> hs  = new HashSet<>();
		while(true) {
			int n =  r.nextInt(26)+97;
			hs.add((char)n);
			if(hs.size()>=26) {
				break;
			}
		}
		for (Character character : hs) {
			System.out.println(character);
		}
		
	}
}	
