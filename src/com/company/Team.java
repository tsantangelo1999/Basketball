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

    public double getSeasonPointsPerGame()
    {
        return totalPoints / regularSeasonGames;
    }

    public double getSeasonPointsAgainstPerGame()
    {
        return totalPointsAgainst / regularSeasonGames;
    }

    public double getSeasonThreePointPercent()
    {
        return madeThreePointers / totalThreePointers;
    }

    public double getSeasonFieldGoalPercent()
    {
        return madeFieldGoals / totalFieldGoals;
    }

    public double getSeasonFreeThrowPercent()
    {
        return madeFreeThrows / totalFreeThrows;
    }

    public double getSeasonTurnoversPerGame()
    {
        return totalTurnovers / regularSeasonGames;
    }

    public double getSeasonStealsPerGame()
    {
        return totalSteals / regularSeasonGames;
    }

    public double getSeasonBlocksPerGame()
    {
        return totalBlocks / regularSeasonGames;
    }

    public double getSeasonPersonalFoulsPerGame()
    {
        return totalPersonalFouls / regularSeasonGames;
    }
    
    
    
    public double getPointsPerGame()
    {
        return weight(getSeasonPointsPerGame(), getTourneyPointsPerGame());
    }

    public double getPointsAgainstPerGame()
    {
        return weight(getSeasonPointsAgainstPerGame(), getTourneyPointsAgainstPerGame());
    }
    
    public double getThreePointPercent()
    {
        return weight(getSeasonThreePointPercent(), getTourneyThreePointPercent());
    }
    
    public double getFieldGoalPercent()
    {
        return weight(getSeasonFieldGoalPercent(), getTourneyFieldGoalPercent());
    }
    
    public double getFreeThrowPercent()
    {
        return weight(getSeasonFreeThrowPercent(), getTourneyFreeThrowPercent());
    }
    
    public double getTurnoversPerGame()
    {
        return weight(getSeasonTurnoversPerGame(), getTourneyTurnoversPerGame());
    }
    
    public double getStealsPerGame()
    {
        return weight(getSeasonStealsPerGame(), getTourneyStealsPerGame());
    }
    
    public double getBlocksPerGame()
    {
        return weight(getSeasonBlocksPerGame(), getTourneyBlocksPerGame());
    }
    
    public double getPersonalFoulsPerGame()
    {
        return weight(getSeasonPersonalFoulsPerGame(), getTourneyPersonalFoulsPerGame());
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

    public double getTourneyPointsPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalPoints / postSeasonGames;
        }
        else
        {
            return getSeasonPointsPerGame();
        }
    }

    public double getTourneyPointsAgainstPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalPointsAgainst / postSeasonGames;
        }
        else
        {
            return getSeasonPointsAgainstPerGame();
        }
    }

    public double getTourneyThreePointPercent()
    {
        if(postSeasonGames > 0)
        {
            return tourneyMadeThreePointers / tourneyTotalThreePointers;
        }
        else
        {
            return getSeasonThreePointPercent();
        }
    }

    public double getTourneyFieldGoalPercent()
    {
        if(postSeasonGames > 0)
        {
            return tourneyMadeFieldGoals / tourneyTotalFieldGoals;
        }
        else
        {
            return getSeasonFieldGoalPercent();
        }
    }

    public double getTourneyFreeThrowPercent()
    {
        if(postSeasonGames > 0)
        {
            return tourneyMadeFreeThrows / tourneyTotalFreeThrows;
        }
        else
        {
            return getSeasonFreeThrowPercent();
        }
    }

    public double getTourneyTurnoversPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalTurnovers / postSeasonGames;
        }
        else
        {
            return getSeasonTurnoversPerGame();
        }
    }

    public double getTourneyStealsPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalSteals / postSeasonGames;
        }
        else
        {
            return getSeasonStealsPerGame();
        }
    }

    public double getTourneyBlocksPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalBlocks / postSeasonGames;
        }
        else
        {
            return getSeasonBlocksPerGame();
        }
    }

    public double getTourneyPersonalFoulsPerGame()
    {
        if(postSeasonGames > 0)
        {
            return tourneyTotalPersonalFouls / postSeasonGames;
        }
        else
        {
            return getSeasonPersonalFoulsPerGame();
        }
    }



    public static double weight(double r, double t)
    {
        return r * .5 + t * .5;
    }



    public double offensiveScore()
    {
        return 0;
    }

    public double defensiveScore()
    {
        return 0;
    }


    public static double compareTo(Team a, Team b)
    {
        double points = 0;
        if (a.getSeasonWinrate() - b.getSeasonWinrate() > -.05 || a.getSeasonWinrate() - b.getSeasonWinrate() < .05)
            points += .5;
        else if (a.getSeasonWinrate() > b.getSeasonWinrate())
            points += 1;
        if (a.getPointsPerGame() - b.getPointsPerGame() > -4 || a.getPointsPerGame() - b.getPointsPerGame() < 4)
            points += .5;
        else if (a.getPointsPerGame() > b.getPointsPerGame())
            points++;
        if (a.getPointsAgainstPerGame() - b.getPointsAgainstPerGame() > -4 || a.getPointsAgainstPerGame() - b.getPointsAgainstPerGame() < 4)
            points += .5;
        else if (a.getPointsAgainstPerGame() < b.getPointsAgainstPerGame())
            points++;
        if (a.getThreePointPercent() > b.getThreePointPercent())
            points++;
        if (a.getFieldGoalPercent() > b.getFieldGoalPercent())
            points++;
        if (a.getFreeThrowPercent() > b.getFreeThrowPercent())
            points++;
        if (a.getTurnoversPerGame() < b.getTurnoversPerGame())
            points++;
        if (a.getStealsPerGame() > b.getStealsPerGame())
            points++;
        if (a.getBlocksPerGame() > b.getBlocksPerGame())
            points++;
        if (a.getPersonalFoulsPerGame() < b.getPersonalFoulsPerGame())
            points++;
        if (a.getFreeThrowPercent() * b.getPersonalFoulsPerGame() > b.getFreeThrowPercent() * a.getPersonalFoulsPerGame())
            points += .5;
        return points/10.5;
    }
}
