package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Team[] teams = new Team[364];
        for(int i = 1101; i < 1464; i++)
        {
            teams[i - 1101] = new Team(i);
        }
    }
}
