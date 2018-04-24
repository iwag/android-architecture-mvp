package io.github.iwag.todomvp;

import java.util.LinkedList;
import java.util.List;

import io.github.iwag.todomvp.dummy.TodoContent;

/**
 * Created by iwag on 2018-04-23.
 */

public class TodoListPresenter implements TodoListContract.Presenter {
    private final List<TodoContent.TodoItem> mValues;

    TodoRepository repository;

    public TodoListPresenter() {
        repository = new TodoRepositoryImpl();
        mValues = repository.getList();
    }

    @Override
    public TodoContent.TodoItem get(int position) {
        return mValues.get(position);
    }

    @Override
    public int size() {
        return mValues.size();
    }
}
