

public class Task4 {
    String resp;
    public String Palindrome(int number) {
        

       

       
        if (number > 1000 && number < 9999) {

            int originalNumber = number;
            int reversedNumber = 0;

            while (number != 0) {
                int remainder = number % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                number /= 10;
            }

            if (originalNumber == reversedNumber) {
                resp =originalNumber + " є палiндромом.";
               return resp;
            } else {
                resp =originalNumber + " не є палiндромом.";
                return resp;
            }
        } else {
            resp ="неправильне число";
            return resp;
        }
    }

}
