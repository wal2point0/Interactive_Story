package uk.ac.aston.cs.interactivestory.model;

/**
 * Created by wale on 20/10/15.
 */
public class Page {
    private int mImage;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page (int imageId, String text, Choice choice1, Choice choice2){

        mImage = imageId;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;

    }

    public Page (int imageId, String text){

        mImage = imageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;
    }

    public int getImageId() {
        return mImage;
    }

    public String getText() {
        return mText;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setImage(int mImage) {
        this.mImage = mImage;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public void setChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public void setChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean mIsFinal) {
        this.mIsFinal = mIsFinal;
    }
}
