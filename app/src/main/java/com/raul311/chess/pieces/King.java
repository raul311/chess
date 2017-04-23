package com.raul311.chess.pieces;

import com.raul311.chess.R;
import com.raul311.chess.session.Team;

/**
 * Created by raul311
 */

public class King extends ChessPiece {

    private static final String type = "king";

    public King(String teamType) {
        super(teamType);
        setImage();
    }

    protected void setImage() {
        if (Team.BLACK_TEAM.equals(teamType)) {
            imgRes = R.drawable.king_dark;
        } else {
            imgRes = R.drawable.king_light;
        }
    }

    public String getType() {
        return type;
    }
}
