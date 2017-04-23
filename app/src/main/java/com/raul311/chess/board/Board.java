package com.raul311.chess.board;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.widget.GridView;

/**
 * Created by raul311
 */

public class Board extends GridView {

    private static final int COLS = 8;
    private static final int ROWS = 8;
    public static final int COLUMN_NUMBER = 8;
    public static final int BLACK_COLOR = 0xFFFFFFFF;
    public static final int WHITE_COLOR = 0xFF000000;

    private Tile[][] tiles;
    private int imageHeight;
    private int imageWidth;

    public Board(Context context) {
        super(context);
        createTiles(context);
    }

    public Board(Context context, AttributeSet attrs) {
        super(context, attrs);
        createTiles(context);
    }

    private void createTiles(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        this.imageWidth = size.x / COLUMN_NUMBER;
        this.imageHeight = size.y / COLUMN_NUMBER;
        this.tiles = new Tile[COLS][ROWS];
        for (int column = 0; column < COLS; column++) {
            for (int row = 0; row < ROWS; row++) {
                Tile tile = new Tile(context);
                if (isBlackPosition(column * COLS + row)) {
                    tile.setBackgroundColor(BLACK_COLOR);
                } else {
                    tile.setBackgroundColor(WHITE_COLOR);
                }
                tile.setLayoutParams(new Board.LayoutParams(imageWidth, imageHeight));
                tiles[column][row] = tile;
            }
        }
    }

    private boolean isBlackPosition(int position) {
        return ((position / COLUMN_NUMBER + position % COLUMN_NUMBER) % 2 == 0);
    }

    public Tile[][] getTiles() {
        return tiles;
    }

}
