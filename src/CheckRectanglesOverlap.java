class point
{
	int x;
	int y;
}

public class CheckRectanglesOverlap {
	
	public static boolean overlap(point l1, point r1, point l2, point r2)
	{
		if(l1.x > r2.x || l2.x > r1.x)
			return false;
		if(l1.y < r2.y || l2.y < r1.y)
			return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		point l1 = new point();
		l1.x=0; l1.y=10;
		point r1 = new point();
		r1.x=10; r1.y=0;
	    point l2 = new point();
	    l2.x=5; l2.y=5;
	    point r2 = new point();
	    r2.x=15; r2.y=0;
	    if (overlap(l1, r1, l2, r2))
	        System.out.println("Rectangles Overlap");
	    else
	        System.out.println("Rectangles Don't Overlap");
	}

}
