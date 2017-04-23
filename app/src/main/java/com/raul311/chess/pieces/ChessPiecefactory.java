package com.raul311.chess.pieces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raul311
 */

public class ChessPieceFactory {

    public static ChessPiece getChessPiece(String teamType, String pieceType) {
        switch (pieceType) {
            case ChessPiecesConstants.PAWN_TYPE:
                return new Pawn(teamType);
            case ChessPiecesConstants.BISHOP_TYPE:
                return new Bishop(teamType);
            case ChessPiecesConstants.KNIGHT_TYPE:
                return new Knight(teamType);
            case ChessPiecesConstants.ROOK_TYPE:
                return new Rook(teamType);
            case ChessPiecesConstants.QUEEN_TYPE:
                return new Queen(teamType);
            case ChessPiecesConstants.KING_TYPE:
                return new King(teamType);
        }
        return null;
    }

    public static List<ChessPiece> getChessPieces(String teamType, String pieceType, int count) {
        List<ChessPiece> chessPieces = new ArrayList<>();
        while (count > 0) {
            chessPieces.add(getChessPiece(teamType, pieceType));
            count--;
        }
        return chessPieces;
    }
}
