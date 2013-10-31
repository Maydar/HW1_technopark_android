package ru.mail.homeworkandroid1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {
	
	TextView left, right;
	String text = "";
	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		text = getArguments().getString(MainActivity.SECOND_ACTIVITY_EXTRA);
		return inflater.inflate(R.layout.second_fragment, container, false);
	}
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);
	}
	
	@Override
	public void setMenuVisibility(boolean menuVisible) {
		// TODO Auto-generated method stub
		super.setMenuVisibility(menuVisible);
		
		if (menuVisible) {
			
		}
	}
	
	@SuppressLint("NewApi")
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		View view = getActivity().getLayoutInflater().inflate(R.layout.second_fragment, null);
		
		left = (TextView)view.findViewById(R.id.txt_view1_fragment);
		right = (TextView)view.findViewById(R.id.txt_view2_fragment);
		
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
	}

}
