package se.lexicon.shipping_cost.entity;

import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class Box {
    @Id
    String id;
    @Size(min = 4, max = 20, message = "name length should be between 4 and 20")
    //@Valid
    String name;
    @NotNull(message = "country should not be null")
    String country;
    @NotNull(message = "type should not be null")
    String type;

    double cost;
    @Size(min = 1, message = "weight should not be less than 1")
    double weight;
    @NotNull(message = "weight type should not be null")
    String weightType;

    LocalDateTime createDate;

    boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeightType() {
        return weightType;
    }

    public void setWeightType(String weightType) {
        this.weightType = weightType;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", weightType='" + weightType + '\'' +
                ", createDate=" + createDate +
                ", status=" + status +
                '}';
    }
}
