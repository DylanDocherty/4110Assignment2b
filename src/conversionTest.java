import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class conversionTest {
    docMath.trig mathDoc; //doc short for docherty
    double delta = 0.01;
    @Before
    public void setup(){
        mathDoc = new docMath.trig();
    }
    //degToRad and radToDeg
    @Test
    public void Test45degToRad(){
        //testing qaudrant 1
        double angle = 45;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test135degToRad(){
        //testing qaudrant 2
        double angle = 135;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test225degToRad(){
        //testing qaudrant 3
        double angle = 225;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test315degToRad(){
        //testing qaudrant 4
        double angle = 315;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test90DegToRad(){
        //testing possible edge case
        double angle = 90;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test45radToDeg(){
        //testing qaudrant 1 in radians
        double angle = Math.toRadians(45);
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test135radToDeg(){
        //testing qaudrant 2 in radians
        double angle = Math.toRadians(135);
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test225radToDeg(){
        //testing qaudrant 3 in radians
        double angle = Math.toRadians(225);
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test315radToDeg(){
        //testing qaudrant 4 in radians
        double angle = Math.toRadians(315);
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void Test90radToDeg(){
        //testing possible edge case
        double angle = 90;
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }

    //negative

    @Test
    public void negTest45degToRad(){
        //testing qaudrant 1
        double angle = -45;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest135degToRad(){
        //testing qaudrant 2
        double angle = -135;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest225degToRad(){
        //testing qaudrant 3
        double angle = -225;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest315degToRad(){
        //testing qaudrant 4
        double angle = -315;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest90DegToRad(){
        //testing possible edge case
        double angle = -90;
        double test = mathDoc.degToRad(angle);
        double real = Math.toRadians(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest45radToDeg(){
        //testing qaudrant 1 in radians
        double angle = -Math.toRadians(45);
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest135radToDeg(){
        //testing qaudrant 2 in radians
        double angle = -Math.toRadians(135);
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest225radToDeg(){
        //testing qaudrant 3 in radians
        double angle = -Math.toRadians(225);
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest315radToDeg(){
        //testing qaudrant 4 in radians
        double angle = -Math.toRadians(315);
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negTest90radToDeg(){
        //testing possible edge case
        double angle = -90;
        double test = mathDoc.radToDeg(angle);
        double real = Math.toDegrees(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }

}
