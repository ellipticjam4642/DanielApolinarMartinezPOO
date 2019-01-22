public class Circle {
    //Atributos
    double area;
    double length;
    double perimeter;
    double width; 

    //Metodos

    public void calcArea(){
        area=Math.PI * Math.pow((width/2),2);
    }

    public void calcPerimeter(){
        perimeter= 2 * Math.PI * (width/2);
    } 

    public double getArea(){
        return area; 
    }

    public double getPerimeter(){ 
        return perimeter;
    }

    public void setLength(double Length){

    }

    public static void main(String[] args) {
        //Circle circle1;
        //circle = new Circle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(); 
        Circle circle3 = new Circle(); 

        circle1.width = 5.2d; 
        circle2.width = 10d;
        circle3.width = 20d; 

        circle1.calcArea(); 
        circle2.calcArea();
        circle3.calcArea(); 

        System.out.println("el area total de circle1 es: " + circle1.getArea());
        System.out.println("el area total de circle2 es: " + circle2.getArea());
        System.out.println("el area total de circle3 es: " + circle3.getArea());
    }
}