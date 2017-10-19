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

import org.hibernate.annotations.ColumnDefault;

import com.future.bbetter.member.model.Member;

/**
 * ScheduleOwner generated by hbm2java
 */
@Entity
@Table(name = "schedule_owner", catalog = "bbetter")
public class ScheduleOwner implements java.io.Serializable {

	private Long scheduleOwnerId;
	private Member member;
	private int isValid;
	private Date createdate;
	private Date updatedate;
	private Set<ScheduleReport> scheduleReports = new HashSet<ScheduleReport>(0);
	private Set<ScheduleHad> scheduleHads = new HashSet<ScheduleHad>(0);

	public ScheduleOwner() {
	}

	public ScheduleOwner(Member member, int isValid) {
		this.member = member;
		this.isValid = isValid;
	}

	public ScheduleOwner(Member member, int isValid, Date createdate, Date updatedate,
			Set<ScheduleReport> scheduleReports, Set<ScheduleHad> scheduleHads) {
		this.member = member;
		this.isValid = isValid;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.scheduleReports = scheduleReports;
		this.scheduleHads = scheduleHads;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "schedule_owner_id", unique = true, nullable = false)
	public Long getScheduleOwnerId() {
		return this.scheduleOwnerId;
	}

	public void setScheduleOwnerId(Long scheduleOwnerId) {
		this.scheduleOwnerId = scheduleOwnerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", nullable = false)
	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@Column(name = "is_valid", nullable = false)
	@ColumnDefault("1")
	public int getIsValid() {
		return this.isValid;
	}

	public void setIsValid(int isValid) {
		this.isValid = isValid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdate", length = 19)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updatedate", length = 19)
	public Date getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "scheduleOwner")
	public Set<ScheduleReport> getScheduleReports() {
		return this.scheduleReports;
	}

	public void setScheduleReports(Set<ScheduleReport> scheduleReports) {
		this.scheduleReports = scheduleReports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "scheduleOwner")
	public Set<ScheduleHad> getScheduleHads() {
		return this.scheduleHads;
	}

	public void setScheduleHads(Set<ScheduleHad> scheduleHads) {
		this.scheduleHads = scheduleHads;
	}

}