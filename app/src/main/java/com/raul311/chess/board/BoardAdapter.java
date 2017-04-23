package com.raul311.chess.board;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;

/**
 * Created by raul311
 */

public class BoardAdapter extends BaseAdapter {

    private static final int COLUMN_NUMBER = 8;
    private static final int BLACK_COLOR = 0xFFFFFFFF;
    private static final int WHITE_COLOR = 0xFF000000;

    private Context context;
    private Tile[][] tiles;
    private int imageHeight;
    private int imageWidth;

    public BoardAdapter(Context context, Tile[][] tiles) {
        this.context = context;
        this.tiles = tiles;

        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        this.imageWidth = size.x / COLUMN_NUMBER;
        this.imageHeight = size.y / COLUMN_NUMBER;
    }

    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = new View(context);
            view.setLayoutParams(new Board.LayoutParams(imageWidth, imageHeight));
        }
        if ((position / COLUMN_NUMBER + position % COLUMN_NUMBER) % 2 == 0) {
            view.setBackgroundColor(BLACK_COLOR);
        } else {
            view.setBackgroundColor(WHITE_COLOR);
        }

        return view;
    }

    public Object getItem(int id) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public int getCount() {
        return COLUMN_NUMBER * COLUMN_NUMBER;
    }

}
