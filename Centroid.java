package MASS.KMeans_java;
import edu.uw.bothell.css.dsl.MASS.Place;

public class Centroid extends Place {
    public static final int init_    = 0;
    public static final int mean_    = 1;
    public static final int update_  = 2;
    public static final int sig_     = 3;
    public static final int findv_   = 4;
    public static final int getNext_ = 5;
    public static final int rept_    = 6;

    public static Object callMethod(int functionId, Object args){
        switch(functionId){
            case init_:    return init(args);
            case mean_:    return getMean(args);
            case update_:  return update();
            case sig_:     return signal();
            case findv_:   return findValid();
            case getNext_: return sendNextMove();
            case rept_:    return report();
        }
        return null;
    }
}