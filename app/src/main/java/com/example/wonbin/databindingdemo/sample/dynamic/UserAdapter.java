package com.example.wonbin.databindingdemo.sample.dynamic;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import com.example.wonbin.databindingdemo.R;
import com.example.wonbin.databindingdemo.databinding.UserItemBinding;
import com.example.wonbin.databindingdemo.model.User;
import com.example.wonbin.databindingdemo.utils.Randoms;

/**
 * Created by wonbin on 5/21/16.
 */
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder> {

    private static final int USER_COUNT = 10;

    private List<User> mUser;

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item,parent,false);

        return  new UserHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {
        holder.bind(mUser.get(position));
    }

    @Override
    public int getItemCount() {
        return mUser.size();
    }

    public static class UserHolder extends RecyclerView.ViewHolder {
        private UserItemBinding itemBinding;

        public UserHolder(View itemView) {
            super(itemView);
            itemBinding = DataBindingUtil.bind(itemView);
        }

        public void bind(@NonNull User user) {itemBinding.setUser(user);}
    }

    public UserAdapter() {
        mUser = new ArrayList<>(10);
        for (int i = 0; i < USER_COUNT; i++) {
            User user = new User(Randoms.nextFirstName(),Randoms.nextLastName());
            mUser.add(user);
        }

    }
}
