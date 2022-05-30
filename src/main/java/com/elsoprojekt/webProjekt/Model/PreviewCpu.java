package com.elsoprojekt.webProjekt.Model;

import javax.persistence.*;

@Entity
@Table(name="previewCpu")
public class PreviewCpu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Title;

    @Column(name ="url")
    private String url;

    @Column (name="price")
    private int price;

    @Column (name ="cores")
    private int cores;

    @Column(name ="clock")
    private String clock;

    @Column(name = "socket")
    private String socket;

    public PreviewCpu() {

    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
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
        return "Preview [id=" + id + "+Title=" + Title + "+url="+ url +"price="+ price + "cores =" +cores+ "clock="+clock+"socket="+socket+"]";
    }
}
