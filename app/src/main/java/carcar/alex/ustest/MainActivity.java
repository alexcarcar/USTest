package carcar.alex.ustest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Questions q;
    private TextView question, answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q = new Questions();

        question = (TextView) findViewById(R.id.question);
        answer = (TextView) findViewById(R.id.answer);
        question.setText(q.getQuestion());
    }

    public void newQuestion(View view) {
        question.setText(q.getQuestion());
    }

    public void showAnswer(View view) {
        answer.setText(q.getAnswer());
    }
}
