package projekat;


public class GameObject {
    private int x, y, width, height;

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        setWidth(width);
        setHeight(height);
     // TODO Auto-generated constructor stub
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public void setWidth(int width) {
        if (width > 0) this.width = width;
        else this.width = 1;
    }

    public void setHeight(int height) {
        if (height > 0) this.height = height;
        else this.height = 1;
    }

    public boolean intersects(GameObject other) {
        return x < other.x + other.width &&
               x + width > other.x &&
               y < other.y + other.height &&
               y + height > other.y;
    }

    public String toString() {
        return "GameObject @ (" + x + "," + y +
               ") " + width + "x" + height;
    }
}


