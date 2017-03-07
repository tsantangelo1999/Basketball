package com.company;

import java.util.Scanner;
import java.io.*;

public class Bracket
{
    File seeds;
    Team[] teams;

    public Team[] w = new Team[16];
    public Team[] x = new Team[16];
    public Team[] y = new Team[16];
    public Team[] z = new Team[16];

    public Bracket(File f, Team[] t)
    {
        seeds = f;
        teams = t;
    }

    public void run() throws IOException
    {
        Scanner sc = new Scanner(seeds);
        sc.useDelimiter(",|\n");
        while(sc.hasNextLine())
        {
            String seed = sc.next();
            int team = sc.nextInt();
            if(seed.substring(seed.length() - 1).equalsIgnoreCase("a"))
            {
                sc.next();
                int team2 = sc.nextInt();
                double c = Team.compareTo(teams[team - 1101], teams[team2 - 1101]);
                if(c > 0.5)
                {

                }
            }
        }
    }
}
