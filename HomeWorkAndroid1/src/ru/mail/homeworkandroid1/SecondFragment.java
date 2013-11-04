package ru.mail.homeworkandroid1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondFragment extends Fragment {
	
	TextView left, right;
	String text = "";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Toast.makeText(getActivity(), "onCreate " , Toast.LENGTH_LONG).show();
	}
	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		text = getArguments().getString(MainFragment.SECOND_ACTIVITY_EXTRA);
		View view = inflater.inflate(R.layout.second_fragment, container, false);
		
		left = (TextView)view.findViewById(R.id.txt_view1_fragment);
		right = (TextView)view.findViewById(R.id.txt_view2_fragment);
		left.setText("left");
		right.setText("right");
		Toast.makeText(getActivity(), text , Toast.LENGTH_LONG).show();
		
		if(text.isEmpty()) {
			left.setText("Нет текста");
			right.setText("Нет текста");
		}
		else {
			Integer midOfString = text.length()/2;
			String leftText = text.substring(0, midOfString);
			String rightText = text.substring(midOfString, text.length());
			left.setText(leftText);
			right.setText(rightText);
		}
		
		
		return view;
	}
	
	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Toast.makeText(getActivity(), "OnResume " , Toast.LENGTH_LONG).show();
	}
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Toast.makeText(getActivity(), "Onstart" , Toast.LENGTH_LONG).show();
	}
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);
	}
	
}
