import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] input = br.readLine().split(" ");
            int Ø = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int F = Integer.parseInt(input[2]);

            int[][] bridges = new int[B][3];
            for (int i = 0; i < B; i++) {
                String[] bridgeInfo = br.readLine().split(" ");
                bridges[i][0] = Integer.parseInt(bridgeInfo[0]);
                bridges[i][1] = Integer.parseInt(bridgeInfo[1]);
                bridges[i][2] = Integer.parseInt(bridgeInfo[2]);
            }
            Graph graph = new Graph(Ø);

            for(int i = 0; i < B; i++) {
                graph.addEdge(adjustIndex(bridges[i][0]), adjustIndex(bridges[i][1]), bridges[i][2]);
            }

            ArrayList<Edge> mut = graph.kruskalMUT();
            int totalOmkostning = 0;

            for(Edge edge : mut){
                totalOmkostning += edge.getc();
            }
            Collections.sort(mut, (e1, e2) -> e2.getc() - e1.getc());

            int færgerBrugt = 0;
            while(færgerBrugt < F && !mut.isEmpty()){
                totalOmkostning -= mut.get(0).getc();
                mut.remove(0);
                færgerBrugt++;
            }

        System.out.println(totalOmkostning);
    }

    private static int adjustIndex(int index){
        return index-1;
    }
}