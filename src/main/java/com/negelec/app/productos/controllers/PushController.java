package com.negelec.app.productos.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.negelec.app.productos.model.CuerpoNotificacion;
import com.negelec.app.productos.model.DatosNotificaciones;
import com.negelec.app.productos.model.PushMessageModel;
import com.negelec.app.productos.model.PushNotificationModel;

@RestController
@CrossOrigin
public class PushController {

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/push-notification")
	public String sendPushNotification(@RequestBody PushNotificationModel push) {
		PushMessageModel pmm = new PushMessageModel();
		CuerpoNotificacion cnt = new CuerpoNotificacion();
		DatosNotificaciones dtn = new DatosNotificaciones();
		pmm.setTo(push.getCodCelular());
		cnt.setBody("Se concreto una compra desde nuestra web");
		cnt.setTitle("Nueva Compra");
		dtn.setCodigoUsuario(push.getUsuario());
		dtn.setClick_action("FLUTTER_NOTIFICATION_CLICK");
		pmm.setNotification(cnt);
		pmm.setData(dtn);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "key=AAAALnwfbrQ:APA91bHQoPg8HO05adg6t42y_yUwdI6e0J9uKm1CeGRFZUCwECKuitu-6BCmPVPldtm_QjP_rAQpxcWUfauLgSm22BIgrokwVLE_QUPTvzRx0sToxFE68z5k2c8MBCwNBFJ3EfFXe-ON");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<PushMessageModel> entity = new HttpEntity<PushMessageModel>(pmm, headers);
		System.out.println(entity);
		return restTemplate.exchange("https://fcm.googleapis.com/fcm/send", HttpMethod.POST, entity, String.class).getBody();
	}
}
