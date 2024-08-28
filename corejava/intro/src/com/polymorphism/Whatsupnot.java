package com.polymorphism;
class Notification{
	public void sendNotification() {
		System.out.println("its a normal message");
	}
}
class EmailNoti extends Notification{
	public void sendNotification() {
		System.out.println("its a email message");
	}
}
public class Whatsupnot extends Notification{
	public void sendNotification() {
		System.out.println("its a whatsupgi message");
	}
	public static void main(String[] args) {
		Notification n=new Notification();
		Notification wn=new Whatsupnot();
		Notification en=new EmailNoti();
		n.sendNotification();
		en.sendNotification();
		wn.sendNotification();
	}
}
