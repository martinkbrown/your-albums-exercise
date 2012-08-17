package edu.fsu.cs.mobile.example.albums_app;

import java.util.ArrayList;

import android.app.ListFragment;
import android.os.Bundle;

public class SongsFragment extends ListFragment {

	ArrayList<ArrayList<String>> songs = new ArrayList<ArrayList<String>>();
	
	private int selected = 0;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		super.onActivityCreated(savedInstanceState);
		
		setSongs();
		
		/*
		 * The SongsFragment is similar to AlbumsFragment, as it also extends ListFragment. 
		 * 	- first, create a Bundle and call getArguments to populate the Bundle
		 * 	- get the "selected" integer from the Bundle, using the getInt() method of Bundle
		 * 	- assign this "selected" value to the selected field in this class
		 * 	- make sure to check that the Bundle is not null before you do this, otherwise you may get Force Close
		 * 	- You should call setListAdapter here also, using the songs ArrayList to populate the ListAdapter
		 * 	- Notice that I call setSongs() in the beginning of onActivityCreated(); 
		 * 	- I already made it so that the Fragment reads the String Array Resources in res/layout/strings.xml. 
		 * 	- To retrieve a list of songs for a particular album, call songs.get(selected)
		 * 		- where index should be the item clicked from the AlbumsFragment
		 */
	}
	
	private void setSongs() {
		
		ArrayList<String> list;
		
		list = toArrayList(getResources().getStringArray(R.array.twenty_one));
		songs.add(list);
		list = toArrayList(getResources().getStringArray(R.array.the_element_of_freedom));
		songs.add(list);
		list = toArrayList(getResources().getStringArray(R.array.epiphany));
		songs.add(list);
		
	}
	
	private ArrayList<String> toArrayList(String str[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		
		return list;
	}
}
