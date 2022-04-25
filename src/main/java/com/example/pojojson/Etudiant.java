package com.example.pojojson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "ETUDIANT")
public class Etudiant {
    
    @JsonProperty("nom")
    private String firstname;
    @JsonProperty("name")
    private String lastname;
    private Integer age;
}
