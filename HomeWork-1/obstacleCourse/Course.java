package Lesson_1.HomeWork.obstacleCourse;

import Lesson_1.HomeWork.Status;
import Lesson_1.HomeWork.team.Team;
import Lesson_1.HomeWork.team.TeamMember;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.goChallenge(member);
                if (member.getStatus()== Status.NoPassedDistance){
                    break;
                }
            }
        }
    }
}
