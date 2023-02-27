
public class VowelAndConsonantsCounts {
	
	public static void main(String[] args) {
		
		String str = "This is Ram More From PG-DAC";
		
		countVowelAndConsonats(str);
	}

	private static void countVowelAndConsonats(String str) {
		int vowelCount = 0;
		int consonatCount = 0;
		
		for(int i=0; i<str.length(); i++ )
		{
			if(isVowel(str.charAt(i)))
			{
				vowelCount++;
			}
			else
			{
				consonatCount++;
			}
		}
		System.out.println("Vowel Count : "+vowelCount);
		System.out.println("Consonant Count : "+consonatCount);
		
	}

	private static boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'); 
	}

}
