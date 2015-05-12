package de.uks.se.scoreproject.dice.preferences;

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import dice.Activator;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class SamplePreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public SamplePreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Dice Settings Window. Set Server address username and Password here.");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
//		addField(new DirectoryFieldEditor(PreferenceConstants.P_PATH, 
//				"&Directory preference:", getFieldEditorParent()));
//		addField(
//			new BooleanFieldEditor(
//				PreferenceConstants.P_BOOLEAN,
//				"&An example of a boolean preference",
//				getFieldEditorParent()));
//
//		addField(new RadioGroupFieldEditor(
//				PreferenceConstants.P_CHOICE,
//			"An example of a multiple-choice preference",
//			1,
//			new String[][] { { "&Choice 1", "choice1" }, {
//				"C&hoice 2", "choice2" }
//		}, getFieldEditorParent()));
	StringFieldEditor sfip = new StringFieldEditor(PreferenceConstants.P_STRING_Address, "Server Adress:Port :", getFieldEditorParent());
		addField( // A &text preference
			sfip);
		StringFieldEditor sfu = new StringFieldEditor(PreferenceConstants.P_STRING_username, "Benutzername :", getFieldEditorParent());
		addField( // A &text preference
			sfu	);
		
		StringFieldEditor sfe = new StringFieldEditor(PreferenceConstants.P_STRING_pw, "Passwort :", getFieldEditorParent());
		
			System.out.println(sfe.getPreferenceName());
			System.out.println(sfu.getPreferenceName());
			System.out.println(sfip.getPreferenceName());
		addField( // A &text preference
				sfe);
//		this.getFieldEditorParent().
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}