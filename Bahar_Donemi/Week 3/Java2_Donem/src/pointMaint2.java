public class pointMaint2 {

    public static void main(String[] args) {

        Point2 pnt = new Point2();
        pnt.x = 3;
        pnt.y = 4;

    //      pnt.translate(2, -1);
    //      System.out.println("point1 = ("+pnt.x + ","+pnt.y+")");
    //    pnt.translate(-5, -7);
    //    System.out.println("point1 = ("+pnt.x + ","+pnt.y+")");

        System.out.println("point1 = ("+pnt.x + ","+pnt.y+")");
        System.out.println("distance from orijin ="+pnt.distanceFromOrigin());
    }

}