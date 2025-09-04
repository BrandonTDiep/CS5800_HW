package com.cpp.cs5800q5;

public class CS5800_Q5 {
    public static void main(String[] args) {
        // root folder
        Folder phpDemo1 = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        phpDemo1.addFolder(sourceFiles);
        phpDemo1.addFolder(includePath);
        phpDemo1.addFolder(remoteFiles);

        // inside source files folder
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicFolder);
        sourceFiles.addFile(new File(".htaccess"));
        sourceFiles.addFile(new File(".htrouter.php"));
        sourceFiles.addFile(new File("index.html"));

        // inside app folder
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);

        System.out.println("Folder structure: ");
        phpDemo1.print("");
        System.out.println();

        // Delete the "app" folder
        System.out.println("Removal of app folder: ");
        sourceFiles.removeFolder("app");
        phpDemo1.print("");
        System.out.println();

        // Delete the "public" folder
        System.out.println("Removal of public folder: ");
        sourceFiles.removeFolder("public");
        phpDemo1.print("");
        System.out.println();

    }

}

