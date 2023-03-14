

public class Task1 {
   
   
    int totalGrade;

   

    public String Grades(int Math, int programming, int philosophy) {
           String resp;
        totalGrade = Math + programming + philosophy;

        if (totalGrade >= 12 && Math >= 4 && programming >= 4 && philosophy >= 4) {
        resp = "Ви отримуєте підвищену стипендiю";
           return resp; 
        } else if (totalGrade >= 9 && Math >= 3 && programming >= 3 && philosophy >= 3) {
           resp = "Ви отримуєте звичайну стипендiю";
           return resp;
           
        } else {

           
            resp = "На жаль ви отримуєте стипендiю";
            return resp;
        }
    }
}