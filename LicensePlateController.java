import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LicensePlateController {
    private LicensePlateUI ui;
    private LicensePlateRecognizer recognizer;
    private LicensePlateRecord record;

    public LicensePlateController(LicensePlateUI ui, LicensePlateRecognizer recognizer, LicensePlateRecord record) {
        this.ui = ui;
        this.recognizer = recognizer;
        this.record = record;

        // Agregar manejadores de eventos a los botones de la interfaz
        ui.addStartRecognitionListener(new StartRecognitionListener());
        ui.addStopRecognitionListener(new StopRecognitionListener());
        ui.addViewRecordListener(new ViewRecordListener());
    }

    // Clase interna para manejar el inicio del reconocimiento
    class StartRecognitionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Llamar al método para iniciar el reconocimiento en LicensePlateRecognizer
            recognizer.startRecognition();
        }
    }

    // Clase interna para manejar la detención del reconocimiento
    class StopRecognitionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Llamar al método para detener el reconocimiento en LicensePlateRecognizer
            recognizer.stopRecognition();
        }
    }

    // Clase interna para manejar la visualización del registro
    class ViewRecordListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Obtener las matrículas del registro y mostrarlas en la interfaz
            ui.displayLicensePlates(record.getLicensePlates());
        }
    }
}

