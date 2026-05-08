package TestingPurpose;

import org.testng.annotations.Test;

public class SearchElement {

	@Test
	public void test() {
		int[] arr= {1,2,3,4,5,6};
		
		int value=4;
		int index=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				index=i;
				break;
			}
		}
		if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
	}
}
