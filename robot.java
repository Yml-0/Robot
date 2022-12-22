public class robot {
    int x;
    int y;
    int xMax = 10;
    int yMax = 10;
    char[][] map = new char[xMax][yMax];

    public void setXMax(int xMax) {
        this.xMax = xMax;
    }

    public void setYMax(int yMax) {
        this.yMax = yMax;
    }

    public robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void up() {
        y += 1;
    }

    public void up(int steps) {
        y += steps;
    }

    public void down() {
        y -= 1;
    }

    public void down(int steps) {
        y -= steps;
    }

    public void left() {
        x -= 1;
    }

    public void left(int steps) {
        x -= steps;
    }

    public void right() {
        x += 1;
    }

    public void right(int steps) {
        x += steps;
    }

    public void getPos() {
        System.out.println("x: " + x + " y: " + y);
    }

    public void paint() {
        map[y - 1][x - 1] = '*';
    }

    public void printMap() {
        for (int j = 0; j < xMax; j++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = xMax - 1; i >= 0; i--) {
            System.out.print("| ");
            for (int j = 0; j < xMax; j++) {
                if (i == y - 1 && j == x - 1) {
                    System.out.print("R" + " | ");
                } else if (map[i][j] == '*') {
                    System.out.print(map[i][j] + " | ");
                } else {
                    System.out.print(" " + " | ");
                }
            }
            System.out.println();
            for (int d = 0; d < xMax; d++) {
                System.out.print("----");
            }
            System.out.println();
        }
    }

}
