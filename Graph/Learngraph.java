import java.util.*;

public class Learngraph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Learngraph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int v, int w) {
        adjacencyList.putIfAbsent(v, new ArrayList<>());
        adjacencyList.putIfAbsent(w, new ArrayList<>());
        adjacencyList.get(v).add(w);
        adjacencyList.get(w).add(v);
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsRecursive(start, visited);
    }

    private void dfsRecursive(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : adjacencyList.get(node)) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int neighbor : entry.getValue()) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Learngraph graph = new Learngraph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Graph adjacency list:");
        graph.printGraph();

        System.out.println("\nDFS starting from node 0:");
        graph.dfs(0);
    }
}
