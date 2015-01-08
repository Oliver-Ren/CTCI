
public class solution1_3 {
	public static void replaceSpace(char [] str){
		int spaceCount = 0;
		int endpoint = 0;
		for (int i = 0; i < str.length; i++){
			if (str[i] == ' '){
				spaceCount++;
			}
			else endpoint = i;
		}
		
		spaceCount -= str.length - endpoint - 1;
		for ( int i = endpoint; i >= 0; i--){
			if (str[i] != ' ')
				str[i + 2*spaceCount] = str[i];
			else{
				str[i + 2 * spaceCount] = '0';
				str[i + 2 * spaceCount - 1] = '2';
				str[i + 2 * spaceCount - 2] = '%';
				spaceCount--;
			}
		}
	}

//	public static void main(String args[]){
//		String testString = new String("how are you  fdsdf          ");
//		char [] testCharString = testString.toCharArray();
//		System.out.println(testCharString);
//		replaceSpace(testCharString);
//		System.out.println(testCharString);
//		
//	}
}
