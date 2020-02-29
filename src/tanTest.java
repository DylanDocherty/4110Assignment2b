import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class tanTest {
    docMath.trig mathDoc; //doc short for docherty
    double delta = 0.01;
    @Before
    public void setup(){
        mathDoc = new docMath.trig();
    }
    @Test
    public void tanTest45deg(){
        //testing qaudrant 1
        double angle = 45;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest135deg(){
        //testing qaudrant 2
        double angle = 135;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest225deg(){
        //testing qaudrant 3
        double angle = 225;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest315deg(){
        //testing qaudrant 4
        double angle = 315;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest0Deg(){
        //testing possible edge case
        double angle = 0;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest45(){
        //testing qaudrant 1 in radians
        double angle = Math.toRadians(45);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest135(){
        //testing qaudrant 2 in radians
        double angle = Math.toRadians(135);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest225(){
        //testing qaudrant 3 in radians
        double angle = Math.toRadians(225);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest315(){
        //testing qaudrant 4 in radians
        double angle = Math.toRadians(315);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void tanTest0(){
        //testing possible edge case
        double angle = Math.toRadians(0);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }



    //negative
    @Test
    public void negtanTest45deg(){
        //testing negative qaudrant 1
        double angle = -45;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest135deg(){
        //testing negative qaudrant 2
        double angle = -135;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest225deg(){
        //testing negative qaudrant 3
        double angle = -225;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest315deg(){
        //testing negative qaudrant 4
        double angle = -315;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest0Deg(){
        //testing possible edge case
        double angle = 0;
        double test = mathDoc.tanDeg(angle);
        double real = Math.tan(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest45(){
        //testing negative qaudrant 1 in radians
        double angle = Math.toRadians(-45);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest135(){
        //testing negative qaudrant 2 in radians
        double angle = Math.toRadians(-135);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest225(){
        //testing negative qaudrant 3 in radians
        double angle = Math.toRadians(-225);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest315(){
        //testing negative qaudrant 4 in radians
        double angle = Math.toRadians(-315);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negtanTest0(){
        //testing possible edge case
        double angle = Math.toRadians(0);
        double test = mathDoc.tan(angle);
        double real = Math.tan(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }



}
