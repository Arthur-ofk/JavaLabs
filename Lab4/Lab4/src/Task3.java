

public class Task3 {
    String resp;
    public  String Triangle(int a, int b,int  c) {
       

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                resp ="Трикутник є рівностороннім.";
                return resp;
               
            } else if (a == b || b == c || c == a) {
                
                resp ="Трикутник є рівнобедреним.";
                return resp;
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                
                resp ="Трикутник є прямокутним.";
                return resp;
            } else {
                
                resp ="Трикутник є довільним.";
                return resp;
            }
        } else {
           
            resp ="Такого трикутника не існує.";
            return resp;
        }
    }

    
}
