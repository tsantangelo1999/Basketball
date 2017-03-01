package com.company;

import java.io.*;
import java.util.Scanner;

public class Team
{
    public Team(int teamNum)
    {
        Scanner sc = new Scanner("RegularSeasonDetailedResults.csv");
        sc.nextLine();
        while(sc.hasNextLine())
        {
            sc.useDelimiter(",");
            
        }
    }

    public final String NAME;
    public final double SEASON_WINS; //avg
    public final double POST_SEASON_WINS; //avg
    public final double POINTS_PER_GAME;
    public final double THREE_POINT_PERCENT;
    public final double FIELD_GOAL_PERCENT;
    public final double FREE_THROW_PERCENT;
    public final double TURN_OVER_AVERAGE; //avg turnovers per game
    public final double STEALS_AVERAGE; //avg steals per game
    public final double BLOCKS_AVERAGE; //avg blocks per game
}
