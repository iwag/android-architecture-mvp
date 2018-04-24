package io.github.iwag.todomvp;

import android.arch.lifecycle.LiveData;

import java.util.List;

import io.github.iwag.todomvp.dummy.TodoContent;

/**
 * Created by iwag on 2018-04-23.
 */

public interface TodoRepository {
    LiveData<List<TodoContent.TodoItem>> getList();
}
