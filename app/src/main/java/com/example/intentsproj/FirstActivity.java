package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;
    EditText no1,no2;
    float num1;
    float num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = findViewById(R.id.btnOk);
        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);

        //show msg code
        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;

        final Toast toast = Toast.makeText(context,message,duration);


        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,20);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                num1 = Float.parseFloat(no1.getText()+"");
                num2 = Float.parseFloat(no2.getText()+"");
                i.putExtra("value1",num1);
                i.putExtra("value2",num2);
                startActivity(i);

                toast.show();//show msg when click ok button
            }
        });

        //Creating the layoutInflater instance
        LayoutInflater li= getLayoutInflater();
        //Getting the view object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.custom_toast,(ViewGroup)
        findViewById(R.id.custom_toast_layout));

        //Creating the toast object
        Toast toast1 = new Toast(getApplicationContext());
        toast1.setDuration(Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast1.setView(layout);//setting the view of custom layout
        toast1.show();

    }
}