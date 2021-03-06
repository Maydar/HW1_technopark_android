package ru.mail.homeworkandroid1.dialogues;

import ru.mail.homeworkandroid1.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

public class FragmentDialogue extends android.support.v4.app.DialogFragment {
	public interface FragmentDialogListener {
        public void onDialogPositiveClick(android.support.v4.app.DialogFragment dialog);
        public void onDialogNegativeClick(android.support.v4.app.DialogFragment dialog);
    }
	
	FragmentDialogListener fListener;
	
	@Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            fListener = (FragmentDialogListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement FragmentDialogListener");
        }
    }
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {	
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		LayoutInflater inflater = getActivity().getLayoutInflater();
		builder.setView(inflater.inflate(R.layout.activity_fragment_dialogue, null))
						.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								fListener.onDialogPositiveClick(FragmentDialogue.this);
								
							}
						})
						.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								fListener.onDialogNegativeClick(FragmentDialogue.this);
								
								
							}
						});
		return builder.create();
	}

	

}
