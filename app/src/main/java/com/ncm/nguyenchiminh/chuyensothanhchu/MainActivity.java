package com.ncm.nguyenchiminh.chuyensothanhchu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ncm.nguyenchiminh.Utils.MoneyConverter;
import com.ncm.nguyenchiminh.chuyensothanhchu.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //khai báo biến binding có kiểu tương ứng với lớp được tạo ra từ layout của màn hình
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //gọi hàm inflate
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        //thay thế đối số truyền vào cho setContentView bằng binding.getRoot()
        setContentView(binding.getRoot());
        addEvent();
    }

    private void addEvent() {

        binding.btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.edtNumber.getText().toString().trim().length() > 0) {
                    String docTien = MoneyConverter.TextOfMoney(binding.edtNumber.getText().toString());
                    binding.tvChu.setText(docTien);
                } else {
                    Toast.makeText(MainActivity.this, "Xin vui lòng nhập số", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
