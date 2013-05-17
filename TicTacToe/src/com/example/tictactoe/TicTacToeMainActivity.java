package com.example.tictactoe;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TicTacToeMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tic_tac_toe_main, menu);
        return true;
    }
    
}
