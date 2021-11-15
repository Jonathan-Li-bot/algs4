package UnionFind;

public class QF implements UF {
    private int[] id; // access to component id (site indexed)
    private int count; // number of components

    public QF(int N) {
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
        return id[p];
    }

    @Override
    public void union(int p, int q) {
        // Put p and q into the same component.
        int pID = find(p);
        int qID = find(q);

        // Nothing to do if p and q are already in the same component.
        if (pID == qID) {
            return;
        }

        // Rename p's component to q's name.
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
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
