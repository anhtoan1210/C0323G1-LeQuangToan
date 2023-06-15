package ss4_class_object.repository;

import ss4_class_object.common.ReadAndWrite;
import ss4_class_object.model.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepository implements IDoctorRepository {
    List<Doctor> doctors = new ArrayList<>();
    public static final String PATH_DOCTORS = "src/ss4_class_object/data/file.csv";

    @Override
    public List<Doctor> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_DOCTORS);
        doctors.clear();
        String[] info;
        for (String s : strings) {
            info = s.split(",");
            doctors.add(new Doctor(info[0], Integer.parseInt(info[1]), info[2], info[3], Long.parseLong(info[4]), info[5]));
        }
        return doctors;
    }

    @Override
    public void add(Doctor doctor) {
        List<String> strings = new ArrayList<>();
        //String name, int yearOld, String address, String email, long numberPhone, String workingPosition
        strings.add(doctor.getName() + "," + doctor.getYearOld() + "," + doctor.getAddress() + "," + doctor.getEmail() + "," + doctor.getNumberPhone() + "," + doctor.getWorkingPosition());
        ReadAndWrite.writeFIle(PATH_DOCTORS, strings, true);
    }
}
