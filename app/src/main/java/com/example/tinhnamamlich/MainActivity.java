package com.example.tinhnamamlich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editAL;
    Button btntinh;
    TextView textkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAL=(EditText)findViewById(R.id.editText_amlich);
        btntinh=(Button)findViewById(R.id.button_tinh);
        textkq=(TextView)findViewById(R.id.textView_kq);
        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can = "", chi = "";
                String chuoi1 = editAL.getText().toString();
                int NamAL = Integer.parseInt(chuoi1);
                if (NamAL < 1900) {
                    textkq.setText("Xin nhập năm lớn hơn 1900");
                } else {
                    switch (NamAL % 10) {
                        case 0:
                            can = "Canh";
                            break;
                        case 1:
                            can = "Tân";
                            break;
                        case 2:
                            can = "Nhâm";
                            break;
                        case 3:
                            can = "Quý";
                            break;
                        case 4:
                            can = "Giáp";
                            break;
                        case 5:
                            can = "Ất";
                            break;
                        case 6:
                            can = "Bính";
                            break;
                        case 7:
                            can = "Đinh";
                            break;
                        case 8:
                            can = "Mậu";
                            break;
                        case 9:
                            can = "Kỷ";
                            break;
                    }

                    switch (NamAL % 12) {
                        case 0:
                            chi = "Thân";
                            break;
                        case 1:
                            chi = "Dậu";
                            break;
                        case 2:
                            chi = "Tuất";
                            break;
                        case 3:
                            chi = "Hợi";
                            break;
                        case 4:
                            chi = "Tý";
                            break;
                        case 5:
                            chi = "Sửu";
                            break;
                        case 6:
                            chi = "Dần";
                            break;
                        case 7:
                            chi = "Mẹo";
                            break;
                        case 8:
                            chi = "Thìn";
                            break;
                        case 9:
                            chi = "Tỵ";
                            break;
                        case 10:
                            chi = "Ngọ";
                            break;
                        case 11:
                            chi = "Mùi";
                            break;
                    }
                    textkq.setText("Năm âm lịch tương ứng với năm dương lịch = " + NamAL + " là " + String.valueOf(can + " " + chi));
                }
            }
        });
    }
}
