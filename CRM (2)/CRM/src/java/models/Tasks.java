/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Tasks {
    private int id;
    private String name;
    private Date start_date;
    private Date end_date;
    private int user_id;
    private int job_id;
    private int status_id;
    private String user_name;
    private String job_name;
    private String status_name;

    public Tasks() {
    }

    public Tasks(int id, String name, Date start_date, Date end_date, int user_id, int job_id, int status_id, String user_name, String job_name, String status_name) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.user_id = user_id;
        this.job_id = job_id;
        this.status_id = status_id;
        this.user_name = user_name;
        this.job_name = job_name;
        this.status_name = status_name;
    }

    
    public Tasks(int id, String name, Date start_date, Date end_date, int user_id, int job_id, int status_id) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.user_id = user_id;
        this.job_id = job_id;
        this.status_id = status_id;
    }

    public Tasks(String name, Date start_date, Date end_date, int user_id, int job_id, int status_id) {
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.user_id = user_id;
        this.job_id = job_id;
        this.status_id = status_id;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }
    
    
}
