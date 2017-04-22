package com.raul311.chess.pieces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raul311
 */

public class ChessPiecefactory {

    public static ChessPiece getChessPiece(String pieceType) {
        switch (pieceType) {
            case ChessPiecesConstants.PAWN_TYPE:
                return new Pawn();
            case ChessPiecesConstants.BISHOP_TYPE:
                return new Bishop();
            case ChessPiecesConstants.KNIGHT_TYPE:
                return new Knight();
            case ChessPiecesConstants.ROOK_TYPE:
                return new Rook();
            case ChessPiecesConstants.QUEEN_TYPE:
                return new Queen();
            case ChessPiecesConstants.KING_TYPE:
                return new King();
        }
        return null;
    }

    public static List<ChessPiece> getChessPieces(String pieceType, int count) {
        List<ChessPiece> chessPieces = new ArrayList<>();
        while (count > 0) {
            chessPieces.add(getChessPiece(pieceType));
            count--;
        }
        return chessPieces;
    }
}
