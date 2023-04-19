public class FællesElement {
    private int[] parent;
    private int[] rank;

    public FællesElement(int øer){
        parent = new int[øer];
        rank = new int[øer];

        for (int i = 0; i<øer; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x){
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y){
        int rodX = find(x);
        int rodY = find(y);

        if (rodX != rodY){
            parent[rodY] = rodX;
        } else {
            parent[rodX] = rodY;
            if (rank[rodX] == rank[rodY]){
                rank[rodY]++;
            }
        }
    }
}
