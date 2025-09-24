package ru.netology;

public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String date;

    public Meeting(int Id, String topic, String project, String date) {
        super(Id);
        this.topic = topic;
        this.project = project;
        this.date = date;

    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }

    public String getDate() {
        return date;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }
}
