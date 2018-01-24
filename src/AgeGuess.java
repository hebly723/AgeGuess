import java.util.ArrayList;
import java.util.List;

public class AgeGuess {
    public static void main(String args[]){
        List<List<Integer>> numbers = new ArrayList<List<Integer>>();
        for (int i = 0; i<8; i++)
            numbers.add(new ArrayList<>());
        for (int i = 0; i < 64; i++)
        {
            int j = i + 1;
            String str = Integer.toBinaryString(j);
            int zero = 0;
            for (int k = str.length(); k > 0; k -- )
            {

                if (str.charAt(k-1) == '1')
                numbers.get(zero).add(j);
                zero++;
            }
        }
        for (List<Integer> numberList : numbers)
        {
            for (int i : numberList)
            {
                if (i<10)
                    System.out.print("0"+i+"    ");
                else
                    System.out.print(i+"    ");
            }
            System.out.println();
        }
    }
}
