package io.github.iwag.todomvp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.github.iwag.todomvp.TodoListFragment.OnListFragmentInteractionListener;
import io.github.iwag.todomvp.dummy.TodoContent.TodoItem;

/**
 * {@link RecyclerView.Adapter} that can display a {@link TodoItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyTodoListRecyclerViewAdapter extends RecyclerView.Adapter<MyTodoListRecyclerViewAdapter.ViewHolder> {

    private final OnListFragmentInteractionListener mListener;
    private TodoListContract.Presenter mPresenter;

    public MyTodoListRecyclerViewAdapter(OnListFragmentInteractionListener listener, TodoListContract.Presenter presenter) {
        mListener = listener;
        this.mPresenter = presenter;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_todolist, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mPresenter.get(position);
        holder.mIdView.setText(mPresenter.get(position).id);
        holder.mContentView.setText(mPresenter.get(position).content);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPresenter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public TodoItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
