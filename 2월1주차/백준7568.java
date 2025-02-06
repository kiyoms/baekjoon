 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(system.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][2]; //몸무게와 키를 받아줄 배열
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<N; i++){
            arr[i][0] = Integer.parseInt(st.nextToken()); //몸무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 키
        }
        for(int i = 0; i<N; i++){
            int rank = 1;
            for(int j=0; j<N; j++){
                if(i == j) continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
                rank++; 
            }
            sb.append(' ');
        }
        System.out.println(sb);


    }
    }