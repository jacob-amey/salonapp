package edu.secourse.salonapp.models;

// this holds all the info for one appointment
public class Appointment {

  // declares all the variables needed
  
  // the appointment's id
	private int id;

	private Customer customer;
	private Stylist stylist;

	// the appointment date
	private String date;

	// the appointment cancellation var
	private boolean cancelled;

  
	// makes a new appointment with the given info
	public Appointment(int id, Customer customer, Stylist stylist, String date) {
    
    // takes info passed into constructor + stores it in appointment's variables
		this.id = id;
		this.customer = customer;
		this.stylist = stylist;
		this.date = date;
    
    // every appointment starts out not cancelled yet
		this.cancelled = false;
	}

  // getter methods to allow other classes to retrieve info
	// gets the appointment id
	public int getId() {
		return id;
	}

	// gets the customer
	public Customer getCustomer() {
		return customer;
	}

	// gets the stylist
	public Stylist getStylist() {
		return stylist;
	}

	// gets the date
	public String getDate() {
		return date;
	}

	// checks if its cancelled
	public boolean isCancelled() {
		return cancelled;
	}



  // setter methods that allow classes to change aspects of the appointment
	// changes the appointment date
	public void setDate(String date) {
		this.date = date;
	}

	// changes the stylist
	public void setStylist(Stylist stylist) {
		this.stylist = stylist;
	}

  
  // regular method just to cancel the appointment
	public void cancel() {
		cancelled = true;
	}
}
