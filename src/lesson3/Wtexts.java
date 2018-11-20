package lesson3;

public enum  Wtexts {
    english("Welcome"),
    czech("Vitejte"),
    danish("Velkomst"),
    french("Bienvenue"),
    dutch("Welkom"),
    estonian("Tere tulemast"),
    finnish("Tervetuloa"),
    flemish("Welgekomen"),
    german("Willkommen"),
    irish("Failte"),
    italian("Benvenuto"),
    latvian("Gaidits"),
    lithuanian("Laukiamas"),
    polish("Witamy"),
    spanish("Bienvenido"),
    swedish("Valkommen"),
    welsh("Croeso");

    private String wlc;

    Wtexts(String wlc) {
        this.wlc = wlc;
    }

    public String getwlc(String wlc) {
        this.wlc = wlc;
        return wlc;
    }

    public String getWlc() {
        return wlc;
    }
}
