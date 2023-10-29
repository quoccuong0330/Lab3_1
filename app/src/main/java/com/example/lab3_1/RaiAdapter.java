package com.example.lab3_1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class RaiAdapter extends BaseAdapter {
    private List<String> users;
    private Activity activity;

    public RaiAdapter(Activity activity , List<String> users) {
        this.users = users;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.user_detail, null);
        TextView tvName = view.findViewById(R.id.tv_user);
        tvName.setText(users.get(position));
        return view;
    }

}
