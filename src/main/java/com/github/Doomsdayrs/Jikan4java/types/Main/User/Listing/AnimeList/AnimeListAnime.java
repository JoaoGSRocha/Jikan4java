package com.github.Doomsdayrs.Jikan4java.types.Main.User.Listing.AnimeList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.Doomsdayrs.Jikan4java.types.Main.Anime.Licensors;
import com.github.Doomsdayrs.Jikan4java.types.Main.Anime.Studios;

import java.util.ArrayList;

/**
 * This file is part of Jikan4java.
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * ====================================================================
 * Jikan4java
 * 03 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
public class AnimeListAnime {

    @JsonProperty("mal_id")
    private int mal_id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("video_url")
    private String video_url;

    @JsonProperty("url")
    private String url;

    @JsonProperty("image_url")
    private String image_url;

    @JsonProperty("type")
    private String type;

    @JsonProperty("watching_status")
    private int watching_status;

    @JsonProperty("score")
    private int score;

    @JsonProperty("watched_episodes")
    private int watched_episodes;

    @JsonProperty("total_episodes")
    private int total_episodes;

    @JsonProperty("airing_status")
    private int airing_status;

    @JsonProperty("season_name")
    private String season_name;

    @JsonProperty("season_year")
    private String season_year;

    @JsonProperty("has_episode_video")
    private boolean has_episode_video;

    @JsonProperty("has_promo_video")
    private boolean has_promo_video;

    @JsonProperty("has_video")
    private boolean has_video;

    @JsonProperty("is_rewatching")
    private boolean is_rewatching;

    @JsonProperty("tags")
    private String tags;

    @JsonProperty("rating")
    private String rating;

    @JsonProperty("start_date")
    private String start_date;

    @JsonProperty("end_date")
    private String end_date;

    @JsonProperty("watch_start_date")
    private String watch_start_date;

    @JsonProperty("watch_end_date")
    private String watch_end_date;

    @JsonProperty("days")
    private String days;

    @JsonProperty("storage")
    private String storage;

    @JsonProperty("priority")
    private String priority;

    @JsonProperty("added_to_list")
    private boolean added_to_list;

    @JsonProperty("studios")
    private ArrayList<Studios> studios;

    @JsonProperty("licensors")
    private ArrayList<Licensors> licensors;

    public int getMal_id() {
        return mal_id;
    }

    public String getTitle() {
        return title;
    }

    public String getVideo_url() {
        return video_url;
    }

    public String getUrl() {
        return url;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getType() {
        return type;
    }

    public int getWatching_status() {
        return watching_status;
    }

    public int getScore() {
        return score;
    }

    public int getWatched_episodes() {
        return watched_episodes;
    }

    public int getTotal_episodes() {
        return total_episodes;
    }

    public int getAiring_status() {
        return airing_status;
    }

    public String getSeason_name() {
        return season_name;
    }

    public String getSeason_year() {
        return season_year;
    }

    public boolean isHas_episode_video() {
        return has_episode_video;
    }

    public boolean isHas_promo_video() {
        return has_promo_video;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public boolean isIs_rewatching() {
        return is_rewatching;
    }

    public String getTags() {
        return tags;
    }

    public String getRating() {
        return rating;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getWatch_start_date() {
        return watch_start_date;
    }

    public String getWatch_end_date() {
        return watch_end_date;
    }

    public String getDays() {
        return days;
    }

    public String getStorage() {
        return storage;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isAdded_to_list() {
        return added_to_list;
    }

    public ArrayList<Studios> getStudios() {
        return studios;
    }

    public ArrayList<Licensors> getLicensors() {
        return licensors;
    }

    @Override
    public String toString() {
        return "AnimeListAnime{" +
                "mal_id=" + mal_id +
                ", title='" + title + '\'' +
                ", video_url='" + video_url + '\'' +
                ", url='" + url + '\'' +
                ", image_url='" + image_url + '\'' +
                ", type='" + type + '\'' +
                ", watching_status=" + watching_status +
                ", score=" + score +
                ", watched_episodes=" + watched_episodes +
                ", total_episodes=" + total_episodes +
                ", airing_status=" + airing_status +
                ", season_name='" + season_name + '\'' +
                ", season_year='" + season_year + '\'' +
                ", has_episode_video=" + has_episode_video +
                ", has_promo_video=" + has_promo_video +
                ", has_video=" + has_video +
                ", is_rewatching=" + is_rewatching +
                ", tags='" + tags + '\'' +
                ", rating='" + rating + '\'' +
                ", start_date='" + start_date + '\'' +
                ", end_date='" + end_date + '\'' +
                ", watch_start_date='" + watch_start_date + '\'' +
                ", watch_end_date='" + watch_end_date + '\'' +
                ", days='" + days + '\'' +
                ", storage='" + storage + '\'' +
                ", priority='" + priority + '\'' +
                ", added_to_list=" + added_to_list +
                ", studios=" + studios +
                ", licensors=" + licensors +
                '}';
    }
}
