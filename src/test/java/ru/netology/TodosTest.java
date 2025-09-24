package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodosTest {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = {"Молоко", "Яйца", "Хлеб","Позвонить родителям"};
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );
    Todos todos = new Todos();

    @BeforeEach
    public void setup() {
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
    }


    @Test
    public void shouldAddThreeTasksOfDifferentType() {


        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchTasks() {
        Task[] expected = {meeting};


        Assertions.assertArrayEquals(expected, todos.search("Выкатка 3й версии приложения"));
    }
    @Test
    public void shouldNotSearchTasks() {
        Task[] expected = new Task[0];


        Assertions.assertArrayEquals(expected, todos.search("Выкатка 4й версии приложения"));
    }
    @Test
    public void shouldSearchMultipleTasks(){
        Task[] expected = {simpleTask,epic};


        Assertions.assertArrayEquals(expected, todos.search("Позвонить родителям"));
    }
}