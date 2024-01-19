import java.util.Arrays;
public class binarySearch {
	public static void main(String[] args)
	{
		int arr[] = {1,3,5,6};

		Arrays.sort(arr);

		int key = 2;
		int res = Arrays.binarySearch(arr, key);

		System.out.println(res); // if the key is not present then it return the - value of where the searching data want to insert (Math.abs(res) - 1)
	}

}
