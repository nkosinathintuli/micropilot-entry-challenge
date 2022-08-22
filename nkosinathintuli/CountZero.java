/**
  *@author Nkosinathi Ntuli
  *@version 1.0
  */

public class CountZero{

	public int countZero(int[] arr){
		int count=0;
		for (int i=0; i<arr.length; i++){
			if (arr[i]==0)
				count++;
		}
		return count;
	}
}
