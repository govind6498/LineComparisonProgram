package com.bridgelabz.linecomparisonprogram;
public class LineComparison {
	class Point{
		double x,y;
		public Point(double x,double y) {
			this.x=x;
			this.y=y;
		}
	}
	Point p1,p2;
	double x1,x2,y1,y2;
	public LineComparison(double xStartPoint,double xEndPoint,double yStartPoint,double yEndPoint){
		this.p1=new Point(xStartPoint,yStartPoint);
		this.p2=new Point(xEndPoint,yEndPoint);
	}
	public double getLegth() {
		return Math.round(Math.sqrt(Math.pow(p2.x-p1.y, 2)+Math.pow(p1.y-p2.y,2)));

	}
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch ");
		LineComparison L1=new LineComparison(7,20,4.8,4.4);
		LineComparison L2=new LineComparison(1.5,1,5.3,5.4);

		//use case 1
		System.out.println("Length of Line 1="+L1.getLegth()+"\t"+"Length of Line 2="+L2.getLegth());
		System.out.println();
	}
}
