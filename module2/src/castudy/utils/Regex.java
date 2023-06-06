package castudy.utils;

public class Regex {
    public static boolean checkId(String id) {
        return id.matches("^NV-\\d{4}$");
    }

    public static boolean checkName(String name) {
        return name.matches("^ \\[A-Z][a-z]*([A-Z][a-z*])*\\b$");
    }

    public static boolean checkGender(String gender) {
        return gender.matches("^Nam|nữ$");
    }

    public static boolean checkIdCode(String idCode) {
        return idCode.matches("^\\d{12}|\\d{9}$");
    }

    public static boolean checkNumberPhone(String number) {
        return number.matches("^0\\d{9}$");
    }

    public static boolean checkEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public static boolean checkLevel(String level) {
        return level.matches("^(Trung cấp)|(Cao đẳng)|(Đại học)|(Sau đại học)$");
    }

    public static boolean checkPosition(String position) {
        return position.matches("^(lễ tân)|(phục vụ)|(chuyên viên)|(giám sát)|(quản lý)|(giám đốc)$");
    }

    public static boolean checkIdVilla(String id) {
        return id.matches("^SVVL-\\d{4}$");
    }

    public static boolean checkIdHouse(String id) {
        return id.matches("^SVHO-\\d{4}$");
    }

    public static boolean checkIdRoom(String id) {
        return id.matches("^SVRO-\\d{4}$");
    }

    public static boolean checkServiceName(String name) {
        return name.matches("^[A-Z][a-z]*$");
    }

    public static boolean checkType(String type) {
        return type.matches("^(Năm)|(Tháng)|(Ngày)|(Giờ)$");
    }

}
