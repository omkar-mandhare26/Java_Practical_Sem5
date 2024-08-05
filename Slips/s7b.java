package Slips;

import java.util.*;

class cricketPlayer {
    public int pid;
    public String pname;
    public int totalRuns;
    public int inningsPlayed;
    public int notOutTimes;
    public float AvgRuns;
    public static float totalAvgRuns = 0;

    cricketPlayer(int pid, String pname, int totalRuns, int inningsPlayed, int notOutTimes) {
        this.pid = pid;
        this.pname = pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
        this.AvgRuns = totalRuns / inningsPlayed;
    }

    public void display() {
        System.out.println("Player ID: " + pid);
        System.out.println("Player Name: " + pname);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Innings Played: " + inningsPlayed);
        System.out.println("Not Out Times: " + notOutTimes);
        System.out.println("Average Runs: " + AvgRuns);
    }

    public float getAvgRuns() {
        return this.AvgRuns;
    }

    public void calculateAverageRuns(cricketPlayer objs[], int n) {
        for (int i = 0; i < n; i++)
            totalAvgRuns += objs[i].getAvgRuns();

        totalAvgRuns /= n;
        System.out.println("Total Average Runs: " + totalAvgRuns);
    }

    public void maxAverage(cricketPlayer objs[], int n) {
        float max = objs[0].getAvgRuns();
        int k = 0;

        for (int i = 1; i < n; i++)
            if (max < objs[i].getAvgRuns()) {
                max = objs[i].getAvgRuns();
                k = i;
            }

        System.out.println("Player With Maximum Average Runs: ");
        objs[k].display();
    }
}

public class s7b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter No of Players: ");
        int n = input.nextInt();

        cricketPlayer[] players = new cricketPlayer[n];
        int pid;
        String pname;
        int totalRuns;
        int inningsPlayed;
        int notOutTimes;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Player ID: ");
            pid = input.nextInt();

            System.out.print("Enter Player Name: ");
            pname = input.next();

            System.out.print("Enter Total Runs: ");
            totalRuns = input.nextInt();

            System.out.print("Enter Innings Played: ");
            inningsPlayed = input.nextInt();

            System.out.print("Enter Not Out Times: ");
            notOutTimes = input.nextInt();
            players[i] = new cricketPlayer(pid, pname, totalRuns, inningsPlayed, notOutTimes);
        }

        input.close();

        float maxRuns = players[0].getAvgRuns();
        int k = 0;
        for (int i = 1; i < n; i++)
            if (maxRuns < players[i].getAvgRuns()) {
                maxRuns = players[i].getAvgRuns();
                k = i;
            }
        System.out.println("Player With Maximum Average Runs: ");
        players[k].display();
    }
}
