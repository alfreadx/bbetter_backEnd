package com.future.bbetter.member.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.future.bbetter.member.dto.FriendDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ThirdPartAuth.java auto generated by Charles. 2017/10/18 上午 12:53:21
 */
@Entity
@Table(name = "third_part_auth", catalog = "bbetter")
public @Data @NoArgsConstructor class ThirdPartAuth {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "third_part_auth_id")
	private Long thirdPartAuthId;
	@Column(name = "member_id")
	private Long memberId;
	@Column(name = "provider_id")
	private String providerId;
	@Column(name = "source")
	private Integer source;

}
