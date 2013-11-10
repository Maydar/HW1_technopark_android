package ru.mail.homeworkandroid1.activities;

import ru.mail.homeworkandroid1.R;
import ru.mail.homeworkandroid1.dialogues.FragmentDialogue;
import ru.mail.homeworkandroid1.dialogues.FragmentDialogue2;
import ru.mail.homeworkandroid1.fragments.FourhFragment;
import ru.mail.homeworkandroid1.fragments.MainFragment;
import ru.mail.homeworkandroid1.fragments.SecondFragment;
import ru.mail.homeworkandroid1.fragments.ThirdFragment;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends FragmentActivity implements FragmentDialogue.FragmentDialogListener, 
							FragmentDialogue2.FragmentDialogListener{
	
	private MainFragment mainFragment;
	private SecondFragment secondFragment;
	private ThirdFragment thirdFragment;
	private FourhFragment fourhFragment;
	
	public void showDialog() {
		DialogFragment newFragment = new FragmentDialogue();
		newFragment.show(getSupportFragmentManager(), "");
	}
	
	public void showDialog2() {
		DialogFragment newFragment = new FragmentDialogue2();
		newFragment.show(getSupportFragmentManager(), "");
	}
	
	public void showSecondFragment(Bundle arguments) {	
		secondFragment = new SecondFragment();
		secondFragment.setArguments(arguments);
		android.support.v4.app.FragmentTransaction fTransaction = getSupportFragmentManager().beginTransaction();
		fTransaction.replace(R.id.fragment_container, secondFragment);
		fTransaction.addToBackStack(null);
		fTransaction.commit();
		
	}
	
	public void showThirdFragment() {
		thirdFragment = new ThirdFragment();
		android.support.v4.app.FragmentTransaction fTransaction = getSupportFragmentManager().beginTransaction();
		fTransaction.replace(R.id.fragment_container, thirdFragment);
		fTransaction.addToBackStack(null);
		fTransaction.commit();
	}
	
	
	public void showFourthFragment(Bundle argBundle) {
		fourhFragment = new FourhFragment();
		fourhFragment.setArguments(argBundle);
		android.support.v4.app.FragmentTransaction fTransaction = getSupportFragmentManager().beginTransaction();
		fTransaction.replace(R.id.fragment_container, fourhFragment);
		fTransaction.addToBackStack(null);
		fTransaction.commit();
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mainFragment = new MainFragment();
		android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		fragmentTransaction.add(R.id.fragment_container, mainFragment);
		fragmentTransaction.addToBackStack(null);
		fragmentTransaction.commit();
		

		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		
	}
	
	@Override
	public void onDialogPositiveClick(DialogFragment dialog) {
		Dialog dialogView = dialog.getDialog();
	    EditText edit_dlg = ((EditText)dialogView.findViewById(R.id.edit_text_dlg));
	    EditText edit2 = mainFragment.edit2;
		edit2 = (EditText)findViewById(R.id.edit_text1);		
		edit2.setText(edit_dlg.getText().toString());
	}
	@Override
	public void onDialogNegativeClick(DialogFragment dialog) {
		
	}

	@Override
	public void onDialogPositiveClick2(DialogFragment dialog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDialogNegativeClick2(DialogFragment dialog) {
		// TODO Auto-generated method stub
		
	}

}
