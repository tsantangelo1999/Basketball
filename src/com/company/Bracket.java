package com.company;

import java.util.*;
import java.io.*;

public class Bracket
{
    File seeds;
    Team[] teams;

    public Team[][] bracket = new Team[4][16];


    public Bracket(File f, Team[] t)
    {
        seeds = f;
        teams = t;
    }
    public Team[] gen(Team[] t){
        Team[] newBrak = new Team[t.length/2];
        for(int i = 0; i < t.length/2; i++){
            newBrak[i] = (Team.compareTo(t[2*i],t[2*i+1]) > 0.5)?t[2*i]:t[2*i+1];
            System.out.println(newBrak[i].name); //asdf
        }
        return newBrak;
    }
    public ArrayList<Team> gen(ArrayList<Team> t){
        ArrayList<Team> newBrak = new ArrayList();
        for(int i = 0; i < t.size()/2; i++){
            Team temp = (Team.compareTo(t.get(2*i), t.get(2*i+1)) > 0.5)?t.get(2*i):t.get(2*i+1);
            newBrak.add(temp);
            System.out.println(temp.name);
        }
        return newBrak;
    }
    public void bracketGen(){
        //wx
        //yz
        Team[] finalfour = new Team[4];
        for(int i = 0; i < bracket.length; i++) {
            ArrayList<Team> temp = new ArrayList();
            for(int j = 0; j < bracket[i].length; j++){
                temp.add(bracket[i][j]);
            }
            for (int j = 0; j < 4; j++) {
                temp = gen(temp);
                if(j==3)
                    finalfour[i] = temp.get(0);
            }
        }
        ArrayList<Team> two1 = new ArrayList();
        two1.add(finalfour[0]); two1.add(finalfour[1]);
        ArrayList<Team> two2 = new ArrayList();
        two2.add(finalfour[2]); two2.add(finalfour[3]);
        ArrayList<Team> finalTwo = new ArrayList();
        finalTwo.add(gen(two1).get(0));
        finalTwo.add(gen(two2).get(0));
        gen(finalTwo);
    }
    public void run() throws IOException
    {
        Scanner sc = new Scanner(seeds);
        sc.useDelimiter("(\\p{javaWhitespace}|,)+|\n");
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
                    bracket[seed.charAt(0) - 87][Integer.parseInt(seed.substring(1, 3))-1] = teams[team - 1101];
                }
                else
                {
                    bracket[seed.charAt(0) - 87][Integer.parseInt(seed.substring(1, 3))-1] = teams[team2 - 1101];
                }
            }
            else
            {
                bracket[seed.charAt(0) - 87][Integer.parseInt(seed.substring(1, 3))-1] = teams[team - 1101];
            }
        }
    }
}
