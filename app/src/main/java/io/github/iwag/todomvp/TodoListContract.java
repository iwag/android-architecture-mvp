package io.github.iwag.todomvp;

import io.github.iwag.todomvp.dummy.TodoContent;

/**
 * Created by iwag on 2018-04-23.
 */

public class TodoListContract {

    interface Presenter {

        TodoContent.TodoItem get(int position);

        int size();
    }
}
