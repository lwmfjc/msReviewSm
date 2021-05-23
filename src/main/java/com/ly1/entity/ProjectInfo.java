package com.ly1.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 项目信息
 */
@Component
public class ProjectInfo {
    private String id;
    private String projectName; //项目名称
    private String projectNo;//项目编号
    private Principal principal; //负责人

    @Autowired
    public ProjectInfo(
            @Qualifier("principalB") Principal principal) {
        this.principal = principal;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "id='" + id + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectNo='" + projectNo + '\'' +
                ", principal=[负责人的口头禅'" + principal.petPhrase()+"']" +
                '}';
    }
}
