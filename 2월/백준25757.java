import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" "); 
        int N = Integer.parseInt(input[0]); //입력값 받는부분
        String type = input[1]; // 게임 타입
        HashSet<String> player = new HashSet<String>(); //Hashset으로 중복 값 제거
            for(int i=0; i<N; i++){
                player.add(input[i]);
            }
        switch (type) {
            case Value("Y"): //윷놀이 2명
                System.out.println(player.size());
                break;
            case Value("F"): //같은 그림 찾기 3명
                System.out.println(player.size()/2);

                break;
            case Value("O"):  // 원카드 4명
                System.out.println(player.size()/2);
    
            default:
                break;
        } 
    }
}