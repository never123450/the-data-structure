package design.dimiter;

public class Test{
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheakNumber(teamLeader);
    }
}