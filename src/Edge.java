public class Edge implements Comparable<Edge> {
    private int a, b, c;

    public Edge(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int geta() {
        return a;
    }

    public void seta(int a) {
        this.a = a;
    }

    public int getb() {
        return b;
    }

    public void setb(int b) {
        this.b = b;
    }

    public int getc() {
        return c;
    }

    public void setc(int c) {
        this.c = c;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.c, other.c);
    }
}
