package com.example.a18801.word_remenber;

import android.media.Image;

/**
 * Created by 18801 on 2019/11/6.
 */

public class Word
{
    private int id;
    private String word;
    private int imageid;
    private String translate;
    private String sentence;
    private String imageadress;
    public Word()
    {

    }
    public Word(int id,String word)
    {
        this.id=id;
        this.word=word;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setWord(String word)
    {
        this.word=word;
    }
    public String getWord()
    {
        return word;
    }
    public void setSentence(String sentence)
    {
        this.sentence=sentence;
    }
    public String getSentence()
    {
        return this.sentence;
    }
    public  void setImageadress(String imageadress)
    {
        this.imageadress=imageadress;
    }
    public String getImageadress()
    {
        return this.imageadress;
    }
    public void setTranslate(String translate)
    {
        this.translate=translate;
    }
    public String getTranslate()
    {
        return this.translate;
    }
    public void setImageid(int imageid)
    {
        this.imageid=imageid;
    }
    public int getImageid()
    {
        return this.imageid;
    }
}
