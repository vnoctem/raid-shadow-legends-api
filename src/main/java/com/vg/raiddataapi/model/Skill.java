package com.vg.raiddataapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Skill {

    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="champion_id")
    @JsonIgnore
    private Champion champion;

    private int revision;
    private String name;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String description;

    private int cooldown;

    @Column(length = 2000)
    private String multiplierFormula;

    private int visibility;

    @Column(name="`group`")
    private int group;

    public Skill() {}

    public int getId() { return id; }

    public int getRevision() { return revision; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public int getCooldown() { return cooldown; }

    public String getMultiplierFormula() { return multiplierFormula; }

    public int getVisibility() { return visibility; }

    public int getGroup() { return group; }

    public Champion getChampion() { return champion; }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", revision=" + revision +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cooldown=" + cooldown +
                ", multiplierFormula='" + multiplierFormula + '\'' +
                ", visibility=" + visibility +
                ", group=" + group +
                '}';
    }
}