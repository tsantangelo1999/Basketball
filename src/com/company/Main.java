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
        sc1.useDelimiter(",");
        while(sc1.hasNextLine())
        {
            int year = sc1.nextInt();
            int teamNum = sc1.nextInt() - 1101;
            double multiplier = 1 - ((2016 - year) * .05);
            teams[teamNum].totalPoints += sc1.nextInt() * multiplier;
            teams[teamNum].madeFieldGoals += sc1.nextInt() * multiplier;
            teams[teamNum].totalFreeThrows += sc1.nextInt() * multiplier;

        }
    }
}
