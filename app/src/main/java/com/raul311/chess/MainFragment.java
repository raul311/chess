package com.raul311.chess;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.raul311.chess.board.Board;
import com.raul311.chess.board.BoardAdapter;
import com.raul311.chess.board.Tile;

/**
 * Created by raul311
 */

public class MainFragment extends Fragment {

    private Board board;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_main, container, false);
        board = (Board) view.findViewById(R.id.chess_gridview);
        board.setNumColumns(8);
        board.setAdapter(new BoardAdapter(getActivity(), board.getTiles()));
        return view;
    }

}
