package com.faisal.warelessproject;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView player_1,player_2;
    int p1=0,p2=0;
    int click=0;

    LinearLayout first_screen,second_screen;
    Button Player_Two,Player_One;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player_1=findViewById(R.id.player_1);
        player_2=findViewById(R.id.player_2);

        first_screen=findViewById(R.id.first_screen);
        second_screen=findViewById(R.id.second_screen);

        Player_Two=findViewById(R.id.Player_Two);
        Player_One=findViewById(R.id.Player_One);

        Player_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1++;
                player_1.setText(""+p1);
                if(p1==100)
                {
                    Player_Two.setEnabled(false);
                    Player_One.setEnabled(false);
                    Alert("Win","Player 1 is win ...");
                }
            }
        });
        Player_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p2++;
                player_2.setText(""+p2);
                if(p2==100)
                {
                    Player_One.setEnabled(false);
                    Player_Two.setEnabled(false);
                    Alert("Win","Player 2 is win ...");
                }
            }
        });
    }


    public void Play(View view) {
        if(click==0)
        {
            first_screen.setVisibility(View.GONE);
            second_screen.setVisibility(View.VISIBLE);
            click++;
        }
    }

    public void Alert(String Title, String Massage)
    {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle(Title);
        alertDialog.setMessage(Massage);
        alertDialog.setCancelable(false);

        alertDialog.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                        p1=0;
                        p2=0;
                        player_1.setText("0");
                        player_2.setText("0");

                        Player_One.setEnabled(true);
                        Player_Two.setEnabled(true);

                        first_screen.setVisibility(View.VISIBLE);
                        second_screen.setVisibility(View.GONE);
                        click=0;
                    }
                });
        alertDialog.show();


    }
}
