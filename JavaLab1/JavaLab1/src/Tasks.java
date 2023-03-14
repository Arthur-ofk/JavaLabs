import java.util.Arrays;




public class Tasks {
   double A;
   double B;
   double C;

   public void Task1(int m) {
      if (m <= 2 || m == 12) {
         System.out.println("Надворi зима");
      } else if (m > 2 & m <= 5) {
         System.out.println("Надворi весна");

      } else if (m > 5 & m <= 7) {
         System.out.println("Надворi літо");
      } else if (m > 7 & m <= 11) {
         System.out.println("Надворi осінь");
      }

   }

   public void Task2(int n, int a, int b) {
      if (n == 1) {
         System.out.println(a + b);
      } else if (n == 2) {
         System.out.println(a - b);
      } else if (n == 3) {
         System.out.println(a * b);
      } else if (n == 4) {
         System.out.println(a / b);
      }
   }

   public void Task3(int k) {
      String m;
      if (k % 10 == 1) {
         m = "Гриб";
         System.out.println("Ми в лісі знайшли" + ' ' + k + ' ' + m);
      } else if (k % 10 <= 4 && k % 10 != 1) {
         m = "гриба";
         System.out.println("Ми в лісі знайшли" + ' ' + k + ' ' + m);
      } else if (k % 10 > 4 || k % 10 == 0) {
         m = "грибів";
         System.out.println("Ми в лісі знайшли" + ' ' + k + ' ' + m);
      }

   }

   public void Task4(int a, int b, int c) {

      int[] d = { a, b, c };
      Arrays.sort(d);
      System.out.println(d[1]);
   }

   public void Task5(int g) {
      if (g <= 34) {
         System.out.println("F-незадовiльно");
      } else if (g > 34 && g <= 59) {
         System.out.println("FX-незадовiльно");
      } else if (g > 59 & g <= 63) {
         System.out.println("E- задовiльно");
      } else if (g > 63 && g <= 74) {
         System.out.println("D-задовiльно");
      } else if (g > 74 && g <= 81) {
         System.out.println("C-добре");
      } else if (g > 81 && g <= 89) {
         System.out.println("B-добре");
      } else if (g > 89 && g <= 100) {
         System.out.println("A-вiдмiнно");
      } else if (g > 100) {
         System.out.println("неправильна оцiнка");
      }
   }

   public void Task6(String t)

   {
      if (t.length() >= 6) {
         int[] num = new int[t.length()];

         for (int i = 0; i < t.length(); i++) {
            num[i] = t.charAt(i) - '0';
         }
         int o = num[0] + num[1] + num[2];
         int p = num[t.length() - 1] + num[t.length() - 2] + num[t.length() - 3];
         if (o == p) {
            System.out.println("Бiлет щасливий");

         } else {
            System.out.println("Бiлет нещасливий");
         }
      } else {
         System.out.println("Неправильний номер бiлета");
      }
   }

   public void Task7(double a, double b, double c, double d) {
      if (a < b && b < c && c < d) {
         System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
      } else if (a > b && b > c && c > d) {
         System.out.println(a * a + "\n" + b * b + "\n" + c * c + "\n" + "\n" + d * d);

      } else {
         System.out.println(a * 10 + "\n" + b * 10 + "\n" + c * 10 + "\n" + "\n" + d * 10);
      }

   }

}
