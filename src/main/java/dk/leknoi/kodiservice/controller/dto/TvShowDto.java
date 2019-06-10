package dk.leknoi.kodiservice.controller.dto;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Data
public class TvShowDto {
    private static final SimpleDateFormat dateFormat
            = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private int idShow;
    public void setIdShow(int idShow) {
        this.idShow = idShow;
    }

    private String showTitle;
    private String plotSummary;
    private String status;
    private String firstAired;
    private String thumbnailURL;
    private String genre;
    private String originalTitle;
    private String episodeGuideURL;
    private String fanArtURL;
    private String uniqueKodiID;
    private String contentRating;
    private String studio;
    private String titleFormattedForSorting;
    private String trailer;

    public Date getFirstAiredConverted(String timezone) throws ParseException {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        return dateFormat.parse(this.firstAired);
    }

    public void setFirstAired(Date date, String timezone) {
        dateFormat.setTimeZone(TimeZone.getTimeZone(timezone));
        this.firstAired = dateFormat.format(date);
    }
}


