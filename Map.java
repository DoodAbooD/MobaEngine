package sample;

public class Map {
      private Point terrain;
      private Point
      private Map(){
      }
      static Map gameMap = new Map();

      public static Map getInstance(){
            return gameMap;

      }

}
