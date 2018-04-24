package io.github.iwag.todomvp;

import java.util.LinkedList;
import java.util.List;

import io.github.iwag.todomvp.dummy.TodoContent;

/**
 * Created by iwag on 2018-04-23.
 */

public class TodoRepositoryImpl implements TodoRepository {
    @Override
    public List<TodoContent.TodoItem> getList() {
        return new LinkedList<>();
    }
}
