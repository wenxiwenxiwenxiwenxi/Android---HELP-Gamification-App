package com.bmc304.wincci.bmc304gamificationapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by wincci on 11/25/2017.
 */

public class ListOnlineViewHolder extends RecyclerView.ViewHolder{
    public TextView txtEmail;
    public ListOnlineViewHolder(View itemView){
        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.txt_email);

    }
}
