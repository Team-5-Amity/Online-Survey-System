// Question.java
package main.java.model;

public class Question {
    private String questionId;
    private String text;
    private QuestionType questionType;

    public Question(String questionId, String text, QuestionType questionType) {
        this.questionId = questionId;
        this.text = text;
        this.questionType = questionType;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getText() {
        return text;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

}
