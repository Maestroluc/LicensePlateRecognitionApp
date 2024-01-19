import java.util.ArrayList;
import java.util.List;

public class LicensePlateRecord {
    private List<String> licensePlates;

    public LicensePlateRecord() {
        licensePlates = new ArrayList<>();
    }

    public void addLicensePlate(String licensePlate) {
        // Agregar una matrícula al registro
        licensePlates.add(licensePlate);
    }

    public List<String> getLicensePlates() {
        // Obtener todas las matrículas del registro
        return licensePlates;
    }
}

