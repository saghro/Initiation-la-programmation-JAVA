
package serie4.exinterface;


public class Carre extends Polygone implements Translation{

    Point point1;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }
    int cote ;

    public Carre(Point point1, int cote) {
        this.point1 = point1;
        this.cote = cote;
    }
    
    
    
    
    @Override
    public double calculSurface() {
       return  cote*cote;
    }

      @Override
    public void transler(int dx , int dy){
        point1.setX(point1.getX()+dx) ;
        point1.setY(point1.getY()+dy) ;
        
    }
    
}
