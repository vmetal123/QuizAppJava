package com.example.cabrera.quizappjava.Common;

import android.os.CountDownTimer;

import com.example.cabrera.quizappjava.Model.Category;
import com.example.cabrera.quizappjava.Model.CurrentQuestion;
import com.example.cabrera.quizappjava.Model.Question;

import java.util.ArrayList;
import java.util.List;

public class Common {

    public static final int TOTAL_TIME = 20*60*1000;
    public static List<Question> questionList = new ArrayList<>();
    public static List<CurrentQuestion> answerSheetList = new ArrayList<>();
    public static Category selectedCategory = new Category();
    public static int right_answer_count = 0;

    public static CountDownTimer countDownTimer;

    public enum ANSWER_TYPE {
        NO_ANSWER,
        WRONG_ANSWER,
        RIGHT_ANSWER
    }
}
