package com.dxc.com.manytomanyby2;


	import java.time.LocalDate;
	import java.util.HashSet;
	import java.util.Set;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.ManyToMany;
	import javax.persistence.Table;

	@Entity
	@Table(name="meetings_m2m")
	public class Meeting {
		@Id
		@Column(name="meeting_id")
		private long meetingId;
		private String subject;
		private LocalDate meetingDate;
		
		@ManyToMany(mappedBy = "meetings")  // key for this relationship is on the other relation - Employee - so don't create new table using this mapping
		private Set<Employee> employees = new HashSet<Employee>();
			
		
		public Meeting(long meetingId, String subject, LocalDate meetingDate) {
			super();
			this.meetingId = meetingId;
			this.subject = subject;
			this.meetingDate = meetingDate;
		}

		public long getMeetingId() {
			return meetingId;
		}

		public void setMeetingId(long meetingId) {
			this.meetingId = meetingId;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public LocalDate getMeetingDate() {
			return meetingDate;
		}

		public void setMeetingDate(LocalDate meetingDate) {
			this.meetingDate = meetingDate;
		}

}
