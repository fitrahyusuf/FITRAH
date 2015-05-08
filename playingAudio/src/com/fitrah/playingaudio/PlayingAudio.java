package com.fitrah.playingaudio;

import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class PlayingAudio extends Activity{
	ImageButton mainkan;
	TextView keterangan;
	MediaPlayer mp;
		
	/** called when the activity is first createrd. */
	
	@Override
	public void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);
			keterangan = (TextView)findViewById(R.id.ket);
			keterangan.setText("Silahakan klik tombol play");
			mainkan=(ImageButton)findViewById(R.id.putarMusik);
			mainkan.setOnClickListener(new OnClickListener(){
				public void onClick(View arg0){
					mainkan.setEnabled(false);
					keterangan.setText("Tombol play tidak aktif");
					go();
				}
			});
			
	}
	
	public void go(){
		mp=MediaPlayer.create(PlayingAudio.this, R.raw.chandelier);
		try{
			mp.prepare();
		}catch(IllegalStateException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		mp.start();
		mp.setOnCompletionListener(new OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				mainkan.setEnabled(true);
				keterangan.setText("Silahkan klik tombol play");
			}
		});
		
	}
}