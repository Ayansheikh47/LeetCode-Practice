import java.util.Scanner;

public class InfosysP2E1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i=0; i<A.length; i++){
            A[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[][] queries = new int[q][4];

        for (int i=0; i<q; i++){
            for(int j=0; j<4; j++){
                queries[i][j] = scanner.nextInt();
            }
        }

        boolean[] isVisited = new boolean[n];
        long MOD = 1000000007L;

        for (int i=q-1; i>=0; i--){

            int l = queries[i][0];
            int r = queries[i][1];
            long x = queries[i][2];
            long y = queries[i][3];

            for(int j=l; j<=r; j++){
                if (!isVisited[j]) {
                    long idx = j-l;
                    A[j] = (int) ((x + idx * y) % MOD);
                    isVisited[j] = true;
                }
            }

        }

        long sum = 0;

        for (int i=0; i<n; i++){
            sum = (sum + A[i]) % MOD;
        }

        System.out.println(sum);
        scanner.close();
    }
}
