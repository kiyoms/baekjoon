 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            if(arr[2] >= arr[0]+arr[1]){
                System.out.println("invaild");
            }

            else if(arr[0] == arr[1] && arr[1] == arr[2]){
                System.out.println("Equilateral ");
            }
        
            else if(arr[0]==arr[1] || arr[0] == arr[2] || arr[1] == arr[2]){
                System.out.println("Isosceles ");
            }
            else{
                System.out.println("Scalene");
            }

        }
    }
    }