package edu.fsu.cs.mobile.example.albums_app;

import android.app.Activity;
import android.os.Bundle;

public class AlbumsActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	 super.onCreate(savedInstanceState);
         setContentView(R.layout.main);
         
         /*
          * Make sure to take a look at AndroidManifest.xml
          * in there we have android:screenConfiguration="landscape"
          * This sets the orientation of the UI to landscape mode
          * You can press Left-Ctrl+F11 to rotate the emulator
          */
         
         /*
          *	Make sure to take a look at res/layout/main.xml
          *	You will be adding the Fragments dynamically 
          */
         
         /*
          * This Activity needs to instantiate the layout. 
          * You need to 
          * 	- get an instance of the FragmentTransaction by saying
          * 		- FragmentTransaction trans = getFragmentManager().beginTransaction();
          * 	- create a new instance of both AlbumsFragment and SongsFragment
          * 	- add or replace AlbumsFragment into R.id.left_container using the FragmentTransaction
          * 	- add or replace SongsFragment into R.id.right_container using the FragmentTransaction
          * 	- call commit on the transaction
          */
         
         /*
          * Next, look at the SongsFragment.java file
          */
    	 
    }
}