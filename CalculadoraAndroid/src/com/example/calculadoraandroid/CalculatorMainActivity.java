package com.example.calculadoraandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorMainActivity extends Activity {
	/** Called when the activity is first created. */ 
	String x=""; 
	int flagpu=0; 
	public int flagpas=0; 
	double Total=0,x1,y1; 
	int flagl=0; 
	int ope=0; 
	public String im(String a){
		float p=Float.parseFloat(a); 
		p*=-1; 
		//p=(float) Math.sqrt(p); 
		a=p+"i"; 

		return a; 
	} 
	
	public void procesa(String a){ 
		Total=Double.parseDouble(a); 
		x=""; 
	} 

	public String resu(){
		return x; 
	} 
	public void almacena(String a){ 
		if(flagl>0){ 
			x=""; 
			flagl=0; 
		} 
		x+=a; 
	} 
	public String get(){ 
		return x; 
	} 
	public String resultad(){ 
		switch (ope){ 
		case 1:{ //	suma 
			Total=x1+y1; 
			x=""+Total; 
			break; 
			} 
		case 2:{ // multiplicacion
			Total=x1*y1; 
			x=""+Total; 
			break; 
			} 
		case 3:{ 
			Total=x1-y1; 
			x=""+Total; 
			break; 
			} 
		case 4:{ 
			Total=x1/y1; 
			x=""+Total; 
			break; 
			} 
		default:{ 
			x=""+y1; 
			break; 
			} 

		} 

		x1=0; 
		y1=0; 
		flagpu=0; 
		return x; 
	} 


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        

        //requestWindowFeature(Window.FEATURE_NO_TITLE); 
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_calculator_main);
        setContentView(R.layout.activity_calculator_main); 

        final TextView Resultado=(TextView)findViewById(R.id.Resultado); 

        //Boton 1 
        final Button boton1=(Button)findViewById(R.id.Boton1); 

        boton1.setOnClickListener(new View.OnClickListener() { 
        	public void onClick(View v){
        		almacena("1"); 
        		Resultado.setText(get()); 
        	} 
        }); 
        
        //Boton 2 
        final Button boton2=(Button)findViewById(R.id.Boton2); 


        boton2.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 

        almacena("2"); 

        Resultado.setText(get()); 


        } 
        }); 
        //Boton 3 
        final Button boton3=(Button)findViewById(R.id.Boton3); 


        boton3.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 


        almacena("3"); 

        Resultado.setText(get()); 

        } 
        }); 
        //Boton 4 
        final Button boton4=(Button)findViewById(R.id.Boton4); 


        boton4.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 

        almacena("4"); 

        Resultado.setText(get()); 


        } 
        }); 
        //Boton 5 
        final Button boton5=(Button)findViewById(R.id.Boton5); 


        boton5.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 
        almacena("5"); 

        Resultado.setText(get()); 



        } 
        }); 
        //Boton 6 
        final Button boton6=(Button)findViewById(R.id.Boton6); 


        boton6.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 


        almacena("6"); 

        Resultado.setText(get()); 

        } 
        }); 
        //Boton 7 
        final Button boton7=(Button)findViewById(R.id.Boton7); 


        boton7.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 


        almacena("7"); 

        Resultado.setText(get()); 

        } 
        }); 
        //Boton 8 
        final Button boton8=(Button)findViewById(R.id.Boton8); 


        boton8.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 
        almacena("8"); 

        Resultado.setText(get()); 



        } 
        }); 
        //Boton 9 
        final Button boton9=(Button)findViewById(R.id.Boton9); 


        boton9.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 

        almacena("9"); 

        Resultado.setText(get()); 


        } 
        }); 
        //Boton . 
        /*final Button botonpunto=(Button)findViewById(R.id.Botonpunto); 


        botonpunto.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 

        if(flagpu==0){ 
        almacena("."); 
        flagpu++; 
        } 

        Resultado.setText(get()); 

        } 
        });*/ 
        //Boton 1 
        final Button boton0=(Button)findViewById(R.id.Boton0); 


        boton0.setOnClickListener(new View.OnClickListener() { 
        public void onClick(View v){ 


        almacena("0"); 

        Resultado.setText(get()); 

        } 
        }); 
        //Boton 1 
        final Button botonmulti=(Button)findViewById(R.id.Botonmulti); 


        botonmulti.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 
        ope=2; 

        if(x1==0){ 
        x=Resultado.getText().toString(); 
        x1=Double.parseDouble(x); 
        x=""; 
        Resultado.setText(x); 
        }else{ 
        y1=Double.parseDouble(Resultado.getText().toString()); 


        Resultado.setText(resultad()); 

        } 


        flagl++; 


        } 
        }); 

        final Button botonresta=(Button)findViewById(R.id.Botonresta); 


        botonresta.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 

        if("".equals(x)){ 
        almacena("-"); 
        }else{ 
        ope=3; 
        flagl++; 
        if(x1==0){ 
        x=Resultado.getText().toString(); 
        x1=Double.parseDouble(x); 
        x=""; 
        Resultado.setText(x); 
        }else{ 

        y1=Double.parseDouble(Resultado.getText().toString()); 


        Resultado.setText(resultad());} 


        } 


        } 
        }); 
        final Button botondiv=(Button)findViewById(R.id.Botondiv); 


        botondiv.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 
        ope=4; 
        flagl++; 
        if(x1==0){ 
        x=Resultado.getText().toString(); 
        x1=Double.parseDouble(x); 
        x=""; 
        Resultado.setText(x); 
        }else{ 


        y1=Double.parseDouble(Resultado.getText().toString()); 


        Resultado.setText(resultad()); 
        } 



        } 
        }); 
        final Button botonsuma=(Button)findViewById(R.id.Botonsuma); 


        botonsuma.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 
        ope=1; 
        flagl++; 
        if(x1==0){ 
        x=Resultado.getText().toString(); 
        x1=Double.parseDouble(x); 
        x=""; 
        Resultado.setText(x); 
        }else{ 

        y1=Double.parseDouble(Resultado.getText().toString()); 


        Resultado.setText(resultad());} 

        } 
        }); 
        /*final Button sqrt=(Button)findViewById(R.id.Botonsqrt); 


        sqrt.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 
        x=Resultado.getText().toString(); 

        flagl++; 
        double p=Float.parseFloat(x); 
        if(p>=0){ 
        p= Math.sqrt(p); 
        Total=p; 
        Resultado.setText(""+Total); 
        x=""; 
        }else { 
        Resultado.setText(im(x)); 

        } 

        } 
        });*/ 
        /*final Button del=(Button)findViewById(R.id.DEL); 


        del.setOnClickListener(new View.OnClickListener() { 
        @Override 
        public void onClick(View v){ 
        if(x.length()>0) 
        x=x.substring(0, (x.length()-1)); 
        Resultado.setText(x); 



        } 
        });*/ 
        final Button Ce=(Button)findViewById(R.id.CE); 
        Ce.setOnClickListener(new View.OnClickListener() { 

        public void onClick(View v) { 
        x=""; 
        y1=0; 
        x1=0; 
        Total=0; 
        flagpu=0; 
        flagpas=0; 





        Resultado.setText(""); 
        } 
        }); 
        final Button igual=(Button)findViewById(R.id.Botonigual); 

        igual.setOnClickListener(new View.OnClickListener() { 

        public void onClick(View v) { 
        y1=Double.parseDouble(Resultado.getText().toString()); 


        Resultado.setText(resultad()); 



        } 
        }); 
        /*final Button exp=(Button)findViewById(R.id.Botonexp); 
        exp.setOnClickListener(new View.OnClickListener() { 

        public void onClick(View v) { 
        x=Resultado.getText().toString(); 
        double k=Float.parseFloat(x); 
        k=k*k; 
        Total=k; 
        flagl++; 

        Resultado.setText(""+Total); 


        } 
        });*/ 




        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculator_main, menu);
        return true;
    }
    
}


 