package ru.netology;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int Id, String[] subtasks) {
        super(Id);
        this.subtasks = subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtask : subtasks) {
            if (subtask.contains(query)) {
                return true;
            }
        }
        return false;
    }

    public String[] getSubtasks() {
        return subtasks;
    }
}