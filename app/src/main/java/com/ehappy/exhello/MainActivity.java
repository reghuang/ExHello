package com.ehappy.exhello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editMilee;
    private TextView txextKm;
    private Button buttonTran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 取得介面元件
        editMilee=(EditText)findViewById(R.id.editMilee);
        txextKm=(TextView)findViewById(R.id.textViewKm);
        buttonTran=(Button)findViewById(R.id.button);
       buttonTran.setOnClickListener(bnClickListener);
    }
    private Button.OnClickListener  bnClickListener = new Button.OnClickListener() {
        public void onClick(View view) {
            double milee = Double.parseDouble(editMilee.getText().toString());
            double km = 1.61 * milee;
            txextKm.setText(km + " 公里 ");
        }
    };

}









