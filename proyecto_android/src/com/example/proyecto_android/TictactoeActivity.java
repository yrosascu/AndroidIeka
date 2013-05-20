package com.example.proyecto_android;
//orlando.karam@gmail.com
//orlandokus

import android.app.Activity;  
import android.os.Bundle;  
import android.view.Menu;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.widget.ImageButton;  
import android.widget.TableLayout;
import android.widget.TextView;  
import java.util.Arrays;
  
public class TictactoeActivity extends Activity {  
 int cont;  
 int[][] ganan={{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};  
 int[] arr_x = new int[5]; // maximo solo hay 5 "x" o "y"  
 int cont_x,cont_o,j1,j2;  
 int[] arr_o = new int[5];  
     
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_tictactoe);
        
        inicio();
        
    }  
  
    public void inicio(){
    	/*TableLayout table1 = (TableLayout)findViewById(R.id.TableLayout1);
        Lienzo fondo = new Lienzo(this);
        table1.addView(fondo);*/
    	cont=0;  
    	cont_x=0;  
    	cont_o=0;  
    	//j1 = 0;
    	//j2 = 0;
    	Arrays.fill(arr_x,0);   
    	Arrays.fill(arr_o,0);  
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
      
    public void stop(){
    	//TextView tv =(TextView)findViewById(R.id.mensaje);
    	
    	ImageButton x = (ImageButton) this.findViewById(R.id.imageButton1);  
    	x.setClickable(false);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton2);  
    	x.setClickable(false);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton3);  
    	x.setClickable(false);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton4);  
    	x.setClickable(false);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton5);  
    	x.setClickable(false);  
    	
    	x = (ImageButton) this.findViewById(R.id.imageButton6);  
    	x.setClickable(false);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton7);  
    	x.setClickable(false);  
    	
    	
    	x = (ImageButton) this.findViewById(R.id.imageButton8);  
    	x.setClickable(false);  
     
    	x = (ImageButton) this.findViewById(R.id.imageButton9);  
    	x.setClickable(false);
    	
    	
    }  
  
    private OnClickListener listener = new OnClickListener() {  
       
        public void onClick(View v) {  
         ImageButton boton= (ImageButton) v;  
         TextView tv =(TextView)findViewById(R.id.mensaje);  
         if(cont%2==0){
        	 boton.setBackgroundResource(R.drawable.x);  
        	 arr_x[cont_x]=Integer.parseInt((String)boton.getTag());  
        	 boton.setClickable(false);  
        	 tv.setText("Turno: Jugador 2");  
        	 cont++;  
        	 cont_x++;  
        	 if(cont_x>=3){
        		 for(int i=0;i<8;i++){  
        			 if(Arrays.toString(arr_x).contains(String.valueOf(ganan[i][0]))&&
        					 Arrays.toString(arr_x).contains(String.valueOf(ganan[i][1]))&&
        					 Arrays.toString(arr_x).contains(String.valueOf(ganan[i][2]))){  
        				 stop();  
        				 tv.setText("Jugador 1 gana!");
        			 }
        		 }  
        	 }  
            
         }else{
        	 boton.setBackgroundResource(R.drawable.o);  
        	 arr_o[cont_o]=Integer.parseInt((String)boton.getTag());  
        	 boton.setClickable(false);  
        	 tv.setText("Turno: Jugador 1");  
        	 cont++;  
        	 cont_o++;  
        	 if(cont_o>=3){
        		 for(int i=0;i<8;i++){
        			 if(Arrays.toString(arr_o).contains(String.valueOf(ganan[i][0]))&&
        					 Arrays.toString(arr_o).contains(String.valueOf(ganan[i][1]))&&
        					 Arrays.toString(arr_o).contains(String.valueOf(ganan[i][2]))){  
        				 stop();  
        				 tv.setText("Jugador 2 gana!");
        				 j2 = 1;
        			 }else j2 = 0;
        		 }  
              }  
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
    
    public boolean onCreateOptionsMenu(Menu menu) {  
    	// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tictactoe, menu);
        return true;  
    }  
}  