package com.bignerdranch.android.beatbox;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeatBox {
    private static final String TAG = "BeatBox";

    //private static final String SOUNDS_FOLDER = "sample_sounds";
    private static final int MAX_SOUNDS = 5;

    private AssetManager mAssets;
    private List<Sound> mSounds;
    private List<Sound> mNumberSounds;
    private List<Sound> mShapeSounds;
    private List<Sound> mColorSounds;
    private SoundPool mSoundPool;

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        mSoundPool = new SoundPool(MAX_SOUNDS, AudioManager.STREAM_MUSIC, 0);
        loadSoundsAlphabet();
        loadSoundsNumber();
        loadSoundsShape();
        loadSoundsColor();
    }

    public void play(Sound sound) {
        Integer soundId = sound.getSoundId();
        if (soundId == null) {
            return;
        }
        mSoundPool.play(soundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void release() {
        mSoundPool.release();
    }

    public List<Sound> getSounds() {
        return mSounds;
    }

    private void loadSoundsAlphabet() {

        String[] soundNames;
        try {
            soundNames = mAssets.list("sample_sounds");
            Log.i(TAG, "Found " + soundNames.length + " sounds");
        } catch (IOException ioe) {
            Log.e(TAG, "Could not list assets", ioe);
            return;
        }

        mSounds = new ArrayList<Sound>();
        for (String filename : soundNames) {
            try {
                String assetPath = "sample_sounds" + "/" + filename;
                Sound sound = new Sound(assetPath);
                load(sound);
                mSounds.add(sound);
            } catch (IOException ioe) {
                Log.e(TAG, "Could not load sound " + filename, ioe);
            }
        }
    }

    private void loadSoundsNumber() {

        String[] soundNames;
        try {
            soundNames = mAssets.list("sound_number");
            Log.i(TAG, "Found " + soundNames.length + " sounds");
        } catch (IOException ioe) {
            Log.e(TAG, "Could not list assets", ioe);
            return;
        }

        mNumberSounds = new ArrayList<Sound>();
        for (String filename : soundNames) {
            try {
                String assetPath = "sound_number" + "/" + filename;
                Sound sound = new Sound(assetPath);
                load(sound);
                mNumberSounds.add(sound);
            } catch (IOException ioe) {
                Log.e(TAG, "Could not load sound " + filename, ioe);
            }
        }
    }

    private void loadSoundsShape() {

        String[] soundNames;
        try {
            soundNames = mAssets.list("sound_shape");
            Log.i(TAG, "Found " + soundNames.length + " sounds");
        } catch (IOException ioe) {
            Log.e(TAG, "Could not list assets", ioe);
            return;
        }

        mShapeSounds = new ArrayList<Sound>();
        for (String filename : soundNames) {
            try {
                String assetPath = "sound_shape" + "/" + filename;
                Sound sound = new Sound(assetPath);
                load(sound);
                mShapeSounds.add(sound);
            } catch (IOException ioe) {
                Log.e(TAG, "Could not load sound " + filename, ioe);
            }
        }
    }

    private void loadSoundsColor() {

        String[] soundNames;
        try {
            soundNames = mAssets.list("sound_color");
            Log.i(TAG, "Found " + soundNames.length + " sounds");
        } catch (IOException ioe) {
            Log.e(TAG, "Could not list assets", ioe);
            return;
        }

        mColorSounds = new ArrayList<Sound>();
        for (String filename : soundNames) {
            try {
                String assetPath = "sound_color" + "/" + filename;
                Sound sound = new Sound(assetPath);
                load(sound);
                mColorSounds.add(sound);
            } catch (IOException ioe) {
                Log.e(TAG, "Could not load sound " + filename, ioe);
            }
        }
    }

    private void load(Sound sound) throws IOException {
        AssetFileDescriptor afd = mAssets.openFd(sound.getAssetPath());
        int soundId = mSoundPool.load(afd, 1);
        sound.setSoundId(soundId);
    }
}