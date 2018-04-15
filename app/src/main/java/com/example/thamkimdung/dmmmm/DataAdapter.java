package com.example.thamkimdung.dmmmm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ThamKimDung on 4/15/2018.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<Person> personArrayList;
    private Context context;

    public DataAdapter(ArrayList<Person> personArrayList, Context context) {
        this.personArrayList = personArrayList;
        this.context = context;
    }

    //tao view holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_person,parent,false);
        return new ViewHolder(view);
    }

    // hung du lieu do vao
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.name.setText(personArrayList.get(position).getName().toString());
        holder.age.setText(personArrayList.get(position).getAge()+"");
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView age;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvName);
            age = itemView.findViewById(R.id.tvAge);
        }
    }
}
