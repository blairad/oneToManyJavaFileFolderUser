package com.example.userfileshomework.projections;

import com.example.userfileshomework.models.File;
import com.example.userfileshomework.models.Folder;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {

     String name();
     String extensionType();
     int size();

     Folder getFolder();

}
