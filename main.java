public class main {
    public static void main(String[] args) {
        robot r = new robot(1, 1);
        r.setXMax(10);
        r.setYMax(10);
        r.paint();
        r.up();
        r.paint();
        r.right();
        r.paint();
        r.up(5);
        r.paint();
        r.getPos();
        r.printMap();
    }
}
