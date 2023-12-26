package com.example.hardvpn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.hardvpn.Adapter.ServerListAdapter;
import com.example.hardvpn.Model.Servers;

import java.util.ArrayList;

public class Server_list_Activity extends AppCompatActivity {

    ServerListAdapter serverListAdapter;
    ArrayList<Servers> ServerList;
    RecyclerView serverRecyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_list);
        serverRecyclerView = findViewById(R.id.ASLRecyclerView);

        serverRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ServerList = getServerList();

        if (ServerList != null) {

            serverListAdapter = new ServerListAdapter(this,ServerList);
            serverRecyclerView.setAdapter(serverListAdapter);

        }

    }

    public ArrayList getServerList() {
        ArrayList<Servers> serverlist = new ArrayList<>();

        serverlist.add(new Servers
                ("Japan",
                        Utiles.getImageUrl(R.drawable.japan),
                        "japan.ovpn",
                        "vpn",
                        "vpn"));
        serverlist.add(new Servers
                ("Japan Tokyo",
                        Utiles.getImageUrl(R.drawable.japan),
                        "Japan2.ovpn",
                        "vpn",
                        "vpn"));

        serverlist.add(new Servers
                ("Cambodia",
                        Utiles.getImageUrl(R.drawable.cambodia),
                        "kambodia.ovpn",
                        "vpn",
                        "vpn"));

        serverlist.add(new Servers
                ("Korea",
                        Utiles.getImageUrl(R.drawable.south_korea),
                        "Korea.ovpn",
                        "vpn",
                        "vpn"));

        serverlist.add(new Servers
                ("Thailand",
                        Utiles.getImageUrl(R.drawable.thailand),
                        "Thailand.ovpn",
                        "vpn",
                        "vpn"));

        serverlist.add(new Servers
                ("United States",
                        Utiles.getImageUrl(R.drawable.united_states),
                        "UnitedStates.ovpn",
                        "vpn",
                        "vpn"));

        serverlist.add(new Servers
                ("Vietnam",
                        Utiles.getImageUrl(R.drawable.vietnam),
                        "VietNam.ovpn",
                        "vpn",
                        "vpn"));

        return serverlist;
    }


}