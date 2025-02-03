package br.com.web.tournament.jzsports.model.entity.e;

public enum EPosition {

    GOLEIRO("Goleiro"),
    ZAGUEIRO("Zagueiro"),
    VOLANTE("Volante"),
    MEIA("Meia"),
    ATACANTE("Atacante"),
    LATERALD("Laterald"),
    LATERALE("Laterale");

    private String description;

    EPosition(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
