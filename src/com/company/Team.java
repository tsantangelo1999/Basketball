package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Team// implements Comparable
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
                name = name.substring(0, name.length());
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
    public double regularSeasonWins; //avg
    public double postSeasonWins; //avg
    
    public double totalPoints;
    public double totalPointsAgainst;
    
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

    public double getPointsAgainstPerGame()
    {
        return totalPointsAgainst / regularSeasonGames;
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

    public static double compareTo(Team a, Team b)
    {
        int points[] = new int[2];
        if (a.getSeasonWinrate() > b.getSeasonWinrate())
            points[0]++;
        else
        points[1]++;
        if (a.getPointsPerGame() > b.getPointsPerGame())
            points[0]++;
        else
        points[1]++;
        if (a.getPointsAgainstPerGame() < b.getPointsAgainstPerGame())
            points[0]++;
        else
        points[1]++;
        if (a.getThreePointPercent() > b.getThreePointPercent())
            points[0]++;
        else
        points[1]++;
        if (a.getFieldGoalPercent() > b.getFieldGoalPercent())
            points[0]++;
        else
        points[1]++;
        if (a.getFreeThrowPercent() > b.getFreeThrowPercent())
            points[0]++;
        else
        points[1]++;
        if (a.getTurnoversPerGame() < b.getTurnoversPerGame())
            points[0]++;
        else
        points[1]++;
        if (a.getStealsPerGame() > b.getStealsPerGame())
            points[0]++;
        else
        points[1]++;
        if (a.getBlocksPerGame() > b.getBlocksPerGame())
            points[0]++;
        else
        points[1]++;
        if (a.getPersonalFoulsPerGame() > b.getPersonalFoulsPerGame())
            points[0]++;
        else
        points[1]++;
        return points[0]/10;
    }

    public double tourneyTotalPoints;
    public double tourneyTotalPointsAgainst;

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
        if(postSeasonGames > 0)
        {
            return postSeasonWins / postSeasonGames;
        }
        else
        {
            return getSeasonWinrate();
        }
    }

    public double tourneyGetPointsPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalPoints / postSeasonGames;
        }
        else
        {
            return getPointsPerGame();
        }
    }

    public double tourneyGetPointsAgainstPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalPointsAgainst / postSeasonGames;
        }
        else
        {
            return getPointsAgainstPerGame();
        }
    }

    public double tourneyGetThreePointPercent()
    {
        if(postSeasonGames > 0)
        {
            return tourneyMadeThreePointers / tourneyTotalThreePointers;
        }
        else
        {
            return getThreePointPercent();
        }
    }

    public double tourneyGetFieldGoalPercent()
    {
        if(postSeasonGames > 0)
        {
            return tourneyMadeFieldGoals / tourneyTotalFieldGoals;
        }
        else
        {
            return getFieldGoalPercent();
        }
    }

    public double tourneyGetFreeThrowPercent()
    {
        if(postSeasonGames > 0)
        {
            return tourneyMadeFreeThrows / tourneyTotalFreeThrows;
        }
        else
        {
            return getFreeThrowPercent();
        }
    }

    public double tourneyGetTurnoversPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalTurnovers / postSeasonGames;
        }
        else
        {
            return getTurnoversPerGame();
        }
    }

    public double tourneyGetStealsPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalSteals / postSeasonGames;
        }
        else
        {
            return getStealsPerGame();
        }
    }

    public double tourneyGetBlocksPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalBlocks / postSeasonGames;
        }
        else
        {
            return getBlocksPerGame();
        }
    }

    public double tourneyGetPersonalFoulsPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalPersonalFouls / postSeasonGames;
        }
        else
        {
            return getPersonalFoulsPerGame();
        }
    }



    public static double weight(double r, double t)
    {
        return r * .45 + t * .55;
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
