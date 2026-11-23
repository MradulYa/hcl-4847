package org.abes.hrmsdatabse.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name="attendance")
public class Attendance {

    public Attendance(){

    }

    @Id
@Column(name="attendanceid", nullable = false, unique = true)
@GeneratedValue(strategy = GenerationType.IDENTITY)

private long attendanceId;

@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "empid")
private Employee employee;
@Column(nullable = false)
private LocalDate attendancedate;

private LocalDateTime inTime;
private LocalDateTime outTime;

    public Attendance(long attendanceId, Employee employee, LocalDate attendancedate, LocalDateTime inTime, LocalDateTime outTime, String comment) {
        this.attendanceId = attendanceId;
        this.employee = employee;
        this.attendancedate = attendancedate;
        this.inTime = inTime;
        this.outTime = outTime;
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getAttendancedate() {
        return attendancedate;
    }

    public void setAttendancedate(LocalDate attendancedate) {
        this.attendancedate = attendancedate;
    }

    public LocalDateTime getInTime() {
        return inTime;
    }

    public void setInTime(LocalDateTime inTime) {
        this.inTime = inTime;
    }

    public LocalDateTime getOutTime() {
        return outTime;
    }

    public void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }

    private String comment;



}
