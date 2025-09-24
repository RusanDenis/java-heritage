package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    SimpleTask simpTask = new SimpleTask(1, "Sleep");

    String[] subtasks = {"walk", "eat", "fly", "swim"};
    Epic epicTask = new Epic(2, subtasks);

    Meeting meet = new Meeting(3, "Полет на марс", "Space X", "21.03.2032");

    @Test
    public void shouldMatchesSimpleTask() {
        boolean expected = true;

        Assertions.assertEquals(expected, simpTask.matches("Sleep"));
    }

    @Test
    public void shouldNotMatchesSimpleTask() {
        boolean expected = false;

        Assertions.assertEquals(expected, simpTask.matches("Walk"));
    }

    @Test
    public void shouldMatchesEpic() {
        boolean expected = true;

        Assertions.assertEquals(expected, epicTask.matches("fly"));
    }

    @Test
    public void shouldNotMatchesEpic() {
        boolean expected = false;

        Assertions.assertEquals(expected, epicTask.matches("run"));
    }

    @Test
    public void shouldMatchesMeetingTopic() {
        boolean expected = true;

        Assertions.assertEquals(expected, meet.matches("Полет на марс"));
    }

    @Test
    public void shouldMatchesMeetingProject() {
        boolean expected = true;

        Assertions.assertEquals(expected, meet.matches("Space X"));
    }

    @Test
    public void shouldNotMatchesMeeting() {
        boolean expected = false;

        Assertions.assertEquals(expected, meet.matches("Полет на Луну"));
    }
}