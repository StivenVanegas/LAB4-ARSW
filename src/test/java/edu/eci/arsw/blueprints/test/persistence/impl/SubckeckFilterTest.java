package edu.eci.arsw.blueprints.test.persistence.impl;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.impl.SubcheckFilter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class SubckeckFilterTest {

    @Test
    public void subsamplingFiltering(){
        SubcheckFilter caso1 = new SubcheckFilter();
        Point[] points = {new Point(1,2), new Point(3,4), new Point(5,6), new Point(7,8), new Point(9,10)};
        Blueprint blueprint = new Blueprint("Stiven","Janer",points);
        blueprint = caso1.filter(blueprint);
        List<Point> resPuntos = new ArrayList<>();
        resPuntos.add(new Point(1,2));
        resPuntos.add(new Point(5,6));
        resPuntos.add(new Point(9,10));
        assertEquals(blueprint.getPoints().size(), resPuntos.size());
        List<Point> res = blueprint.getPoints();
        for (int i = 0; i < res.size(); i++){
            assertEquals(resPuntos.get(i),res.get(i));
        }
    }
}
