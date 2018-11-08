package com.example.cabrera.quizappjava.Model;

public class Question {
    private int id;
    private String questionText, questionImage, answerA, answerB, answerC, answerD, correctAnswer;
    private boolean isImageQuestion;
    private int category;

    public Question(int id, String questionText, String questionImage, String answerA, String answerB, String answerC, String answerD, String correctAnswer, boolean isImageQuestion, int category) {
        this.id = id;
        this.questionText = questionText;
        this.questionImage = questionImage;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
        this.isImageQuestion = isImageQuestion;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionImage() {
        return questionImage;
    }

    public void setQuestionImage(String questionImage) {
        this.questionImage = questionImage;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean getIsImageQuestion() {
        return isImageQuestion;
    }

    public void setIsImageQuestion(boolean isImageQuestion) {
        this.isImageQuestion = isImageQuestion;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
