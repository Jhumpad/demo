package maccess;

import java.util.List;
import java.util.stream.Stream;

public class DemoProg3_map {
public static void main(String[] args) {
	//List<Integer> ob=new ArrayList<Integer>();
	List<Integer> ob=List.of(2,1,6,4,5);//creating immutable object
	System.out.println("===Normal List===");
	System.out.println(ob.toString());
	System.out.println("===map()===");
//	ob.add(new Integer(11));
//	ob.add(new Integer(10));
//	ob.add(new Integer(7));
//	ob.add(new Integer(18));
	System.out.println();
	Stream<Integer> sm=ob.stream();
	sm.map((x)->x*x).forEach((y)->System.out.println(y));
	System.out.println(ob.toString());
}
}
