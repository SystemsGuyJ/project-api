package com.endpoint.api;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"slack_name","current_day","utc_time","track","github_file_url","github_repo_url","status_code"})
public class Details {
    @JsonProperty("slack_name")
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private long status_code;

    
    public Details(String slack_name, String track) {
        this.slack_name = slack_name;
        this.track = track;
        this.current_day = dayOfWeek();
        this.utc_time = formatUtcTime();
        this.track = track;
        this.github_file_url = "https://github.com/SystemsGuyJ/project-api/blob/558616da3fdcc5a4b0ea64c1235d82c58502d139/src/main/java/com/endpoint/api/APIController.java";
        this.github_repo_url = "https://github.com/SystemsGuyJ/project-api.git";
        this.status_code = 200;
    }

    
    public String getSlack_name() {
        return slack_name;
    }
    public void setSlack_name(String slack_name) {
        this.slack_name = slack_name;
    }
    public String getCurrent_day() {
        return current_day;
    }
    public void setCurrent_day(String current_day) {
        this.current_day = current_day;
    }
    public String getUtc_time() {
        return utc_time;
    }
    public void setUtc_time(String utc_time) {
        this.utc_time = utc_time;
    }
    public String getTrack() {
        return track;
    }
    public void setTrack(String track) {
        this.track = track;
    }
    public String getGithub_file_url() {
        return github_file_url;
    }
    public void setGithub_file_url(String github_file_url) {
        this.github_file_url = github_file_url;
    }
    public String getGithub_repo_url() {
        return github_repo_url;
    }
    public void setGithub_repo_url(String github_repo_url) {
        this.github_repo_url = github_repo_url;
    }
    public long getStatus_code() {
        return status_code;
    }
    public void setStatus_code(long status_code) {
        this.status_code = status_code;
    }

    
     protected String dayOfWeek(){
        
        // Get the current date
        Date currentDate = new Date();

        // Define the date format
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");

        // Format the current date to get the day of the week
        String today = formatter.format(currentDate);

        // Print the day of the week
        return today;
    
    }

    protected String formatUtcTime() {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        formatter.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return formatter.format(currentDate);

    
}
}
