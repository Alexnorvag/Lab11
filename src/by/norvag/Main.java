package by.norvag;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by norvag on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Initialization of the rectangle: ");
        System.out.print("Enter x: ");
        int x = Integer.parseInt(reader.readLine());

        System.out.print("Enter y: ");
        int y = Integer.parseInt(reader.readLine());

        System.out.print("Enter width: ");
        int width = Integer.parseInt(reader.readLine());

        System.out.print("Enter height: ");
        int height = Integer.parseInt(reader.readLine());

        MyRectangle rectangle = new MyRectangle(x, y, width, height);

        System.out.print("Amount of points: ");
        int amountPoint = Integer.parseInt(reader.readLine());

        MyPoint[] point = new MyPoint[amountPoint];

        System.out.println("Points: ");
        for (int i = 0; i < point.length; i++) {
            System.out.print("Enter x[" + (1 + i) + "]: ");
            int xp = Integer.parseInt(reader.readLine());
            System.out.print("Enter y[" + (1 + i) + "]: ");
            int yp = Integer.parseInt(reader.readLine());
            point[i] = new MyPoint(xp, yp);
        }

        JFrame frame = new JFrame("Point");
        MyPanel panel = new MyPanel();
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 600);
        panel.setMyRectangle(rectangle);
        panel.setMyPoint(point);
    }
}
