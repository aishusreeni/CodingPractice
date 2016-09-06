import java.util.HashMap;
import java.util.Map;

public class SumPairInArrayElement {
	
	public static boolean check(int[] arr, int sum)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			if(!map.containsKey(sum-arr[i]))
				map.put(sum-arr[i], 1);
			else
				map.put(sum-arr[i], map.get(sum-arr[i])+1);
		}
		for(int i=0;i<length;i++)
		{
			if(map.containsKey(arr[i]) && map.containsKey(sum-arr[i]))
			{
				if(map.containsKey(arr[i]))
				{
					map.put(sum-arr[i], map.get(sum-arr[i])-1);
					if(map.get(arr[i])==0)
						map.remove(arr[i]);
				}
				if(map.containsKey(sum-arr[i]))
				{
					System.out.println(arr[i]+" "+(sum-arr[i]));
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1, 4, 45, 6, 10, -8};
		check(arr,16);
	}

}
