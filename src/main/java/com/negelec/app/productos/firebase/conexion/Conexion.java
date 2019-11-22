package com.negelec.app.productos.firebase.conexion;

import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.stereotype.Component;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
@Component
public class Conexion {
	private boolean yaInicializado = false;

	public void Conectar() throws IOException {
		if (!yaInicializado) {
			FileInputStream serviceAccount = new FileInputStream("src/main/resources/serviceAccountKey.json");

			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://ne-gutinatura.firebaseio.com").build();

			FirebaseApp.initializeApp(options);
			yaInicializado = true;
		}
	}
}
