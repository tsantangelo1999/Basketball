package com.company;

import java.util.Scanner;
import java.io.*;

public class Bracket
{
    File seeds;
    Team[] teams;

    public FileWriter fw;
    public PrintWriter pw;

    public Team[][] bracket = new Team[4][16];

    public Bracket(File f, Team[] t)
    {
        seeds = f;
        teams = t;
    }

    public void run() throws IOException
    {
        Scanner sc = new Scanner(seeds);
        sc.useDelimiter("(\\p{javaWhitespace}|,)+|\n");
        while(sc.hasNextLine())
        {
            String seed = sc.next();
            int team = Integer.parseInt(sc.next());
            if(seed.substring(seed.length() - 1).equalsIgnoreCase("a"))
            {
                sc.next();
                int team2 = sc.nextInt();
                double c = Team.compareTo(teams[team - 1101], teams[team2 - 1101]);
                if(c > 0.5)
                {
                    bracket[seed.charAt(0) - 87][Integer.parseInt(seed.substring(1, 3)) - 1] = teams[team - 1101];
                    //OUTPUT GOES HERE
                }
                else
                {
                    bracket[seed.charAt(0) - 87][Integer.parseInt(seed.substring(1, 3)) - 1] = teams[team2 - 1101];
                    //OUTPUT GOES HERE
                }
            }
            else
            {
                bracket[seed.charAt(0) - 87][Integer.parseInt(seed.substring(1, 3)) - 1] = teams[team - 1101];
            }
        }
        for(int i = 0; i < bracket.length; i++)
        {
            for(int j = 0; j < bracket[i].length; j++)
            {
                System.out.println(i + ":" + j + "-" + bracket[i][j].name);
            }
        }
    }
}
