package com.faisal.warelessproject;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Math.abs;

public class Calculator extends AppCompatActivity {

    EditText first,second;
    double a=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
    }

    public void Plus(View view) {
        if(Check()==true)
        {
            a=Double.parseDouble(first.getText().toString());
            b=Double.parseDouble(second.getText().toString());
            Alert("Addition","Value is = "+(a+b));
        }
        else
            Toast.makeText(this, "Please input all.", Toast.LENGTH_SHORT).show();
    }

    public void Minus(View view) {
        if(Check()==true)
        {
            a=Double.parseDouble(first.getText().toString());
            b=Double.parseDouble(second.getText().toString());
            Alert("Subtraction","Value is = "+abs(a-b));
        }
        else
            Toast.makeText(this, "Please input all.", Toast.LENGTH_SHORT).show();
    }

    public void Multiply(View view) {
        if(Check()==true)
        {
            a=Double.parseDouble(first.getText().toString());
            b=Double.parseDouble(second.getText().toString());
            Alert("Multiplication","Value is = "+(a*b));
        }
        else
            Toast.makeText(this, "Please input all.", Toast.LENGTH_SHORT).show();

    }

    public void Division(View view) {
        if(Check()==true)
        {
            a=Double.parseDouble(first.getText().toString());
            b=Double.parseDouble(second.getText().toString());
            Alert("Division","Value is = "+abs(a/b));
        }
        else
            Toast.makeText(this, "Please input all.", Toast.LENGTH_SHORT).show();

    }

    public boolean Check()
    {
        if(!first.getText().toString().equals("") && !second.getText().toString().equals(""))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void Alert(String Title, String Massage)
    {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(Calculator.this);
        alertDialog.setTitle(Title);
        alertDialog.setMessage(Massage);
        alertDialog.setCancelable(false);

        alertDialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                       first.setText("");
                       second.setText("");
                    }
                });
        alertDialog.show();
    }
}
