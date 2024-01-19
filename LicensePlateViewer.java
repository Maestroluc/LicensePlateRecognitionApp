import java.util.List;

public class LicensePlateViewer {
    private LicensePlateUI ui;

    public LicensePlateViewer(LicensePlateUI ui) {
        this.ui = ui;
    }

    public void displayLicensePlate(List<String> licensePlate) {
        // Muestra la matrícula en la interfaz de usuario
        ui.displayLicensePlates(licensePlate);
    }
}
