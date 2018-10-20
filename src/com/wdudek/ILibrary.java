package com.wdudek;

import com.wdudek.resources.Book;
import com.wdudek.resources.Magazine;
import com.wdudek.users.Lecturer;
import com.wdudek.users.Student;

public interface ILibrary {
    boolean addBook(Book book);
    boolean addMagazine(Magazine magazine);

    boolean addStudent(Student student);
    boolean addLecturer(Lecturer lecturer);

    // find resouces
}
