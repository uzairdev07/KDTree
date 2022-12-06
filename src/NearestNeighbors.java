package sci2;

import java.util.List;
import java.util.ArrayList;

public class NearestNeighbors {

  protected java.util.List<Point3D> points; 

  // construct with list of points
  public NearestNeighbors(java.util.List<Point3D> points) {
       
    this.points= points; 
  }

  // gets the neighbors of p (at a distance less than eps)
  public List<Point3D> rangeQuery(Point3D p, double eps) {

    // empty list to contain the neighbors
    List<Point3D> neighbors= new ArrayList<Point3D>(); 

    for (Point3D point: points) {

       if (p.distance(point) < eps) {
		   neighbors.add(point);
	   }
    }
	
    return neighbors;
  }  
}
