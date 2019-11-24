package com.negelec.app.productos.model;

public class PushMessageModel {

	private String to;
	private CuerpoNotificacion notification;
	private DatosNotificaciones data;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public CuerpoNotificacion getNotification() {
		return notification;
	}

	public void setNotification(CuerpoNotificacion notification) {
		this.notification = notification;
	}

	public DatosNotificaciones getData() {
		return data;
	}

	public void setData(DatosNotificaciones data) {
		this.data = data;
	}

}
