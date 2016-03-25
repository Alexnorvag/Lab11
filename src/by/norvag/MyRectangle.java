package by.norvag;

/**
 * Created by norvag on 11.03.2016.
 */
public class MyRectangle {
    private int _x;
    private int _y;
    private int _width;
    private int _height;

    public MyRectangle (int x, int y, int width, int height) {
        _x = x;
        _y = y;
        _width = width;
        _height = height;
    }

    public int get_x() {
        return _x;
    }

    public int get_y() {
        return _y;
    }

    public int get_width() {
        return _width;
    }

    public int get_height() {
        return _height;
    }
}
