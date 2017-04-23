package com.raul311.chess.pieces;

import com.raul311.chess.R;
import com.raul311.chess.session.Team;

/**
 * Created by raul311
 */

public class Knight extends ChessPiece {

    private static final String type = "knight";

    public Knight(String teamType) {
        super(teamType);
        setImage();
    }

    protected void setImage() {
        if (Team.BLACK_TEAM.equals(teamType)) {
            imgRes = R.drawable.knigth_dark;
        } else {
            imgRes = R.drawable.knigth_light;
        }
    }

    public String getType() {
        return type;
    }
}
