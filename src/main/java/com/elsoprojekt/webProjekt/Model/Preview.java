package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;

@Entity
@Table(name="previewGpu")
public class Preview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Title;

    @Column(name ="url")
    private String url;

    @Column (name="price")
    private int price;

    @Column (name ="memory")
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Preview(){

    }

    public Preview(String title, Byte[] cover) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    @Override
    public String toString() {
        return "Preview [id=" + id + "+Title=" + Title + "+url="+ url +"price="+ price + "memory =" +memory+"]";
    }
}
