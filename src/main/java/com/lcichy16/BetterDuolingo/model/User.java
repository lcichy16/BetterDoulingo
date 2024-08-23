package com.lcichy16.BetterDuolingo.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class User {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String languageLearning; // Język, którego się uczy
    private String role; // Rola użytkownika, np. ADMIN, USER
    private Date registrationDate;
    private int experiencePoints; // Punkty doświadczenia
    private int level; // Poziom użytkownika
    private Set<String> completedLessons = new HashSet<>(); // Ukończone lekcje (przechowywane jako identyfikatory lekcji)
    private Set<String> achievements = new HashSet<>(); // Osiągnięcia użytkownika (przechowywane jako identyfikatory osiągnięć)
    private String bio; // Krótkie bio użytkownika
    private boolean isActive; // Czy konto jest aktywne
    private Date lastLoginDate;

    // Konstruktor bezargumentowy
    public User() {
    }

    // Konstruktor z wszystkimi polami
    public User(Long id, String username, String email, String password, String firstName, String lastName,
                Date dateOfBirth, String languageLearning, String role, Date registrationDate,
                int experiencePoints, int level, Set<String> completedLessons, Set<String> achievements,
                String bio, boolean isActive, Date lastLoginDate) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.languageLearning = languageLearning;
        this.role = role;
        this.registrationDate = registrationDate;
        this.experiencePoints = experiencePoints;
        this.level = level;
        this.completedLessons = completedLessons;
        this.achievements = achievements;
        this.bio = bio;
        this.isActive = isActive;
        this.lastLoginDate = lastLoginDate;
    }

    // Gettery i settery

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLanguageLearning() {
        return languageLearning;
    }

    public void setLanguageLearning(String languageLearning) {
        this.languageLearning = languageLearning;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Set<String> getCompletedLessons() {
        return completedLessons;
    }

    public void setCompletedLessons(Set<String> completedLessons) {
        this.completedLessons = completedLessons;
    }

    public Set<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(Set<String> achievements) {
        this.achievements = achievements;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
