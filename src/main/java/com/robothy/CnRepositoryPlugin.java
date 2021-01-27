package com.robothy;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.dsl.RepositoryHandler;

/**
 * Plugin entry.
 */
public class CnRepositoryPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        RepositoryHandler repositoryHandler = project.getRepositories();
        repositoryHandler.mavenLocal();
        for (String url : Repositories.URLS){
            repositoryHandler.maven(repo->repo.setUrl(url));
        }
    }

}

