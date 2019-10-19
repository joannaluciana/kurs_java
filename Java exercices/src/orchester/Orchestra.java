package orchester;
import java.awt.*;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
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
	JFrame ramkaGlowna;
	
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
			JPanel panelTl1a = new JPanel (uklad);
			panelTl1a.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
			
			listaPolWyboru = new ArrayList <JCheckBox>();
			Box obszarPrzyciskow = new Box(BoxLayout.Y_AXIS);
			
			JButton start = new JButton("Start");
			start.addActionListener(new MojStartListener());
			obszarPrzyciskow.add(start);
			
			JButton stop= new JButton("Stop");
			stop.addActionListener(new MojStopListener());
			obszarPrzyciskow.add(stop);
			
			JButton tempoG= new JButton("Szybciej");
			tempoG.addActionListener(new MojtempoGListener());
			obszarPrzyciskow.add(tempoG);
			
			JButton tempoD= new JButton("Wolniej");
			tempoD.addActionListener(new MojtempoDListener());
			obszarPrzyciskow.add(tempoD);
			
			Box obszarNazw = new Box (BoxLayout.Y_AXIS);
			for (int i =0; i <16; i++) {
				
				obszarNazw.add(new Label (nazwyInstrumentow[i]));
			}
			
			panelTl1a.add(BorderLayout.EAST, obszarPrzyciskow);
			panelTl1a.add(BorderLayout.WEST, obszarNazw);
			
			
			ramkaGlowna.getContentPane().add(panelTl1a);
			
			GridLayout siatkaPolWyboru = new GridLayout (16,16);
			siatkaPolWyboru.setVgap(1);
			siatkaPolWyboru.setHgap(2);
			panelGlowny = new JPanel (siatkaPolWyboru);
			panelTl1a.add(BorderLayout.CENTER, panelGlowny);
			
			for (int i = 0; i< 256; i++) {
				JCheckBox c = new JCheckBox ();
				c.setSelected(false);
				listaPolWyboru.add(c);
				panelGlowny.add(c);
			}
			
			konfigurujMidi();
			
			ramkaGlowna.setBounds(50,50,300,300);
			ramkaGlowna.pack();
			ramkaGlowna.setVisible(true);
			}
	
	public void konfigurujMidi () {
		
		try {
			sekwenser = MidiSystem.getSequencer();
			sekwenser.open();
			sekwencja = new Sequence (Sequence.PPQ,4);
			sciezka = sekwencja.createTrack();
			sekwenser.setTempoInBPM(120);
		} catch  (Exception e) {e.printStackTrace();}
			
		
		}
	
			public void utworzSciezkeOdtworz () {
				int [] listaSciezki = null;
				
				
				sekwencja.deleteTrack(sciezka);
				sciezka = sekwencja.createTrack();
				
				for (int i=0; i <16; i ++) {
					listaSciezki = new int [16];
					int klucz = instrumenty[i];
					
					for (int j =0; j<16; j++) {
					JCheckBox jc = (JCheckBox) listaPolWyboru.get(j+(16*i));
					if (jc.isSelected()) {
						listaSciezki[j]=klucz;
					} else {
						listaSciezki[j]=0;
						}
			}
			}
				
				utworzSciezke(listaSciezki);
				sciezka.add(tworzZdarzenie(176,1,127,0,16));
			}
				sciezka.add(tworzZdarzenie (192,9,1,0,15));
				try {
					
					sekwenser.setSequence(sekwencja);
					sekwenser.setLoopCount(sekwenser.LOOP_CONTINUOUSLY);
					sekwenser.start();
					sekwenser.setTempoInBPM(120);
					
				} catch (Exception e ) {
					e.printStackTrace();
	}			
}

	public class MojStartListener implements ActionListener {
		public void actionPerformed (ActionEvent a) {
			utworzSciezkeIOdtworz ();
	}	
}
 				
	public void MojStopListener implements ActionListener {
		public void actionPerformed (ActionEvent a) {
			sekwenser.stop();
	}	
}
public class MojTempoGListener implements ActionListener {
	public void actionPerformed (ActionEvent a) {
		float wspTempa = sekwenser.getTempoFactor();
		sekwenser.setTempoFactor((float)wspTempa *1.03);
	}
}

public class MojTempoDListener implements ActionListener {
	
	public void actionPerformed (ActionEvent a) {
		float wspTempa = sekwenser.getTempoFactor();
		sekwenser.setTempoFactor((float)wspTempa *0.97);
	}

}
	public void utworzSciezke (int [lista]) {
		for (int i =0; i< 16; i ++) {
			int klucz = lista [i];
			if (klucz[i]!=0) { 
				sciezka.add(tworzZdarzenie(144,9,klucz,100,i));
				sciezka.add(tworzZdarzenie(128,9,klucz,100,i));
			}
		}
	}
	
	public static MidiEvent tworzZdarzenie (int plc, int kanal, int jeden, int dwa, int takt) {
		
		MidiEvent zdarzenie = null;
		
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage (plc, kanal, jeden, dwa);
			zdarzenie= new MidiEvent(a, takt);
		} catch (Exception e) { e.printStackTrace();}
		
		return zdarzenie;
			
		}
			
	}

