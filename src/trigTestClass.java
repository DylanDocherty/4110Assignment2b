import java.lang.Math;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({sinTest.class,cosTest.class,tanTest.class,conversionTest.class,otherFunctions.class})
public class trigTestClass {
    docMath.trig mathDoc; //doc short for docherty
//    double delta = 0.01;
    @Before
    public void setup(){
        mathDoc = new docMath.trig();
    }



}
