
package MASS.KMeans_java;
import edu.uw.bothell.css.dsl.MASS.*;

public class Centroid extends Place {
    public static final int init_    = 0;
    public static final int update_  = 1;
    public static final int sig_     = 2;
    public static final int findv_   = 3;
    public static final int getNext_ = 4;
    public static final int rept_    = 5;

    private int mean;
    private int csize;
    private int[] nextMove;
    private int arrX, arrY, localX, localY; // array dimensions and local dimensions

    public Centroid(){
        super();
        nextMove = new int[2];
        Vector<int[]> neighbors = new Vector<>();
        neighbors.add(new int[]{0,-1});
        neighbors.add(new int[]{1,0});
        neighbors.add(new int[]{0,1});
        neighbors.add(new int[]{-1,0});
        setNeighbors(neighbors);
    }
    
    public Centroid(Object obj){
        super();
        nextMove = new int[2];
        Vector<int[]> neighbors = new Vector<>();
        neighbors.add(new int[]{0,-1});
        neighbors.add(new int[]{1,0});
        neighbors.add(new int[]{0,1});
        neighbors.add(new int[]{-1,0});
        setNeighbors(neighbors);
    }

    public static Object callMethod(int functionId, Object args){
        switch(functionId){
            case init_:    return init(args);
            case update_:  return update();
            case sig_:     return signal();
            case findv_:   return findValid();
            case getNext_: return sendNextMove();
        }
        return null;
    }

    // initializes essential data for the Centroid
    private Object init(){
        arrX = getSize()[0];
        arrY = getSize()[1];       // places array size
        localX = getIndex()[0]; localY = getIndex()[1]; // my coordinates
        mean = Math.random() % 20 + 1;
        csize = 0;
        return null;
    }

    //returns mean to point
    public int getMean(){
        return mean;
    }

    // checks inmessages for a valid place to move the unlocked points
    private Object findValid(){
        return null;
    }

    //sends next move to unlocked points
    public int[] sendNextMove(){
        return nextMove;
    }

    // updates mean of centroids
    private Object update(){
        int sum = 0;
        int total = getAgents().size();
        
        // loop logic to sum up weights of agents and compute new mean
        
        /* Set<Point> points = getAgents();
           Iterator iter = points.iterator();
           while(iter.hasNext()){
               sum += iter.next().getWeight();
           }
           mean = sum / total; */
        return null; 
    }

}