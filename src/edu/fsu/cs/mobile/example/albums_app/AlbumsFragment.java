package edu.fsu.cs.mobile.example.albums_app;

import android.app.ListFragment;
import android.os.Bundle;

public class AlbumsFragment extends ListFragment {
	
	String[] albums = new String[]{"21", "The Element of Freedom", "Epiphany"};
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		/*
		 * AlbumsFragment already has a ListView attached to it, because it extends ListFragment. 
		 * 	- You need to call setListAdapter with the correct arguments to populate the ListView with the albums String array
		 *	- You should type “setList” then press Ctrl+Space
		 *	- Select “setListAdapter”
		 *	- Immediately type the word “new” followed by a space, then press Ctrl+Space again
		 *	- Select the third ArrayAdapter constructor in the list
		 *	- In place of the T between <>, you should type String, because you will be using the String[] albums array for the ArrayAdapter
		 *	- You need to figure out the arguments to this constructor
		 */
		
		/*
		 *	- you should get a reference to the ListView (it has a ListView because it extends ListFragment), 
		 * 		and then set the appropriate listener on the ListView. 
		 * 	- The listener should
		 * 		- create a new instance of SongsFragment
		 * 		- create a Bundle
		 * 		- add the clicked album (an integer) to the Bundle
		 * 		- call setArguments on the SongsFragment and pass the Bundle
		 * 		- use a FragmentTransaction to replace the current SongsFragment with the new instance of the SongsFragment
		 * 	- to get a handle on the FragmentTransaction
		 * 		- you first need to get a handle on the FragmentManager
		 * 		- then call beginTransaction() on the FragmentManager
		 * 	- to get a handle on the FragmentManager
		 * 		- you first need to get a handle on the controlling Activity using getActivity()
		 * 		- then call getFragmentManager() on the Activity
		 */
		

		/*
         * Next, look at the SongsFragment.java file
         */
	}

}
