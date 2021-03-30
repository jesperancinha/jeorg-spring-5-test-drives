package org.jesperancinha.std.app2.scrap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table
public class Scrapbook {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;

    private ScrapbookType scrapbookType;

    private Integer pages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScrapbookType getScrapbookType() {
        return scrapbookType;
    }

    public void setScrapbookType(ScrapbookType scrapbookType) {
        this.scrapbookType = scrapbookType;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Scrapbook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scrapbookType=" + scrapbookType +
                ", pages=" + pages +
                '}';
    }
}
