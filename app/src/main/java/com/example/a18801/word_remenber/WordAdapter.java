package com.example.a18801.word_remenber;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 18801 on 2019/11/6.
 */

public class WordAdapter  extends ArrayAdapter<Word>
{
    private int resourceId;
    public WordAdapter(Context context, int textviewResourceId, List<Word> objects)
    {
        super(context,textviewResourceId,objects);
        this.resourceId=textviewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Word word=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView textview=(TextView)view.findViewById(R.id.word_name);
        textview.setText(word.getWord());
        return view;
    }
}
