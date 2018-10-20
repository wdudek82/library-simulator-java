# Library Simulator

## Description
1. Library has two types of users:
- Students (can borrow as much as 4 items)
- Lecturers (can borrow as much as 10 items)
- each user has a first name, last name, and unique card number

2. Library stores two types of resources:
- Books (each has title, author, and number of copies)
- Magazines (title, issue no, number of copies)

3. If we add new item to library, that already was in the stock, we only need to increment
"number of copies" value.

4. Method for adding new books or magazines should accept one element or whole set at once.

5. There should be a method for borrowing books to users - provided that there is still available copies left 
AND user doesn't reached his limit.

6. We need to be able to list all available library resources:
```text
Title;Author;Copies;Available
Ogniem i mieczem;H. Sienkiewicz;20;7

Title;Issue;Copies;Available
Traveler;03/2017;30;17
National Geographic;01/2016;15;13
```

7. We also need to be able to list all library users (including their type: S - Student, L - Lecturer):

```text
First Name;Last Name;Card Number;Type
Grzegorz;Szczutkowski;21;L
Piotr;Kowalczyk;13;S
```

8. writing resources and users to a file(s)...

9. reading resources and users from a file(s)...

10. storing all data in database...


### Additional:
1. Create text menu for application
