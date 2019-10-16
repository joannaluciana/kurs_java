package orchester;
import java.awt.*;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Orchestra {
 
	JPanel panelGlowny;
	ArrayList<JCheckBox> listaPolWyboru;
	Sequencer sekwenser;
	Sequence sekwencja;
	Track sciezka;
	JFrame ramkGlowna;
	
	String[] nazwyInstrumentow = {"Bass Drum", "Closed Hi-Hat","Open Hi-Hat", "Acoustic Snare","Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo", " Maracas",
			"Whistle", "Low Conga", "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"};
	int [] instrumenty = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	
	public static void main (String [] asia) {
		new Orchestra().tworzGUI();
	}
	public void tworzGUI () {
			ramkaGlowna = new JFrame ("Orchestra");
			ramkaGlowna.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
			BorderLayout uklad= new BorderLayout (); 
			
	}
}
