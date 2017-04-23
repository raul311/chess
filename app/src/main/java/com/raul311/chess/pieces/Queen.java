package com.raul311.chess.pieces;

import com.raul311.chess.R;
import com.raul311.chess.session.Team;

/**
 * Created by raul311
 */

public class Queen extends ChessPiece {

    private static final String type = "queen";

    public Queen(String teamType) {
        super(teamType);
        setImage();
    }

    protected void setImage() {
        if (Team.BLACK_TEAM.equals(teamType)) {
            imgRes = R.drawable.queen_dark;
        } else {
            imgRes = R.drawable.queen_light;
        }
    }

    public String getType() {
        return type;
    }
}
