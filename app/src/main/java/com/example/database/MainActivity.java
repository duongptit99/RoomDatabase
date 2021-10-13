package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText edtId,edtName,edtSex,edtIclass,edtMath,edtChemistry,edtPhysic;
    private Button btn;
    private RecyclerView recyclerView;
    private StudentAdapter studentAdapter;

    private List<Student> studentList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        loadData();

        btn.setOnClickListener(v -> {
            onClick();
        });
    }

    private void onClick() {
        Student student = new Student(edtName.getText().toString()
                ,edtSex.getText().toString()
                ,edtIclass.getText().toString()
                ,edtMath.getText().toString()
                ,edtPhysic.getText().toString()
                ,edtChemistry.getText().toString());
        Database.getInstance(this).dao().insertUser(student);

        edtName.setText("");
        edtSex.setText("");
        edtIclass.setText("");
        edtMath.setText("");
        edtPhysic.setText("");
        edtChemistry.setText("");
        studentList.add(student);
        loadData();
    }

    private void loadData() {
        studentList =Database.getInstance(this).dao().getAll();
        studentAdapter.setList(studentList);
        recyclerView.setAdapter(studentAdapter);
    }

    public void init(){
        edtId = findViewById(R.id.edt_id);
        edtName = findViewById(R.id.edt_name);
        edtSex = findViewById(R.id.edt_sex);
        edtIclass = findViewById(R.id.edt_iclass);
        edtMath = findViewById(R.id.edt_pointmath);
        edtChemistry = findViewById(R.id.edt_pointchemistry);
        edtPhysic = findViewById(R.id.edt_pointphysic);
        btn = findViewById(R.id.btn_add);

        recyclerView = findViewById(R.id.recyclerview);
        studentAdapter  = new StudentAdapter();
        studentList = new ArrayList<>();
    }
}