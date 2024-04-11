class Grid {
    int MinX;
    int MinY;
    int MaxX;
    int MaxY;
    boolean isValid(int x, int y) {
        if((x >= MinX) && (x <= MaxX) && (y >= MinY) && (y <= MaxY)) {
            return true;
        }
        else {
            return false;
        }
    }
}







class Main {
    public static void main(String[] args) {
        Grid grid1 = new Grid();
        grid1.MinX = 0;
        grid1.MinY = 0;
        grid1.MaxX = 4;
        grid1.MaxY = 4;
        System.out.println(grid1.isValid(3, 3));
        System.out.println(grid1.isValid(6, 2));
    }
}
