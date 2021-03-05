package org.jesperancinha.std.flash320.bean.required.domain;

import org.springframework.beans.factory.annotation.Required;

public class People {
    public String slogan;

    public Boolean homesick;

    public String coldAs;

    public People() {
    }

    public People(String slogan, Boolean homesick, String coldAs) {
        this.slogan = slogan;
        this.homesick = homesick;
        this.coldAs = coldAs;
    }

    public String getSlogan() {
        return slogan;
    }

    @Required
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Boolean getHomesick() {
        return homesick;
    }

    @Required
    public void setHomesick(Boolean homesick) {
        this.homesick = homesick;
    }

    public String getColdAs() {
        return coldAs;
    }

    @Required
    public void setColdAs(String coldAs) {
        this.coldAs = coldAs;
    }

    @Override
    public String toString() {
        return "People{" +
                "slogan='" + slogan + '\'' +
                ", homesick=" + homesick +
                ", coldAs='" + coldAs + '\'' +
                '}';
    }
}
