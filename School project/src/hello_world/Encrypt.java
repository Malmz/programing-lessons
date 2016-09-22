package hello_world;

public class Encrypt {

	char c1;
	String s1;
	String s2 = "";

	public int getNum(char c1) {
		
		int num = (int)c1;
		if(num <= (int)'z' & num >= (int)'a'){
			return num-96;
		}
		else{
			return -1;
		}
		
	}
	
	public String decrypt(String s1) {
		for (int i = 0; i < s1.length();) {
			int jump = getNum(s1.charAt(i));
			s2 += s1.charAt(i);
			i += jump;
		}
		
		return s2;
	}
	
	public static void main(String[] args) {
		Encrypt e1 = new Encrypt();
		System.out.println(e1.decrypt("hzbkryafeaaaaj"));
		
	}
	
}
