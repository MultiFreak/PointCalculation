package point;

public class Point {

	private double xCoord,yCoord;
	
	public Point() {
		xCoord = 0;
		yCoord = 0;
	}
	
	public Point(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	
	public String toString() {
		return "X-Coordinate: " + xCoord + " Y-Coordinate: " + yCoord; 
	}
	
	public Point move(Point shift) {
		xCoord += shift.xCoord;
		yCoord += shift.yCoord;
		
		return this;
		
	}
	
	public Point moveTo(Point newPos) {
		xCoord = newPos.xCoord;
		yCoord = newPos.yCoord;
		
		return this;
	}
	
	public Point scale(double factor) {
		xCoord *= factor;
		yCoord *= factor;
		
		return this;
	}
	
	public double distance() {
		return Math.sqrt((xCoord*xCoord + yCoord*yCoord));
	}
	
	public double distance(Point other) {
		double distance = 0;
		
		distance = other.distance() - this.distance();
		if (distance < 0)
			distance *= -1;
		
		return distance;
	}
	
	public boolean equals(Point other) {
		
		if(other.getxCoord() == this.xCoord && other.getyCoord() == this.yCoord)
			return true;
		else
			return false;
		
	}
	
	
	public double getxCoord() {
		return xCoord;
	}

	public double getyCoord() {
		return yCoord;
	}
	
	
	
	
}
