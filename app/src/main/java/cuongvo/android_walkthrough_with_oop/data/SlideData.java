package cuongvo.android_walkthrough_with_oop.data;

/**
 * Created by cuongvo on 5/28/17.
 */

public abstract class SlideData {
    private int imageId;
    private String title;
    private boolean isSelected;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
