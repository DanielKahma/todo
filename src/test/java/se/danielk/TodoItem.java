package se.danielk;

import java.time.LocalDate;

public class TodoItem {
    private int TodoItem;
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
    private person creator;


    public TodoItem(String title, String description, LocalDate deadLine, boolean done, person creator){
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;

    }

    public int getTodoItem() {
        return TodoItem;
    }

    //Getters and Setters
    public void setTodoItem(int todoItem) {
        TodoItem = todoItem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public person getCreator() {
        return creator;
    }

    public void setCreator(person creator) {
        this.creator = creator;
    }


}
