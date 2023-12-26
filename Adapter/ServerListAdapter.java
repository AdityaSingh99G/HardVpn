package com.example.hardvpn.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hardvpn.Model.Servers;
import com.example.hardvpn.R;

import java.util.ArrayList;

public class ServerListAdapter extends RecyclerView.Adapter<ServerListAdapter.MyViewHOlder> {

    private Context Context;
    private ArrayList<Servers> ServerList;

    public ServerListAdapter(android.content.Context context, ArrayList<Servers> serverList) {
        Context = context;
        ServerList = serverList;
    }

    @NonNull
    @Override
    public MyViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(Context).inflate(R.layout.serverlayout, parent, false);
        return new MyViewHOlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHOlder holder, int position) {

        Servers servers = ServerList.get(position);
        holder.CountryName.setText(servers.getServerCountry());

        //for adding ImageUrl using Glide library

        Glide.with(Context).load(servers.getFlagUrl()).into(holder.ServerIcon);


    }


    @Override
    public int getItemCount() {
        return ServerList.size();
    }

    public class MyViewHOlder extends RecyclerView.ViewHolder {

        ImageView ServerIcon;
        View ServerSignalwifi;
        TextView CountryName;

        public MyViewHOlder(@NonNull View itemView) {
            super(itemView);
            ServerIcon = itemView.findViewById(R.id.SLcircularImg);
            ServerSignalwifi = itemView.findViewById(R.id.SLServerSignal);
            CountryName= itemView.findViewById(R.id.SLCountryName);


        }
    }


}













