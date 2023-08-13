package com.bank;

public class MyAccount
{
   private String name, ifsc;
   private long phone, accountno;
   private double bal;
   private int pin;
   
   public MyAccount(String name, String ifsc, long phone, long accountno, double bal, int pin)

{
	super();
	this.name = name;
	this.ifsc = ifsc;
	this.phone = phone;
	this.accountno = accountno;
	this.bal = bal;
	this.pin = pin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public long getAccountno() {
	return accountno;
}
public void setAccountno(long accountno) {
	this.accountno = accountno;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
   
}
