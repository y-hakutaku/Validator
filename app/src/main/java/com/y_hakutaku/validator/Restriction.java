package com.y_hakutaku.validator;

/**
 * Created by shirasawayoshiyasu on 2017/06/18.
 */

public class Restriction {
    private String key = null;
    private String regex = null;
    private Integer min = 0; //String
    private Integer max = Integer.MAX_VALUE; //String
    private Integer min_length = 0;
    private Integer max_length = 0;
    private Long min_size = 0L;
    private Long max_size = Long.MAX_VALUE;
    private boolean mandatory = false;

    protected Restriction(String key, String regex, Integer min, Integer max, Integer min_length, Integer max_length, Long min_size, Long max_size, boolean mandatory) {
        this.key = key;
        this.regex = regex;
        this.min = min;
        this.max = max;
        this.min_length = min_length;
        this.max_length = max_length;
        this.min_size = min_size;
        this.max_size = max_size;
        this.mandatory = mandatory;
    }

    protected String getKey(){
        return key;
    }

    protected String getRegex() {
        return regex;
    }

    protected Integer getMin() {
        return min;
    }

    protected Integer getMax() {
        return max;
    }

    protected Integer getMin_length() {
        return min_length;
    }

    protected Integer getMax_length() {
        return max_length;
    }

    protected Long getMin_size() {
        return min_size;
    }

    protected Long getMax_size() {
        return max_size;
    }

    protected boolean getMandatory() {
        return mandatory;
    }
}
