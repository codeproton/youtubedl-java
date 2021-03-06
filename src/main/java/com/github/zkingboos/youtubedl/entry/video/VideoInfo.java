package com.github.zkingboos.youtubedl.entry.video;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.zkingboos.youtubedl.YoutubeRequest;
import com.github.zkingboos.youtubedl.YoutubeResponse;
import com.github.zkingboos.youtubedl.entry.HttpHeader;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;

@Data
@ToString
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoInfo {

    public String id;
    public String fulltitle;
    public String title;
    @JsonProperty("upload_date")
    public String uploadDate;
    @JsonProperty("display_id")
    public String displayId;
    public int duration;
    public String description;
    public String thumbnail;
    public String license;

    @JsonProperty("uploader_id")
    public String uploaderId;
    public String uploader;

    @JsonProperty("player_url")
    public String playerUrl;
    @JsonProperty("webpage_url")
    public String webpageUrl;
    @JsonProperty("webpage_url_basename")
    public String webpageUrlBasename;

    public String resolution;
    public int width;
    public int height;
    public String format;
    public String ext;

    @JsonProperty("http_headers")
    public HttpHeader httpHeader;
    public ArrayList<String> categories;
    public ArrayList<String> tags;
    public ArrayList<VideoFormat> formats;
    public ArrayList<VideoThumbnail> thumbnails;
    //public ArrayList<VideoSubtitle> subtitles;

    @JsonProperty("playlist_id")
    private String playlistId;
    @JsonProperty("playlist_title")
    private String playlistTitle;
    @JsonProperty("playlist_index")
    private int playlistIndex;
    @JsonProperty("playlist_uploader")
    private String playlistUploader;

    @JsonIgnore
    private YoutubeRequest request;
    @JsonIgnore
    private YoutubeResponse response;
}
