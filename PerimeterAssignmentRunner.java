import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        int count=0;
        for(Point currPt: s.getPoints())
        {
            count++;
        }
        // Put code here
        return count;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        double avg,count=0,totalPerim=0.0;
        Point prev = s.getLastPoint();
        for(Point curr: s.getPoints())
        {
            double currdist = prev.distance(curr);
            totalPerim = totalPerim + currdist;
            prev = curr;
            count++;
        }
        avg=(totalPerim/count);
        return avg;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        double max=0;
        Point prev = s.getLastPoint();
        for(Point curr: s.getPoints())
        {
            double currdist = prev.distance(curr);
            if(max<currdist)
            {
                max=currdist;
            }
            prev=curr;
        }
        return max;
    }

    public double getLargestX(Shape s) {
        // Put code here
        double larX=0.0,max=0.0,x;
        Point prev = s.getLastPoint();
        for(Point curr: s.getPoints())
        {
            x=curr.getX();
            if(max<x)
            {
                max=x;
            }
            prev=curr;
        }
        return max;
    }

    public double getLargestPerimeterMultipleFiles() {
        double largestperimeter=0.0;
        DirectoryResource dr = new DirectoryResource();
        FileResource largestfile=null;
        
        for (File f : dr.selectedFiles())
        {              
            FileResource fr = new FileResource(f);
            Shape myshape= new Shape(fr);
            double perim = getPerimeter(myshape);
            if(perim > largestperimeter)
            {
                largestperimeter=perim;
            }
        
        }
       
        return largestperimeter;
    }

    public File getFileWithLargestPerimeter() {
        // Put code here
         File fileName = null;
        double largestPerim = 0;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double currPerim =    getPerimeter(s);
            if (currPerim > largestPerim){
                largestPerim = currPerim;
                fileName = f;
            }
        }
        return fileName;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        //int numofpoints = getNumPoints(s);
        System.out.println("Perimeter = " + length);
        //System.out.println("No. of points = "+numofpoints);
        double avgofSide = getAverageLength(s);
        System.out.println("Average length = "+avgofSide);
        double largestside = getLargestSide(s);
        System.out.println("Largest Side ="+largestside);
        //double largeX = getLargestX(s);
        //System.out.println("Largest X = "+largeX);
        //testPerimeterMultipleFiles();
        
    }
    
    public void testPerimeterMultipleFiles() {
        double largest = getLargestPerimeterMultipleFiles();
        System.out.println("Largest perimeter is : "+largest);
    }

    public void testFileWithLargestPerimeter() {
        File fileName = getFileWithLargestPerimeter();
        System.out.println("Name of file with largest perimeter is ="+fileName);
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        //pr.printFileNames();
        //pr.testFileWithLargestPerimeter();
        //pr.testPerimeterMultipleFiles();
        
    }
}
