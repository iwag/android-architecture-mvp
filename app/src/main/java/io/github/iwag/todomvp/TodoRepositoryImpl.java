package io.github.iwag.todomvp;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.LinkedList;
import java.util.List;

import io.github.iwag.todomvp.dummy.TodoContent;

/**
 * Created by iwag on 2018-04-23.
 */

public class TodoRepositoryImpl implements TodoRepository {
    @Override
    public LiveData<List<TodoContent.TodoItem>> getList() {
        MutableLiveData<List<TodoContent.TodoItem>> liveData = new MutableLiveData<>();
        liveData.setValue(new LinkedList<TodoContent.TodoItem>());
        return liveData;
    }
}
