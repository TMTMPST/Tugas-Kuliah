public class Dragon30 {
    int x, y, width, height;


    public Dragon(int initialX, int initialY, int width, int height) {
        this.x = initialX;
        this.y = initialY;
        this.width = width;
        this.height = height;
    }
    
    void moveLeft(){
        x--;
        if (x < 0) {
            detectCollision(x, y);
        }
    }

    void moveRight(){
        x++;
        if (x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp(){
        y--;
        if (x < 0) {
            detectCollision(x, y);
        }
    }

    void moveDown(){
        y++;
        if (y > width) {
            detectCollision(x, y);
        }
    }

    void printPosition(){

    }

    void detectCollision(int x , int y) {
        System.out.println("Game Over");
    }
}
