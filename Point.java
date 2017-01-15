package MASS.Kmeans_java;
import edu.uw.bothell.css.dsl.MASS.Place;
import edu.uw.bothell.css.dsl.MASS.Agent;

public class Point extends Agent{
        public static final int set_    = 0;
        public static final int move_   = 1;
        public static final int weight_ = 2;
        public static final int dist_   = 3;
        public static final int rept_   = 4;

        public static Object callMethod(int functionId, Object args){
            switch(functionId){
                case set_:      return setWeight();
                case move_:     return move();
                case weight_:   return getWeight(args);
                case dist_:     return dist();
                case rept_:     return report();
            }
            return null;
        }
}