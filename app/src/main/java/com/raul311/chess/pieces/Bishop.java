package com.raul311.chess.pieces;

import com.raul311.chess.R;
import com.raul311.chess.session.Team;

/**
 * Created by raul311
 */

public class Bishop extends ChessPiece {

    private static final String type = "bishop";

    public Bishop(String teamType) {
        super(teamType);
        setImage();
    }

    protected void setImage() {
        if (Team.BLACK_TEAM.equals(teamType)) {
            imgRes = R.drawable.bishop_dark;
        } else {
            imgRes = R.drawable.bishop_light;
        }
    }

    public String getType() {
        return type;
    }
}
