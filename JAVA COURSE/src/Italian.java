import java.util.HashMap;
import java.util.Map;

public class Italian implements Class {
    private Map<String, Boolean> attendanceMap = new HashMap<>();

    @Override
    public void takeAttendance(String personName, boolean isPresent) {
        attendanceMap.put(personName, isPresent);
    }

    @Override
    public String getAttendanceList() {
        StringBuilder attendanceList = new StringBuilder("Italian Class Attendance:\n");
        for (Map.Entry<String, Boolean> entry : attendanceMap.entrySet()) {
            attendanceList.append(entry.getKey())
                    .append(" - ")
                    .append(entry.getValue() ? "Present" : "Absent")
                    .append("\n");
        }
        return attendanceList.toString();
    }
}
