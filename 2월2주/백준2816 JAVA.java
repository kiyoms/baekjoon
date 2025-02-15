import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String[] Channel = new String[cnt];
        for(int i = 0 ; i<cnt; i++){
            Channel[i] = br.readLine();
        }
        StringBuilder result = new StringBuilder();
        int index = 0;
        String tmp;
        //kbs1을 찾아야함


        while(!Channel[index].equals("KBS1")){
        index++;
        result.append("1");
        }

        while(index > 0){ 
        tmp = Channel[index];
        Channel[index] = Channel[index-1];
        Channel[index-1] = tmp;
        index--;
        result.append("4");
        }
        
        //kbs2 찾기 
        while(!Channel[index].equals("KBS2")){
        index++;
        result.append("1");
        }
        
        while(index > 1){
            
        tmp = Channel[index];
        Channel[index] = Channel[index-1];
        Channel[index-1] = tmp;
        index--;
        result.append("4");
        }
        System.out.println(result);
        
    
      
    }
}