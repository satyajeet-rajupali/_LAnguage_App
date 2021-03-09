package com.satyajeet.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiWokTranslation;
    private int mAudioResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiWokTranslation, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiWokTranslation = mMiWokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String mDefaultTranslation, String mMiWokTranslation, int mImageResourceId, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiWokTranslation = mMiWokTranslation;
        this.mAudioResourceId = mAudioResourceId;
        this.mImageResourceId = mImageResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getMiWokTranslation() {
        return mMiWokTranslation;
    }

    public void setMiWokTranslation(String mMiWokTranslation) {
        this.mMiWokTranslation = mMiWokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public void setAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }
}
