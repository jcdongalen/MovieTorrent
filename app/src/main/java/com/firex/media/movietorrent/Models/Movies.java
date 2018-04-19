package com.firex.media.movietorrent.Models;

import java.util.List;

public class Movies {
    private String status;
    private String status_message;
    private Data data;
    private Meta meta;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public class Data{
        private int moview_count;
        private int limit;
        private int page_number;
        private List<MovieDetails> movies;

        public int getMoview_count() {
            return moview_count;
        }

        public void setMoview_count(int moview_count) {
            this.moview_count = moview_count;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getPage_number() {
            return page_number;
        }

        public void setPage_number(int page_number) {
            this.page_number = page_number;
        }

        public List<MovieDetails> getMovies() {
            return movies;
        }

        public void setMovies(List<MovieDetails> movies) {
            this.movies = movies;
        }
    }

    public class Meta{
        private float server_time;
        private String server_timezone;
        private int api_version;
        private String execution_time;

        public float getServer_time() {
            return server_time;
        }

        public void setServer_time(float server_time) {
            this.server_time = server_time;
        }

        public String getServer_timezone() {
            return server_timezone;
        }

        public void setServer_timezone(String server_timezone) {
            this.server_timezone = server_timezone;
        }

        public int getApi_version() {
            return api_version;
        }

        public void setApi_version(int api_version) {
            this.api_version = api_version;
        }

        public String getExecution_time() {
            return execution_time;
        }

        public void setExecution_time(String execution_time) {
            this.execution_time = execution_time;
        }
    }
}
