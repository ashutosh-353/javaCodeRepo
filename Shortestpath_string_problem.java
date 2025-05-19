public class Shortestpath_string_problem {
    public static double getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                y--;
            }
        }

        double shortestPath;
        shortestPath = Math.sqrt((x * x) + (y * y));

        return shortestPath;
    }

    public static void main(String args[]) {
        String path = "EWEES";

        double res = getShortestPath(path);
        System.out.println("Shotest path is: " + res);
    }
}