package com.raul311.chess.pieces;

import com.raul311.chess.R;
import com.raul311.chess.session.Team;

/**
 * Created by raul311
 */

public class Pawn extends ChessPiece {

    private static final String type = "pawn";

    public Pawn(String teamType) {
        super(teamType);
        setImage();
    }

    protected void setImage() {
        if (Team.BLACK_TEAM.equals(teamType)) {
            imgRes = R.drawable.pawn_dark;
        } else {
            imgRes = R.drawable.pawn_light;
        }
    }

    public String getType() {
        return type;
    }
}
