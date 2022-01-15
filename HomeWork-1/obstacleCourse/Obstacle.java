package Lesson_1.HomeWork.obstacleCourse;

import Lesson_1.HomeWork.team.TeamMember;

public abstract class Obstacle {
    private int difficulty;

    public Obstacle(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void goChallenge (TeamMember member){}

}
