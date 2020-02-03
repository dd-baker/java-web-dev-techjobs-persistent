package org.launchcode.javawebdevtechjobspersistent.models;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @Valid
    public Skill(){}

    @ManyToMany(mappedBy="skill")
    private final List<Job> jobs = new ArrayList<>();

    @Size(min=1, max=250)
    @NotBlank
    private String description;

    public Skill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}