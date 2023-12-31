package com.example.quizgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CHAPTER6MATHONE extends AppCompatActivity {

    RecyclerView questionPlace;
    public static String [] question={
            "Q1.When we go to bed? ",
            "Q2.When we wake up ? ",
            "Q3.At what time we come from school? "

    };
    public static String [] options={
            "night","morning","evening","summer",
            "night", "morning", "summer", "afternoon",
            "afternoon", "morning", "evening", "summer"
    };
    public static String [] correctAnswer={
            "night","morning","afternoon"

    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








        questionPlace=findViewById(R.id.questionPlace);

        MainActivityQuiz.question=question;
        MainActivityQuiz.correctAnswer=correctAnswer;
        MainActivityQuiz.options=options;


        QuizAdapter adapter=new QuizAdapter(question,options,correctAnswer,this);
        questionPlace.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        questionPlace.setLayoutManager(layoutManager);

    }
}