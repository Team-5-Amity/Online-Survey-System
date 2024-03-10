// Response.java
package main.java.model;

import java.util.Map;

public class Response {
    private Map<String, String> answers; // Assuming a simple mapping of question IDs to answers

    public Response(Map<String, String> answers) {
        this.answers = answers;
    }

    public Map<String, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }

}
