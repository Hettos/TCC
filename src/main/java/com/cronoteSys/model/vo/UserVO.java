package com.cronoteSys.model.vo;
// Generated 25/06/2018 22:33:40 by Hibernate Tools 4.3.1

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * TbUser generated by hbm2java
 */
@Entity
@Table(name = "tb_user")
public class UserVO implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer idUser;
	private String completeName;
	private LocalDate birthDate;
	private Date registerDate;
	private String emailRecover;
	private byte stats;
	private String avatarPath;
	private Set<UserVO> tbLogins = new HashSet<UserVO>();

	public UserVO() {
	}

	public UserVO(String completeName, LocalDate birthDate, byte stats) {
		this.completeName = completeName;
		this.birthDate = birthDate;
		this.stats = stats;
	}

	public UserVO(Integer id) {
		this.idUser = id;
	}

	public UserVO(Integer id, String completeName, LocalDate birthDate, byte stats) {
		this.idUser = id;
		this.completeName = completeName;
		this.birthDate = birthDate;
		this.stats = stats;
	}

	public UserVO(String completeName, LocalDate birthDate, Date registerDate, String emailRecover, byte stats,
			String avatarPath, Set<UserVO> tbLogins) {
		this.completeName = completeName;
		this.birthDate = birthDate;
		this.registerDate = registerDate;
		this.emailRecover = emailRecover;
		this.stats = stats;
		this.avatarPath = avatarPath;
		this.tbLogins = tbLogins;
	}

	@Id
	@Column(name = "id_user")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdUser() {
		return this.idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	@Column(name = "complete_name", nullable = false)
	public String getCompleteName() {
		return this.completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	@Column(name = "birth_date", nullable = false)
	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_date" )
	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Column(name = "email_recover")
	public String getEmailRecover() {
		return this.emailRecover;
	}

	public void setEmailRecover(String emailRecover) {
		this.emailRecover = emailRecover;
	}

	@Column(name = "stats", nullable = false)
	public byte getStats() {
		return this.stats;
	}

	public void setStats(byte stats) {
		this.stats = stats;
	}

	@Column(name = "avatar_path")
	public String getAvatarPath() {
		return this.avatarPath;
	}

	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
	}

	@OneToMany
	@Fetch(FetchMode.SELECT)
	public Set<UserVO> getTbLogins() {
		return this.tbLogins;
	}

	public void setTbLogins(Set<UserVO> tbLogins) {
		this.tbLogins = tbLogins;
	}

}
