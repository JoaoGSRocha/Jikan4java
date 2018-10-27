package Jikan4java.types.Main.Anime;
/*
This file is part of Jikan4java.

Jikan4java is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Foobar is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
*/
import Jikan4java.types.Support.Related.Related;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Anime {

    @JsonProperty("request_hash")
    private String request_hash;

    @JsonProperty("request_cached")
    private boolean request_cached;

    @JsonProperty("request_cache_expiry")
    private int request_cache_expiry;

    @JsonProperty("mal_id")
    private int mal_id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("image_url")
    private String iconURL;

    @JsonProperty("trailer_url")
    private String trailer_url;

    @JsonProperty("title")
    private String title;

    @JsonProperty("title_english")
    private String title_english;

    @JsonProperty("title_japanese")
    private String title_japanese;

    @JsonProperty("title_synonyms")
    private ArrayList<String> title_synonyms;

    @JsonProperty("type")
    private String type;

    @JsonProperty("source")
    private String source;

    @JsonProperty("episodes")
    private int episodes;

    @JsonProperty("status")
    private String status;
    
    @JsonProperty("aired")
    private Aired aired;

    @JsonProperty("airing")
    private boolean airing;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("rating")
    private String rating;

    @JsonProperty("score")
    private double score;

    @JsonProperty("scored_by")
    private int scored_by;

    @JsonProperty("rank")
    private int rank;

    @JsonProperty("popularity")
    private int popularirty;

    @JsonProperty("members")
    private int members;

    @JsonProperty("favorites")
    private int favorites;

    @JsonProperty("synopsis")
    private String synopsis;

    @JsonProperty("background")
    private String background;

    @JsonProperty("premiered")
    private String premiered;

    @JsonProperty("broadcast")
    private String broadcast;

    @JsonProperty("related")
    private Related related;

    @JsonProperty("producers")
    private ArrayList<Producers> producers;

    @JsonProperty("licensors")
    private ArrayList<Licensors> licensors;

    @JsonProperty("studios")
    private ArrayList<Studios> studios;

    @JsonProperty("genres")
    private ArrayList<Genres> genres;

    @JsonProperty("opening_themes")
    private ArrayList<String> opening_themes;

    @JsonProperty("ending_themes")
    private ArrayList<String> ending_themes;

    /**
     * Anime object constructor without variables
     */
    public Anime() {
    }

    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public int getMal_id() {
        return mal_id;
    }

    public String getUrl() {
        return url;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getTrailer_url() {
        return trailer_url;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle_english() {
        return title_english;
    }

    public String getTitle_japanese() {
        return title_japanese;
    }

    public ArrayList<String> getTitle_synonyms() {
        return title_synonyms;
    }

    public String getType() {
        return type;
    }

    public String getSource() {
        return source;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getStatus() {
        return status;
    }

    public Aired getAired() {
        return aired;
    }

    public boolean isAiring() {
        return airing;
    }

    public String getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    public double getScore() {
        return score;
    }

    public int getScored_by() {
        return scored_by;
    }

    public int getRank() {
        return rank;
    }

    public int getPopularirty() {
        return popularirty;
    }

    public int getMembers() {
        return members;
    }

    public int getFavorites() {
        return favorites;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getBackground() {
        return background;
    }

    public String getPremiered() {
        return premiered;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public Related getRelated() {
        return related;
    }

    public ArrayList<Producers> getProducers() {
        return producers;
    }

    public ArrayList<Licensors> getLicensors() {
        return licensors;
    }

    public ArrayList<Studios> getStudios() {
        return studios;
    }

    public ArrayList<Genres> getGenres() {
        return genres;
    }

    public ArrayList<String> getOpening_themes() {
        return opening_themes;
    }

    public ArrayList<String> getEnding_themes() {
        return ending_themes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "request_hash='" + request_hash + '\'' +
                ",\n request_cached=" + request_cached +
                ",\n request_cache_expiry=" + request_cache_expiry +
                ",\n mal_id=" + mal_id +
                ",\n url='" + url + '\'' +
                ",\n iconURL='" + iconURL + '\'' +
                ",\n trailer_url='" + trailer_url + '\'' +
                ",\n title='" + title + '\'' +
                ",\n title_english='" + title_english + '\'' +
                ",\n title_japanese='" + title_japanese + '\'' +
                ",\n title_synonyms=" + title_synonyms +
                ",\n type='" + type + '\'' +
                ",\n source='" + source + '\'' +
                ",\n episodes=" + episodes +
                ",\n status='" + status + '\'' +
                ",\n aired=" + aired +
                ",\n airing=" + airing +
                ",\n duration='" + duration + '\'' +
                ",\n rating='" + rating + '\'' +
                ",\n score=" + score +
                ",\n scored_by=" + scored_by +
                ",\n rank=" + rank +
                ",\n popularirty=" + popularirty +
                ",\n members=" + members +
                ",\n favorites=" + favorites +
                ",\n synopsis='" + synopsis + '\'' +
                ",\n background='" + background + '\'' +
                ",\n premiered='" + premiered + '\'' +
                ",\n broadcast='" + broadcast + '\'' +
                ",\n related=" + related +
                ",\n producers=" + producers +
                ",\n licensors=" + licensors +
                ",\n studios=" + studios +
                ",\n genres=" + genres +
                ",\n opening_themes=" + opening_themes +
                ",\n ending_themes=" + ending_themes +
                '}';
    }
}