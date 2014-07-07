package com.mdqandroid.controlplc;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;



public class MainActivity extends Activity {

	private BluetoothAdapter AdaptadorBT;
	private String serviceNAme =
	
	
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
     
   }


   public  void onStart() {
   super.onStart();
   ConfigBT();
   }


private void ConfigBT() {
	AdaptadorBT =BluetoothAdapter.getDefaultAdapter();
	
	if(AdaptadorBT==null){
		Toast.makeText(getApplicationContext(), "El Dispositivo no soporta Bluetooth", Toast.LENGTH_SHORT).show();
	}else{
		if(!AdaptadorBT.isEnabled()){
			Toast.makeText(getApplicationContext(), "Por favor encienda el bluetooth !!!", Toast.LENGTH_SHORT).show();
					
		}
		
		
		
	}
	
}

/*
final Handler mHandler = new Handler() {
    @Override
    public void handleMessage(Message msg) {
            	
                switch (msg.what) {
     //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   
                case Mensaje_Escrito:
                	  byte[] writeBuf = (byte[]) msg.obj;//buffer de escritura...
                      // Construye un String del Buffer
                      String writeMessage = new String(writeBuf);
                      if(D) Log.e(TAG, "Message_write  =w= "+ writeMessage);  
                    break;
      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>                                
                case Mensaje_Leido:   	                 
                	byte[] readBuf = (byte[]) msg.obj;//buffer de lectura...
                    //Construye un String de los bytes validos en el buffer
                  String readMessage = new String(readBuf, 0, msg.arg1);
                  if(D) Log.e(TAG, "Message_read   =w= "+ readMessage);              	                 
                    break;
     //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	           
                case Mensaje_Nombre_Dispositivo:
                    mConnectedDeviceName = msg.getData().getString(DEVICE_NAME); //Guardamos nombre del dispositivo
     Toast.makeText(getApplicationContext(), "Conectado con "+ mConnectedDeviceName, Toast.LENGTH_SHORT).show();
     seleccionador=true;
                    break;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>                  
                case Mensaje_TOAST:
                    Toast.makeText(getApplicationContext(), msg.getData().getString(TOAST),
                    Toast.LENGTH_SHORT).show();
                    break;
     //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
                case MESSAGE_Desconectado:	
                  	 if(D) Log.e("Conexion","DESConectados");
                  	 seleccionador=false;             	
          break;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  
                }//FIN DE SWITCH CASE PRIMARIO DEL HANDLER
            }//FIN DE METODO INTERNO handleMessage
        };//Fin de Handler*/

}