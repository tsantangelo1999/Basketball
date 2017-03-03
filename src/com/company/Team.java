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

    public double regularSeasonGames;
    public double postSeasonGames;
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

    public double getPostSeasonWinrate()
    {
        try
        {
            return postSeasonWins / postSeasonGames;
        }
        catch(ArithmeticException e)
        {
            return getSeasonWinrate();
        }
    }

    public double tourneyGetPointsPerGame()
    {
        try
        {
            return tourneyTotalPoints / postSeasonGames;
        }
        catch(ArithmeticException e)
        {
            return getPointsPerGame();
        }
    }

    public double tourneyGetThreePointPercent()
    {
        try
        {
            return tourneyMadeThreePointers / tourneyTotalThreePointers;
        }
        catch(ArithmeticException e)
        {
            return getThreePointPercent();
        }
    }

    public double tourneyGetFieldGoalPercent()
    {
        try
        {
            return tourneyMadeFieldGoals / tourneyTotalFieldGoals;
        }
        catch(ArithmeticException e)
        {
            return getFieldGoalPercent();
        }
    }

    public double tourneyGetFreeThrowPercent()
    {
        try
        {
            return tourneyMadeFreeThrows / tourneyTotalFreeThrows;
        }
        catch(ArithmeticException e)
        {
            return getFreeThrowPercent();
        }
    }

    public double tourneyGetTurnoversPerGame()
    {
        try
        {
            return tourneyTotalTurnovers / postSeasonGames;
        }
        catch(ArithmeticException e)
        {
            return getTurnoversPerGame();
        }
    }

    public double tourneyGetStealsPerGame()
    {
        try
        {
            return tourneyTotalSteals / postSeasonGames;
        }
        catch(ArithmeticException e)
        {
            return getStealsPerGame();
        }
    }

    public double tourneyGetBlocksPerGame()
    {
        try
        {
            return tourneyTotalBlocks / postSeasonGames;
        }
        catch(ArithmeticException e)
        {
            return getBlocksPerGame();
        }
    }

    public double tourneyGetPersonalFoulsPerGame()
    {
        try
        {
            return tourneyTotalPersonalFouls / postSeasonGames;
        }
        catch(ArithmeticException e)
        {
            return getPersonalFoulsPerGame();
        }
    }



    public static double weight(double r, double t)
    {
        return r * .4 + t * .6;
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
