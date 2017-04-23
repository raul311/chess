package com.raul311.chess.session;

import com.raul311.chess.pieces.ChessPiece;

import java.util.List;

/**
 * Created by raul311
 */

public abstract class Team {

    public static final String BLACK_TEAM = "black";
    public static final String WHITE_TEAM = "white";

    public static final int PAWN_COUNT = 8;
    public static final int BISHOP_COUNT = 2;
    public static final int ROOK_COUNT = 2;
    public static final int KNIGHT_COUNT = 2;
    public static final int QUEEN_COUNT = 1;
    public static final int KING_COUNT = 1;

    public abstract String getTeamType();

    protected List<ChessPiece> pieces;
}
