package com.lcichy16.BetterDuolingo.model;

import java.util.Date;

public class Lesson {

    private Long id;
    private String title; // Tytuł lekcji
    private String description; // Opis lekcji
    private String language; // Język lekcji
    private Date creationDate; // Data stworzenia lekcji
    private int difficultyLevel; // Poziom trudności lekcji
    private boolean isCompleted; // Czy lekcja została ukończona

    // Konstruktor bezargumentowy
    public Lesson() {
    }

    // Konstruktor z wszystkimi polami
    public Lesson(Long id, String title, String description, String language, Date creationDate, int difficultyLevel, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.language = language;
        this.creationDate = creationDate;
        this.difficultyLevel = difficultyLevel;
        this.isCompleted = isCompleted;
    }

    // Gettery i settery

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
