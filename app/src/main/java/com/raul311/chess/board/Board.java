package com.raul311.chess.board;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by raul311
 */

public class Board extends GridView {

    private static final int COLS = 8;
    private static final int ROWS = 8;

    private Tile[][] tiles;
    private int x = 0;
    private int y = 0;
    private int squareSize = 0;

    //private Context context;

    public Board(Context context) {
        super(context);
        createTiles(context);
    }

    public Board(Context context, AttributeSet attrs) {
        super(context, attrs);
        createTiles(context);
    }

    private void createTiles(Context context) {
        this.tiles = new Tile[COLS][ROWS];
        for (int column = 0; column < COLS; column++) {
            for (int row = 0; row < ROWS; row++) {
                tiles[column][row] = new Tile(context);
            }
        }
    }

}
