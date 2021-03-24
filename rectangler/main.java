package rectangler;

public class main {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle();
        rectangle1.longside=6;
        rectangle1.shortside=5;
        rectangle rectangle2 = new rectangle();
        rectangle2.shortside=5;
        rectangle2.longside=8;
        rectangle1.area(rectangle1.longside, rectangle1.shortside);
        rectangle2.area(rectangle2.shortside, rectangle2.longside);


    }
}
