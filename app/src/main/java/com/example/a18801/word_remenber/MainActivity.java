package com.example.a18801.word_remenber;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private List<Word> wordList=new ArrayList<>();
    private TextView liju;
    private  TextView sentence;
    private TextView translate;
    private ImageView image;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liju=(TextView)findViewById(R.id.textView3);
        sentence=(TextView)findViewById(R.id.textView5);
        translate=(TextView)findViewById(R.id.textView2);
        image=(ImageView) findViewById(R.id.imageView);
        final Word word1=new Word(1,"apple");
        word1.setSentence("this is a apple");
        word1.setTranslate("苹果");
        word1.setImageid(R.mipmap.ic_launcher);
        wordList.add(word1);
        WordAdapter wordAdapter=new WordAdapter(MainActivity.this,R.layout.word_item,wordList);
        ListView listview=(ListView)findViewById(R.id.word);
        listview.setAdapter(wordAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent,View view, int position,long id)
            {
                Word word=wordList.get(position);
                if(liju.getText().equals(""))
                {
                    liju.setText("例句:");
                }
                sentence.setText(word.getSentence());
                translate.setText(word.getTranslate());
                Bitmap bitmap=getLoacalBitmap(word.getImageadress());
                image.setImageBitmap(bitmap);
            }
        });
    }
    public static Bitmap getLoacalBitmap(String url) {
        try {
            FileInputStream fis = new FileInputStream(url);
            return BitmapFactory.decodeStream(fis);  ///把流转化为Bitmap图片
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
