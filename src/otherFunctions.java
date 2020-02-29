import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class otherFunctions {
    docMath.trig mathDoc; //doc short for docherty
    double delta = 0.01;
    @Before
    public void setup(){
        mathDoc = new docMath.trig();
    }
    @Test
    public void testFactorial0(){
        //testing for 0 a edge case
        double x = 0;
        double test = mathDoc.factorial(x);
        double real = 1;

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void testFactorial3(){
        //testing for 3a regular case
        double x = 3;
        double test = mathDoc.factorial(x);
        double real = 6;

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void testPower0(){
        //testing for 0 a edge case
        double x = 0;
        double test = mathDoc.power(2,0);
        double real = 1;

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
    @Test
    public void testPower3(){
        //testing for 0 a edge case
        double x = 3;
        double test = mathDoc.power(2,3);
        double real = 8;

        Assert.assertEquals(real,test,delta);//margin of error 0.01
    }
}
