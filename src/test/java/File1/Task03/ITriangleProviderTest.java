package File1.Task03;

import org.junit.*;

import static org.junit.Assert.*;

public class ITriangleProviderTest {

    private ITriangle iTriangle;

    @Before
    public void setUp(){
        this.iTriangle = ITriangleProvider.getTriangle();
    }

    @After
    public void clearITreangle(){
        iTriangle = null;
    }

    /**check that the method getTriangle(); returns a rectangular triangle*/
    @Test
    public void getTriangle() throws Exception {

        assertNotNull(iTriangle);

        int x1, y1, x2, y2, x3, y3;
        double sqab, sqbc, sqac;

        x1 = iTriangle.getX1();
        y1 = iTriangle.getY1();
        x2 = iTriangle.getX2();
        y2 = iTriangle.getY2();
        x3 = iTriangle.getX3();
        y3 = iTriangle.getY3();

        /*Checks if all points lie on one straight line*/
        assertFalse((x1-x3)*(y2-y3) == (x2-x3)*(y1-y3));

        sqab = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        sqbc = (x3-x2)*(x3-x2)+(y3-y2)*(y3-y2);
        sqac = (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1);

        /*Check for squareness*/
        assertTrue(sqab==sqac+sqbc || sqac==sqab+sqbc || sqbc==sqab+sqac);

    }

}