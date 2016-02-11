/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Katha
 */
@Entity
public class Kunde implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long kundennummer;
   
    private String vorname;
    private String nachname;
    private Timestamp gebDate;
    private int plz;
    private String city;
    private String street;
    private int houseNumber;
    private String telefonNumber;

    public Long getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(Long kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Timestamp getGebDate() {
        return gebDate;
    }

    public void setGebDate(Timestamp gebDate) {
        this.gebDate = gebDate;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public Vertrag getVertrag() {
        return vertrag;
    }

    public void setVertrag(Vertrag vertrag) {
        this.vertrag = vertrag;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getGekuendigt() {
        return gekuendigt;
    }

    public void setGekuendigt(Boolean gekuendigt) {
        this.gekuendigt = gekuendigt;
    }

    public Timestamp getVertragsbeginn() {
        return vertragsbeginn;
    }

    public void setVertragsbeginn(Timestamp vertragsbeginn) {
        this.vertragsbeginn = vertragsbeginn;
    }

    public String getBildpfad() {
        return Bildpfad;
    }

    public void setBildpfad(String Bildpfad) {
        this.Bildpfad = Bildpfad;
    }

    public Boolean getNichtGezahlt() {
        return nichtGezahlt;
    }

    public void setNichtGezahlt(Boolean nichtGezahlt) {
        this.nichtGezahlt = nichtGezahlt;
    }
    private Vertrag vertrag;
    private String note;
    private Boolean gekuendigt;
    private Timestamp vertragsbeginn;
    private String Bildpfad;
    private Boolean nichtGezahlt;
}
