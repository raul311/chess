package com.raul311.chess.session;

import com.raul311.chess.pieces.ChessPieceFactory;
import com.raul311.chess.pieces.ChessPiecesConstants;

import java.util.ArrayList;

/**
 * Created by raul311
 */

public class BlackTeam extends Team {

    public BlackTeam() {
        pieces = new ArrayList<>();
        pieces.addAll(ChessPieceFactory.getChessPieces(getTeamType(), ChessPiecesConstants.PAWN_TYPE, PAWN_COUNT));
        pieces.addAll(ChessPieceFactory.getChessPieces(getTeamType(), ChessPiecesConstants.BISHOP_TYPE, BISHOP_COUNT));
        pieces.addAll(ChessPieceFactory.getChessPieces(getTeamType(), ChessPiecesConstants.ROOK_TYPE, ROOK_COUNT));
        pieces.addAll(ChessPieceFactory.getChessPieces(getTeamType(), ChessPiecesConstants.KNIGHT_TYPE, KNIGHT_COUNT));
        pieces.add(ChessPieceFactory.getChessPiece(getTeamType(), ChessPiecesConstants.QUEEN_TYPE));
        pieces.add(ChessPieceFactory.getChessPiece(getTeamType(), ChessPiecesConstants.KING_TYPE));
    }

    public String getTeamType() {
        return BLACK_TEAM;
    }
}
