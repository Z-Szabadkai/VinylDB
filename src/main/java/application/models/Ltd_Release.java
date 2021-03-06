package application.models;

public enum Ltd_Release {

    REGULAR,
    COLORED;

    public static Ltd_Release find(String name) {
        for (Ltd_Release vinyl : Ltd_Release.values()) {
            if (vinyl.toString().equalsIgnoreCase(name)) {
                return vinyl;
            }
        }
        return Ltd_Release.REGULAR;
    }

    public int getDBIndex() {
        return ordinal() + 1;
    }
}
