package com.raul311.chess.session;

import com.raul311.chess.pieces.ChessPiece;
import com.raul311.chess.pieces.ChessPiecefactory;
import com.raul311.chess.pieces.ChessPiecesConstants;
import com.raul311.chess.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raul311
 */

public class WhiteTeam extends Team {

    private List<ChessPiece> pieces;

    public WhiteTeam() {
        pieces = new ArrayList<>();
        pieces.addAll(ChessPiecefactory.getChessPieces(ChessPiecesConstants.PAWN_TYPE, PAWN_COUNT));
        pieces.addAll(ChessPiecefactory.getChessPieces(ChessPiecesConstants.BISHOP_TYPE, BISHOP_COUNT));
        pieces.addAll(ChessPiecefactory.getChessPieces(ChessPiecesConstants.ROOK_TYPE, ROOK_COUNT));
        pieces.addAll(ChessPiecefactory.getChessPieces(ChessPiecesConstants.KNIGHT_TYPE, KNIGHT_COUNT));
        pieces.add(ChessPiecefactory.getChessPiece(ChessPiecesConstants.QUEEN_TYPE));
        pieces.add(ChessPiecefactory.getChessPiece(ChessPiecesConstants.KING_TYPE));
    }

    private List<ChessPiece> createPawns() {
        List<ChessPiece> pieces = new ArrayList<>();
        pieces.add(new Pawn());
        pieces.add(new Pawn());
        pieces.add(new Pawn());
        pieces.add(new Pawn());
        return pieces;
    }

    private List<ChessPiece> createBishops() {
        List<ChessPiece> pieces = new ArrayList<>();
        pieces.add(new Pawn());
        pieces.add(new Pawn());
        pieces.add(new Pawn());
        pieces.add(new Pawn());
        return pieces;
    }
}
