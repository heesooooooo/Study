package view;

import java.util.Scanner;

import javazoom.jl.player.MP3Player;
import model.HangmanDAO;

public class MusicMain {

	public static void main6(String[] args) {
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();
		HangmanDAO dao = new HangmanDAO();

		while (true) {
			System.out.print(" >> ");
			int input = sc.nextInt();

			if (input == 1) {
				dao.startBgm();

			} else if (input == 2) {
				dao.sreamBgm();

			} else if (input == 3) {
				dao.errorBgm();

			} else if (input == 4) {
				dao.pianoBgm();

			} else if (input == 5) {
				dao.successBgm();

			} else if (input == 6) {
				dao.endBgm();

			} else if (input == 7) {
				if (mp3.isPlaying()) {
					mp3.stop();
				}

			}

		}

	}

}
