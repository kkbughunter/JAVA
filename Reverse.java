public class Reverse{
	
	public static void main(String[] args){

		StringBuffer str = new StringBuffer("Iam Cyber Security Expert.");
		// System.out.println(reverse(str));
		System.out.println(reverseWord(str));
	}

	public static StringBuffer reverse(StringBuffer str){
		if(str == null) 
			return null;
		StringBuffer res = new StringBuffer();
		for(int i=str.length() -1; i>=0; i--)
			res.append(str.charAt(i));
		
		return res;

	}

	public static StringBuffer reverseWord(StringBuffer str){
		StringBuffer res = new StringBuffer();
		StringBuffer temp = new StringBuffer();

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				temp.append(" ");
				res.append(reverse(temp));
				temp.setLength(0);
			}
			else temp.append(str.charAt(i));
		}
		return res;
	}
}