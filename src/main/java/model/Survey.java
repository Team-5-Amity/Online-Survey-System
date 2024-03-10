// Survey.java
package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Survey {
    private String title;
    private List<Question> questions;

    public Survey(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    @Override
    public String toString() {
        return "Survey{" +
                "title='" + title + '\'' +
                ", questions=" + questions +
                '}';
    }
}
