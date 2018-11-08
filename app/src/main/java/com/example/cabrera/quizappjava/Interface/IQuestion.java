package com.example.cabrera.quizappjava.Interface;

import com.example.cabrera.quizappjava.Model.CurrentQuestion;

public interface IQuestion {
    CurrentQuestion getSelectedAnswer();
    void showCorrectAnswer();
    void disableAnswer();
    void resetQuestion();
}
