package io.github.iwag.todomvp;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;

import java.util.LinkedList;
import java.util.List;

import io.github.iwag.todomvp.dummy.TodoContent;

/**
 * Created by iwag on 2018-04-23.
 */

public class TodoListPresenter implements TodoListContract.Presenter {
    private final List<TodoContent.TodoItem> mValues;

    TodoRepository repository;

    public TodoListPresenter(LifecycleOwner owner) {
        mValues = new LinkedList<>();
        repository = new TodoRepositoryImpl();
        repository.getList().observe(owner, new Observer<List<TodoContent.TodoItem>>() {
            @Override
            public void onChanged(@Nullable List<TodoContent.TodoItem> todoItems) {
                mValues.addAll(todoItems);
            }
        });

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
