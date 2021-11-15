package UnionFind;

public class WeightedQuickUnionUF {
    private int[] id;  // parent link (site indexed)
    private int[] sz;  // size of component for roots (site indexed)
    private int count; // number of components

    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) {
            // if p is not the root, find the index of p's parent index
            p = id[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        // Make smaller root point to larger one.
        if (sz[i] < sz[j]) {
            id[i] = j; sz[j] += sz[i];
        }
        else {
            id[j] = i; sz[i] += sz[j];
        }
        count--;
    }

    public void printID() {
        for (int i =0; i < this.id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println("");
    }

}
