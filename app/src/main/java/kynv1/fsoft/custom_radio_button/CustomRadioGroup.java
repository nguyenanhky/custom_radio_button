package kynv1.fsoft.custom_radio_button;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;


public class CustomRadioGroup extends LinearLayout {
    private CustomRadioButton selectedRadioButton;

    public CustomRadioGroup(Context context) {
        super(context);
    }

    public CustomRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }

    private void init() {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i) instanceof CustomRadioButton) {
                CustomRadioButton radioButton = (CustomRadioButton) getChildAt(i);
                radioButton.setOnClickListener(v -> {
                    if (selectedRadioButton != null && selectedRadioButton != radioButton) {
                        selectedRadioButton.setChecked(false);
                    }
                    radioButton.setChecked(true);
                    selectedRadioButton = radioButton;
                });
            }
        }
    }
}
