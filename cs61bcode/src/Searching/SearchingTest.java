package Searching;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchingTest {
    @Test
    public void BSTTest() {
        BST bst = new BST();
        System.out.println(bst);


        bst.put("S", 0);

        bst.put("E", 1);

        bst.put("A", 2);

        bst.put("R", 3);

        bst.put("C", 4);

        bst.put("H", 5);

        bst.put("E", 6);


        assertEquals(6, bst.get("E"));



    }


}
