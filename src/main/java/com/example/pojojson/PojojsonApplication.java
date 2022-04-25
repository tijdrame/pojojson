package com.example.pojojson;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PojojsonApplication {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		SpringApplication.run(PojojsonApplication.class, args);
		Etudiant e = new Etudiant("Tidiane", "Dramé", 21);
		ObjectMapper objectMapper = new ObjectMapper();
		log.info("json [{}]",objectMapper.writeValueAsString(e));
		objectMapper.writeValue(new File("target/e.json"), e);

		XmlMapper xmlMapper = new XmlMapper();
		log.info("json [{}]",xmlMapper.writeValueAsString(e));

		Map <String, String> map = new HashMap<>();
		map.put("key", "value");
		map.put("keys", "values");
		log.info("taille [{}]", map.size());

	}

}
