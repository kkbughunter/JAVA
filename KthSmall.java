import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class KthSmall{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,1,4,5));
		ArrayList<Integer> res = new ArrayList<Integer>();
		int len = al.size();
		int k = 1;
		
		Collections.sort(al);

		for(int i=0; i<len-1; i++)
			if(al.get(i) != al.get(i+1))
				res.add(al.get(i));
		res.add(al.get(len-1));

		System.out.println(res.get(k));
	}
}