import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class sinTest {
    docMath.trig mathDoc; //doc short for docherty
    double delta = 0.01;
    @Before
    public void setup(){
        mathDoc = new docMath.trig();
    }
    @Test
    public void sinTest45deg(){
        //testing qaudrant 1
        double angle = 45;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest135deg(){
        //testing qaudrant 2
        double angle = 135;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest225deg(){
        //testing qaudrant 3
        double angle = 225;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest315deg(){
        //testing qaudrant 4
        double angle = 315;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest90Deg(){
        //testing possible edge case
        double angle = 90;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest45(){
        //testing qaudrant 1 in radians
        double angle = Math.toRadians(45);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest135(){
        //testing qaudrant 2 in radians
        double angle = Math.toRadians(135);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest225(){
        //testing qaudrant 3 in radians
        double angle = Math.toRadians(225);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest315(){
        //testing qaudrant 4 in radians
        double angle = Math.toRadians(315);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void sinTest90(){
        //testing possible edge case
        double angle = Math.toRadians(90);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }



    //negative

    @Test
    public void negSinTest45deg(){
        //testing negative qaudrant 1
        double angle = -45;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest135deg(){
        //testing negative qaudrant 2
        double angle = -135;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest225deg(){
        //testing negative qaudrant 3
        double angle = -225;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest315deg(){
        //testing negative qaudrant 4
        double angle = -315;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest90Deg(){
        //testing possible edge case
        double angle = -90;
        double test = mathDoc.sinDeg(angle);
        double real = Math.sin(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest45(){
        //testing negative qaudrant 1 in radians
        double angle = Math.toRadians(-45);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest135(){
        //testing negative qaudrant 2 in radians
        double angle = Math.toRadians(-135);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest225(){
        //testing negative qaudrant 3 in radians
        double angle = Math.toRadians(-225);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest315(){
        //testing negative qaudrant 4 in radians
        double angle = Math.toRadians(-315);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negSinTest90(){
        //testing possible edge case
        double angle = Math.toRadians(-90);
        double test = mathDoc.sin(angle);
        double real = Math.sin(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
}
