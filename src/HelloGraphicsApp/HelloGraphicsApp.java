package HelloGraphicsApp;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Ellipse;

public class HelloGraphicsApp extends GraphicsApp {

    /* Private Konstanten */
    private static final Color BACKGROUND_COLOR = Colors.WHITE;
    private static final int CANVAS_WIDTH = 500;
    private static final int CANVAS_HEIGHT = 500;

    /*
     * Die initialize-Methode wird einmalig zum Start des Programms
     * aufgerufen.
     */

    @Override
    public void initialize() {
        setupCanvas();
    }

    /*
     * Die draw-Methode wird so lange wiederholt aufgerufen, bis das Programm
     * beendet wird.
     */

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        drawSmiley();
    }

    private void setupCanvas() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        drawBackground(BACKGROUND_COLOR);
    }

    private void drawSmiley() {
        drawFace();
        drawMouth();
        drawLeftEye();
        drawRightEye();
    }

    private void drawFace() {
        float x = CANVAS_WIDTH / 2.f;
        float y = CANVAS_HEIGHT / 2.f;
        int width = CANVAS_WIDTH / 2;
        int height = CANVAS_HEIGHT / 2;
        Ellipse face = new Ellipse(x, y, width, height, Colors.YELLOW);
        face.draw();
    }

    private void drawMouth() {
        float x = CANVAS_WIDTH / 2.f;
        float y = CANVAS_HEIGHT / 1.5f;
        int width = CANVAS_WIDTH / 10;
        int height = CANVAS_HEIGHT /20;
        Ellipse mouth = new Ellipse(x, y, width,height, Colors.BLACK);
        mouth.draw();
    }

    private void drawLeftEye() {
        float x = CANVAS_WIDTH / 2.f - CANVAS_WIDTH / 10.f;
        float y = CANVAS_HEIGHT / 2.5f;
        int width = CANVAS_WIDTH / 10;
        int height = CANVAS_HEIGHT /10;
        int pupilWidth = CANVAS_WIDTH /20;
        int pupilHeight= CANVAS_HEIGHT /20;
        Ellipse leftEye = new Ellipse(x, y, width, height, Colors.BLACK);
        leftEye.draw();
        Ellipse leftIris = new Ellipse(x, y, pupilWidth, pupilHeight, Colors.WHITE);
        leftIris.draw();
    }

    private void drawRightEye() {
        float x = CANVAS_WIDTH / 2.f + CANVAS_WIDTH / 10.f;
        float y = CANVAS_HEIGHT / 2.5f;
        int width = CANVAS_WIDTH / 10;
        int height = CANVAS_HEIGHT /10;
        int pupilWidth = CANVAS_WIDTH /20;
        int pupilHeight= CANVAS_HEIGHT /20;
        Ellipse rightEye = new Ellipse(x, y, width, height, Colors.BLACK);
        rightEye.draw();
        Ellipse rightIris = new Ellipse(x, y, pupilWidth, pupilHeight, Colors.WHITE);
        rightIris.draw();
    }
}
