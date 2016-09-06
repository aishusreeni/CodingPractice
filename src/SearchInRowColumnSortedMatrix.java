
public class SearchInRowColumnSortedMatrix {
	
	public static boolean search(int data, int i, int j, int[][] arr)
	{
		System.out.println();
		if(i<0 || j<0 || i>3 || j>3)
			return false;
		boolean val = false;
		if(data==arr[i][j])
			val = true;
		if(data<arr[i][j])
			return val||search(data,i,j-1,arr);
		else
			return val||search(data,i+1,j,arr);
	}
	
	public static void main(String[] args)
	{
		int[][] arr = {{1,3,5,10},{4,8,11,15},{6,10,15,16},{8,11,20,30}};
		System.out.println(search(9,0,3,arr));
	}
}
