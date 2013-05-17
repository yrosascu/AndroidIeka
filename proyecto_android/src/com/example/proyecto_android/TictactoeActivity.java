package com.example.proyecto_android;

import java.util.Arrays;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class TictactoeActivity extends Activity {

	int cont;  
	int[][] win={{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};  
	int cont_x, cont_o;  
	int[] arrx = new int[5];
	int[] arro = new int[5]; 
		 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe);
    }

    public void inicio(){
    	cont=0;  
    	cont_x=0;  
    	cont_o=0;  
    	Arrays.fill(arrx,0);   
    	Arrays.fill(arro,0);  
    	ImageButton x = (ImageButton) this.findViewById(R.id.imageButton1);  
    	x.setOnClickListener(listener);  
    	
    	x = (ImageButton) this.findViewById(R.id.imageButton2);  
    	x.setOnClickListener(listener);  
    	
    	x = (ImageButton) this.findViewById(R.id.imageButton3);  
    	x.setOnClickListener(listener);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton4);  
    	x.setOnClickListener(listener);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton5);  
    	x.setOnClickListener(listener);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton6);  
    	x.setOnClickListener(listener);  
    	
    	x = (ImageButton) this.findViewById(R.id.imageButton7);  
    	x.setOnClickListener(listener);  
    	
    	x = (ImageButton) this.findViewById(R.id.imageButton8);  
    	x.setOnClickListener(listener);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton9);  
    	x.setOnClickListener(listener);  
    
    }
    
    public OnClickListener listener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			ImageButton ico = (ImageButton)v;
			TextView t = (TextView)findViewById(R.id.editText1);
			if (cont == 2){
				ico.setBackgroundResource(R.drawable.x);
				
				
			}
			
		}
    	
    };

    public void close(View v){  
        finish();  
       }  
    public void restart(View v){  
        setContentView(R.layout.activity_tictactoe);  
           inicio();  
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tictactoe, menu);
        return true;
    }
    
}
