package com.company;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Team[] teams = new Team[364];
        for(int i = 1101; i < 1465; i++)
        {
            teams[i - 1101] = new Team(i);
        }
        for(int i = 0; i < teams.length; i++)
        {
            System.out.println(teams[i].NAME);
        }
    }
}
