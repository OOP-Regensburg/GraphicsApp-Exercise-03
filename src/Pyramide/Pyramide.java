package Pyramide;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Rectangle;


public class Pyramide extends GraphicsApp {

    /* constants for canvas setup */
    private static final int CANVAS_HEIGHT = 800;
    private static final int CANVAS_WIDTH = 800;
    private static final int HORIZONTAL_CENTER = CANVAS_WIDTH / 2;
    private static final Color BACKGROUND_COLOR = Colors.BLACK;

    /* constants for bricks */
    private final int BRICK_WIDTH = 30;
    private final int BRICK_HEIGHT = 12;
    private final int BRICKS_IN_BASE = 14;
    private final int PYRAMID_ROWS = BRICKS_IN_BASE;
    private final Color BRICK_COLOR = Colors.ORANGE;

    /*
     * This method is called once when the program is started.
     */

    @Override
    public void initialize() {
        setupCanvas();
    }

    /*
     * This method is called repeatedly while the program is running.
     */

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        drawPyramid();
    }

    private void setupCanvas() {
        setCanvasSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        drawBackground(BACKGROUND_COLOR);
    }

    /*
     * Methods for pyramid drawing
     */

    private void drawPyramid() {
        int xPosStart = HORIZONTAL_CENTER - (BRICK_WIDTH * BRICKS_IN_BASE / 2)  ;
        for (int currentRow = 1; currentRow <= PYRAMID_ROWS; currentRow++) {
            int yPos = calcCurrentYPos(currentRow);
            int numBricks = PYRAMID_ROWS - currentRow + 1;
            int xPosRowStart = calcCurrentXPos(currentRow, xPosStart);
            drawPyramidRow(numBricks, xPosRowStart, yPos);
        }
    }

    private void drawPyramidRow(int numBricks, int xPosStart, int yPos) {
        for (int j = 0; j < numBricks; j++) {
            int xPosBrickInRow = xPosStart + (j * BRICK_WIDTH);
            drawBrick(xPosBrickInRow, yPos);
        }
    }

    private void drawBrick(int xPos, int yPos){
        Rectangle brick = new Rectangle(xPos, yPos, BRICK_WIDTH, BRICK_HEIGHT, BRICK_COLOR);
        brick.setBorder(BACKGROUND_COLOR, 1);
        brick.draw();
    }

    private int calcCurrentYPos(int row){
        return CANVAS_HEIGHT - row * BRICK_HEIGHT;
    }

    private int calcCurrentXPos(int row, int xPosStart){
        return xPosStart + ((row -1) * (BRICK_WIDTH / 2));
    }
}