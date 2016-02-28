package uk.ac.aston.cs.interactivestory.model;

/**
 * Created by wale on 20/10/15.
 */
public class Choice {

    private String mText;
    private int mNextPage;


    public Choice (String text, int nextPage){

        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public void setNextPage(int mNextPage) {
        this.mNextPage = mNextPage;
    }
}
