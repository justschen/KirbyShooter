import java.util.Scanner;

import javax.swing.JOptionPane;

public class StopKen {
		
	boolean KenWantsToBeASoundCloudRapper = true;
	int annoyance = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object[] options = {"No","No","No"};
			int n = JOptionPane.showOptionDialog(null,
					"Should Kenichi become "+ 
							"a SoundCloud rapper?\n" +  "                "
									+ "(The choice is clear.)","Kenichi is a meme.",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					options[2]);
	
			
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Does Kenichi want to be a SoundCloud Rapper?");
		String first = s.nextLine();	
		
		
		if (first.contains("yes")) {
			System.out.println("How annoying is Kenichi on a scale of 1-10?");
			System.out.println("10 being VERY annoying. 1 being not at all.");
			int next = s.nextInt();
			
			if (next>10) {
				System.out.println("TOO BAD KEN. STOP TRYNA BE A RAPPER.");
			}
			
			if(next >= 7 && next <=10) {
				System.out.println("Ken should stop trying to be a SoundCloud rapper.");
				System.out.println("Please sign our petition: www.change.org/p/kenichi-himself-stop-kenichi-from-trying-to-be-a-soundcloud-rapper?recruiter.");
			}
			
			if (next>=4 && next<7) {
				System.out.println("Block Kenichi. He still can't be a SoundCloud rapper.");
			}
			
			if (next<4) {
				System.out.println("Wow. You must really like Ken. Is your name April?");
				Scanner a = new Scanner(System.in);
				String april = a.nextLine();
			
				if (april.contains("yes")) {
					System.out.println("WOW. GOOD FOR KEN!");
				}
				
				if (april.contains("no")) {
					System.out.println("Oof. Sad life for Ken. ");
				}
			}
			
		}
	}

	
	public void blockKen() {
		if (KenWantsToBeASoundCloudRapper) {
			annoyance++;
		}
	}
	
	
	
	
}
