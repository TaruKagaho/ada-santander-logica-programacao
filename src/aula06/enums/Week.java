package aula06.enums;

public enum Week {
    SUNDAY("domingo", 1),
    MONDAY("segunda-feira", 2),
    TUESDAY("terça-feira", 3),
    WEDNESDAY("quarta-feira", 4),
    THURSDAY("quinta-feira", 5),
    FRIDAY("sexta-feira", 6),
    SATURDAY("sábado", 7);

    final String name;
    final int day;

    Week(String name, int day){
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }
    public static Week stringToEnum(String name) {
        for (Week day : Week.values()) {
            if (day.getName().equalsIgnoreCase(name)) {
                return day;
            }
        }

        throw new IllegalArgumentException("Dia " + name + " informado é inválido");
    }
}
