package com.company;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Team[] teams = new Team[364];
        for(int i = 1101; i < 1465; i++)
        {
            teams[i - 1101] = new Team(i);
        }
        Scanner sc1 = new Scanner(new File("RegularSeasonDetailedResultsE.csv"));
        sc1.nextLine();
        sc1.useDelimiter(",|\n|\\s+");
        while(sc1.hasNextLine())
        {
            int year = sc1.nextInt();
            int teamNum = sc1.nextInt() - 1101;
            double multiplier = 1 - ((2016 - year) * .05);
            teams[teamNum].totalPoints += sc1.nextInt() * multiplier;
            teams[teamNum].madeFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum].totalFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum].madeThreePointers += sc1.nextInt() * multiplier;
            teams[teamNum].totalThreePointers += sc1.nextInt() * multiplier;
            teams[teamNum].madeFreeThrows += sc1.nextInt() * multiplier;
            teams[teamNum].totalFreeThrows += sc1.nextInt() * multiplier;
            teams[teamNum].totalTurnovers += sc1.nextInt() * multiplier;
            teams[teamNum].totalSteals += sc1.nextInt() * multiplier;
            teams[teamNum].totalBlocks += sc1.nextInt() * multiplier;
            teams[teamNum].totalPersonalFouls += sc1.nextInt() * multiplier;
            teams[teamNum].regularSeasonGames += multiplier;
            teams[teamNum].regularSeasonWins += multiplier;
            teamNum = sc1.nextInt() - 1101;
            teams[teamNum].totalPoints += sc1.nextInt() * multiplier;
            teams[teamNum].madeFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum].totalFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum].madeThreePointers += sc1.nextInt() * multiplier;
            teams[teamNum].totalThreePointers += sc1.nextInt() * multiplier;
            teams[teamNum].madeFreeThrows += sc1.nextInt() * multiplier;
            teams[teamNum].totalFreeThrows += sc1.nextInt() * multiplier;
            teams[teamNum].totalTurnovers += sc1.nextInt() * multiplier;
            teams[teamNum].totalSteals += sc1.nextInt() * multiplier;
            teams[teamNum].totalBlocks += sc1.nextInt() * multiplier;
            teams[teamNum].totalPersonalFouls += sc1.nextInt() * multiplier;
            teams[teamNum].regularSeasonGames += multiplier;
        }
        sc1.close();
        Scanner sc2 = new Scanner(new File("TourneyDetailedResultsE.csv"));
        sc2.nextLine();
        sc2.useDelimiter(",|\n|\\s+");
        while(sc2.hasNextLine())
        {
            int year = sc2.nextInt();
            int teamNum = sc2.nextInt() - 1101;
            double multiplier = 1 - ((2016 - year) * .05);
            teams[teamNum].tourneyTotalPoints += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyMadeFieldGoals += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalFieldGoals += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyMadeThreePointers += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalThreePointers += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyMadeFreeThrows += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalFreeThrows += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalTurnovers += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalSteals += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalBlocks += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalPersonalFouls += sc2.nextInt() * multiplier;
            teams[teamNum].postSeasonGames += multiplier;
            teams[teamNum].postSeasonWins += multiplier;
            teamNum = sc2.nextInt() - 1101;
            teams[teamNum].tourneyTotalPoints += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyMadeFieldGoals += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalFieldGoals += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyMadeThreePointers += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalThreePointers += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyMadeFreeThrows += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalFreeThrows += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalTurnovers += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalSteals += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalBlocks += sc2.nextInt() * multiplier;
            teams[teamNum].tourneyTotalPersonalFouls += sc2.nextInt() * multiplier;
            teams[teamNum].postSeasonGames += multiplier;
        }
        sc2.close();
        FileWriter fw = new FileWriter("TeamStats.csv");
        PrintWriter pw = new PrintWriter(fw);
        for(int i = 0; i < teams.length; i++)
        {
            pw.println(teams[i].name + ","
                    + Team.weight(teams[i].getSeasonWinrate(), teams[i].getPostSeasonWinrate()) + ","
                    + Team.weight(teams[i].getPointsPerGame(), teams[i].tourneyGetPointsPerGame()) + ","
                    + Team.weight(teams[i].getThreePointPercent(), teams[i].tourneyGetThreePointPercent()) + ","
                    + Team.weight(teams[i].getFieldGoalPercent(), teams[i].tourneyGetFieldGoalPercent()) + ","
                    + Team.weight(teams[i].getFreeThrowPercent(), teams[i].tourneyGetFreeThrowPercent()) + ","
                    + Team.weight(teams[i].getTurnoversPerGame(), teams[i].tourneyGetTurnoversPerGame()) + ","
                    + Team.weight(teams[i].getStealsPerGame(), teams[i].tourneyGetStealsPerGame()) + ","
                    + Team.weight(teams[i].getBlocksPerGame(), teams[i].tourneyGetBlocksPerGame()) + ","
                    + Team.weight(teams[i].getPersonalFoulsPerGame(), teams[i].tourneyGetPersonalFoulsPerGame()));
        }
        pw.close();
        fw.close();
    }
}
