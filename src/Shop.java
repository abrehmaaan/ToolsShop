import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Frame;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;

public class Shop {
  private ArrayList<Tool> toolList;

  public Shop() {
    toolList = new ArrayList<>();
  }

  public void storeTool(Tool tool) {
    toolList.add(tool);
  }

  public void printAllTools() {
    for (Tool tool : toolList) {
      tool.printDetails();
    }
  }
  private void readToolData() {
	    Frame f = new Frame();
	    FileDialog fileDialog = new FileDialog(f, "Select tool data file", FileDialog.LOAD);
	    fileDialog.setDirectory(System.getProperty("user.dir"));
	    fileDialog.setVisible(true);
	    String fileName = fileDialog.getFile();
	    String directory = fileDialog.getDirectory();
	    File file = new File(directory + fileName);
	    
	    try (Scanner scanner = new Scanner(file)) {
	        while (scanner.hasNextLine()) {
	            String lineOfText = scanner.nextLine().trim();
	            if (!lineOfText.isEmpty() && !lineOfText.startsWith("//")) {
	                try (Scanner lineScanner = new Scanner(lineOfText)) {
						Tool tool = new Tool();
						tool.readData(lineScanner);
						toolList.add(tool);
					}
	            }
	        }
	    } catch (FileNotFoundException e) {
	        System.out.println("File not found: " + fileName);
	    }
	}
  public static void main(String [] args) {
	  Shop shop = new Shop();
	  shop.readToolData();
	  shop.printAllTools();
  }
}
