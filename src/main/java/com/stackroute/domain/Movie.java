package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

   Actor actor;


    public Movie() {
        System.out.println("Constructor");
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie(Actor actor) {
        this.actor=actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

}
