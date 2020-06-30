package com.dxc.com.manytomanyby2;
  import java.util.Set;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.JoinTable;
	import javax.persistence.ManyToMany;
	import javax.persistence.Table;

	@Entity
	@Table(name="emp_m2m")
	public class Employee {
		@Id
		@Column(name="emp_id")
		private long id;
		
		@Column(name="first_name")
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		private double salary;
		
		@ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(name="Employee_Meeting", 
			joinColumns = {@JoinColumn(name="emp_id")},
			inverseJoinColumns = {@JoinColumn(name="meeting_id")})
		private Set<Meeting> meetings = new HashSet<Meeting>();
		
		
		public Employee(long id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Set<Meeting> getMeetings() {
			return meetings;
		}
		public void setMeetings(Set<Meeting> meetings) {
			this.meetings = meetings;
		}
		
		
		
	}



