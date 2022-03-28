package lesson17;

import org.testng.annotations.Test;

public class WordCount {
	
	public static int findWords(String input) {		
		int count = 1; 		
		for(int i=1; i<input.length(); i++) {
			
			if(input.charAt(i) == ' ' && input.charAt(i+1) !=' ') {
				count++;
			}			
		}
		return count; 
	}
	
	@Test(priority=1)
	public static void wordCount() {
		String str = "It's hard to be humble, when you're as great as I am.";		
		int totalWords = findWords(str);		
		System.out.println("The sentence - " + str + " contains " + totalWords + " words.");
	}
	
	@Test(priority=2)
	public static void findWords2() {
		String str = "It's not where you come from. It's where you're going that counts.";		
		String a[] = str.split(" "); 
		System.out.println("The string contains " +a.length+ " words");
	}

}
