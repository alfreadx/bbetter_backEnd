package com.future.bbetter.schedule.model;
// Generated 2017/10/14 上午 11:25:08 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ScheduleSubType generated by hbm2java
 */
@Entity
@Table(name = "schedule_sub_type", catalog = "bbetter")
public class ScheduleSubType implements java.io.Serializable {

	private Integer scheduleSubTypeId;
	private ScheduleType scheduleType;
	private String name;
	private Date createdate;
	private Set<Schedule> schedules = new HashSet<Schedule>(0);

	public ScheduleSubType() {
	}

	public ScheduleSubType(ScheduleType scheduleType, String name) {
		this.scheduleType = scheduleType;
		this.name = name;
	}

	public ScheduleSubType(ScheduleType scheduleType, String name, Date createdate, Set<Schedule> schedules) {
		this.scheduleType = scheduleType;
		this.name = name;
		this.createdate = createdate;
		this.schedules = schedules;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "schedule_sub_type_id", unique = true, nullable = false)
	public Integer getScheduleSubTypeId() {
		return this.scheduleSubTypeId;
	}

	public void setScheduleSubTypeId(Integer scheduleSubTypeId) {
		this.scheduleSubTypeId = scheduleSubTypeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schedule_type_id", nullable = false)
	public ScheduleType getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(ScheduleType scheduleType) {
		this.scheduleType = scheduleType;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdate", length = 19)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "scheduleSubType")
	public Set<Schedule> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(Set<Schedule> schedules) {
		this.schedules = schedules;
	}

}
