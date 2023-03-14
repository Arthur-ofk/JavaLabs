

public class Task2 {
    String resp;
    public  String  Numbers(double x, double y) {
       

       
        if (x < 0 && y < 0) {
            x = Math.abs(x);
            y = Math.abs(y);
        }

        else if (x < 0 || y < 0) {
            x++;
            y++;
        }

        else if (x >= 2 && x <= 9 && y >= 2 && y <= 9) {
            x /= 10;
            y /= 10;
        }
         resp ="x" + ',' + "y";
       return resp;

    }

  
}
