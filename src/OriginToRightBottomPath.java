
public class OriginToRightBottomPath {
	
	public static boolean findPath(int[][] mat, int m, int n, String path)
	{
		if(m<0 || n<0 || mat[m][n]==-1)
			return false;
		if((m==0&&n==0)||findPath(mat,m-1,n,path)||findPath(mat,m,n-1,path))
		{
			path+=m+","+n+" ";
			System.out.print(path);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int[][] arr = {{0,-1,0},{0,0,-1},{-1,0,0},{0,0,0},{0,-1,0}};
		System.out.println(findPath(arr,4,2,""));
	}

}
