import java.util.*;

public class Main {
    
    static class ABT {
        List<Integer> TA;

        ABT() {
            TA = new ArrayList<>();
        }

        void addNode(Integer value) {
            TA.add(value);
        }

        public Integer GN(int index) {
            if (index >= 0 && index < TA.size()) {
                return TA.get(index);
            }
            return null;
        }

        Integer GLC(int ParentI) {
            int LCI = 2 * ParentI + 1;
            return GN(LCI);
        }

        Integer GRC(int ParentI) {
            int RCI = 2 * ParentI + 2;
            return GN(RCI);
        }

        Integer GP(int CI) {
            if (CI <= 0) {
                return null;
            }
            int Parent_Index = (CI - 1) / 2;
            return GN(Parent_Index);
        }
    }

    public static void main(String[] args) {
        ABT tree = new ABT();
        tree.addNode(10); 
        tree.addNode(20);
        tree.addNode(30);  
        tree.addNode(40); 
        tree.addNode(50); 
        tree.addNode(60); 

        System.out.println("Root value: " + tree.GN(0));
        System.out.println("Left child of root: " + tree.GLC(0));
        System.out.println("Right child of root: " + tree.GRC(0));
        System.out.println("Parent of node at index 3: " + tree.GP(3));
        System.out.println("Left child of node at index 1: " + tree.GLC(1));
        System.out.println("Right child of node at index 1: " + tree.GRC(1));
    }
}
