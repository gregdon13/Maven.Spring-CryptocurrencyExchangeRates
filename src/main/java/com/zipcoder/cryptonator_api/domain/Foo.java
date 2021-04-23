package com.zipcoder.cryptonator_api.domain;

/**
 * Created by leon on 1/22/18.
 */
public class Foo {
    String base;
    String target;
    Float price;
    Float volume;
    Float change;
    Long timestamp;
    Boolean success;
    String error;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }

    public Float getChange() {
        return change;
    }

    public void setChange(Float change) {
        this.change = change;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
