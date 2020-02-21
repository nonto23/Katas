import java.lang.reflect.Array;
import java.util.Scanner;

public class Operators {




  public static void main(String []args) {


      int num1;

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number");
      num1 = sc.nextInt();



      OddEvenNumber  odd = new OddEvenNumber();
      odd.EvenOrOdd(num1);
      System.out.println("------------- ");

      Square square = new Square();
      square.square(4);
      System.out.println("------------- ");

      Triangle triangle = new Triangle();
      triangle.Triangle(4);
      System.out.println("------------- ");

      Issosscless iss = new Issosscless();
      iss.Isosscles(4);
      System.out.println("------------- ");



      System.out.println("------------- ");
        String[] names = {"the","quick","brown", "fox", "ate", "my", "chickens","importan"};

      LongestString longw = new LongestString(names);
        String LongWord = longw.longest();

        System.out.println(LongWord);
      System.out.println("------------- ");

      CombineTwoArrays arrays = new CombineTwoArrays();

        int[] first = {4,7,8,9,4};
        int[] second = {6,9,2,5,3};

      arrays.combinearrays(first,second);

      System.out.println("------------- ");



        String[] str = {"Write","good","code","every","day"};
      Frame frame = new Frame(str);
      frame.StartWords();




  }
}