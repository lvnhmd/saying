package com.saying.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Saying", schema = "Sayings")
public class Saying {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@NotNull
	@Column(name = "Saying")
	private String content;

	public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
