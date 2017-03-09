package com.company;

import java.io.*;
import java.util.Scanner;
import java.text.NumberFormat;

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
            int teamNum1 = sc1.nextInt() - 1101;
            int teamNum2 = sc1.nextInt() - 1101;
            double multiplier = 1 - ((2016 - year) * .05);
            int i = sc1.nextInt();
            teams[teamNum1].totalPoints += i * multiplier;
            teams[teamNum2].totalPointsAgainst += i * multiplier;
            teams[teamNum1].madeFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum1].totalFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum1].madeThreePointers += sc1.nextInt() * multiplier;
            teams[teamNum1].totalThreePointers += sc1.nextInt() * multiplier;
            teams[teamNum1].madeFreeThrows += sc1.nextInt() * multiplier;
            teams[teamNum1].totalFreeThrows += sc1.nextInt() * multiplier;
            teams[teamNum1].totalTurnovers += sc1.nextInt() * multiplier;
            teams[teamNum1].totalSteals += sc1.nextInt() * multiplier;
            teams[teamNum1].totalBlocks += sc1.nextInt() * multiplier;
            teams[teamNum1].totalPersonalFouls += sc1.nextInt() * multiplier;
            teams[teamNum1].regularSeasonGames += multiplier;
            teams[teamNum1].regularSeasonWins += multiplier;

            i = sc1.nextInt();
            teams[teamNum2].totalPoints += i * multiplier;
            teams[teamNum1].totalPointsAgainst += i * multiplier;
            teams[teamNum2].madeFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum2].totalFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum2].madeThreePointers += sc1.nextInt() * multiplier;
            teams[teamNum2].totalThreePointers += sc1.nextInt() * multiplier;
            teams[teamNum2].madeFreeThrows += sc1.nextInt() * multiplier;
            teams[teamNum2].totalFreeThrows += sc1.nextInt() * multiplier;
            teams[teamNum2].totalTurnovers += sc1.nextInt() * multiplier;
            teams[teamNum2].totalSteals += sc1.nextInt() * multiplier;
            teams[teamNum2].totalBlocks += sc1.nextInt() * multiplier;
            teams[teamNum2].totalPersonalFouls += sc1.nextInt() * multiplier;
            teams[teamNum2].regularSeasonGames += multiplier;
        }
        sc1.close();
        Scanner sc2 = new Scanner(new File("TourneyDetailedResultsE.csv"));
        sc2.nextLine();
        sc2.useDelimiter(",|\n|\\s+");
        while(sc2.hasNextLine())
        {
            int year = sc2.nextInt();
            int teamNum1 = sc2.nextInt() - 1101;
            int teamNum2 = sc2.nextInt() - 1101;
            double multiplier = 1 - ((2016 - year) * .05);
            int i = sc2.nextInt();
            teams[teamNum1].tourneyTotalPoints += i * multiplier;
            teams[teamNum2].tourneyTotalPointsAgainst += i * multiplier;
            teams[teamNum1].tourneyMadeFieldGoals += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyTotalFieldGoals += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyMadeThreePointers += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyTotalThreePointers += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyMadeFreeThrows += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyTotalFreeThrows += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyTotalTurnovers += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyTotalSteals += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyTotalBlocks += sc2.nextInt() * multiplier;
            teams[teamNum1].tourneyTotalPersonalFouls += sc2.nextInt() * multiplier;
            teams[teamNum1].postSeasonGames += multiplier;
            teams[teamNum1].postSeasonWins += multiplier;

            i = sc2.nextInt();
            teams[teamNum2].tourneyTotalPoints += i * multiplier;
            teams[teamNum1].tourneyTotalPointsAgainst += i * multiplier;
            teams[teamNum2].tourneyMadeFieldGoals += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyTotalFieldGoals += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyMadeThreePointers += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyTotalThreePointers += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyMadeFreeThrows += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyTotalFreeThrows += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyTotalTurnovers += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyTotalSteals += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyTotalBlocks += sc2.nextInt() * multiplier;
            teams[teamNum2].tourneyTotalPersonalFouls += sc2.nextInt() * multiplier;
            teams[teamNum2].postSeasonGames += multiplier;
        }
        sc2.close();
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(4);
        nf.setMaximumFractionDigits(4);
        FileWriter fw = new FileWriter("TeamStats.csv");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("name,winrate,ppg,papg,3p%,fg%,ft%,topg,spg,bpg,pfpg");
        for(int i = 0; i < teams.length; i++)
        {
            pw.println(teams[i].name + ","
                    + nf.format(teams[i].getSeasonWinrate()) + ","
                    + nf.format(teams[i].getPointsPerGame()) + ","
                    + nf.format(teams[i].getPointsAgainstPerGame()) + ","
                    + nf.format(teams[i].getThreePointPercent()) + ","
                    + nf.format(teams[i].getFieldGoalPercent()) + ","
                    + nf.format(teams[i].getFreeThrowPercent()) + ","
                    + nf.format(teams[i].getTurnoversPerGame()) + ","
                    + nf.format(teams[i].getStealsPerGame()) + ","
                    + nf.format(teams[i].getBlocksPerGame()) + ","
                    + nf.format(teams[i].getPersonalFoulsPerGame());
        }
        pw.close();
        fw.close();
        Bracket bracket = new Bracket(new File("TourneySeeds.csv"), teams);
        bracket.run();
    }
}
