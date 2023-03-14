
public class Task5 {
    String resp;
    public String Month(int month) {
       
        

        int daysInMonth;
        switch (month) {
            case 1:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 12:
                daysInMonth = 31;
                break;
            default:
                resp ="Введено неправильний номер місяця.";
                return resp;
        }
 
        resp = "Кількість днів у місяці: " + daysInMonth;
        return resp;
    }
}
