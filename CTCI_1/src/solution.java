import java.util.Arrays;


public class solution {
	
	// Method 1, sorting
	
	public static boolean isPerm(String stra, String strb){
		if (stra.length() != strb.length())
			return false;
		return sortString(stra).equals(sortString(strb));
	}

	
	public static String sortString(String str){
		char [] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
	
	// Method 2, for ASCII checking the char frequency
	
	public static boolean isPerm2(String stra, String strb){
		if(stra.length() != strb.length()) return false;
		int [] charList = new int[128];
		int tempA, tempB;
		for (int i = 0; i < stra.length(); i++){
			tempA = stra.charAt(i);
			tempB = strb.charAt(i);
			charList[tempA]++;
			charList[tempB]--;
		}
		
		for (int i = 0; i < 128; i++){
			if (charList[i] != 0) return false;
		}
		
		return true;
		
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
//		for (String[] pair : pairs){
//			String word1 = pair[0];
//			String word2 = pair[1];
//			boolean sss = isPerm2(word1,word2);
//			boolean sss2 = isPerm(word1, word2);
//			System.out.println(sss+","+sss2);
//
//		}
//
//	}

}
