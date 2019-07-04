package com.geektech.taskappa2;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    EditText titleEditText;
    EditText descriptionEditText;
    EditText textSize;
    public static String RESULT_KEY= "result_key";


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        titleEditText=findViewById(R.id.editTitle);
        descriptionEditText= findViewById(R.id.editDesc);
        textSize = findViewById(R.id.editTextSize);


        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(FormActivity.this);

        String title= preferences.getString("Task_title"," ");
        titleEditText.setText(title);
        String desc1 = preferences.getString("Task_desc", " ");
        descriptionEditText.setText(desc1);

        if(getSupportActionBar()!=null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    public void onClickCancel(View view) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(FormActivity.this);
        SharedPreferences.Editor editor= preferences.edit();
        String title = titleEditText.getText().toString();
        String desc = descriptionEditText.getText().toString();
        String sizeOfText = textSize.getText().toString();
//        Log.d("lolol", sizeOfText + " ");
        editor.putString("Task_title", title );
        editor.putString("Task_desc", desc);
        editor.putString("Task_desc", sizeOfText);
        editor.apply();
        finish();

    }

    public void onClickSave(View view) {
        Intent intent = new Intent();
        String title= titleEditText.getText().toString();
        String description= descriptionEditText.getText().toString();
        String sizeOfText = textSize.getText().toString();
        Log.d("tag12", title + " " + description + " " + sizeOfText);
        Task task= new Task(title,description, sizeOfText);
        intent.putExtra(RESULT_KEY,task);
        setResult(RESULT_OK, intent);
        finish();



    }



}
