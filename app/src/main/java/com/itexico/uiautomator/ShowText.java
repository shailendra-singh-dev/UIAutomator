package com.itexico.uiautomator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by iTexico Developer on 8/22/2016.
 */
public class ShowText extends AppCompatActivity {

    // The name of the extra data sent through an {@link Intent}.
    public final static String KEY_EXTRA_MESSAGE =
            "com.itexico.uiautomator.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_text);

        // Get the message from the Intent.
        Intent intent = getIntent();
        String message = intent.getStringExtra(KEY_EXTRA_MESSAGE);

        // Show message.
        ((TextView) findViewById(R.id.show_changed_text_view)).setText(message);
    }

    /**
     * Creates an {@link Intent} for {@link ShowText} with the message to be displayed.
     *
     * @param context the {@link Context} where the {@link Intent} will be used
     * @param message a {@link String} with text to be displayed
     * @return an {@link Intent} used to start {@link ShowText}
     */
    static protected Intent newStartIntent(Context context, String message) {
        Intent newIntent = new Intent(context, ShowText.class);
        newIntent.putExtra(KEY_EXTRA_MESSAGE, message);
        return newIntent;
    }
}
