import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class cosTest {
    docMath.trig mathDoc; //doc short for docherty
    double delta = 0.01;
    @Before
    public void setup(){
        mathDoc = new docMath.trig();
    }

    @Test
    public void cosTest45deg(){
        //testing qaudrant 1
        double angle = 45;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest135deg(){
        //testing qaudrant 2
        double angle = 135;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest225deg(){
        //testing qaudrant 3
        double angle = 225;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest315deg(){
        //testing qaudrant 4
        double angle = 315;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest90Deg(){
        //testing possible edge case
        double angle = 90;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest45(){
        //testing qaudrant 1 in radians
        double angle = Math.toRadians(45);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest135(){
        //testing qaudrant 2 in radians
        double angle = Math.toRadians(135);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest225(){
        //testing qaudrant 3 in radians
        double angle = Math.toRadians(225);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest315(){
        //testing qaudrant 4 in radians
        double angle = Math.toRadians(315);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void cosTest90(){
        //testing possible edge case
        double angle = Math.toRadians(90);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }

    //negative

    @Test
    public void negcosTest45deg(){
        //testing negative qaudrant 1
        double angle = -45;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest135deg(){
        //testing negative qaudrant 2
        double angle = -135;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest225deg(){
        //testing negative qaudrant 3
        double angle = -225;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest315deg(){
        //testing negative qaudrant 4
        double angle = -315;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest90Deg(){
        //testing possible edge case
        double angle = -90;
        double test = mathDoc.cosDeg(angle);
        double real = Math.cos(Math.toRadians(angle));

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest45(){
        //testing negative qaudrant 1 in radians
        double angle = Math.toRadians(-45);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest135(){
        //testing negative qaudrant 2 in radians
        double angle = Math.toRadians(-135);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest225(){
        //testing negative qaudrant 3 in radians
        double angle = Math.toRadians(-225);
        System.out.println(angle);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest315(){
        //testing negative qaudrant 4 in radians
        double angle = Math.toRadians(-315);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void negcosTest90(){
        //testing possible edge case
        double angle = Math.toRadians(-90);
        double test = mathDoc.cos(angle);
        double real = Math.cos(angle);

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
}
