package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrderUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> compName = new ArrayList<String>();
		compName.add("HCL");
		compName.add("Aspire Systems");
		compName.add("CTS");
		Collections.sort(compName);
		Collections.reverse(compName);
		for (String revOrder : compName) {
			System.out.println(revOrder);
		}
	}

}
