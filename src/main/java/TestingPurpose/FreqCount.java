package TestingPurpose;

import org.testng.annotations.Test;

public class FreqCount {
	
	
	@Test
	public void test() {
		

		int[] arr= {1,2,2,3,4,5,5,5,6};
		
		for(int i=0;i<arr.length-1;i++) {
			int count=0;
			while(arr[i] == arr[i+1]) {
				break;
				
				
			}
			count++;
			if(count>1) {
				System.out.println(arr[i]+"----"+count);
			}
		}
	}

}
