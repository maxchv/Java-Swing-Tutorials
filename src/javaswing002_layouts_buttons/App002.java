package javaswing002_layouts_buttons;

import javax.swing.SwingUtilities;

public class App002
{

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				MainFrame testFrame = new MainFrame();
			}
		});

	}

}
