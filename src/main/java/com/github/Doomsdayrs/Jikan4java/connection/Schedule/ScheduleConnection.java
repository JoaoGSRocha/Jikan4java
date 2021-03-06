package com.github.Doomsdayrs.Jikan4java.connection.Schedule;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.Doomsdayrs.Jikan4java.types.Main.Schedule.Day;
import com.github.Doomsdayrs.Jikan4java.types.Main.Schedule.Schedule;
import com.github.Doomsdayrs.Jikan4java.types.Main.Schedule.Week.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Objects;

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
 * 02 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
public class ScheduleConnection {
    private final OkHttpClient client = new OkHttpClient();
    private final String baseURL = "https://api.jikan.moe/v3";
    private final ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

    /**
     * Constructor
     */
    public ScheduleConnection() {
    }

    /**
     * Returns current schedule for all anime
     *
     * @return Schedule
     * @throws IOException    IOException
     * @throws ParseException ParseException
     */
    public Schedule scheduleSearch() throws IOException, ParseException {
        return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/").build()).execute().body()).string())).toJSONString(), Schedule.class);
    }

    /**
     * Returns all anime's schedule on a certain day
     *
     * @param day Day to retrieve, Can also be other or unknown
     * @return DaySchedule object
     * @throws IOException    IOException
     * @throws ParseException ParseException
     */
    public Day scheduleSearch(String day) throws IOException, ParseException {
        if (day.equalsIgnoreCase("monday")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Monday.class);
        } else if (day.equalsIgnoreCase("tuesday")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Tuesday.class);
        } else if (day.equalsIgnoreCase("wednesday")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Wednesday.class);
        } else if (day.equalsIgnoreCase("thursday")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Thursday.class);
        } else if (day.equalsIgnoreCase("friday")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Friday.class);
        } else if (day.equalsIgnoreCase("saturday")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Saturday.class);
        } else if (day.equalsIgnoreCase("sunday")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Sunday.class);
        } else if (day.equalsIgnoreCase("other")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Other.class);
        } else if (day.equalsIgnoreCase("unknown")) {
            return objectMapper.readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("https://api.jikan.moe/v3/schedule/" + day).build()).execute().body()).string())).toJSONString(), Unknown.class);
        }
        System.out.println("ERROR, Invalid input");
        return null;
    }

}
