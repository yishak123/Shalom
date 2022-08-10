package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private LayoutInflater inflater;
    private String[] sTitles;
    private String[] sContent;


    Adapter(Context context, String[] titles,String[] contents){
    this.inflater=LayoutInflater.from(context);
    this.sTitles=titles;
    this.sContent = contents;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.custome_view,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String title = sTitles[i];
        String content =sContent[i];
        viewHolder.lyricsTitle.setText(title);
        viewHolder.lyricsContent.setText(content);

    }

    @Override
    public int getItemCount() {
        return sTitles.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView lyricsTitle,lyricsContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                 public void onClick(View v) {
                    Intent i = new Intent(v.getContext(),Details.class);
                    //send lyrics title and contents through recyclerview to detail activity
                    i.putExtra("lyricsTitle",sTitles[getAdapterPosition()]);
                    i.putExtra("lyricsContents",sContent[getAdapterPosition()]);
                    v.getContext().startActivity(i);
                }
            });
            lyricsTitle = itemView.findViewById(R.id.lyricsTitle);
            lyricsContent=itemView.findViewById(R.id.lyricsContent);
        }
    }
}
