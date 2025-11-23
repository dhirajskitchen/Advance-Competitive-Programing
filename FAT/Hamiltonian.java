import java.util.ArrayList;
import java.util.List;

public class Hamiltonian {
    static boolean used[] = new boolean[5];
    static int v = 5;
    static public List<Integer> path = new ArrayList<>();

    static boolean HC(int[][] graph, int count, int start) {
        if (count == v) {
            return graph[path.get(path.size() - 1)][start] == 1;
        }
        for (int i = 0; i < v; i++) {
            if (i != path.get(path.size() - 1) && !used[i] && graph[path.get(path.size() - 1)][i] == 1) {
                used[i] = true;
                path.add(i);
                if (HC(graph, count + 1, start)) {
                    return true;
                }
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
        return false;
    }

    static public void main(String args[]) {
        int[][] graph = {
                { 0, 1, 0, 1, 0 },
                { 1, 0, 1, 1, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 1, 1, 1, 0 }
        };
        path.add(0);
        used[0] = true;
        if (HC(graph, 1, 0)) {
            System.out.print(path);
        }

    }
}
