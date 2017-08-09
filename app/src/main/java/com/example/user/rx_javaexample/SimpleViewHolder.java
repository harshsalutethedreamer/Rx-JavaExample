package com.example.user.rx_javaexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 8/9/2017.
 */

public class SimpleViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextView;

    public SimpleViewHolder(View itemView) {
        super(itemView);
        mTextView=(TextView)itemView.findViewById(R.id.simple_list_item);

    }
}
