public class Majsetic{
	public static void main(String[] args){
		int[] array = {1,2,3,4,6,0,0};
		int len = array.length;
		System.out.println(((array[0]+array[1]+array[2]) == (array[len-3]+array[len-2]+array[len-1])) ? 1 : 0);
	}
}