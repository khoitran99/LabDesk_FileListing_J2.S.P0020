/**
 *Name : Tran Van Khoi
 *MSSV : HE130007
 *Email : khoitvhe130007@fpt.edu.vn
 *Lecturer : DuongTB
 */
package controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.DefaultListModel;

/**
 *
 * @author khoitvhe130007@fpt.edu.vn
 */
public class MainController {

    public DefaultListModel listModel;

    public MainController() {
        listModel = new DefaultListModel();
    }

    /* get all files from path and add to jList */
    public DefaultListModel getListFile(String path) {
        listModel.removeAllElements();
        File fileObj = new File(path);

        String[] files = fileObj.list();
        for (String file : files) {
            listModel.addElement(file);
        }
        return listModel;
    }

    /* display file that user select in the list */
    public String getFileContent(File file, String filePath) throws IOException {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            throw e;
        }
        return content;
    }

    /* update file content*/
    public void updateFileContent(File file, String text) throws Exception {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file);
            writer.write(text);
            writer.close();
        } catch (FileNotFoundException e) {
            throw e;
        }
    }

    /* delete selected file */
    public void deleteFile(File file) {
        file.delete();
    }
}
