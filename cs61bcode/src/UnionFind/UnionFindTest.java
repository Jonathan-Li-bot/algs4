package UnionFind;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class UnionFindTest {
    @Test
    public void QuickFindTest() {
        //Example on page 223 of algs.
        QF UF = new QF(10);

        UF.union(4, 3);
        assertTrue(UF.connected(4, 3));
        assertEquals(9, UF.count());
        UF.printID();

        UF.union(3, 8);
        assertTrue(UF.connected(8, 4));
        assertEquals(8, UF.count());
        UF.printID();


        UF.union(6, 5);
        UF.printID();


        UF.union(9, 4);
        assertTrue(UF.connected(8, 9));
        UF.printID();

        UF.union(2, 1);
        UF.printID();

        UF.union(5, 0);
        UF.printID();
        UF.union(7, 2);
        UF.printID();
        UF.union(6, 1);
        UF.printID();
        assertEquals(2, UF.count());
        assertTrue(UF.connected(3, 4));
    }


    @Test
    public void QuickUnionTest() {
        QN UF = new QN(10);

        UF.union(4, 3);
        assertTrue(UF.connected(4, 3));
        UF.printID();
        assertEquals(9, UF.count());


        UF.union(3, 8);
        assertTrue(UF.connected(8, 4));
        assertEquals(8, UF.count());
        UF.printID();


        UF.union(6, 5);
        UF.printID();


        UF.union(9, 4);
        assertTrue(UF.connected(8, 9));
        UF.printID();

        UF.union(2, 1);
        UF.printID();

        UF.union(5, 0);
        UF.printID();
        UF.union(7, 2);
        UF.printID();
        UF.union(6, 1);
        UF.printID();
        assertEquals(2, UF.count());
        assertTrue(UF.connected(3, 4));

    }

    @Test
    public void WeightedQuickUnionUFTest() {
        WeightedQuickUnionUF UF = new WeightedQuickUnionUF(10);

        UF.union(4, 3);
        assertTrue(UF.connected(4, 3));
        UF.printID();
        assertEquals(9, UF.count());


        UF.union(3, 8);
        assertTrue(UF.connected(8, 4));
        assertEquals(8, UF.count());
        UF.printID();


        UF.union(6, 5);
        UF.printID();


        UF.union(9, 4);
        assertTrue(UF.connected(8, 9));
        UF.printID();

        UF.union(2, 1);
        UF.printID();

        UF.union(5, 0);
        UF.printID();
        UF.union(7, 2);
        UF.printID();
        UF.union(6, 1);
        UF.printID();
        assertEquals(2, UF.count());
        assertTrue(UF.connected(3, 4));

    }


}
