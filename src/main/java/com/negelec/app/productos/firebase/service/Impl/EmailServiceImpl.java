package com.negelec.app.productos.firebase.service.Impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.negelec.app.productos.firebase.conexion.Conexion;
import com.negelec.app.productos.firebase.service.IEmailService;

@Service
public class EmailServiceImpl implements IEmailService {
	@Autowired
	private Conexion conexion;

	@Override
	public String enviarEmail(String mensaje) {
		try {
			conexion.Conectar();

			// This registration token comes from the client FCM SDKs.
			String registrationToken = "eCHD99Rq3sk:APA91bG5ylkYs2mr7IMiE7oOu0JDHBHq710eCmXYrN79jzCKfinydvWoSI15PUndxbKU3kRJsSCXFvvveD0Pk9D3Xlpz23XYGyKSwgfC0sfur6ZUpxYAWKvA7BFYvnzHVMEclHz1X0WC";

			// See documentation on defining a message payload.
			Message message = Message.builder().putData("mensaje", mensaje).setToken(registrationToken).build();

			// Send a message to the device corresponding to the provided
			// registration token.

			String response;
			response = FirebaseMessaging.getInstance().send(message);
			// Response is a message ID string.
			return "Successfully sent message: " + response;
		} catch (IOException e) {
			System.out.println(e);
			return "Error while trying to send the message";
		} catch (FirebaseMessagingException e) {
			System.out.println(e);
			return "Error while trying to send the message";
		}
	}

}
