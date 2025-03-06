 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int alphabet[] = new int[26];
        String str = br.readLine();
       
         for(int i=0; i<str.length();i++){
            int str_char = str.charAt(i);
            if(str_char >= 97){
                alphabet[str_char - 'a']++;
            } else alphabet[str_char -'A']++;
         } 

         int max = -1;
        char index = 0;
    
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                index = (char) (i + 65);
            } else if (alphabet[i] == max) {
                index = '?';
            }
        }
            System.out.println(index);
 
    }
}