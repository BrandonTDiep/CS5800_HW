package com.cpp.cs5800q5;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFolder(Folder folder) {
        this.subFolders.add(folder);
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void removeFolder(String folderName) {
        subFolders.removeIf(folder -> folder.getName().equals(folderName));
    }


    public void print(String currentFolderDirectory) {
        System.out.println(currentFolderDirectory + " " + name);

        for(Folder folder : subFolders) {
            folder.print(currentFolderDirectory + "   |");
        }

        for(File file : files) {
            file.print(currentFolderDirectory + "   |" + "");
        }
    }
}