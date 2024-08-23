package com.lcichy16.BetterDuolingo.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserProgress {

    private Long userId;
    private Map<Long, Progress> lessonProgressMap;

    public UserProgress(Long userId) {
        this.userId = userId;
        this.lessonProgressMap = new HashMap<>();
    }

    public void updateProgress(Long lessonId, int score, boolean isCompleted, Date completionDate) {
        lessonProgressMap.put(lessonId, new Progress(score, isCompleted, completionDate));
    }

    public Progress getProgress(Long lessonId) {
        return lessonProgressMap.get(lessonId);
    }

    public static class Progress {
        private int score;
        private boolean isCompleted;
        private Date completionDate;

        public Progress(int score, boolean isCompleted, Date completionDate) {
            this.score = score;
            this.isCompleted = isCompleted;
            this.completionDate = completionDate;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public void setCompleted(boolean completed) {
            isCompleted = completed;
        }

        public Date getCompletionDate() {
            return completionDate;
        }

        public void setCompletionDate(Date completionDate) {
            this.completionDate = completionDate;
        }
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Map<Long, Progress> getLessonProgressMap() {
        return lessonProgressMap;
    }

    public void setLessonProgressMap(Map<Long, Progress> lessonProgressMap) {
        this.lessonProgressMap = lessonProgressMap;
    }
}
