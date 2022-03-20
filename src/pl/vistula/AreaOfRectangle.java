package pl.vistula;

import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AreaOfRectangle {

    double l, w, area;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will calculate the area of Rectangle");
        System.out.println("Enter the value of the length side l:");
        l = Double.parseDouble(br.readLine());
        System.out.println("Enter the value of the length side w:");
        w = Double.parseDouble(br.readLine());

    }
    void computerField() { area = l*w;}
    void fieldDisplay() {
        System.out.print("The area of the rectangle with the side of a =");
        System.out.printf("%2.2f",l);
        System.out.print("and side b =");
        System.out.printf("%2.2f",w);
        System.out.print("is =");
        System.out.printf("%2.2f.\n",area);
    }

    static  void  demo() throws IOException{
        AreaOfRectangle r = new AreaOfRectangle();
        r.getData();
        r.computerField();
        r.fieldDisplay();
    }
}
public class RectangleDemo {
    public static void main(String[] args) throws IOException {
        AreaOfRectangle.demo();
    }
}