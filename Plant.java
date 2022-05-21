package ukol;

import java.time.LocalDate;

public class Plant {
    String name;
    String notes;
    LocalDate planted;
    LocalDate watering;
    int frequency;

    String string;

    public Plant(String name, String notes, LocalDate planted, LocalDate watering, int frequency) {
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.watering = watering;
        this.frequency = frequency;
    }

    public Plant(LocalDate watering, String string){
        this.notes = " ";
        this.watering = LocalDate.now();
    }
    public Plant(LocalDate watering, String string, int frequency, LocalDate planted){
        this.frequency = 7;
        this.planted = LocalDate.now();
        this.notes = " ";
        this.watering = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) {
        this.watering = watering;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    //metoda  vypisuje informace o kytce
    // jest2 chci zkusit jestli to bude fungovat i bey toString a bude tam moct byt napsano// getWateringInfo nebo jeslti bud muse napsat konstruktor
    @Override
    public String toString() {
        return "Nazev kvetinky je: "  + name + " a jeji datum posledni yalivky a doporucene zalivky je " + watering + " " +  frequency  ;
    }

}
