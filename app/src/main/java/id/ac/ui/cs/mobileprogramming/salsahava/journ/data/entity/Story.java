package id.ac.ui.cs.mobileprogramming.salsahava.journ.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.Date;
import java.util.List;

import id.ac.ui.cs.mobileprogramming.salsahava.journ.util.Converters;

@Entity(tableName = "story_table")
@TypeConverters(Converters.class)
public class Story {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;

    private Date date;

    private String description;

    private List<Integer> commentId = null;

    public Story(String title, Date date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCommentId(List<Integer> commentId) {
        this.commentId = commentId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public List<Integer> getCommentId() {
        return commentId;
    }
}
