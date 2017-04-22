package com.raul311.chess.session;

/**
 * Created by raul311
 */

public class TeamFactory {

    public static Team getTeam(String teamType) {
        if (Team.BLACK_TEAM.equals(teamType)) {
            return new BlackTeam();
        } else if (Team.WHITE_TEAM.equals(teamType)) {
            return new WhiteTeam();
        }
        return null;
    }
}
