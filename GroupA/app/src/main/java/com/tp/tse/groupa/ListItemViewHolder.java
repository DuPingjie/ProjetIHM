package com.tp.tse.groupa;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
public class ListItemViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;
    public ListItemViewHolder(@NonNull View itemView){
        super(itemView);
        this.textViewName = itemView.findViewById(R.id.listItem_textView_name);
    }
    public void setContent(String name){
        textViewName.setText(name);

    }
}
