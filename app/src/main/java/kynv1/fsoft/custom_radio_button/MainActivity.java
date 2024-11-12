package kynv1.fsoft.custom_radio_button;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kynv1.fsoft.custom_radio_button.databinding.ActivityMain2Binding;
import kynv1.fsoft.custom_radio_button.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ActivityMain2Binding binding2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        binding2 = ActivityMain2Binding.inflate(getLayoutInflater());
//        setContentView(binding2.getRoot());

//        binding.test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(binding.btnSelected1.isChecked()){
//                    // khoa hoc ghi de
//                    binding.mgs.setText("dung roi");
//                }else{
//                    // khoa khong ghi de
//                    binding.mgs.setText("Sai roi");
//                }
//            }
//        });
    }

}
