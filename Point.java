package MASS.Kmeans_java;
import edu.uw.bothell.css.dsl.MASS.*;

public class Point extends Agent{
        public static final int set_    = 0;
        public static final int move_   = 1;
        public static final int weight_ = 2;
        public static final int dist_   = 3;
        public static final int rept_   = 4;

        private Vector<int[]> neighbors = new Vector<>();
        private int weight;
        private boolean lock;
        private int[] movement;
        
        public Point(){
            super();
        }

        public Point(Object obj){
            super();
            movement = new int[2];
            neighbors.add(new int[]{0, -1});
            neighbors.add(new int[]{1, 0});
            neighbors.add(new int[]{0, 1});
            neighbors.add(new int[]{-1, 0});
            setWeight();
        }
        public static Object callMethod(int functionId, Object args){
            switch(functionId){
                case set_:      return setWeight();
                case move_:     return move();
                case weight_:   return getWeight(args);
                case dist_:     return dist();
            }
            return null;
        }

        private Object setWeight(){
            weight = Math.random() % 20 + 1;
            return null;
        }

        public int getWeight(){
            return weight;
        }

        private Object distance(){
            int m = getPlace().getMean();
            int dist = Math.abs(weight - m);
            if(dist <= m){
                lock = true;
            } else {
                lock = false;
            }
            return null;
        }

        private Object move(){
            if(!lock){
                movement = getPlace().sendNextMove();
                migrate(movement[0], movement[1]);
            }
            return null;
        }
}