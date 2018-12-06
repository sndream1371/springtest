package com.example.board.dto;


import java.util.Date;
 
public class BoardVO {
    private int bno;            // �Խñ� ��ȣ
    private String title;       // �Խñ� ����
    private String content;     // �Խñ� ����
    private String writer;      // �Խñ� �ۼ���
    private Date regdate;       // �Խñ� �ۼ����� util.Date
    private int viewcnt;        // �Խñ� ��ȸ��
    
    
    // Getter/Setter
    public int getBno() {
        return bno;
    }
    public void setBno(int bno) {
        this.bno = bno;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public Date getRegdate() {
        return regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    public int getViewcnt() {
        return viewcnt;
    }
    public void setViewcnt(int viewcnt) {
        this.viewcnt = viewcnt;
    }
    // toString()
    @Override
    public String toString() {
        return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
                + regdate + ", viewcnt=" + viewcnt + "]";
    }
    
}