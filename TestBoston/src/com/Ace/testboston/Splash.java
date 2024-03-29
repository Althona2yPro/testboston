package com.Ace.testboston;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	MediaPlayer backgroundMusic;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();

				} finally {
					Intent openMain = new Intent("com.Ace.testboston.MENU");
					startActivity(openMain);
				}
			}

		};
		timer.start();

		backgroundMusic = MediaPlayer.create(Splash.this, R.raw.backsound);
		backgroundMusic.start();

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		backgroundMusic.pause();
		finish();

	}

}
