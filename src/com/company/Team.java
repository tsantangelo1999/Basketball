package com.company;

import java.util.Scanner;

public class Team
{
    public Team(int teamNum)
    {
        Scanner sc = new Scanner("Teams.csv");
        sc.useDelimiter(",");
        while(sc.hasNextLine())
        {
            if(sc.next().equals(teamNum))
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
        return 0
    }
}
