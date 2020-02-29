public class docMath {
    public docMath(){
        //nothing needed here
    }
    public static class trig{
        public trig() {
        }
        public double sinDeg(double x){
            x = this.degToRad(x);

            return this.sin(x);
        }
        public double cosDeg(double x){
            x = this.degToRad(x);

            return this.cos(x);
        }
        public double tanDeg(double x){
            if(x==1.5708 || x==-1.5708){
                return 0;
            }
            x = this.degToRad(x);

            return this.tan(x);
        }
        public double sin(double x){
            if(x<0){
                return (-this.sin(x*-1));//just do -sin if its neg
            }
            double PI = 3.14159265359;

            x %= 2 * PI;

            int sign = 1;
            if (x > PI) {
                x -= PI;
                sign = -1;
            }

            int decimalPoints = 7;
            double result = 0;
            //setup the series
            for (int i = 0; i <= decimalPoints; i++) {
                //use power fuction for multiplying by -1 or 1
                //then do the rest
                result += this.power(-1, i) * (this.power(x, 2 * i + 1) / this.factorial(2 * i + 1));
            }

            return sign * result;
        }
        public double cos(double x){
//            if(x<0){
//                return (-this.cos(x*-1));
//            }
            double PI = 3.14159265359;
            x %= 2 * PI;

            int sign = 1;
            if (x > PI) {
                x -= PI;
                sign = -1;
            }
            int decimalPoints = 9;
            double result = 0;
            //setup the series
            for (int i = 0; i <= decimalPoints; i++) {
                //use power fuction for multiplying by -1 or 1
                //then do the rest
                result += power(-1, i) * (this.power(x, 2 * i ) / this.factorial(2 * i ));
            }

            return  sign*result;
        }
        public double tan(double x){
            if(x==1.5708){
                return 0;
            }
            return this.sin(x)/this.cos(x);
        }
        public double degToRad(double x){
            double PI = 3.14159265359;
            return x*(PI/180);
        }
        public double radToDeg(double x){
            double PI = 3.14159265359;
            return x*(180/PI);
        }
        public double factorial( double x ){
            double result = 1;
            for ( int i=1; i<=x; i++ )
                result *= i;
            return result;
        }
        public double power(double x,double y){
            if ( y == 0 ) {
                return 1;
            }
            return ( x * power(x,y-1));
        }
    }
}

