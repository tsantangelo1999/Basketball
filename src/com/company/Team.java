package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Team
{
    public Team(int teamNum) throws IOException
    {
        Scanner sc = new Scanner(new File("Teams.csv"));
        sc.useDelimiter(",|\n");
        while(sc.hasNextLine())
        {
            if(sc.next().equals(Integer.toString(teamNum)))
            {
                NAME = sc.next();
                break;
            }
        }
    }

    public String NAME;
    public double SEASON_WINS; //avg
    public double POST_SEASON_WINS; //avg
    public double POINTS_PER_GAME;
    public double THREE_POINT_PERCENT;
    public double FIELD_GOAL_PERCENT;
    public double FREE_THROW_PERCENT;
    public double TURN_OVER_AVERAGE; //avg turnovers per game
    public double STEALS_AVERAGE; //avg steals per game
    public double BLOCKS_AVERAGE; //avg blocks per game

    public double offensiveScore()
    {
        return 0;
    }

    public double defensiveScore()
    {
        return 0;
    }
}
