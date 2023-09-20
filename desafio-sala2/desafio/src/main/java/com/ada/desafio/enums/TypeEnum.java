package com.ada.desafio.enums;

public enum TypeEnum {
    SUGESTAO("Sugestao"),
    ELOGIO("elogio"),
    CRITICA("critica");

    private String type;

    TypeEnum(String type){ this.type = type; }

    public String getType() { return type; }

}