package com.future.bbetter.pet.model;
// Generated 2017/10/14 上午 11:25:08 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.future.bbetter.member.model.Member;

/**
 * PetsHad generated by hbm2java
 */
@Entity
@Table(name = "pets_had", catalog = "bbetter")
public class PetsHad implements java.io.Serializable {

	private Integer petsHadId;
	private Member member;
	private Pet pet;
	private String nickname;
	private float isCurrent;
	private float height;
	private float weight;
	private float vision;
	private float hp;
	private float mp;
	private float mentality;
	private float strength;
	private float intelligence;
	private float dexterity;
	private float vitality;
	private float isDeath;

	public PetsHad() {
	}

	public PetsHad(Member member, Pet pet, float isCurrent, float height, float weight, float vision, float hp,
			float mp, float mentality, float strength, float intelligence, float dexterity, float vitality,
			float isDeath) {
		this.member = member;
		this.pet = pet;
		this.isCurrent = isCurrent;
		this.height = height;
		this.weight = weight;
		this.vision = vision;
		this.hp = hp;
		this.mp = mp;
		this.mentality = mentality;
		this.strength = strength;
		this.intelligence = intelligence;
		this.dexterity = dexterity;
		this.vitality = vitality;
		this.isDeath = isDeath;
	}

	public PetsHad(Member member, Pet pet, String nickname, float isCurrent, float height, float weight, float vision,
			float hp, float mp, float mentality, float strength, float intelligence, float dexterity, float vitality,
			float isDeath) {
		this.member = member;
		this.pet = pet;
		this.nickname = nickname;
		this.isCurrent = isCurrent;
		this.height = height;
		this.weight = weight;
		this.vision = vision;
		this.hp = hp;
		this.mp = mp;
		this.mentality = mentality;
		this.strength = strength;
		this.intelligence = intelligence;
		this.dexterity = dexterity;
		this.vitality = vitality;
		this.isDeath = isDeath;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "pets_had_id", unique = true, nullable = false)
	public Integer getPetsHadId() {
		return this.petsHadId;
	}

	public void setPetsHadId(Integer petsHadId) {
		this.petsHadId = petsHadId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_id", nullable = false)
	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pet_id", nullable = false)
	public Pet getPet() {
		return this.pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Column(name = "nickname", length = 60)
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "is_current", nullable = false, precision = 6, scale = 3)
	public float getIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(float isCurrent) {
		this.isCurrent = isCurrent;
	}

	@Column(name = "height", nullable = false, precision = 6, scale = 3)
	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Column(name = "weight", nullable = false, precision = 6, scale = 3)
	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Column(name = "vision", nullable = false, precision = 6, scale = 3)
	public float getVision() {
		return this.vision;
	}

	public void setVision(float vision) {
		this.vision = vision;
	}

	@Column(name = "hp", nullable = false, precision = 6, scale = 3)
	public float getHp() {
		return this.hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	@Column(name = "mp", nullable = false, precision = 6, scale = 3)
	public float getMp() {
		return this.mp;
	}

	public void setMp(float mp) {
		this.mp = mp;
	}

	@Column(name = "mentality", nullable = false, precision = 6, scale = 3)
	public float getMentality() {
		return this.mentality;
	}

	public void setMentality(float mentality) {
		this.mentality = mentality;
	}

	@Column(name = "strength", nullable = false, precision = 6, scale = 3)
	public float getStrength() {
		return this.strength;
	}

	public void setStrength(float strength) {
		this.strength = strength;
	}

	@Column(name = "intelligence", nullable = false, precision = 6, scale = 3)
	public float getIntelligence() {
		return this.intelligence;
	}

	public void setIntelligence(float intelligence) {
		this.intelligence = intelligence;
	}

	@Column(name = "dexterity", nullable = false, precision = 6, scale = 3)
	public float getDexterity() {
		return this.dexterity;
	}

	public void setDexterity(float dexterity) {
		this.dexterity = dexterity;
	}

	@Column(name = "vitality", nullable = false, precision = 6, scale = 3)
	public float getVitality() {
		return this.vitality;
	}

	public void setVitality(float vitality) {
		this.vitality = vitality;
	}

	@Column(name = "is_death", nullable = false, precision = 6, scale = 3)
	@ColumnDefault("0.0")
	public float getIsDeath() {
		return this.isDeath;
	}

	public void setIsDeath(float isDeath) {
		this.isDeath = isDeath;
	}

}
