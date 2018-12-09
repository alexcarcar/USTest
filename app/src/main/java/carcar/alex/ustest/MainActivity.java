package carcar.alex.ustest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Questions q;
    private TextView question, answer;
    private ImageView image;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q = new Questions();

        question = findViewById(R.id.question);
        answer = findViewById(R.id.answer);
        image = findViewById(R.id.questionImage);
        question.setText(q.getQuestion());

        image.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeLeft() {
                newQuestionHelper();
            }

            public void onSwipeRight() {
                newQuestionHelper();
            }

            public void onSwipeTop() {
                showAnswerHelper();
            }

            public void onSwipeBottom() {
                showAnswerHelper();
            }
        });
    }

    private void newQuestionHelper() {
        question.setText(q.getQuestion());
        answer.setText("");
        image.setImageResource(R.drawable.start);
    }

//    public void newQuestion(View view) {
//        newQuestionHelper();
//    }
//
//    public void showAnswer(View view) {
//        showAnswerHelper();
//    }

    public void showAnswerHelper() {
        answer.setText(q.getAnswer());
        image.setImageResource(imageResources[q.getIndex()]);
    }

    int imageResources[] = {R.drawable.image0, R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11, R.drawable.image12, R.drawable.image13, R.drawable.image14, R.drawable.image15, R.drawable.image16, R.drawable.image17, R.drawable.image18, R.drawable.image19, R.drawable.image20, R.drawable.image21, R.drawable.image22, R.drawable.image23, R.drawable.image24, R.drawable.image25, R.drawable.image26, R.drawable.image27, R.drawable.image28, R.drawable.image29, R.drawable.image30, R.drawable.image31, R.drawable.image32, R.drawable.image33, R.drawable.image34, R.drawable.image35, R.drawable.image36, R.drawable.image37, R.drawable.image38, R.drawable.image39, R.drawable.image40, R.drawable.image41, R.drawable.image42, R.drawable.image43, R.drawable.image44, R.drawable.image45, R.drawable.image46, R.drawable.image47, R.drawable.image48, R.drawable.image49, R.drawable.image50, R.drawable.image51, R.drawable.image52, R.drawable.image53, R.drawable.image54, R.drawable.image55, R.drawable.image56, R.drawable.image57, R.drawable.image58, R.drawable.image59, R.drawable.image60, R.drawable.image61, R.drawable.image62, R.drawable.image63, R.drawable.image64, R.drawable.image65, R.drawable.image66, R.drawable.image67, R.drawable.image68, R.drawable.image69, R.drawable.image70, R.drawable.image71, R.drawable.image72, R.drawable.image73, R.drawable.image74, R.drawable.image75, R.drawable.image76, R.drawable.image77, R.drawable.image78, R.drawable.image79, R.drawable.image80, R.drawable.image81, R.drawable.image82, R.drawable.image83, R.drawable.image84, R.drawable.image85, R.drawable.image86, R.drawable.image87, R.drawable.image88, R.drawable.image89, R.drawable.image90, R.drawable.image91, R.drawable.image92, R.drawable.image93, R.drawable.image94, R.drawable.image95, R.drawable.image96, R.drawable.image97, R.drawable.image98, R.drawable.image99};
}