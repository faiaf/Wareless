package com.faisal.warelessproject;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Converter extends AppCompatActivity {

    EditText input;
    RadioButton dollar,taka;

    String type="";
    double value=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        input=findViewById(R.id.input);
        dollar=findViewById(R.id.dollar);
        taka=findViewById(R.id.taka);


    }

    public void Conert(View view) {
        if(type.equals(""))
        {
            Toast.makeText(this, "Please select one.",
                    Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(type.equals("Dollar"))
            {
                value=Double.parseDouble(input.getText().toString())*84;
                Alert("Dollar",""+value+" TK");
            }
            else if(type.equals("Taka"))
            {
                value=Double.parseDouble(input.getText().toString())/84;
                Alert("Taka",""+value+" Dollar");
            }
        }
    }

    public void Dollar(View view) {
        type="Dollar";
        taka.setSelected(false);
        taka.setChecked(false);
    }

    public void Taka(View view) {
        type="Taka";
        dollar.setSelected(false);
        dollar.setChecked(false);
    }

    public void Alert(String Title, String Massage)
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Converter.this);
        alertDialog.setTitle(Title);
        alertDialog.setMessage(Massage);
        alertDialog.setCancelable(false);

        alertDialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {

                    }
                });
        alertDialog.show();
    }
}
