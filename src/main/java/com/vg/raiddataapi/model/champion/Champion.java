package com.vg.raiddataapi.model.champion;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Champion {

    @Id
    private int id;
    private String name;
    private String affinity;
    private String role;
    private String faction;
    private String rarity;
    private int health;
    private int attack;
    private int defense;
    private int speed;
    private int resistance;
    private int accuracy;
    private int criticalChance;
    private int criticalDamage;
    private int criticalHeal;

    public Champion() {}

    public Champion(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.affinity = builder.affinity;
        this.role = builder.role;
        this.faction = builder.faction;
        this.rarity = builder.rarity;
        this.health = builder.health;
        this.attack = builder.attack;
        this.defense = builder.defense;
        this.speed = builder.speed;
        this.resistance = builder.resistance;
        this.accuracy = builder.accuracy;
        this.criticalChance = builder.criticalChance;
        this.criticalDamage = builder.criticalDamage;
        this.criticalHeal = builder.criticalHeal;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getAffinity() { return affinity; }

    public String getRole() { return role; }

    public String getFaction() { return faction; }

    public String getRarity() { return rarity; }

    public int getHealth() { return health; }

    public int getAttack() { return attack; }

    public int getDefense() { return defense; }

    public int getSpeed() { return speed; }

    public int getResistance() { return resistance; }

    public int getAccuracy() { return accuracy; }

    public int getCriticalChance() { return criticalChance; }

    public int getCriticalDamage() { return criticalDamage; }

    public int getCriticalHeal() { return criticalHeal; }

    public void setId(int id) {this.id = id;}

    public void setName(String name) {this.name = name;}

    public void setAffinity(String affinity) {this.affinity = affinity;}

    public void setRole(String role) {this.role = role;}

    public void setFaction(String faction) {this.faction = faction;}

    public void setRarity(String rarity) {this.rarity = rarity;}

    public void setHealth(int health) {this.health = health;}

    public void setAttack(int attack) {this.attack = attack;}

    public void setDefense(int defense) {this.defense = defense;}

    public void setSpeed(int speed) {this.speed = speed;}

    public void setResistance(int resistance) {this.resistance = resistance;}

    public void setAccuracy(int accuracy) {this.accuracy = accuracy;}

    public void setCriticalChance(int criticalChance) {this.criticalChance = criticalChance;}

    public void setCriticalDamage(int criticalDamage) {this.criticalDamage = criticalDamage;}

    public void setCriticalHeal(int criticalHeal) {this.criticalHeal = criticalHeal;}

    @Override
    public String toString() {
        return "Champion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", affinity=" + affinity +
                ", role=" + role +
                ", faction=" + faction +
                ", rarity=" + rarity +
                ", health=" + health +
                ", attack=" + attack +
                ", defense=" + defense +
                ", speed=" + speed +
                ", resistance=" + resistance +
                ", accuracy=" + accuracy +
                ", criticalChance=" + criticalChance +
                ", criticalDamage=" + criticalDamage +
                ", criticalHeal=" + criticalHeal +
                '}';
    }

    public static class Builder {

        private int id;
        private String name;
        private String affinity;
        private String role;
        private String faction;
        private String rarity;
        private int health;
        private int attack;
        private int defense;
        private int speed;
        private int resistance;
        private int accuracy;
        private int criticalChance;
        private int criticalDamage;
        private int criticalHeal;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAffinity(String affinity) {
            this.affinity = affinity;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public Builder setFaction(String faction) {
            this.faction = faction;
            return this;
        }

        public Builder setRarity(String rarity) {
            this.rarity = rarity;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setAttack(int attack) {
            this.attack = attack;
            return this;
        }

        public Builder setDefense(int defense) {
            this.defense = defense;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setResistance(int resistance) {
            this.resistance = resistance;
            return this;
        }

        public Builder setAccuracy(int accuracy) {
            this.accuracy = accuracy;
            return this;
        }

        public Builder setCriticalChance(int criticalChance) {
            this.criticalChance = criticalChance;
            return this;
        }

        public Builder setCriticalDamage(int criticalDamage) {
            this.criticalDamage = criticalDamage;
            return this;
        }

        public Builder setCriticalHeal(int criticalHeal) {
            this.criticalHeal = criticalHeal;
            return this;
        }

        public Champion build() {
            return new Champion(this);
        }
    }
}