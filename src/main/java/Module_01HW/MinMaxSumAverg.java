package Module_01HW;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinMaxSumAverg {
    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int x = Integer.parseInt(reader.readLine());
            int n = 0;
            int z = 0;
            int maximum = z - 1;
            if (x > 0) {
                while (n < x) {
                    z = Integer.parseInt(reader.readLine());
                    maximum = maximum > z ? maximum : z;
                    n++;
                }
                System.out.println(maximum);
            }
        }
}




