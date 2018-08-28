package com.example.job.roomwordsample;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private WordRepository mRespository;
    private LiveData<List<Word>> mAllWords;
    public WordViewModel(@NonNull Application application) {
        super(application);
        mRespository = new WordRepository(application);
        mAllWords = mRespository.getmAllWords();
    }
    LiveData<List<Word>> getmAllWords(){return mAllWords;}
}
