package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView babyImage = findViewById(R.id.babyImage);
        babyImage.setImageResource(R.drawable.cute_baby);

        MediaPlayer audioBaby = MediaPlayer.create(this, R.raw.baby_laughing);
        audioBaby.start();

        VideoView rabbidVideo = findViewById(R.id.rabbidVideo);
        rabbidVideo.setVideoURI(
                Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid)
        );
        rabbidVideo.start();
    }
}
