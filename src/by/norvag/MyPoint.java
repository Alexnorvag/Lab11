package by.norvag;

/**
 * Created by norvag on 11.03.2016.
 */
public class MyPoint {
    private int _x;
    private int _y;

    public MyPoint(int x, int y)
    {
        _x = x;
        _y = y;
    }

    public void set_x(int x) {
        _x = x;
    }

    public void set_y(int y) {
        _y = y;
    }

    public int get_x() {
        return _x;
    }

    public int get_y() {
        return _y;
    }
}
