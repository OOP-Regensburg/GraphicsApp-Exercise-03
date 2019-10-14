package HelloGraphicsApp;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;

public class HelloGraphicsApp extends GraphicsApp {

    /* Private constants */
    private static final Color BACKGROUND_COLOR = Colors.BLACK;

    /*
     * This method is called once when the program is started.
     */

    @Override
    public void initialize() {

    }

    /*
     * This method is called repeatedly while the program is running.
     */

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
    }
}
