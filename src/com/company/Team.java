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
    public double seasonWins; //avg
    public double postSeasonWins; //avg
    
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
    
    public double getPointsPerGame()
    {
        return totalPoints / totalGames();
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
        return totalTurnovers / totalGames();
    }
    
    public double getStealsPerGame()
    {
        return totalSteals / totalGames();
    }
    
    public double getBlocksPerGame()
    {
        return totalBlocks / totalGames();
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
