package models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Ronja on 2018-12-04.
 */
@Entity
@Table(name = "city", schema = "world", catalog = "")
public class City implements Serializable {
    private int id;
    private String name;
    private String district;
    private int population;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "District")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "Population")
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
