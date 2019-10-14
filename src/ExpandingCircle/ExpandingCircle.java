package ExpandingCircle;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;

public class ExpandingCircle extends GraphicsApp {

    /* Private constants */
    private static final int CANVAS_HEIGHT = 800;
    private static final int CANVAS_WIDTH = 800;
    private static final int FRAME_RATE = 60;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;
    private static final Color CIRCLE_COLOR = Colors.ORANGE;
    private static final int INITIAL_CIRCLE_RADIUS = 50;
    private static final int MAX_CIRCLE_RADIUS = 250;

    private Circle circle;

    /*
     * This method is called once when the program is started.
     */

    @Override
    public void initialize() {
        setupCanvas();
        setupCircle();
    }

    /*
     * This method is called repeatedly while the program is running.
     */

    @Override
    public void draw() {
        updateCircle();

        drawBackground(BACKGROUND_COLOR);
        circle.draw();
    }

    private void setupCanvas() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        setFrameRate(FRAME_RATE);
    }

    private void setupCircle() {
        circle = new Circle(
                CANVAS_WIDTH / 2.f,
                CANVAS_HEIGHT / 2.f,
                INITIAL_CIRCLE_RADIUS * 2.f,
                CIRCLE_COLOR);
    }

    /*
     * For each call of this method, the circles width and height is increased by 1. If MAX_CIRCLE_RADIUS is reached,
     * the circles width and height are reset to INITIAL_CIRCLE_RADIUS.
     */
    private void updateCircle() {
        float newCircleRadius = circle.getRadius() + 1;

        if(newCircleRadius > MAX_CIRCLE_RADIUS * 2) {
            newCircleRadius = INITIAL_CIRCLE_RADIUS * 2;
        }
        
        circle.setRadius(newCircleRadius);
    }
}