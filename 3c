public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekday() {
        return this == MONDAY || this == TUESDAY || this == WEDNESDAY || this == THURSDAY || this == FRIDAY;
    }

    public boolean isHoliday() {
        return !isWeekday();
    }
}

Weekday today = Weekday.MONDAY;
if (today.isWeekday()) {
    System.out.println("Today is a weekday.");
}
if (today.isHoliday()) {
    System.out.println("Today is a holiday.");
}
