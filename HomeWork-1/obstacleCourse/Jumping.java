package Lesson_1.HomeWork.obstacleCourse;

import Lesson_1.HomeWork.team.TeamMember;

public class Jumping extends Obstacle {
    public Jumping(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.jump(super.getDifficulty());
    }
}
