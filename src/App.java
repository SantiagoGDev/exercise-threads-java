import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import threads.MultiplicationTablesThread;
import threads.OtherThread;
import threads.ShowNumbersThread;
import threads.SongThread;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear el selector de archivos y establecer el filtro de extensión
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de audio", "wav", "mp3");
        fileChooser.setFileFilter(filter);

        // Mostrar la ventana de diálogo y obtener la respuesta del usuario
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado por el usuario
            String filePath = fileChooser.getSelectedFile().getAbsolutePath(); 
            File selectedFile = new File(filePath);

            // Crear los objetos de cada hilo
            Thread songThread = new SongThread(selectedFile);
            Thread multiplicationTable = new MultiplicationTablesThread();
            Thread showNumbers = new ShowNumbersThread();
            Thread showHelloWorld = new OtherThread();
            // Iniciar cada hilo
            songThread.start();
            multiplicationTable.start();
            showNumbers.start();
            showHelloWorld.start();
        }
    }
}
