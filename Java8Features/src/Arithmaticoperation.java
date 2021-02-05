import java.util.Arrays;
import java.util.List;

public class Arithmaticoperation {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(new Integer[] {22 ,11, 33, 99, 55, 66, 12, 88, 44,  77});
		
		int sum=list.stream().reduce(0,(x,y)->x+y);
		System.out.println("Sum of numbers:"+sum);
		int max=list.stream().reduce(0,(x,y)->x>y?x:y);
		System.out.println("Maximum:"+max);
		int min=list.stream().reduce(99,(x,y)->x<y?x:y);
		System.out.println("Minimum:"+min);
		int even=list.stream().filter(x->x%2==0).reduce(0, (x,y)->x+y);
		System.out.println(even);
		
	}

}
