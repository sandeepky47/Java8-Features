import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FruitClass {

	public static void main(String[] args) {

		List<String> fruitList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Fruits");
		int n=sc.nextInt();
		System.out.println("Enter fruit Names");
		for(int i=0;i<n;i++) {
			fruitList.add(sc.next());
		}
		List<String> resultList=fruitList.stream().filter(str->str.charAt(0)!='a'&& str.charAt(0)!='A').collect(Collectors.toList());
		List<String> resultList1=fruitList.stream().map(str->str.toUpperCase()).collect(Collectors.toList());

		resultList.stream().forEach(str->System.out.println(str));
		System.out.println("\nUppercase..");
		resultList1.stream().forEach(str->System.out.println(str));
	}

}
