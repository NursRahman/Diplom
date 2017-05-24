package com.bignerdranch.android.beatbox;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

public class BeatBoxFragment extends Fragment {

    private BeatBox mBeatBox;

    public static BeatBoxFragment newInstance() {
        return new BeatBoxFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBeatBox = new BeatBox(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_beat_box, container, false);

        RecyclerView recyclerView = (RecyclerView)view
                .findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        recyclerView.setAdapter(new SoundAdapter(mBeatBox.getSounds()));

        return view;
    }

    private class SoundHolder extends RecyclerView.ViewHolder {
        private Button mButton;
        private Sound mSound;

        public SoundHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_sound, parent, false));

            mButton = (Button)itemView.findViewById(R.id.button);
            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent  = new Intent(getActivity(), AlphabetActivity.class);
                    intent.putExtra("MSOUND",mSound);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getActivity().startActivity(intent);
                }
            });
        }

        public void bindSound(Sound sound) {
            mSound = sound;
            mButton.setText(mSound.getName());
            if (mSound.getName().equals("uu")){
                mButton.setText("Үү");
            }
            switch (mSound.getName()){
                case "a":
                    mButton.setText("А");
                    break;
                case "b":
                    mButton.setText("Б");
                    break;
                case "c":
                    mButton.setText("В");
                    break;
                case "d":
                    mButton.setText("Г");
                    break;
                case "e":
                    mButton.setText("Д");
                    break;
                case "f":
                    mButton.setText("Е");
                    break;
                case "g":
                    mButton.setText("Ж");
                    break;
                case "h":
                    mButton.setText("З");
                    break;
                case "i":
                    mButton.setText("И");
                    break;
                case "j":
                    mButton.setText("Й");
                    break;
                case "k":
                    mButton.setText("К");
                    break;
                case "l":
                    mButton.setText("Л");
                    break;
                case "m":
                    mButton.setText("М");
                    break;
                case "n":
                    mButton.setText("Н");
                    break;
                case "nn":
                    mButton.setText("ң");
                    break;
                case "o":
                    mButton.setText("О");
                    break;
                case "oo":
                    mButton.setText("Ө");
                    break;
                case "p":
                    mButton.setText("П");
                    break;
                case "r":
                    mButton.setText("Р");
                    break;
                case "s":
                    mButton.setText("С");
                    break;
                case "t":
                    mButton.setText("Т");
                    break;
                case "u":
                    mButton.setText("У");
                    break;
                case "uu":
                    mButton.setText("Ү");
                    break;
                case "v":
                    mButton.setText("Ф");
                    break;
                case "w":
                    mButton.setText("Х");
                    break;
                case "x":
                    mButton.setText("Ц");
                    break;
                case "y":
                    mButton.setText("Ч");
                    break;
                case "z":
                    mButton.setText("Ш");
                    break;
                case "z1":
                    mButton.setText("Ы");
                    break;
                case "z2":
                    mButton.setText("Э");
                    break;
                case "z3":
                    mButton.setText("Ю");
                    break;
                case "z4":
                    mButton.setText("Я");
                    break;
            }
        }

    }

    private class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {
        private List<Sound> mSounds;

        public SoundAdapter(List<Sound> sounds) {
            mSounds = sounds;
        }

        @Override
        public SoundHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new SoundHolder(inflater, viewGroup);
        }

        @Override
        public void onBindViewHolder(SoundHolder soundHolder, int i) {
            Sound sound = mSounds.get(i);
            soundHolder.bindSound(sound);
        }

        @Override
        public int getItemCount() {
            return mSounds.size();
        }
    }
}
