package Lesson_1.HomeWork;

import Lesson_1.HomeWork.obstacleCourse.*;
import Lesson_1.HomeWork.team.Team;
import Lesson_1.HomeWork.team.TeamMember;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("1-st", 6),
                new TeamMember("2-nd", 6),
                new TeamMember("3-rd", 6),
                new TeamMember("4-th" ,7));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(7), new Jumping(7));
        TeamMember[] members = dreamTeam.getMembers();
        for (TeamMember member : members) {
            System.out.println("Член команды: " + member.getNameTeamMember() + ", сила: " + member.getPower());
        }
        course.doIt(dreamTeam);
        dreamTeam.showResults();

    }
}
