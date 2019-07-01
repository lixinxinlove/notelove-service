package com.lixinxinlove.notelove.dataobject;

public class NoteDO {
    private Integer id;

    private Integer userId;

    private String title;

    private Integer theme;

    private String info;

    private Long time;

    private Long editTime;

    private Integer status;

    private Boolean flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getEditTime() {
        return editTime;
    }

    public void setEditTime(Long editTime) {
        this.editTime = editTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "NoteDO{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", theme=" + theme +
                ", info='" + info + '\'' +
                ", time=" + time +
                ", editTime=" + editTime +
                ", status=" + status +
                ", flag=" + flag +
                '}';
    }
}