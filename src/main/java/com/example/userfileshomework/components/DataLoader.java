package com.example.userfileshomework.components;

import com.example.userfileshomework.models.File;
import com.example.userfileshomework.models.Folder;
import com.example.userfileshomework.models.User;
import com.example.userfileshomework.repositorties.FileRepository;
import com.example.userfileshomework.repositorties.FolderRepository;
import com.example.userfileshomework.repositorties.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.JobSheets;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) throws Exception {
            User Andrew = new User("Andrew");
            userRepository.save(Andrew);

            Folder day_1 = new Folder("Codeclan");
            folderRepository.save(day_1);

            Folder Jobs = new Folder("CV");
            folderRepository.save(Jobs);

            File Homework = new File("homework", ".java", 32, day_1);
            fileRepository.save(Homework);


            File CV = new File("CV", "Silver", 10, Jobs);
            fileRepository.save(CV);
        }


}
