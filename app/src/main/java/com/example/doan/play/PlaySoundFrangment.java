package com.example.doan.play;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;

import com.example.doan.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PlaySoundFrangment extends Fragment {
    ImageButton play,pause;
Handler handler;
Runnable runnable;
SeekBar seekBar;
    MediaPlayer sound;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_play_sound,container,false);
play =(ImageButton) rootView.findViewById(R.id.PSPlay);
pause = (ImageButton) rootView.findViewById(R.id.PSBlock);
seekBar = (SeekBar) rootView.findViewById(R.id.sbPSound);
 sound = MediaPlayer.create(getActivity(),R.raw.song_2);
handler = new Handler();
sound.setAudioStreamType(AudioManager.STREAM_MUSIC);

sound.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        seekBar.setMax(sound.getDuration());
        playCycle();
        sound.start();
    }
});

seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if(b){
        sound.seekTo(i);
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

});


play.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(sound.isPlaying()){
            sound.pause();
        }else{
        sound.setLooping(true);
        sound.start();
    }}
});
pause.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(sound.isPlaying()){
            sound.pause();
        }}
});       return rootView;

    }
    public void playCycle(){
        seekBar.setProgress(sound.getCurrentPosition());
        if(sound.isPlaying()){
            runnable = new Runnable() {
                @Override
                public void run() {
                    playCycle();
                }
            };
            handler.postDelayed(runnable,1000);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    sound.release();
    handler.removeCallbacks(runnable);
    }
}



