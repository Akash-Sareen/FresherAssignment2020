package com.company.Comparator;

import com.company.Student;

import java.util.Comparator;

public class comparatorByRollAssend implements Comparator<Student> {
    public int compare(Student s1, Student s2  ){
        if(s1.getRollNumber() > s2.getRollNumber())
            return 1;
        else if(s1.getRollNumber() < s2.getRollNumber())
            return -1;
        else
            return 0;
        }
    }