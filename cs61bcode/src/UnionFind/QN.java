package UnionFind;

public class QN implements UF{

    private int[] id; // access to component id (site indexed)
    private int count; // number of components

    public QN(int N) {
        // Initialize component id array.
        count = N;
        id = new int[N]; // id array
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int find(int p) {
        //Find component name.
        while (p != id[p]) {
            // if p is not the root, find the index of p's parent index
            p = id[p];
        }
        return p;
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) {
            return;
        }
        id[pRoot] = qRoot;
        count--;
    }

    public int[] id() {
        return id;
    }

    public void printID() {
        for (int i =0; i < this.id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println("");
    }

}
