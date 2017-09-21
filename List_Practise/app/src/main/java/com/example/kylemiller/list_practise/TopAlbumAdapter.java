package com.example.kylemiller.list_practise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kylemiller on 20/09/2017.
 */

public class TopAlbumAdapter extends ArrayAdapter<Album> {

    public TopAlbumAdapter(Context context, ArrayList<Album> albums){
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = (LayoutInflater.from(getContext())
                    .inflate(R.layout.album_item, parent, false));
        }
        Album currentAlbum = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentAlbum.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.Name);
        title.setText(currentAlbum.getName().toString());

        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentAlbum.getArtist().toString());

        TextView genre = (TextView) listItemView.findViewById(R.id.genre);
        genre.setText(currentAlbum.getGenre().toString());

        return listItemView;
    }
}
