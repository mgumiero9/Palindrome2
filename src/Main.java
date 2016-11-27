import com.sun.xml.internal.fastinfoset.util.CharArray;
import org.jetbrains.annotations.Contract;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.NativeString.concat;

/**
 * @author mgumiero9
 */
public class Main {

    private static String myResult;
    private static int counter = 0;

    public static void main(String[] args) throws IOException {
/*        //int[] _numbers = {5, 1, 2, 3, 4, 5};
        Scanner in = new Scanner(System.in);

        final String fileName = "/home/mgumiero9/IdeaProjects/ArrayTest2/text.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));


        int _numbers_size = 0;
        _numbers_size = Integer.parseInt(in.nextLine().trim());
        int[] _numbers = new int[_numbers_size];
        int _numbers_item;
        for (int _numbers_i = 0; _numbers_i < _numbers_size; _numbers_i++) {
            _numbers_item = Integer.parseInt(in.nextLine().trim());
            _numbers[_numbers_i] = _numbers_item;
        }*/

        String res;
        String str = "aaabbbbccdddeeeeeghjt";
        compress(str);
/*        bw.write(String.valueOf(res));
        System.out.println(res);
        bw.newLine();

        bw.close();*/
    }

    static String compress(String str) {
        char[] myChars = str.toCharArray();
        char lastCh = myChars[0];
        myResult = "";
        counter = 0;
        for (char ch: myChars) {
            //myResult += ch + " " + counter + " ";
            if (ch == lastCh) {
                counter++;
            } else {
                if (counter == 1) {
                    myResult = myResult.concat(String.valueOf(lastCh));
                    counter = 1;
                    lastCh = ch;
                } else {
                    myResult = myResult.concat(String.valueOf(lastCh)).concat(String.valueOf(counter));
                    counter = 1;
                    lastCh = ch;
                }
            }
        }
        if (counter == 1) {
            myResult = myResult.concat(String.valueOf(lastCh));
        } else {
            myResult = myResult.concat(String.valueOf(lastCh)).concat(String.valueOf(counter));
        }
        System.out.println(myResult);

        return myResult;
    }
}
