package com.raul311.chess.pieces;

import com.raul311.chess.session.Team;

/**
 * Created by raul311
 */

public abstract class ChessPiece {

    protected String teamType;
    protected int imgRes;

    public ChessPiece(String teamType) {
        this.teamType = teamType;
        setImage();
    }

    public String getType() {
        return null;
    }

    public String getTeamType() {
        return teamType;
    }

    protected void setImage() {}

    public int getImage() {
        return imgRes;
    }

}
