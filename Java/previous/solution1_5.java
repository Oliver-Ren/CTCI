
//Compression

public class solution1_5 {
	public static String compressStr(String str){
		if(str == null || str.length() == 0) return null;
		int repeatTime = 1;
		int index = 0, i = 0;
		char [] newString = new char[str.length()];
		for (i = 0; i < str.length(); i++){
			if (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)  ){
				repeatTime++;
			}
			else{
				newString[index] = str.charAt(i);
				if (repeatTime > 1)
					newString[++index] = (char) ('0' + repeatTime);
				index++;
				repeatTime = 1;
			}
		}
		return new String(newString);
	}

	public static void main(String[] args) {
		String testStr = "aaaaaaAAABBBbb";
		String compressedStr = compressStr(testStr);
		System.out.println(testStr);
		System.out.println(compressedStr);
		// TODO Auto-generated method stub

	}

}
