package by.norvag;

import javax.swing.*;
import java.awt.*;

/**
 * Created by norvag on 11.03.2016.
 * Определить класс Rectangle и класс Point.
 * Объявить массив из n объек-тов класса Point.
 * Написать функцию, определяющую, какая из точек ле-жит снаружи,
 * а какая – внутри прямоугольника.
 */
public class MyPanel extends JPanel {
    private int _X;
    private int _Y;
    private int _WIDTH;
    private int _HEIGHT;
    private int[] _XP;
    private int[] _YP;

    public MyPanel () {

    }

    public void setMyRectangle (MyRectangle rectangle) {
        _X = rectangle.get_x();
        _Y = rectangle.get_y();
        _WIDTH = rectangle.get_width();
        _HEIGHT = rectangle.get_height();
    }

    public void setMyPoint (MyPoint[] point) {
        _XP = new int[point.length];
        _YP = new int[point.length];
        for (int i = 0; i < point.length; i++) {
            _XP[i] = point[i].get_x();
            _YP[i] = point[i].get_y();
        }
    }

    public void paint(Graphics g) {
        g.drawRect(_X, _Y, _WIDTH, _HEIGHT);
        for (int i = 0; i < _XP.length; i++) {
            if (_X <= _XP[i] && _XP[i] <= _WIDTH + _X && _Y <= _YP[i] && _YP[i] <= _HEIGHT + _Y) {
                g.setColor(Color.GREEN);
                g.drawLine(_XP[i], _YP[i], _XP[i], _YP[i]);
                g.drawString("Yes", _XP[i], _YP[i]);
            }
            else {
                g.setColor(Color.RED);
                g.drawLine(_XP[i], _YP[i], _XP[i], _YP[i]);
                g.drawString("No", _XP[i], _YP[i]);
            }
        }
    }

}
