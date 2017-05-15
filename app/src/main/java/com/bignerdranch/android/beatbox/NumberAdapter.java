package com.bignerdranch.android.beatbox;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nurs on 4/30/17.
 */

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberHolder> {

    public ArrayList<Integer> list;
    public Context context;


    public NumberAdapter(Context context,ArrayList<Integer> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public NumberHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return new NumberHolder(inflater,parent);
    }

    @Override
    public void onBindViewHolder(NumberHolder holder, int position) {
        Integer integer = list.get(position);
        holder.bindSound(integer);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NumberHolder extends RecyclerView.ViewHolder {
        private Button mButton;
        private Integer integer;

        public NumberHolder(final LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_sound, parent, false));

            mButton = (Button)itemView.findViewById(R.id.button);
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent  = new Intent(context,NumberDetailActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("INTEGER_VALUE",integer);
                    intent.putExtras(bundle);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            });
        }

        public void bindSound(Integer integer) {
            this.integer = integer;
            mButton.setText(integer.toString());
        }

    }

}