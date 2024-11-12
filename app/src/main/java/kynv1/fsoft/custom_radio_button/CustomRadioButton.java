package kynv1.fsoft.custom_radio_button;


import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;

public class CustomRadioButton extends LinearLayout {

    private TextView textView;
    private ImageView imageView;
    private AppCompatRadioButton radioButton;

    public CustomRadioButton(Context context) {
        super(context);
        init(context);

    }

    public CustomRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);

    }

    public CustomRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);

    }

    private void init(Context context) {
        // Inflate the layout
        LayoutInflater.from(context).inflate(R.layout.my_radio_button_content, this, true);
        // Initialize views
        radioButton = findViewById(R.id.radioButton);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);

        this.setBackgroundResource(R.drawable.radio_button_background);

    }

    // Set the title text
    public void setTitleText(CharSequence text) {
        textView.setText(text);
    }

    // Set the image resource
    public void setImageResource(int resId) {
        imageView.setImageResource(resId);
    }
    // Set the image bitmap
    public void setImageBitmap(Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }
    // Get and set checked state
    public boolean isChecked() {
        return radioButton.isChecked();
    }

    public void setChecked(boolean checked) {
        radioButton.setChecked(checked);
    }

}

