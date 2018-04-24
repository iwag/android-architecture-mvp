package io.github.iwag.todomvp;

import java.util.List;

import io.github.iwag.todomvp.dummy.TodoContent;

/**
 * Created by iwag on 2018-04-23.
 */

public interface TodoRepository {
    List<TodoContent.TodoItem> getList();
}
