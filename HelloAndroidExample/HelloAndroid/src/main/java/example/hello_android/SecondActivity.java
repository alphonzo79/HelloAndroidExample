package example.hello_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

        Intent intent = getIntent();
        String input = intent.getStringExtra("input");
        long time = intent.getLongExtra("time", 0);

        ((TextView)findViewById(R.id.text_holder)).setText(String.format("%s %d", input, time));
    }
}
