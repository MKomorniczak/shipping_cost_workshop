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
    @Valid
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
}
