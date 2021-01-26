package com.robothy;

import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CnRepositoryPluginTest {

    @Test
    void testApply(){
        Project project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("com.robothy.cn-repo");
        Assertions.assertTrue(project.getRepositories().size() >= Repositories.URLS.length);
    }

}