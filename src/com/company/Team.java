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
                name = sc.next();
                break;
            }
        }
    }

    public String name;

    public int regularSeasonGames;
    public int postSeasonGames;
    public double totalGames()
    {
        return regularSeasonGames + postSeasonGames;
    }
    public int regularSeasonWins; //avg
    public int postSeasonWins; //avg
    
    public double totalPoints;
    
    public double madeThreePointers;
    public double totalThreePointers;
    
    public double madeFieldGoals;
    public double totalFieldGoals;
    
    public double madeFreeThrows;
    public double totalFreeThrows;
    
    public double totalTurnovers;
    
    public double totalSteals;
    
    public double totalBlocks;
    
    public double totalPersonalFouls;
    
    public double getSeasonWinrate()
    {
        return regularSeasonWins / regularSeasonGames;
    }
    
    public double getPointsPerGame()
    {
        return totalPoints / regularSeasonGames;
    }
    
    public double getThreePointPercent()
    {
        return madeThreePointers / totalThreePointers;
    }
    
    public double getFieldGoalPercent()
    {
        return madeFieldGoals / totalFieldGoals;
    }
    
    public double getFreeThrowPercent()
    {
        return madeFreeThrows / totalFreeThrows;
    }
    
    public double getTurnoversPerGame()
    {
        return totalTurnovers / regularSeasonGames;
    }
    
    public double getStealsPerGame()
    {
        return totalSteals / regularSeasonGames;
    }
    
    public double getBlocksPerGame()
    {
        return totalBlocks / regularSeasonGames;
    }
    
    public double getPersonalFoulsPerGame()
    {
        return totalPersonalFouls / regularSeasonGames;
    }



    public double tourneyTotalPoints;

    public double tourneyMadeThreePointers;
    public double tourneyTotalThreePointers;

    public double tourneyMadeFieldGoals;
    public double tourneyTotalFieldGoals;

    public double tourneyMadeFreeThrows;
    public double tourneyTotalFreeThrows;

    public double tourneyTotalTurnovers;

    public double tourneyTotalSteals;

    public double tourneyTotalBlocks;

    public double tourneyTotalPersonalFouls;

    public double tourneyGetPostSeasonWinrate()
    {
        return postSeasonWins / postSeasonGames;
    }

    public double tourneyGetPointsPerGame()
    {
        return tourneyTotalPoints / postSeasonGames;
    }

    public double tourneyGetThreePointPercent()
    {
        return tourneyMadeThreePointers / tourneyTotalThreePointers;
    }

    public double tourneyGetFieldGoalPercent()
    {
        return tourneyMadeFieldGoals / tourneyTotalFieldGoals;
    }

    public double tourneyGetFreeThrowPercent()
    {
        return tourneyMadeFreeThrows / tourneyTotalFreeThrows;
    }

    public double tourneyGetTurnoversPerGame()
    {
        return tourneyTotalTurnovers / postSeasonGames;
    }

    public double tourneyGetStealsPerGame()
    {
        return tourneyTotalSteals / postSeasonGames;
    }

    public double tourneyGetBlocksPerGame()
    {
        return tourneyTotalBlocks / postSeasonGames;
    }

    public double tourneyGetPersonalFoulsPerGame()
    {
        return tourneyTotalPersonalFouls / postSeasonGames;
    }

    public double offensiveScore()
    {
        return 0;
    }

    public double defensiveScore()
    {
        return 0;
    }
}
