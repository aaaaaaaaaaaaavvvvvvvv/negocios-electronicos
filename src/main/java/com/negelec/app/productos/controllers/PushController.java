package com.negelec.app.productos.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.negelec.app.productos.model.CuerpoNotificacion;
import com.negelec.app.productos.model.DatosNotificaciones;
import com.negelec.app.productos.model.PushMessageModel;

@RestController
public class PushController {

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/push-notification")
	public void sendPushNotification(@RequestBody String usuario) {
		PushMessageModel pmm = new PushMessageModel();
		CuerpoNotificacion cnt = new CuerpoNotificacion();
		DatosNotificaciones dtn = new DatosNotificaciones();
		pmm.setTo("dW1PxJXYy7o:APA91bHOh_BBQ6ZzzPmtBpr2xowDoG-6YYint4tfyHqU_voCodBPmpzF2TSnOW5rp3my_dFn_w1PoeF_sN6GcQvbDomJV8FYGQJOMXAxj43fGH-uO3QsCccrhP2mcdxLsbdiYXpXyKtm");
		cnt.setBody("Se concreto una compra desde nuestra web");
		cnt.setTitle("Nueva Compra");
		dtn.setCodigoUsuario(usuario);
		pmm.setNotification(cnt);
		pmm.setData(dtn);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "key=AAAALnwfbrQ:APA91bHQoPg8HO05adg6t42y_yUwdI6e0J9uKm1CeGRFZUCwECKuitu-6BCmPVPldtm_QjP_rAQpxcWUfauLgSm22BIgrokwVLE_QUPTvzRx0sToxFE68z5k2c8MBCwNBFJ3EfFXe-ON");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<PushMessageModel> entity = new HttpEntity<PushMessageModel>(pmm, headers);
		restTemplate.exchange("https://fcm.googleapis.com/fcm/send", HttpMethod.POST, entity, String.class).getBody();
	}
}
