package se.danielk;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private person assignee;


    //Constructors

    public TodoItemTask (int id, boolean assigned, TodoItem todoItem, person assignee){

        if (todoItem == null)
            throw new IllegalArgumentException("not allowed to be null!");

        if (assignee != null)
            assigned = true;

        if (assignee == null)
            assigned = false;



        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;
    }

    //Getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("not allowed to be null!");
        this.todoItem = todoItem;
    }

    public person getAssignee() {
        return assignee;
    }

    public void setAssignee(person assignee) {
        this.assignee = assignee;
    }


}
