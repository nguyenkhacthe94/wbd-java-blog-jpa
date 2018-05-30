package com.blog.model;

public class Blog {
    private Long id;
    private String title;
    private String summary;
    private String content;

    public Blog() {
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, title='%s', summary='%s', content='%s]", id, title, summary, content);
    }

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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Blog(Long id, String title, String summary, String content) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.content = content;
    }


}
