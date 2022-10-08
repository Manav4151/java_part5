// 21CE097 Manav Patel
//WAP to show how to create a file with different mode and methods of File class to find path, directory etc.
import java.io.File;

// Displaying file propertypublic 
class prac1_5 {
    public static void main(String[] args) {

        // pass the filename or directory name to File object
        File f = new File("mjp.txt");
        // apply File class methods on File object
        System.out.println("File  name  :" + f.getName());
        System.out.println("Path:  " + f.getPath());
        System.out.println("Absolute  path:" + f.getAbsolutePath());
        System.out.println("Parent:" + f.getParent());
        System.out.println("Exists  :" + f.exists());
        if (f.exists()) {
            System.out.println("Is  writeable:" + f.canWrite());
            System.out.println("Is  readable" + f.canRead());
            System.out.println("Is  adirectory:" + f.isDirectory());
            System.out.println("File  Size  in  bytes" + f.length());
        }
        
    }
}
