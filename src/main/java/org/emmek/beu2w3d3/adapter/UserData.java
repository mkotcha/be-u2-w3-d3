package org.emmek.beu2w3d3.adapter;

import lombok.Getter;

@Getter
public class UserData {
    private String fullName;
    private int age;

    public void getData(DataSource ds) {
        fullName = ds.getFullName();
        age = ds.getAge();
    }
}
