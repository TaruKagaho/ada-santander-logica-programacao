package aula07.enums;

public enum Week02 {
    SUNDAY(new String[]{"domingo", "d"}, 1),
    MONDAY(new String[]{"segunda-feira", "segunda", "s"}, 2),
    TUESDAY(new String[]{"terça-feira", "terça", "t"}, 3),
    WEDNESDAY(new String[]{"quarta-feira", "quarta", "qa"}, 4),
    THURSDAY(new String[]{"quinta-feira", "quinta", "qi"}, 5),
    FRIDAY(new String[]{"sexta-feira", "sexta", "sx"}, 6),
    SATURDAY(new String[]{"sábado", "sabado", "sa"}, 7);

    final String[] keywords;
    final int day;

    Week02(String[] keywords, int day) {
        this.keywords = keywords;
        this.day = day;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public int getDay() {
        return day;
    }
    public static Week02 stringToEnum(String name) {
        for (Week02 day : Week02.values()) {
            for (String dayName : day.getKeywords()) {
                if (dayName.equalsIgnoreCase(name)) {
                    return day;
                }
            }
        }

        throw new IllegalArgumentException("Dia " + name + " informado é inválido");
    }
}
