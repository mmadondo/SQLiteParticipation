package commmadondo.github.sqliteparticipation;

/**
 * Created by mmadondo on 3/31/2017.
 * Model
 * Contains data to be used in database and shown in the UI
 */

public class Comment {
    private long id;
    private String comment;
    private String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return (comment + "The rating is " + rating);  //displays the rating along with the comment text
    }
}