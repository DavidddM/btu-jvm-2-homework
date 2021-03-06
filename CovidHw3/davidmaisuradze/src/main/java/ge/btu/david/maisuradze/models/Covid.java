package ge.btu.david.maisuradze.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Covid {
    public Covid(String country, int confirmed, int death, int recovered) {
        this.country = country;
        this.confirmed = confirmed;
        this.death = death;
        this.recovered = recovered;
    }

    public Covid() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    String country;
    int confirmed;
    int death;
    int recovered;
}
