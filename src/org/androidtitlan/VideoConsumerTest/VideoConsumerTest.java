package org.androidtitlan.VideoConsumerTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoConsumerTest extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Calling VideoView
        VideoView videoView = (VideoView) findViewById(R.id.VideoView);
		MediaController mediaController = new MediaController(this);
		mediaController.setAnchorView(videoView);
		
		
		String resource="rtsp://here goes your rstp";
		mediaController = new MediaController(this);
		mediaController.setMediaPlayer(videoView);
		videoView.setVideoPath(resource); 
		videoView.setMediaController(mediaController);
		videoView.requestFocus();
		videoView.start();

		mediaController.show();
		

    }
}