package com.future.bbetter.schedule.model;
// Generated 2017/10/14 上午 11:25:08 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;

/**
 * ScheduleRemind generated by hbm2java
 */
@Entity
@Table(name = "schedule_remind", catalog = "bbetter")
public class ScheduleRemind implements java.io.Serializable {

	private Long scheduleRemindId;
	private ScheduleHad scheduleHad;
	private Date remindTime;
	private int remindWay;
	private String remark;

	public ScheduleRemind() {
	}

	public ScheduleRemind(ScheduleHad scheduleHad, Date remindTime, int remindWay) {
		this.scheduleHad = scheduleHad;
		this.remindTime = remindTime;
		this.remindWay = remindWay;
	}

	public ScheduleRemind(ScheduleHad scheduleHad, Date remindTime, int remindWay, String remark) {
		this.scheduleHad = scheduleHad;
		this.remindTime = remindTime;
		this.remindWay = remindWay;
		this.remark = remark;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "schedule_remind_id", unique = true, nullable = false)
	public Long getScheduleRemindId() {
		return this.scheduleRemindId;
	}

	public void setScheduleRemindId(Long scheduleRemindId) {
		this.scheduleRemindId = scheduleRemindId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schedule_had_id", nullable = false)
	public ScheduleHad getScheduleHad() {
		return this.scheduleHad;
	}

	public void setScheduleHad(ScheduleHad scheduleHad) {
		this.scheduleHad = scheduleHad;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "remind_time", nullable = false, length = 19)
	public Date getRemindTime() {
		return this.remindTime;
	}

	public void setRemindTime(Date remindTime) {
		this.remindTime = remindTime;
	}

	@Column(name = "remind_way", nullable = false)
	@ColumnDefault("1")
	public int getRemindWay() {
		return this.remindWay;
	}

	public void setRemindWay(int remindWay) {
		this.remindWay = remindWay;
	}

	@Column(name = "remark", length = 200)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
