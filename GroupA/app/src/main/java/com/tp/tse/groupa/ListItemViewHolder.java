package com.tp.tse.groupa;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class ListItemViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewName;
    private String name;
    public ListItemViewHolder(@NonNull View itemView,final NameItemListerner nameItemListerner){

        super(itemView);

        CardView cardView=itemView.findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                nameItemListerner.clickOnItem(name);
            }
        });

        ImageView imageView=itemView.findViewById(R.id.item_view_image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameItemListerner.clickOnCross(name);

            }
        });
        this.textViewName = itemView.findViewById(R.id.listItem_textView_name);

    }
    public void setContent(String name){
        textViewName.setText(name);

    }
}
