package edu.eci.arsw.blueprints.test.persistence.impl;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.impl.FilterRedundancy;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class FilterRedundancyTest {
    @Test
    public void filterRepeated() {
        FilterRedundancy Caso1 = new FilterRedundancy();
        Point points[] = {new Point(1, 1), new Point(1, 1), new Point(2, 2), new Point(2, 2), new Point(3, 3), new Point(3, 3)};
        Blueprint blueprint = new Blueprint("Stiven", "Janer", points);
        blueprint = Caso1.filter(blueprint);
        List<Point> resPuntos = new ArrayList<>();
        resPuntos.add(new Point(1, 1));
        resPuntos.add(new Point(2, 2));
        resPuntos.add(new Point(3, 3));
        assertTrue(blueprint.getPoints().size() == resPuntos.size());
        List<Point> res = blueprint.getPoints();
        for (int i = 0; i < res.size(); i++){
            assertEquals(resPuntos.get(i),res.get(i));
        }
    }
}
