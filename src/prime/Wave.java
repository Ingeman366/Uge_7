package prime;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Wave {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("hello my man")));
    }
    public static String[] wave(String str) {
        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = "";
        }

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i)==' '){
                i++;
            }

            if(i>0){
                arr[i] = str.substring(0,i);
            }
            arr[i] += str.substring(i,(i+1)).toUpperCase();
            if (i!=str.length()-1){
                arr[i] +=str.substring((i+1));
            }
        }

        return arr;
    }
}
