package homework1.ModelElements;

import homework1.Filling.Point3D;

import java.util.ArrayList;
import java.util.List;
public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();

    public Poligon(Point3D point) {
        points.add(point);
    }

}
