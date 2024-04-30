package homework_week3;

public class Prog15_WallArea {
    public double width;
    public double height;

    Prog15_WallArea() {
        this.width = 0;
        this.height = 0;
    }
    Prog15_WallArea(double width, double height) {
        if (width <= 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height <= 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    //get
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    //set
    public void setWidth(double width) {
        if (width <= 0) {
            this.width = 0;
        } else {
            this.width = width;
        }}
        public void setHeight ( double height){
            if (height <= 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }
        public double getArea() {
            double area = width * height;
            return area;
        }
        public static void main (String[]args){
            Prog15_WallArea wall = new Prog15_WallArea(5, 4);
            System.out.println("area= " + wall.getArea());
            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }
    }



