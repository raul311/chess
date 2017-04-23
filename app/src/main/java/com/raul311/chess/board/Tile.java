package com.raul311.chess.board;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.raul311.chess.pieces.ChessPiece;

/**
 * Created by raul311
 */

public class Tile extends View {

    private Color color;
    private ChessPiece chessPiece;
    private int position;

    public Tile(Context context) {
        super(context);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }

    public ChessPiece getChessPiece() {
        return chessPiece;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

}
