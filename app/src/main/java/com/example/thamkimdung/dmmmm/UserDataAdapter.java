package com.example.thamkimdung.dmmmm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThamKimDung on 4/16/2018.
 */

public class UserDataAdapter extends RecyclerView.Adapter<UserDataAdapter.ViewHolder> {
    private Context context;
    private List<User> userArrayList;

    public UserDataAdapter(Context context, List<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        User user = userArrayList.get(position);
        holder.userName.setText(user.getLogin());
        holder.id.setText(user.getId() + "");
        Picasso.with(context).load(user.avatar_url).into(holder.img_url);

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_url;
        TextView userName;
        TextView id;

        public ViewHolder(View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.tvUserName);
            id = itemView.findViewById(R.id.tvId);
            img_url = itemView.findViewById(R.id.imgAvatar);
        }
    }
}
