package com.example.doan.play;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.doan.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PlaySoundFrangment extends Fragment {
    ImageButton play,pause;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_play_sound,container,false);
play =(ImageButton) rootView.findViewById(R.id.PSPlay);
pause = (ImageButton) rootView.findViewById(R.id.PSBlock);
final MediaPlayer sound = MediaPlayer.create(getActivity(),R.raw.song_1);
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
        }
    }
});
        return rootView;
            }

        }



