package model;

import java.sql.Date;

public class Client extends Person{
	private int id;
	private int idrate;
	private Date firstClassDate;
	private Date lastClassDate;
	
	
	public Client() {
		super();
		id = 0;
		idrate = 0;
		firstClassDate = null;
		lastClassDate = null;		
	}
	
	public Client(String name, String lastname, String bloodType, Date birthday, String phoneNumber,
			String email, String adress,Boolean isActive, int id, int idrate, Date firstClassDate, Date lastClassDate) {
		super(name,lastname,bloodType,birthday,phoneNumber,email,adress,isActive);
		this.id = id;
		this.idrate = idrate;
		this.firstClassDate = firstClassDate;
		this.lastClassDate = lastClassDate;
	}

	public Client(String name, String lastname, String bloodType, Date birthday, String phoneNumber,
			String email, String adress,Boolean isActive, int idrate, Date firstClassDate, Date lastClassDate) {
		super(name,lastname,bloodType,birthday,phoneNumber,email,adress,isActive);
		this.idrate = idrate;
		this.firstClassDate = firstClassDate;
		this.lastClassDate = lastClassDate;
	}
	public int getId() {
		return id;
	}

	public int getIdRate() {
		return this.idrate;
	}
	
	public Date getFirstClassDate() {
		return firstClassDate;
	}

	public Date getLastClassDate() {
		return lastClassDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}
	
	
	// super getters
	public String getName() {
		return super.name;
	}
	
	public String getLastname() {
		return super.lastname;
	}
	
	public String getBloodType() {
		return super.bloodType;
	}
	
	public Date getBirthday() {		
		return super.birthday;
	}
	
	public String getPhoneNumber() {
		return super.phoneNumber;
	}
	
	public String getEmail() {
		return super.email;
	}
	
	public String getAdress() {
		return super.adress;
	}
	
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setIdRate(int idrate) {
		this.idrate = idrate;
	}
	
	public void setFirstClassDate(Date firstClassDate) {
		this.firstClassDate = firstClassDate;
	}

	public void setLastClassDate(Date lastClassDate) {
		this.lastClassDate = lastClassDate;
	}

	public void setName(String name) {
		super.name = name;
	}
	
	public void setLastname(String lastname) {
		super.lastname = lastname;
	}
	
	public void setBloodtype(String bloodtype) {
		super.bloodType = bloodtype;
	}
	
	public void setBirthday(Date birthday) {
		super.birthday = birthday;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		super.phoneNumber = phoneNumber;
	}
	
	public void setEmail(String email) {
		super.email = email;
	}
	
	public void setAdress(String adress) {
		super.adress = adress;
	}

	public void setActive(Boolean status) {
		super.isActive = status;
	}
}
