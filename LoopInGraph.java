import java.util.Stack;
import java.util.ArrayList;

public class LoopInGraph{
	public static void main(String[] args){
		
		int n = 2;
		int m = 2;

		ArrayList<ArrayList<Integer>> graph =  new ArrayList<>();   // {{0,1},{1,0}};

		Stack<Integer> stack= new Stack<Integer>(); 
		
		for(int i=0; i<n; i++)
			graph.add(new ArrayList<Integer>());
		
		graph.get(0).add(0);
		graph.get(0).add(1);
		graph.get(1).add(1);
		graph.get(1).add(0);
		

		System.out.println(graph);
	}
}