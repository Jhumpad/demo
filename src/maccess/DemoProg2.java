package maccess;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoProg2 {
	@SuppressWarnings("unused")
public static void main(String[] args) {
		System.out.println("===Array-Stream");
	Integer a[]= {9,4,2,11,7};
	Stream<Integer> sm=Arrays.stream(a);
	//sm.forEach((y)->System.out.println(y));
	 sm.filter(x->x%2==0).forEach((y)->System.out.println(y));
	System.out.println("===collection-Stream===");
	List<Integer> ob=List.of(9,4,2,11,7);
	Stream<Integer> sm2=ob.stream();
	//sm2.forEach((y)->System.out.println(y));
	sm2.filter(x->x%2==0).forEach((y)->System.out.println(y) );
}
}
