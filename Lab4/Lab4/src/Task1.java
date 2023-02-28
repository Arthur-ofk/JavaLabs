import java.util.Scanner;

public class Task1 {
    Scanner scanner = new Scanner(System.in);
    int Math, programming, philosophy;
    int totalGrade;

    public Task1(int Math, int programming, int philosophy) {
        this.Math = Math;
        this.programming = programming;
        this.philosophy = philosophy;

    }

    public void Grades() {

        totalGrade = Math + programming + philosophy;

        if (totalGrade >= 12 && Math >= 4 && programming >= 4 && philosophy >= 4) {

            System.out.println("Ви отримуєте підвищену стипендiю");
        } else if (totalGrade >= 9 && Math >= 3 && programming >= 3 && philosophy >= 3) {

            System.out.println("Ви отримуєте звичайну стипендiю");
        } else {

            System.out.println("На жаль ви отримуєте стипендiю");
        }
    }
}