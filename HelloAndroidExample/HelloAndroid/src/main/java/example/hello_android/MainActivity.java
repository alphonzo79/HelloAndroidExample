package example.hello_android;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    TextView label;
    EditText input;
    Button inputAction, explicitIntent, implicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        label = (TextView)findViewById(R.id.hello_world_label);
        input = (EditText)findViewById(R.id.input_field);

        inputAction = (Button)findViewById(R.id.what_happens_button);
        explicitIntent = (Button)findViewById(R.id.explicit_intent);
        implicitIntent = (Button)findViewById(R.id.implicit_intent);

        inputAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input.getText().length() > 0) {
                    label.setText(input.getText().toString());
                }
                input.setText(null);
            }
        });

        explicitIntent.setOnClickListener(handleExplicitIntent);
        implicitIntent.setOnClickListener(this);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void enableIntents(View view) {
        explicitIntent.setEnabled(true);
        implicitIntent.setEnabled(true);
        view.setEnabled(false);
    }

    Button.OnClickListener handleExplicitIntent = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent explicit = new Intent(MainActivity.this, SecondActivity.class);
            explicit.putExtra("input", input.getText().toString());
            explicit.putExtra("time", System.currentTimeMillis());
            startActivity(explicit);
        }
    };

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.implicit_intent:
                Intent implicit = new Intent(Intent.ACTION_VIEW);
                implicit.setData(Uri.parse("http://www.bodybuilding.com"));
                startActivity(implicit);
                break;
        }
    }
}
