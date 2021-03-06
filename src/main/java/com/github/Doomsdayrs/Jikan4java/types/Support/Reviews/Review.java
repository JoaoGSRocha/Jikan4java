package com.github.Doomsdayrs.Jikan4java.types.Support.Reviews;

import com.fasterxml.jackson.annotation.JsonProperty;

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
 * 30 / December / 2018
 *
 * @author github.com/doomsdayrs
 */
public class Review {
    @JsonProperty("mal_id")
    private int mal_id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("helpful_count")
    private int helpful_count;

    @JsonProperty("date")
    private String date;

    @JsonProperty("reviewer")
    private Reviewer reviewer;

    @JsonProperty("content")
    private String content;

    public int getMal_id() {
        return mal_id;
    }

    public String getUrl() {
        return url;
    }

    public int getHelpful_count() {
        return helpful_count;
    }

    public String getDate() {
        return date;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Review{" +
                "mal_id=" + mal_id +
                ", url='" + url + '\'' +
                ", helpful_count=" + helpful_count +
                ", date='" + date + '\'' +
                ", reviewer=" + reviewer +
                ", content='" + content + '\'' +
                '}';
    }
}
