package com.cgi;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


	@Entity
	@Table(name = "DEMO_FILE", schema = "public")
	public class FileDemo  {

		@Id
		@Column(name = "FILE_ID")
		private int fileId;

		@Column(name = "FILE_NAME")
		private String fileName;

		@Column(name = "OWNER_ID")
		private int ownerId;

		@Column(name = "CREATION_DATE")
		@Temporal(value = TemporalType.TIMESTAMP)
		private Date creationDate;
		
		

		public FileDemo() {
			super();
			// TODO Auto-generated constructor stub
		}

		public FileDemo(int fileId, String fileName, int ownerId, Date creationDate) {
			super();
			this.fileId = fileId;
			this.fileName = fileName;
			this.ownerId = ownerId;
			this.creationDate = creationDate;
		}

		public int getFileId() {
			return fileId;
		}

		public void setFileId(int fileId) {
			this.fileId = fileId;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public int getOwnerId() {
			return ownerId;
		}

		public void setOwnerId(int ownerId) {
			this.ownerId = ownerId;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

	}

