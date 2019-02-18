package com.bw.djr2019218.model;

import java.util.ArrayList;

/**
 * @Auther: 董建茹
 * @Date: 2019/2/18 09:04:29
 * @Description:
 */
public class JavaBean2 {
    private ArrayList<String> albums;
    private String burden;
    private String id;
    private String imtro;
    private String ingredients;
    private ArrayList<JavaBean1> steps;
    private String tags;
    private String title;

    public JavaBean2(ArrayList<String> albums, String burden, String id, String imtro, String ingredients, ArrayList<JavaBean1> steps, String tags, String title) {
        this.albums = albums;
        this.burden = burden;
        this.id = id;
        this.imtro = imtro;
        this.ingredients = ingredients;
        this.steps = steps;
        this.tags = tags;
        this.title = title;
    }

    public JavaBean2() {
    }

    public ArrayList<String> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = albums;
    }

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImtro() {
        return imtro;
    }

    public void setImtro(String imtro) {
        this.imtro = imtro;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<JavaBean1> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<JavaBean1> steps) {
        this.steps = steps;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "JavaBean2{" +
                "albums=" + albums +
                ", burden='" + burden + '\'' +
                ", id='" + id + '\'' +
                ", imtro='" + imtro + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", steps=" + steps +
                ", tags='" + tags + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
