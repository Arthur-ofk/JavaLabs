
public class Task6 {
    public String Age(int age) {
        
      
        String description;

        if (age % 10 == 1 && age != 11) {
            description = age + " рік";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age < 10 || age > 20)) {
            description = age + " роки";
        } else {
            description = age + " років";
        }

        return description;
    }
}
