---
title: "Collection Frameworks in JAVA"
seoTitle: "Explore Java Collection Frameworks"
seoDescription: "Learn the Java Collection Framework's structure, benefits, and interfaces—List, Map, Queue—for efficient, flexible data management"
datePublished: Sat Nov 08 2025 15:29:01 GMT+0000 (Coordinated Universal Time)
cuid: cmhqfwipa000002jsbf0d65uk
slug: collection-frameworks-in-java
cover: https://cdn.hashnode.com/res/hashnode/image/stock/unsplash/KrYbarbAx5s/upload/ef9d36621fead726f406264118ec05b3.jpeg
ogImage: https://cdn.hashnode.com/res/hashnode/image/upload/v1762615582088/f2c58c2c-783e-461d-a261-20d6dc04017b.png
tags: java, springboot, java8, collection-framework

---

## What is Collection?

A collection is nothing but a group of object that somebody has collected as their hobby.

## <mark>What is Collection Framework?</mark>

In Java, a collection is an interface representing a group of objects, called elements, that are stored and manipulated as a single unit.

so , Why it was introduced ?

because before the introduction of collection framework in JDK 1.2, Java used to rely on a Variety of classes like Vector, Stack, Hashtable, and arrays to store and manipulate group of objects.

but my Question was Why it was introduced huh?

***As u see this classes had several drawbacks***

![Crying Cat Meme Template — Kapwing](https://cdn-useast1.kapwing.com/static/templates/crying-cat-meme-template-full-719a53dc.webp align="left")

1. <mark>They were inconsistent</mark> like the classes had a different way of managing collections, leading to confusion and a steep learning curve
    
2. These classes were not designed or made to work together seamlessly thus <mark>lack of inter-Operabilty</mark>.
    
3. There were no common Interface for all these classes, which meant You cannot write generic algorithms that could operate on different types of collections
    

To Solve this Problem, the collection Framework was introduced

![Happy Mood Meme Face](https://i.pinimg.com/736x/85/f9/12/85f9128f5db8b74157f4154508f1e8f0.jpg align="center")

### **1\. Efficiency**

Pre-built algorithms enhance performance by providing optimized solutions for sorting, searching, and manipulation.

```java
List<Integer> numbers = Arrays.asList(4, 2, 8, 6);
Collections.sort(numbers);
System.out.println(numbers); // Output: [2, 4, 6, 8]
```

### **2\. Flexibility**

Supports diverse data structures, such as lists, sets, and maps, to meet various application requirements.

```java
Map<String, String> messages = new HashMap<>();
messages.put("user1", "Hello");
messages.put("user2", "Hi");
System.out.println(messages.get("user1")); // Output: Hello
```

### **3\. Reusability**

Developers can leverage pre-defined classes and interfaces, significantly reducing development time. It also allows developers to customize data structures by extending existing classes or implementing interfaces.

```java
class CustomList<T> extends ArrayList<T> {
    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }
}
```

### **4\. Scalability**

The framework is suitable for small-scale programs as well as large, enterprise-level applications. It supports dynamic resizing (e.g., ArrayList and HashMap) and thread-safe collections (e.g., ConcurrentHashMap) for enterprise-level requirements.

```java
List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
data.parallelStream().forEach(System.out::println);
```

### **5\. Robustness**

Framework provides fail-fast iterators and concurrent collections (e.g., ConcurrentHashMap) to prevent data corruption in multi-threaded environments. This Java collection tutorial in depth covers scalable features like parallel streams for large datasets.

```java
List<String> immutableList = List.of("A", "B", "C");
immutableList.add("D"); // Throws UnsupportedOperationException
```

### **6\. Beginner-Friendly**

The framework provides tools and methods, making it an ideal collection in Java for beginners to learn step-by-step. Its consistent design and extensive support for common operations simplify the learning curve.

## <mark>What is Collection Interface?</mark>

The [Collection Interface](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html) [acts as the blueprin](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)t, defining core operations such as adding, removing, and checking for elements. It serves as a superinterface for List, Set, and Queue. While it does not provide direct implementations, it ensures consistency across different types of collections, facilitating polymorphism and flexibility in handling data.

## **Collections Framework Vs. Collection Interface**

The Collections Framework and Collection Interface are distinct but interconnected components of Java’s data management system:

![](https://uploads.sitepoint.com/wp-content/uploads/2025/01/1737774810Collections-Framework-Vs.-Collection-Interface.png align="left")

### <mark>Collection Structure and Hierarchy</mark>

![Collection](https://media.geeksforgeeks.org/wp-content/uploads/20250726164918853294/Collection.webp align="left")

## **<mark>1. List</mark>**

Interfaces define the structure and behavior of different types of collections. They act as blueprints for how data should be organized and accessed. Here are some popular interface collection examples in Java.

#### **Core Collection Interfaces:**

**Collection** is the root interface for most collections, defining methods like add(), remove(), and size().

```java
Collection<String> items = new ArrayList<>(); 
items.add("Item1"); 
System.out.println(items.size()); // Output: 1
```

![](https://cdn.hashnode.com/res/hashnode/image/upload/v1761272195114/7a2f5ac4-f896-4dda-992f-f4632203103f.png align="center")

so, Interface has some sub-Interfaces we will now see :

### ***<mark>List Interface</mark>***

The List Interface in Java is a part of `java.util` package and is a sub-interface of the collection interface. It provides a way to store an ordered ***collection of elements*** (known as a sequence). Lists allow for precise control over where elements are inserted and ***can contain duplicate elements.***

so, When to use List?

When we need Ordered and duplicate sequence we will use List.

Now, We will learn about different types of List Interface.

1. ### *<mark>ArrayList</mark>*
    
    An ArrayList is a resizable array implementation of the list interface. Unlike arrays in java, which have a fixed size, an ArrayList can change its size dynamically as elements are added or removed. This flexibility makes it popular choice when the number of elements in a list isn’t known in advance.
    

```java
package Collection_frameworks.ArrayList;

import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(1);//0
        list.add(5);//1
        list.add(69);//2

        //get and size check
        System.out.println("get the number: " + list.get(2));
        System.out.println("checking the size: "+list.size());
//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));//for-loop
//        }

        //traverse the whole arraylist
            System.out.println(list);//for-each loop
        

        //checking existence
        System.out.println("checking existence: "+list.contains(5));
        System.out.println("checking existence: "+list.contains(50));

        //remove
        System.out.println("Succesfully removed: "+list.remove(2));

        System.out.println("after removing: "+list);

        //add elements in any index
        list.add(2,99);
        System.out.println("after adding elements in 2th index"+list);

        //set
        list.set(2,50);
        System.out.println(list);
    }
}
```

output

```java
get the number: 69
checking the size: 3
[1, 5, 69]
checking existence: true
checking existence: false
Succesfully removed: 69
after removing: [1, 5]
after adding elements in 2th index[1, 5, 99]
[1, 5, 50]
```

### <mark>Java Comparator</mark>

In Java, the `Comparator` interface is part of the `java.util` package and is used to define custom sorting logic for objects. It provides a way to sort collections of objects based on criteria that are external to the objects themselves, or to define multiple sorting orders for the same class.

so, Why we use Java Comparators?

we use it to <mark>sort </mark> (custom sorting or External Sorting Logic)

![](https://cdn.hashnode.com/res/hashnode/image/upload/v1761409872613/b56fc59e-4597-4c2b-8427-b42d4021ac5a.jpeg align="center")

Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second. The implementor must ensure that signum(compare(x, y)) == -signum(compare(y, x)) for all x and y. (This implies that compare(x, y) must throw an exception if and only if compare(y, x) throws an exception.)

The `Comparator` interface defines a single abstract method:

![](https://cdn.hashnode.com/res/hashnode/image/upload/v1761409650766/0de24c63-d56e-419e-a5fa-08f2b4ffc55e.png align="left")

**Use Cases:**

* Sorting `ArrayList`, `LinkedList`, `Vector`, etc., using `Collections.sort()` or `List.sort()`.
    
* Sorting arrays using `Arrays.sort()`.
    
* Defining the ordering for `TreeSet` and `TreeMap` when their elements or keys don't have a natural ordering or when a different ordering is desired.
    
* Implementing multiple sorting criteria for a single class (e.g., sorting `Student` objects by name, then by age, or by ID).
    
    The Code below is to show how Comparator Works:
    

```java
package Collection_frameworks.Comparator;

//we will learn more about java8 to easily use comparator dont have to write lines of lines of code

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//string
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length();
    }
}

//list or integer
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;//if o1 is 5 and o2 is 3 then sort will be  3 and 5
    }
}

//custom comparator
class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}





public class comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);

        //sorted list
        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);




        List<Student> students = new ArrayList<>();
        students.add(new Student("Abir", 8.0));
        students.add(new Student("Ayish", 9.2));
        students.add(new Student("priyanshu", 7.1));
        students.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            }else {
                return 0;
            }
        });

        for (Student s : students){
            System.out.println(s.getName()+ ":" + s.getGpa());
        }

    }
}
```

output

```java
[9, 5, 2]
[date, apple, banana]
Ayish:9.2
Abir:8.0
priyanshu:7.1
```

2. ### *<mark>Linked List</mark>*
    
    The `LinkedList` [clas](https://www.w3schools.com/java/java_list.asp)s is a collection which can contain many objects of the same type, just like the `ArrayList`.
    
    The `LinkedList` [clas](https://www.w3schools.com/java/java_list.asp)s has the same methods as `ArrayList` because both follow the [`List`](https://www.w3schools.com/java/java_list.asp) interface. This means you can add, change, remove, or clear elements in a `LinkedList` just like you would with an `ArrayList`.
    
    However, while [the](https://www.w3schools.com/java/java_list.asp) `ArrayList` class and the `LinkedList` class can be used in the same way, they are built very differently.
    
    The `LinkedList` stores its elements in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
    
    Here is a simple java program for LinkedList :
    
    ```java
    package Collection_frameworks.linkedlist;
    
    import java.util.LinkedList;
    
    public class test {
        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();
    
            //string
            LinkedList<String> cars = new LinkedList<>();
            cars.add("Bmw");
            cars.add("Mercedes");
            cars.add("Lund");
            cars.remove(1);
            cars.get(1);
    
            //integer
            System.out.println(cars);
            linkedList.add(4);
            linkedList.add(5);
            linkedList.add(8);
            linkedList.get(2);
            linkedList.addFirst(3);
            linkedList.addLast(9);
            linkedList.removeFirst();
            linkedList.getFirst();
            System.out.println(linkedList);
        }
    }
    ```
    
    output
    

```java
[Bmw, Lund]
[4, 5, 8, 9]
```

There are many method apart from the methods I have used in my code ⬆️:

Here is the list of all methods

| `boolean` | [`add`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#add-E-)`(`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `e)` | Appends the specified element to the end of this list. |
| --- | --- | --- |
| `void` | [`add`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#add-int-E-)`(int index,` [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `element)` | Inserts the specified element at the specified position in this list. |
| `boolean` | [`addAll`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#addAll-java.util.Collection-)`(`[`Collection`](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)`<? extends` [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)`> c)` | Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator. |
| `boolean` | [`addAll`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#addAll-int-java.util.Collection-)`(int index,` [`Collection`](https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html)`<? extends` [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)`> c)` | Inserts all of the elements in the specified collection into this list, starting at the specified position. |
| `void` | [`addFirst`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#addFirst-E-)`(`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `e)` | Inserts the specified element at the beginning of this list. |
| `void` | [`addLast`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#addLast-E-)`(`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `e)` | Appends the specified element to the end of this list. |
| `void` | [`clear`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#clear--)`()` | Removes all of the elements from this list. |
| [`Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) | [`clone`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#clone--)`()` | Returns a shallow copy of this `LinkedList`. |
| `boolean` | [`contains`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#contains-java.lang.Object-)`(`[`Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) `o)` | Returns `true` if this list contains the specified element. |
| [`Iterator`](https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)`<`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)`>` | [`descendingIterator`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#descendingIterator--)`()` | Returns an iterator over the elements in this deque in reverse sequential order. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`element`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#element--)`()` | Retrieves, but does not remove, the head (first element) of this list. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`get`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#get-int-)`(int index)` | Returns the element at the specified position in this list. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`getFirst`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#getFirst--)`()` | Returns the first element in this list. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`getLast`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#getLast--)`()` | Returns the last element in this list. |
| `int` | [`indexOf`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#indexOf-java.lang.Object-)`(`[`Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) `o)` | Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| `int` | [`lastIndexOf`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#lastIndexOf-java.lang.Object-)`(`[`Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) `o)` | Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| [`ListIterator`](https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html)`<`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)`>` | [`listIterator`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#listIterator-int-)`(int index)` | Returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list. |
| `boolean` | [`offer`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#offer-E-)`(`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `e)` | Adds the specified element as the tail (last element) of this list. |
| `boolean` | [`offerFirst`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#offerFirst-E-)`(`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `e)` | Inserts the specified element at the front of this list. |
| `boolean` | [`offerLast`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#offerLast-E-)`(`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `e)` | Inserts the specified element at the end of this list. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`peek`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#peek--)`()` | Retrieves, but does not remove, the head (first element) of this list. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`peekFirst`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#peekFirst--)`()` | Retrieves, but does not remove, the first element of this list, or returns `null` if this list is empty. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`peekLast`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#peekLast--)`()` | Retrieves, but does not remove, the last element of this list, or returns `null` if this list is empty. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`poll`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#poll--)`()` | Retrieves and removes the head (first element) of this list. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`pollFirst`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#pollFirst--)`()` | Retrieves and removes the first element of this list, or returns `null` if this list is empty. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`pollLast`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#pollLast--)`()` | Retrieves and removes the last element of this list, or returns `null` if this list is empty. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`pop`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#pop--)`()` | Pops an element from the stack represented by this list. |
| `void` | [`push`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#push-E-)`(`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `e)` | Pushes an element onto the stack represented by this list. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`remove`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#remove--)`()` | Retrieves and removes the head (first element) of this list. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`remove`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#remove-int-)`(int index)` | Removes the element at the specified position in this list. |
| `boolean` | [`remove`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#remove-java.lang.Object-)`(`[`Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) `o)` | Removes the first occurrence of the specified element from this list, if it is present. |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`removeFirst`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#removeFirst--)`()` | Removes and returns the first element from this list. |
| `boolean` | [`removeFirstOccurrence`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#removeFirstOccurrence-java.lang.Object-)`(`[`Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) `o)` | Removes the first occurrence of the specified element in this list (when traversing the list from head to tail). |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`removeLast`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#removeLast--)`()` | Removes and returns the last element from this list. |
| `boolean` | [`removeLastOccurrence`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#removeLastOccurrence-java.lang.Object-)`(`[`Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html) `o)` | Removes the last occurrence of the specified element in this list (when traversing the list from head to tail). |
| [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) | [`set`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#set-int-E-)`(int index,` [`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) `element)` | Replaces the element at the specified position in this list with the specified element. |
| `int` | [`size`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#size--)`()` | Returns the number of elements in this list. |
| [`Spliterator`](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html)`<`[`E`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)`>` | [`spliterator`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#spliterator--)`()` | Creates a [***late-binding***](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html#binding) and *fail-fast* [`Spliterator`](https://docs.oracle.com/javase/8/docs/api/java/util/Spliterator.html) over the elements in this list. |
| [`Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)`[]` | [`toArray`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#toArray--)`()` | Returns an array containing all of the elements in this list in proper sequence (from first to last element). |
| `<T> T[]` | [`toArray`](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#toArray-T:A-)`(T[] a)` | Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array. |

3. ### *<mark>Vectors</mark>*
    
    A Vector is a class that implements the List interface and belongs to the java.util.\* package.
    
    A Vector is a better version of an array where it internally uses an array to represent story elements and provides us with the flexibility to resize the list size internally after adding a new element.
    
    In vector, all elements are stored in contiguous locations like arrays. Like an ArrayList, the vector also maintains insertion order.
    
    A vector dynamically grows and shrinks. Vector also allows us to store and perform different actions on the stored data. It allows us to store all types of data as well as null values.
    
    Vector is thread-safe and synchronized in nature.
    
    1\. Vector is a legacy Synchronized collection class that implements the list interface.
    
    2\. It behaves like a dynamic array and grows as needed.
    
    3\. It provides thread safety but with performance cost in single-threaded environments.
    
    4\. In modern application, Arraylist or concurrent alternative like CopyOnWriteArrayList are typically preferred over Vector unless thread safety is a priority.
    

![This is the diagram showing their parent classes](https://miro.medium.com/v2/resize:fit:252/1*C9KWxJOFVih0CKFL6u--MQ.png align="left")

Here is a simple java program to demonstrate :

```java
package Collection_frameworks.vector;

import java.util.LinkedList;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {

        //create a vector
        //methods in vector
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println(vector1);
    }
}
```

output:

```java
5
8
[1, 2, 3]
```

4. ### *<mark>Stack</mark>*
    
    Stack class implements the LIFO (last-in-first-out) data structure. It supports core operations like push() and pop(), along with peek(), empty(), and search(). Stack is a subclass of Vector and inherits its properties.
    
    so, Why use stack not `ArrayList`?
    
    ![rahul-gandhi-thinking-rahul-gandhi-meme-template - The Best of Indian Pop  Culture & What's Trending on Web](https://scrolldroll.com/wp-content/uploads/2021/09/rahul-gandhi-thinking-rahul-gandhi-meme-template.jpg align="left")
    
    we will get the same result if we use any implementation of List so why not `ArrayList`, it is because it makes the code more complex if we use `LinkedList` or `Vector(`Stack’s subclass) there only we need to add from the last with the in-built method called `addLast` then we will get the same result in both `vector` and `LinkedList.`
    
    But its easier to use Stack as we don’t have to make the code more complex.  
    Now we got it why we will use `Stack` not `ArrayList`
    
    ![Meme: "You got it!!!" - All Templates - Meme-arsenal.com](https://www.meme-arsenal.com/memes/a6d2b3f68dc34c49d95485a984a4dabc.jpg align="left")
    
    Have U read it huh… huh..!!
    
    ![Suspicious Meme GIFs | Tenor](https://media.tenor.com/z3EIfb48qgkAAAAM/bpk-suspicious.gif align="left")
    
    Let's understand the stack with an example:
    

```java
package Collection_frameworks.stack;

import java.util.Iterator;
import java.util.Stack;

public class stackdemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.pop();
        System.out.println(stack);

        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(3);
        System.out.println(search);

        //another way to implement data in a stack
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ",");
        }
        stack.pop();
        stack.size();
    }
}
```

output:

```java
[2, 3, 1, 4]
 4
 false
 4
 3
 2,3,1,4,
```

5. ### *<mark>CopyOnWriteArrayList</mark>*
    
    Whats “Copy On Write” means in `CopyOnWriteArrayList` ??
    
    ![Thru The Lens: (DAY IN THE LIFE): Episode 04 - Day in the ...](https://i.ytimg.com/vi/rClNZLXSKA8/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLBwFKejLHf7PZqHjSEZx0JONCCDqQ align="left")
    
    It means that whenever i will do a write operation like adding or removing an element instead of directly modifying the existing list a new copy of the arraylist is created, and the modification is applied to that copy This ensures that other threads reading the list while it's being modified or unaffected.
    
    Now got it,
    
    ![Thumbs up kid Brent Rambo from Apple promo video working at Facebook |  news.com.au — Australia's leading news site for latest headlines](https://content.api.news/v3/images/bin/82d7897e042bd139ec91db420f0a367e align="left")
    
    so , Here’s a simple java program to understand it:
    

```java
package Collection_frameworks.copyonwritearrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        //"copy on write" means that whenever i will do a write operation
        //like adding or removing an element
        //instead of directly modifying the existing list
        //a new copy of the arraylist is created, and the modification is applied to that copy
        //This ensures that other threads reading the list while it's being modified or unaffected.

        //Read Operation: Fast and direct, since they happen on a stable list without interference from modifications.
        //Write Operations: A new copy of the list is created for every modification.
        //          The reference to the list is then updated so that subsequent reads use this new list.


        List<String> tocart = new CopyOnWriteArrayList<>();
        tocart.add("milk");
        tocart.add("butter");
        tocart.add("carrots");

        for (String x : tocart){
            System.out.println(x);
            if (x.equals("butter")) {
                tocart.add("Bread");
                System.out.println("Added Bread");
            }
        }

        System.out.println("Updated shopping list "+tocart);



//below this code is nothing but to show how it is thread safe

//        List<String> sharedList = new CopyOnWriteArrayList<>();
//        sharedList.add("Item1");
//        sharedList.add("Item2");
//        sharedList.add("Item3");
//        Thread readerThread = new Thread(() -> {
//            try {
//                while (true) {
//                    // Iterate through the list
//                    for (String item : sharedList) {
//                        System.out.println("Reading item: " + item);
//                        Thread.sleep(100); // Small delay to simulate work
//                    }
//                }
//            } catch (Exception e) {
//                System.out.println("Exception in reader thread: " + e);
//            }
//        });
//        Thread writerThread = new Thread(() -> {
//            try {
//                Thread.sleep(500); // Delay to allow reading to start first
//                sharedList.add("Item4");
//                System.out.println("Added Item4 to the list.");
//
//                Thread.sleep(500);
//                sharedList.remove("Item1");
//                System.out.println("Removed Item1 from the list.");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        readerThread.start();
//        writerThread.start();
    }
}
```

output:

```java
milk
butter
Added Bread
carrots
Updated shopping list [milk, butter, carrots, Bread]
```

## <mark>2.Map Interface</mark>

A [`Map`](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html) [is](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html) an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value. It models the mathematical *function* abstraction. The `Map` interface includes methods for basic operations (such as `put`, `get`, `remove`, `containsKey`, `containsValue`, `size`, and `empty`), bulk operations (such as `putAll` and `clear`), and collection views (such as `keySet`, `entrySet`, and `values`).

When You should use Map ?

when You have 2 Unique things to store such as key and a Value.

1. ### <mark>HashMap</mark>
    
    A hashmap is **a data structure that stores data as unique key-value pairs**, allowing for fast retrieval, insertion, and deletion of values by using their corresponding keys.  
    That’s why it has Time Complexity of O(1) which makes searching, inserting easier.
    
    Basic Structure:
    
    ```java
    static class Node<K, V> implements Map.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;
    }
    ```
    
    ![Java-HashMap-Class-Hierarchy](https://media.geeksforgeeks.org/wp-content/uploads/20250808152636570620/Java-HashMap-Class-Hierarchy.webp align="center")
    
    **Key characteristics**
    

* **Key-value pairs:** Each item consists of a unique key and an associated value.
    
* **Unordered:** Hashmaps do not guarantee any specific order for the elements.
    
* **Efficient performance:** They offer average O(1) time complexity for operations like adding, getting, and removing items, thanks to the direct access provided by hashing.
    
* **Nulls:** They can store a single `null` key and multiple `null` values.
    
* **Example:** A simple real-world example is a dictionary where the "word" is the key and the "meaning" is the value, or a phone book where a "name" is the key and the "phone number" is the value.
    
    Here is a simple java program showing insertion, deletion :
    
    ```java
    package Collection_frameworks.Map.Hashmap;
    
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Set;
    
    public class hashMapdemo {
        public static void main(String[] args) {
            HashMap<Integer,String> students = new HashMap<>();
            students.put(1, "Abir");
            students.put(2, "Ayish");
            students.put(3, "Himong");
            students.put(4, "Rayan");
    
            System.out.println(students);
            String a = students.get(3);
            System.out.println(a);
            String b = students.get(69);//checking if the number is there in table?
            System.out.println(b);
    
            System.out.println(students.containsKey(1));
            System.out.println(students.containsValue("Himong"));
    
            for (int i : students.keySet()){
                System.out.println(students.get(i));
            }
    
    
            //sir this is how we can iterate over each item in hashmap using set.
            Set<Map.Entry<Integer, String>> entries = students.entrySet();
    
            for (Map.Entry<Integer, String> entry : entries) {
                entry.setValue(entry.getValue().toLowerCase());
            }
            System.out.println(students);
    
            students.remove(3);
            System.out.println(students);
        }
    }
    ```
    
    output:
    
    ```java
    {1=Abir, 2=Ayish, 3=Himong, 4=Rayan}
    Himong
    null
    true
    true
    Abir
    Ayish
    Himong
    Rayan
    {1=abir, 2=ayish, 3=himong, 4=rayan}
    {1=abir, 2=ayish, 4=rayan}
    ```
    
    🧩 Hashing process  
    When you do:
    
    ```java
    map.put("Apple", 100);
    ```
    
    the following steps happen:
    
    1. Java computes a **hash code** for the key (`"Apple"`) using `hashCode()`.
        
    2. That hash code is then **processed** (with bit manipulations) to reduce collisions.
        
    3. The final hash value is used to find a **bucket index** in the internal array:
        
        ```java
        index = (n - 1) & hash
        ```
        
        where `n` = number of buckets (array size).
        
        The key-value pair is stored in that bucket.
        
    
    ### **💥 Collisions**
    
    1. **Collision** = When **two keys** produce the **same bucket index**.
        
        For example:
        
        * `"Apple"` and `"Banana"` may hash to the same index.
            
        
        In older versions of Java (before Java 8):
        
        * These collided entries were stored in a **linked list** inside that bucket.
            
        
        After **Java 8**:
        
        * If the number of entries in a bucket exceeds **8**, Java converts that bucket’s linked list into a **balanced binary tree** (a *red-black tree*) to improve lookup time.
            
    
    ### 🧮 Load Factor and Rehashing
    
    `HashMap` dynamically grows when it gets too full.
    
    #### 🔹 Default values:
    
    * **Initial capacity:** 16 buckets
        
    * **Load factor:** 0.75
        
    
    When the number of stored entries exceeds:
    
    ```java
    capacity × loadFactor
    ```
    
    → the map **resizes** (doubles the number of buckets).
    
    This process is called **rehashing**, since every key must be rehashed to new bucket indices.
    
    Example:
    
    ```java
    16 × 0.75 = 12
    ```
    
    When the 13th entry is added → resizing happens → capacity becomes 32.
    
    1. ### <mark>LinkedHashMap</mark>
        
        It is a Java class that combines a `HashMap` with a doubly-linked list to maintain the order in which key-value pairs are inserted. This means you can iterate through the map in the exact order the elements were added, unlike a standard `HashMap` which has no guaranteed order. It offers fast performance for operations like `put()` and `get()` (average 𝑂(1) time complexity) while also providing a predictable iteration order.
        
        Here is a simple java program to demonstrate:
        
    
    ```java
    package Collection_frameworks.Map.Hashmap.LinkedHashMap;
    
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    
    public class LinkedHAshMapDemo {
        public static void main(String[] args) {
            LinkedHashMap<String ,Integer> linkedHashMap = new LinkedHashMap<>(12,0.2f,true);//doubly linked list
            linkedHashMap.put("Orange", 1);
            linkedHashMap.put("Mango", 4);
            linkedHashMap.put("Banana", 6);
            linkedHashMap.get("Mango");
            System.out.println(linkedHashMap);
    
            HashMap<String,Integer> hashMap = new HashMap<>();
            LinkedHashMap<String,Integer> linkedHashMap1 = new LinkedHashMap<>();
    
            hashMap.put("Abir", 91);
            hashMap.put("Rayan", 60);
            hashMap.put("Vipul", 78);
    
            Integer result = hashMap.getOrDefault("Vipul",0);
    
            hashMap.putIfAbsent("Shubham",92);//to handle edge cases
            System.out.println(hashMap);
            System.out.println(result);
        }
    }
    ```
    
    output:
    
    ```java
    {Orange=1, Banana=6, Mango=4}
    {Abir=91, Rayan=60, Vipul=78, Shubham=92}
    78
    ```
    
    2. ### <mark>TreeMap</mark>
        
        A TreeMap in Java is a part of the java.util package that implements the Map interface. It stores key-value pairs in a sorted order using either a natural or custom comparator.
        
        * TreeMap internally uses a Red-Black Tree for efficient sorting.
            
        * Provides O(log n) time for insertion, deletion, and lookup.
            
        * TreeMap does not allow null keys, but allows null values.
            
            ![map](https://media.geeksforgeeks.org/wp-content/uploads/20250808165355327082/map.webp align="left")
            
        
    
    ```java
    package Collection_frameworks.Map.Hashmap.TreeMap;
    
    import java.util.TreeMap;
    
    public class TreemapDemo {
        public static void main(String[] args) {
            TreeMap<String,Integer> treeMap = new TreeMap<>();
    
            treeMap.put("Orange", 1);
            treeMap.put("Guava", 4);
            treeMap.put("Grapes", 10);
            treeMap.put("Mango", 3);
            System.out.println(treeMap);
        }
    }
    ```
    
    output:
    
    ```java
    {Grapes=10, Guava=4, Mango=3, Orange=1}
    ```
    
    so, Which is good TreeMap or LinkedHashMap?
    
    I would say that depends on your use case:  
    well I have provided a table You will understand it now:
    
    | Use Case | Best Choice | Reason |
    | --- | --- | --- |
    | You just need key-value storage, and order doesn’t matter | ✅ `HashMap` | Fast and efficient |
    | You want to maintain insertion order (e.g., printing in same order you added) | ✅ `LinkedHashMap` | Predictable order |
    | You want keys sorted (alphabetically, numerically, etc.) | ✅ `TreeMap` | Automatically sorts keys |
    
    ![Thumbs Up GIFs | Tenor](https://media.tenor.com/DtD4LZbctTIAAAAM/tamm-cat.gif align="left")
    

3. ### <mark>WeakHaskMap</mark>
    
    `WeakHashMap` is a Map implementation based on weak references. A weak reference is a reference that does not prevent its referent from being made eligible for garbage collection. This means that the entries in a `WeakHashMap` can be garbage collected when their keys are no longer in use elsewhere in the program.
    
    Characteristics:
    
    * Entries are garbage collected when the keys are weakly reachable.
        
    * Suitable for caching where memory-sensitive entries are desired.
        
    * Not thread-safe. Use `Collections.synchronizedMap` for synchronized access.
        
    
    Use Case:
    
    `WeakHashMap` is ideal for scenarios where you want to hold metadata or cache values that can be discarded when memory is low, without needing explicit removal of entries.
    
    Here is a simple java program to show how weak reference works:
    

```java
    package Collection_frameworks.Map.Hashmap.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapdemo {
    public static void main(String[] args) {
        Map<Integer, String> weakHashMap = new WeakHashMap<>();
        Integer key1 = 1000;
        Integer key2 = 2000;

        weakHashMap.put(key1, "Value1");
        weakHashMap.put(key2, "Value2");


        System.out.println("Before GC: " + weakHashMap);
        key1 = null;

        System.gc();


        try {
            Thread.sleep(1000); // Sleep for a while to let GC do its work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After GC: " + weakHashMap);
    }
}
```

output:

```java
Before GC: {2000=Value2, 1000=Value1}
After GC: {2000=Value2}
```

4. ### <mark>IdentityHashMap</mark>
    
    The **IdentityHashMap** [imp](https://www.geeksforgeeks.org/java/map-interface-in-java/)lements [**Map**](https://www.geeksforgeeks.org/java/map-interface-in-java/) interface using [**Hashtable**](https://www.geeksforgeeks.org/java/hashtable-in-java/), [using re](https://www.geeksforgeeks.org/java/hashtable-in-java/)ference-equality in place of object-equality when comparing keys (and values). This class is not a general-purpose Map implementation. While this class implements the Map interface, it intentionally violates Map's general contract, which mandates the use of the equals() method when comparing objects. This class is used when the user requires the objects to be compared via reference. It belongs to **java.util** package.
    
    **Features of Identity**[**Has**](https://www.geeksforgeeks.org/java/map-interface-in-java/)**hMap**
    
    * It follows reference [eq](https://www.geeksforgeeks.org/java/map-interface-in-java/)uality, [instead](https://www.geeksforgeeks.org/java/hashtable-in-java/) of using the equals() [method it](https://www.geeksforgeeks.org/java/hashtable-in-java/) uses the == operator.
        
    * It is not synchroniz[ed](https://www.geeksforgeeks.org/java/map-interface-in-java/) and must be synchronized externally.
        
    * [Iterato](https://www.geeksforgeeks.org/java/hashtable-in-java/)rs are fail-f[ast](https://www.geeksforgeeks.org/java/map-interface-in-java/), throw **ConcurrentModificationExceptio**[**n** in an a](https://www.geeksforgeeks.org/java/hashtable-in-java/)ttempt to modify while iterating.
        
    * This class provides [con](https://www.geeksforgeeks.org/java/map-interface-in-java/)stant-time performance for the basic o[perations](https://www.geeksforgeeks.org/java/hashtable-in-java/) (get and put), assuming the system identity hash function (System.identityHashCode(Object)) disperses elements properly among the buckets. IdentityHashMap doesn't use hashCode() method instead it uses System.identityHashCode() method. This is a significant difference because now you can use mutable objects as key in Map whose hash code is likely to change when the mapping is stored inside IdentityHashMap.
        
        Example:
        
        ```java
        package Collection_frameworks.Map.Hashmap.IdentityHashMap;
        
        import java.util.HashMap;
        import java.util.IdentityHashMap;
        import java.util.Map;
        
        public class identityhashmapexample {
            public static void main(String[] args) {
                String k1 = new String("key");
                String k2 = new String("key");
        
                Map<String,Integer> map = new IdentityHashMap<>();
                map.put(k1,1);
                map.put(k2,3);
        
                System.out.println(k1.equals(k2));
                System.out.println(map);
        
        
                System.out.println("We are seeing hashcode for identityhashmap :"+ System.identityHashCode(k1));
                System.out.println("We are seeing hashcode for identityhashmap :"+ System.identityHashCode(k2));
        
                System.out.println("We are seeing hashcode for hashmap :"+k1.hashCode());
                System.out.println("We are seeing hashcode for hashmap :"+k2.hashCode());
            }
        }
        ```
        
        output:
        
        ```java
        true
        {key=3, key=1}
        We are seeing hashcode for identityhashmap :41359092
        We are seeing hashcode for identityhashmap :149928006
        We are seeing hashcode for hashmap :106079
        We are seeing hashcode for hashmap :106079
        ```
        
    

## ***<mark>Comparable</mark>***

The `Comparable` interface in Java is a part of the `java.lang` package and is used to define the natural ordering of objects within a class. When a class implements the `Comparable` interface, it signifies that instances of that class can be compared to each other based on a predefined criterion. This natural ordering is then used by various sorting mechanisms in Java, such as `Collections.sort()` for lists or `Arrays.sort()` for arrays.

**Key aspects of** `Comparable`:

* **Single Method:** `compareTo()`:
    
    The `Comparable` interface contains a single abstract method, `compareTo(T o)`, where `T` is the type of the objects being compared. This method takes another object of the same type as a parameter.
    
* **Return Value of** `compareTo()`:
    
    The `compareTo()` method returns an integer value, which indicates the relative order of the current object and the object passed as an argument:
    
    * **Negative value**: The current object is "less than" the argument object.
        
    * **Zero**: The current object is "equal to" the argument object.
        
    * **Positive value**: The current object is "greater than" the argument object.
        
* **Natural Ordering**:
    
    Implementing `Comparable` defines a single, default way to compare objects of that class. This is considered the "natural" order for those objects. For example, the `String` class implements `Comparable` to define alphabetical order as its natural ordering.
    

A simple java Program:

```java
package Collection_frameworks.Comparable;

public class person implements Comparable<person>{
    private String name;
    private double marks;

    public person(String name,double marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int compareTo(person p){
        return Double.compare(p.getMarks(), this.getMarks());
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
```

```java
package Collection_frameworks.Comparable;

import java.util.ArrayList;
import java.util.List;

public class comparabledemo {
    public static void main(String[] args) {
        List<person> list= new ArrayList<>();
        list.add(new person("Charlie", 3.5));
        list.add(new person("Bob", 3.7));
        list.add(new person("Alice", 3.5));
        list.add(new person("Akshit", 3.9));
        list.sort(null);
        System.out.println(list)    ;
    }
}
```

output:

```java
[person{name='Akshit', marks=3.9}, person{name='Bob', marks=3.7}, person{name='Charlie', marks=3.5}, person{name='Alice', marks=3.5}]
```

2. ## <mark>SortedMap</mark>
    
    **SortedMap** is an interface in the [**collection framework**](https://www.geeksforgeeks.org/java/collections-in-java-2/) that is a part of java.util package and extends the [**Map**](https://www.geeksforgeeks.org/java/map-interface-in-java/) interface. It represents a map that maintains its keys in a sorted order. The keys in a SortedMap are sorted according to their natural ordering or by a Comparator provided at the time of map creation.
    
    * SortedMap is a sub-interface of a map that ensures keys are stored in a sorted order.
        
    * The primary class that implements SortedMap is [**TreeMap**](https://www.geeksforgeeks.org/java/treemap-in-java/) which maintains elements in a Red-Black tree structure to ensure sorting.
        
    * A [**comparator**](https://www.geeksforgeeks.org/java/java-comparator-interface/) can be passed to customize the sorting order of the keys.
        
    * A SortedMap orders the keys by their natural ordering (if the key implements Comparable) or by a specified Comparator (if provided).
        
    * SortedMap does not allow null keys or null values. If we insert a null key or value it will throw an error.
        
    
    In simple words sorted map and Navigable map both are interfaces which implements TreeMap so here is a simple java program.
    
    ```java
    package Collection_frameworks.Map.SortedMap;
    
    import java.util.SortedMap;
    import java.util.TreeMap;
    
    //internal implementation is red black tree which is a self balancing binary search tree
    
    public class sortedmapexample {
        public static void main(String[] args) {
            SortedMap<Integer,String> sortedMap = new TreeMap<>((a,b) -> b - a);
            sortedMap.put(13,"Harsh");
            sortedMap.put(29,"Vivek");
            sortedMap.put(15,"Gujju");
            System.out.println(sortedMap);
    
            System.out.println(sortedMap.firstKey());
            System.out.println(sortedMap.lastKey());
            System.out.println(sortedMap.headMap(15));
            System.out.println(sortedMap.tailMap(15));
        }
    
    }
    ```
    
    output:
    

```java
{29=Vivek, 15=Gujju, 13=Harsh}
29
13
{29=Vivek}
{15=Gujju, 13=Harsh}
```

Another example using NavigableMap

```java
package Collection_frameworks.Map.SortedMap.Navigablemap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class navigableexample {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navigableMap = new TreeMap<>((a, b) -> b - a);
        navigableMap.put(13,"Harsh");
        navigableMap.put(29,"Vivek");
        navigableMap.put(15,"Gujju");
        System.out.println(navigableMap);
        System.out.println(navigableMap.ceilingEntry(13));
        System.out.println(navigableMap.floorKey(20));
    }
}
```

output:

```java

{29=Vivek, 15=Gujju, 13=Harsh}
13=Harsh
29
```

3. ## <mark>HashTable</mark>
    
    `Hashtable` is considered a legacy class in Java primarily because it predates the introduction of the Java Collections Framework (JCF) in Java 1.2. While it was re-engineered to implement the `Map` interface and support generics in later versions, its original design and certain characteristics make it less preferred in modern Java development compared to alternatives like `HashMap` or `ConcurrentHashMap`.
    
    **Here's why** `Hashtable` is considered legacy:
    
    * **Pre-Collections Framework Origin:**
        
        `Hashtable` was part of Java from its early versions (JDK 1.0/1.1), before the standardized and more robust JCF was established.
        
    * **Synchronization:**
        
        `Hashtable` is inherently synchronized, meaning all its methods are thread-safe. While this can be useful in multithreaded environments, it introduces performance overhead even in single-threaded scenarios where synchronization is unnecessary. Modern alternatives like `HashMap` are unsynchronized for better performance in single-threaded contexts, and `ConcurrentHashMap` provides more fine-grained and efficient concurrency control for multithreaded use cases.
        
    * **Null Values:**
        
        `Hashtable` does not allow null keys or null values. This restriction can be inconvenient compared to `HashMap`, which permits a single null key and multiple null values.
        
    * **Performance:**
        
        Due to its heavy-handed synchronization, `Hashtable` generally exhibits lower performance than `HashMap` in scenarios where thread safety is not a primary concern. In concurrent environments, `ConcurrentHashMap` offers superior performance due to its more advanced concurrency mechanisms.
        
    * **Modern Alternatives:**
        
        The JCF introduced more flexible and performant alternatives like `HashMap` for general-purpose key-value storage and `ConcurrentHashMap` for thread-safe concurrent operations. These classes offer better design, performance, and features for most modern applications.
        
    
    In essence, while `Hashtable` remains functional and compatible with the JCF, its legacy design and performance characteristics make it a less optimal choice for new development compared to the more modern and efficient options available within the Collections Framework.
    

A simple java program:

```java
package Collection_frameworks.Map.Hashtable;

import java.util.Hashtable;

public class Hashtableexample {
    public static void main(String[] args) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        //hashtable is synchronized i.e it is thread safe
        //so the key and the value cannot be null
        //Its a legacy class because its being replaced by ConcurrentHashMap
        //It is slower than Hashmap because it is synchronized.
        //After a thresold Hashmap use Binary search tree if collision happened .
        //only linked list in case of collision.

        hashtable.put("Abir" , 82);
        hashtable.put("Rayan", 99);
        hashtable.put("Amber" , 13);

        System.out.println(hashtable);
        System.out.println("Value for key 2 : " + hashtable.get("Amber"));


//        hashtable.put("null" , null);//throws exception
//        System.out.println(hashtable);
    }
}
```

output:

```java
{Amber=13, Abir=82, Rayan=99}
Value for key 2 : 13
```

Another example:

```java
package Collection_frameworks.Map.Hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class threadsafeExample {
    public static void main(String[] args) {

        //we use hashtable because it is thread safe where as in hashmap it is not threadsafe and often missout some values
        Hashtable<Integer,String> hashMap = new Hashtable<>();
        //HashMap<Integer,String> hashMap = new HashMap<>();


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                hashMap.put(i,"Thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 10000; i < 20000; i++) {
                hashMap.put(i,"Thread2");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Final size of HashMap: " + hashMap.size());
    }
}
```

output:

```java
Final size of HashMap: 20000
```

so, if we use hashtable we will not miss any data whereas in HashMap missing of data is frequent which makes it thread unsafe  
but there are some drawbacks using Hashtable that it is synchronized, which makes it slower than HashTable .

4. ## <mark>ConcurrentMap</mark>
    
    `ConcurrentHashMap` in Java is a thread-safe implementation of the `Map` interface, designed for use in multi-threaded environments. It offers significant advantages over `HashMap` (which is not thread-safe) and `Hashtable` (which synchronizes all operations, leading to performance bottlenecks).
    
    **Key Features and Characteristics:**
    
    * **Thread Safety:**
        
        `ConcurrentHashMap` ensures thread-safe operations without locking the entire map. It achieves this by employing a fine-grained locking mechanism, often referred to as "segment locking" or "bin-level locking."
        
    * **High Concurrency:**
        
        Multiple threads can read from the map concurrently without any locking, and multiple threads can write to different segments or bins concurrently. This design minimizes contention and improves performance in highly concurrent scenarios.
        
    * **No** `ConcurrentModificationException`:
        
        Unlike `HashMap`, `ConcurrentHashMap` does not throw a `ConcurrentModificationException` during iteration even if the map is modified by other threads. Iterators provide a "weakly consistent" view of the map, reflecting elements as they existed at the time of iteration or subsequent modifications.
        
    * **No Null Keys or Values:**
        
        `ConcurrentHashMap` does not permit null keys or values. This design choice eliminates ambiguity that could arise in concurrent operations and simplifies the implementation of thread-safe behavior.
        
    * **Atomic Operations:**
        
        It provides atomic operations like `putIfAbsent()`, `computeIfPresent()`, and `replace()`, which allow for conditional updates without the need for external synchronization.
        
        **When to Use** `ConcurrentHashMap`:
        
        `ConcurrentHashMap` is the preferred choice when:
        
        * You need a `Map` implementation in a multi-threaded application.
            
        * You require high concurrency for both read and write operations.
            
        * You want to avoid `ConcurrentModificationException` during iteration.|
            
            ![ConcurrentHashMap in Java](https://media.geeksforgeeks.org/wp-content/uploads/20200911154622/ConcurrentHashMapinJava.png align="left")
            
    
    so here is a simple java program:
    

```java
package Collection_frameworks.Map.ConcurrentMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1 {
    public static void main(String[] args) {

        //in java 7 --> segement based locking like divided into --> 16 segments(initial capacity)  --> smaller hashmaps
        //only the segment being written to or read from is locked
        //so if we talk about read operation
        //read : do not require locking unless there is a write operation happening on the same segment.
        //write : so when the writing operation is happening then and there it will lock the segment

        //java8 --> no segmentation because there are only 16 segments so when the program runs we cannot scale them.
        //so what they will use --> Compare-And-Swap Approach --> no locking except resizing or collision happened so lock will happen
        // Thread z Last saw -->  a = 32
        //change it to 40
        // Thread z work --> a to 40
        //if a is still 42, then change it to 40 else don't change and retry.


        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("Abir" , 44);
        concurrentHashMap.put("Ash" , 28);
        concurrentHashMap.put("rigor" , 32);

        System.out.println("Map size : " + concurrentHashMap.size());
        System.out.println(concurrentHashMap.getOrDefault("Ayish", null));

        concurrentHashMap.remove("Ash");
        System.out.println("After remove : "+ concurrentHashMap);
    }
}
```

output:

```java
Map size : 3
null
After remove : {rigor=32, Abir=44}
```

### **<mark>ConcurrentSkipListMap</mark>**

If you want Concurrency in Hashmap use Concurrent Hashmap and if you want things sorted You can use `ConcurrentSkipListMap`

A simple Program:

```java
package Collection_frameworks.Map.ConcurrentMap.ConcurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class concurrentskiplistexample {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        // Adding elements
        map.put(3, "Apple");
        map.put(1, "Orange");
        map.put(5, "Banana");


        System.out.println("Map: " + map); // Output: Map: {1=Orange, 3=Apple, 5=Banana}

        // Retrieving elements
        System.out.println("Value for key 3: " + map.get(3)); // Output: Value for key 3: Apple

        // Range query
        System.out.println("Sub map from 2 to 4: " + map.subMap(2, 4)); // Output: Sub map from 2 to 4: {3=Apple}

        // Removing an element
        map.remove(1);
        System.out.println("Map after removing key 1: " + map); // Output: Map after removing key 1: {3=Apple, 5=Banana}
    }
}
```

output

```java
Map: {1=Orange, 3=Apple, 5=Banana}
Value for key 3: Apple
Sub map from 2 to 4: {3=Apple}
Map after removing key 1: {3=Apple, 5=Banana}
```

5. ## <mark>Immutable Hash Map</mark>
    
    In Java, an immutable `HashMap` is a `Map` implementation whose contents cannot be modified after creation. Once an immutable map is created, you cannot add, remove, or update its key-value pairs. Attempts to modify it will result in an `UnsupportedOperationException`.
    
    Several ways exist to create immutable maps in Java:
    
    **1\. Using** `Collections.unmodifiableMap()`:
    
    This method from the `java.util.Collections` class wraps an existing mutable `Map` and returns an unmodifiable view of it. Any attempts to modify the returned map will throw an `UnsupportedOperationException`.
    
    **2\. Using** `Map.of()` (Java 9+):
    
    For creating immutable maps with a small number of key-value pairs (up to 10), Java 9 introduced the `Map.of()` static factory methods.
    
    **3\. Using** `Map.ofEntries()` (Java 9+):
    
    For creating immutable maps with more than 10 key-value pairs or when you prefer to define entries explicitly, Java 9 also introduced `Map.ofEntries()`.
    
    **Advantages of Immutable Maps:**
    
    * **Thread safety:**
        
        Immutable maps are inherently thread-safe as their state cannot change after creation.
        
    * **Memory efficiency:**
        
        They can sometimes be more memory-efficient, especially for small maps, as they might optimize internal storage.
        
    * **Predictability:**
        
        Their fixed nature leads to more predictable program behavior and easier debugging.
        
    * **Security:**
        
        They can be safely passed to other methods or libraries without concerns about unintended modifications.
        
    
    Here is a simple java program to demonstrate:
    
    ```java
    package Collection_frameworks.Map.ImmutableMap;
    
    import java.util.Collections;
    import java.util.HashMap;
    import java.util.Map;
    
    public class ImmutableExample {
        public static void main(String[] args) {
            //what is immutable map ?
            /*where we cannot instantiate , add , remove , update and so on
            * */
    
            Map<String, Integer> map = new HashMap<>();
            map.put("Abir" , 1);
            map.put("Raj" , 2);
            Map<String, Integer> map1 = Collections.unmodifiableMap(map);
            System.out.println(map1);
    //        map1.put("c" , 3);   //throws exception
    
            //to avoid this there is another type of methods we will see that is map.of
            // but there is a limitation that it can only store 10 key value pairs so to avoid this thing there is another method
            Map<String, Integer> map2 = Map.of("Shubham", 42, "Raju", 54, "Sayan", 42);
            System.out.println(map2);
    
            //map.ofEntries is where we can store unlimited kay value pair
            Map<String, Integer> map3 = Map.ofEntries(Map.entry("Shubham", 42) , Map.entry("Raju", 54));
            System.out.println(map3);
    
        }
    }
    ```
    

output:

```java
{Abir=1, Raj=2}
{Shubham=42, Sayan=42, Raju=54}
{Shubham=42, Raju=54}
```

6. ## <mark>EnumMap</mark>
    
    `EnumMap` in Java is a specialized `Map` implementation designed for use with `Enum` type keys. It is part of the `java.util` package and offers several advantages when working with enums as keys compared to general-purpose `Map` implementations like `HashMap`.
    
    **Key characteristics and features of** `EnumMap`:
    
    * **Enum Keys Only:**
        
        `EnumMap` is specifically optimized to use enum constants as keys. You cannot use other object types as keys.
        
    * **High Performance:**
        
        It is significantly faster and more efficient than `HashMap` when using enums as keys because it leverages the ordinal values of enum constants for internal array-based storage. This avoids the overhead of hashing and potential collisions.
        
    * **Memory Efficiency:**
        
        `EnumMap` uses a compact internal representation, typically an array, which reduces memory overhead compared to `HashMap`.
        
    * **Natural Order:**
        
        Keys in an `EnumMap` are maintained in their natural order, which is the order in which the enum constants are declared within the enum type.
        
    * **No Null Keys:**
        
        `EnumMap` does not allow `null` keys and will throw a `NullPointerException` if you attempt to insert one. However, `null` values are permitted.
        
    * **Weakly Consistent Iterators:**
        
        Iterators returned by collection views (like `keySet()`, `entrySet()`, `values()`) are weakly consistent. They will not throw `ConcurrentModificationException` during concurrent modifications, but they may or may not reflect those modifications during iteration.
        
    * **Not Synchronized:**
        
        `EnumMap` is not synchronized. If thread safety is required, it must be explicitly handled, for example, by wrapping it with `Collections.synchronizedMap()`.
        
        Here is a simple java program which demonstrate the EnumMap:
        
        ```java
        package Collection_frameworks.Map.EnumMap;
        
        import java.util.EnumMap;
        import java.util.HashMap;
        import java.util.Map;
        
        public class EnumMapExample {
            public static void main(String[] args) {
        
                /*Array of size same as enum
                no hashing
                ordinal/index is used`
                * */
                Map<Day,String> map = new EnumMap<>(Day.class);
                map.put(Day.Friday , "Sleep");
                //System.out.println(Day.Friday.ordinal());
                System.out.println(map);
            }
        }
        
        enum Day{
            Monday,Tuesday,Wednesday,Thrusday,Friday,Saturday,Sunday
        }
        ```
        
        output:
        
        ```java
        {Friday=Sleep}
        ```
        
    

***“Just a Gentle Reminder If you are already reading You are ahead of 90% of people.  
I am not kidding You are putting efforts and you have patience.***

***so go ahead very few topics to cover….. Best of Luck”***

***“Tbh Hardwork beats talent”***

![Good luck meme](https://i.pinimg.com/474x/33/52/87/33528736e35debe64cffaf15d1696445.jpg align="center")

# **<mark>A Brief Overview of Java8</mark>**

why Java 8 was introduced as You see many coders or developers fears Java Programming Language  
Do You Know why?  
Its because they have to write class then they have to write the main method then they can print a java statement.  
so, that’s Why java 8 was introduced to write minimalistic and optimistic code

Java is also a Object Oriented Programming Language so before Java8 functional programming was missing so in java8 they were introduced in java

What new things were introduced in Java8?

1. Functional Programming
    
2. Lambda Expression
    
3. Streams
    
4. Date and Time API
    

![Top Java 8 Features With Examples - InterviewBit](https://www.interviewbit.com/blog/wp-content/uploads/2021/12/Features-of-Java-8-1024x554.png align="left")

1. ### **<mark>Lambda Expression</mark>**
    
    Lambda expressions are a feature of [Java](https://www.naukri.com/code360/library/introduction-to-java) [that](https://www.naukri.com/code360/library/introduction-to-java) allows the users to iterate, filter, and extract data from the collection library. It provides clear and concise ways to use expressions to represent method interfaces.
    
    It doesn’t require a lot of code. We don'[t ha](https://www.naukri.com/code360/library/introduction-to-java)ve to redefine the method for lambda expressions to provide the implementation. Only the implementation code needs to be defined explicitly.
    
    The compiler does not create a .class fil[e be](https://www.naukri.com/code360/library/introduction-to-java)cause we treat Java lambda expressions as functions.
    
    **Key characteristics and concepts:**
    
    * **Anonymous Functions:**
        
        Lambda expressions are essentially functions without a name.
        
    * **Functional Interfaces:**
        
        They are used to provide implementations for functional interfaces, which are interfaces containing exactly one abstract method. The `@FunctionalInterface` annotation can be used to enforce this constraint.
        
    * **Syntax:**
        
        The basic syntax is `(parameters) -> expression` for a single-expression body, or `(parameters) -> { // block of code }` for a multi-statement body.
        
    * **Conciseness and Readability:**
        
        Lambdas reduce boilerplate code, particularly when dealing with anonymous inner classes, leading to more compact and readable code.
        
    * **Passing Behavior as Data:**
        
        They allow you to treat functionality as a first-class citizen, meaning you can pass code as arguments to methods or assign it to variables.
        
    * **Integration with Collections and Streams:**
        
        Lambdas are extensively used with Java's Collections API and Stream API for operations like filtering, mapping, and iterating over data.
        
        Here is a simple code :
        
    

```java
package Java8.LambdaExpression;

public class Example2 {
    public static void main(String[] args) {
        MathOpn Sumopn = (a , b) -> a + b;
        MathOpn Subopn = (a , b) -> a - b;
        int res = Sumopn.opn(34,22);
        int res1 =Subopn.opn(123,113);
        System.out.println(res1);
        System.out.println(res);
    }
}
interface MathOpn {
    int opn(int a, int b);
}
```

output:

```java
10
56
```

### **Why Use Lambda Expressions?**

* **Concise Code:** Reduce boilerplate compared to anonymous classes.
    
* **Functional Programming:** Treat functions as first-class citizens.
    
* **Improved Readability:** Code is easier to read and maintain.
    
* **Enhanced Collections and Streams:** Simplify operations like filtering, mapping, and iterating.
    

### **Common Built-in Functional Interfaces**

| Interface | Method | Purpose |
| --- | --- | --- |
| [Predicate](https://www.geeksforgeeks.org/java/java-8-predicate-with-examples/) | boolean test(T t) | Tests a given condition and returns true or false. |
| [Consumer](https://www.geeksforgeeks.org/java/java-8-consumer-interface-in-java-with-examples/) | void accept(T t) | Performs an action on the given argument without returning a result. |
| [Supplier](https://www.geeksforgeeks.org/java/supplier-interface-in-java-with-examples/) | T get() | Supplies or generates a result without taking any input. |
| [Comparator&lt;T&gt;](https://www.geeksforgeeks.org/java/java-comparator-interface/) | int compare(T o1, T o2) | Compares two objects to determine their order. |
| [Comparable&lt;T&gt;](https://www.geeksforgeeks.org/java/comparable-interface-in-java-with-examples/) | int compareTo(T o) | Defines the natural ordering for objects of a class. |

***Predicate:***

so here is a basic example of predicate:

```java
package Java8.LambdaExpression;

import java.util.function.Predicate;

public class Example3predicate {
    public static void main(String[] args) {
        //predicate --> Functional Interface( Boolean Valued Function)
        //what does prediacte do? it just hold a condition
        //do u know how powerful is it u are storing a condition in a variable
        Predicate<Integer> isOdd = x -> x % 1 == 0;
        System.out.println(isOdd.test(5));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(5));

        Predicate<String> isWordsCheck = x -> x.startsWith("A");
        System.out.println(isWordsCheck.test("Abir"));
    }
}
```

output:

```java
true
false
true
```

***Consumer:***

A basic Example on Consumer:

```java
package Java8.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example5Consumer {
    public static void main(String[] args) {

        //what does consumer means
        //That means it will take/Consume something but doesnot return something
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(52);
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 8);
        Consumer<List<Integer>> print = x ->{
            for (int i : x){
                System.out.println(i);
            }
        };
        print.accept(list);
    }
}
```

output:

```java
52
1
3
4
5
8
```

***Supplier:***

Here is a simple java program to demonstrate:

```java
package Java8.LambdaExpression;

import java.util.function.Supplier;

public class Example6Supplier {
    public static void main(String[] args) {

        //why use this?
        //it will only give values like if u want something from the database and want it 100 times
        //so u can ask the Supplier method yo give you and all set
        Supplier<String> gimme = () -> "Hello Love";
        System.out.println(gimme.get());
    }
}
```

output:

```java
Hello Love
```

*“I have already covered compare and compareTo method in the Comparator so why writing again“\\*

A combined Example :

```java
package Java8.LambdaExpression;

import java.util.function.*;

public class Example7allCombined {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer,Integer> function = x -> x * x;
        Consumer<Integer> consumer = x ->System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        //As we see they only take one argumnet so how will store multiple arguments or 2 arguments
        //so , we use BiPredicate, BiFunction , BiConsumer

        BiPredicate<Integer,Integer> isumEven = (x,y) -> (x + y) % 2 == 0;
        System.out.println(isumEven.test(2,4));

        //similarly we will use BiConsumer

        BiFunction<String,String,Integer> biFunction = (x,y)-> (x+y).length();
        System.out.println(biFunction.apply("a","bc"));


        //for finding function we can also use UnaryOperator which implements Function so we dont have to write Integer 2 times
        UnaryOperator<Integer> a = x -> 2;

        //like that binary operator implements bifunction

        BinaryOperator<Integer> b = (x,y) ->(x + y ) ^ 2;
        System.out.println(b.apply(2,5));
    }
}
```

output:

```java
10000
true
3
5
```

2. ### **<mark>Streams</mark>**
    
    Stream is a feature in java 8 where we can process collections of data in a functional and declarative manner.
    
    It simplifies the data processing i.e. we don’t have to write big codes . It embraces Functional Programming which improves readability and maintainability without dealing with multithreading complexities we can easy Parallelism
    
    Stream API is used to process collections of objects.
    

### **How to Create a Java Stream**

Java Stream Creation is one of the most basic steps before considering the functionalities of the Java Stream. Below is the syntax given for declaring a Java Stream.

### **Syntax**

> *Stream&lt;T&gt; stream;*

Here, T is either a class, object or data type depending upon the declaration.

### **Different Operations On Streams**

There are two types of Operations in Streams:

1. Intermediate Operations
    
2. Terminal Operations
    

![What are Java 8 streams?](https://www.logicbig.com/tutorials/core-java-tutorial/java-util-stream/images/java-streams.png align="left")

### **<mark>Important Intermediate Operations</mark>**

There are a few Intermediate Operations mentioned below:

**1\. map()**: The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.

**Syntax:**

> *&lt;R&gt; Stream&lt;R&gt; map(Function&lt;? super T, ? extends R&gt; mapper)*

**2\. filter()**: The filter method is used to select elements as per the Predicate passed as an argument.

**Syntax:**

> *Stream&lt;T&gt; filter(Predicate&lt;? super T&gt; predicate)*

**3\. sorted()**: The sorted method is used to sort the stream.

**Syntax:**

> *Stream&lt;T&gt; sorted()  
> Stream&lt;T&gt; sorted(Comparator&lt;? super T&gt; comparator)*

**4\. flatMap():** The flatMap operation in Java Streams is used to flatten a stream of collections into a single stream of elements.

**Syntax:**

> *&lt;R&gt; Stream&lt;R&gt; flatMap(Function&lt;? super T, ? extends Stream&lt;? extends R&gt;&gt; mapper)*

**5\. distinct()**: Removes duplicate elements. It returns a stream consisting of the distinct elements (according to Object.equals(Object)).

**Syntax:**

> *Stream&lt;T&gt; distinct()*

**6\. peek()**: Performs an action on each element without modifying the stream. It returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.

**Syntax:**

> *Stream&lt;T&gt; peek(Consumer&lt;? super T&gt; action)*

Basic Java Program to demostrate:

```java
package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOpn {
    public static void main(String[] args) {
        //What are Intermediate Operation?
        /*They transform a stream into another stream
        They are lazy , meaning they dont execute until a terminal operation is invoked.
        * */

        //1. filter
        List<String> list = Arrays.asList("Aarav","Vihaan","Reyansh","Aditya","Arjun","Dev","Krishna","Ishan","Rohan","Advait","Saanvi","Anaya","Diya","Myra","Aarohi","Kiara","Ira","Navya","Tara","Meera","Harsh","Abir","Ritika","Nisha","Rehan","Samir","Arnav","Rudra","Ayaan","Ved","Om","Prisha","Avni","Kavya","Sara","Ishita","Anvi","Manya","Pari","Aanya","Trisha","Rhea","Simran","Tanish","Ritik","Ashwin","Neha","Manav","Akira","Ayush");
        //what does filter do it predicates over the whole array and check if the elements are there or not
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A")).limit(10).sorted();
        System.out.println(filteredStream.collect(Collectors.toList()));

        //2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);
        System.out.println(list);

        //3. Sorted List
        Stream<String> sorted = list.stream().sorted();

        //4. distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        //5. limit
        System.out.println(Stream.iterate(1, x->x+1).limit(100).count());

        //6. skip
        System.out.println(Stream.iterate(1 , x->x+1).skip(10).limit(100).count());
    }
}
```

output:

```java
[Aarav, Aarohi, Abir, Aditya, Advait, Anaya, Arjun, Arnav, Avni, Ayaan]
[Aarav, Vihaan, Reyansh, Aditya, Arjun, Dev, Krishna, Ishan, Rohan, Advait, Saanvi, Anaya, Diya, Myra, Aarohi, Kiara, Ira, Navya, Tara, Meera, Harsh, Abir, Ritika, Nisha, Rehan, Samir, Arnav, Rudra, Ayaan, Ved, Om, Prisha, Avni, Kavya, Sara, Ishita, Anvi, Manya, Pari, Aanya, Trisha, Rhea, Simran, Tanish, Ritik, Ashwin, Neha, Manav, Akira, Ayush]
15
100
100
```

### <mark>Terminal Operation</mark>

Terminal Operations are the type of Operations that return the result. These Operations are not processed further just return a final result value.

### **Important Terminal Operations**

**1\. collect()**: The collect method is used to return the result of the intermediate operations performed on the stream.

**Syntax:**

> *&lt;R, A&gt; R collect(Collector&lt;? super T, A, R&gt; collector)*

**2\. forEach()**: The forEach method is used to iterate through every element of the stream.

**Syntax:**

> *void forEach(Consumer&lt;? super T&gt; action)*

**3\. reduce():** The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a BinaryOperator as a parameter.

**Syntax:**

> *T reduce(T identity, BinaryOperator&lt;T&gt; accumulator)  
> Optional&lt;T&gt; reduce(BinaryOperator&lt;T&gt; accumulator)*

**4\. count()**: Returns the count of elements in the stream.

**Syntax:**

> *long count()*

**5\. findFirst()**: Returns the first element of the stream, if present.

**Syntax:**

> *Optional&lt;T&gt; findFirst()*

**6\. allMatch()**: Checks if all elements of the stream match a given predicate.

**Syntax:**

> *boolean allMatch(Predicate&lt;? super T&gt; predicate)*

**7\. anyMatch()**: Checks if any element of the stream matches a given predicate.

**Syntax:**

> *boolean anyMatch(Predicate&lt;? super T&gt; predicate)*

Here ans variable is assigned 0 as the initial value and i is added to it.

**Note:** Intermediate Operations are running based on the concept of Lazy Evaluation, which ensures that every method returns a fixed value(Terminal operation) before moving to the next method.

A simple program to demonstrate :

```java
package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationExample {
    public static void main(String[] args) {

        //Taking out the result from streams
        List<Integer> opn = Arrays.asList(1,2,4,5,3,7);

        //1.collect
        System.out.println(opn.stream().skip(1).toList());
        opn.stream().skip(1).collect(Collectors.toList());

        //2. for-each
        opn.stream().forEach(x -> System.out.println(x));

        //3. reduce : combines elements to produce a single result
        Optional<Integer> optionalInteger = opn.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        //4. anyMatch() , allMatch() , noneMatch()

        boolean b = opn.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = opn.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = opn.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        //5. findFirst , findAny
        System.out.println(opn.stream().findFirst().get());
        System.out.println(opn.stream().findAny().get());

    }

}
```

output:

```java
[2, 4, 5, 3, 7]
1
2
4
5
3
7
22
true
true
true
1
1
```

Another Example using all the methods :

```java
package Java8.Streams;

import java.util.Arrays;
import java.util.List;

public class AllStreamsExamples {
    public static void main(String[] args) {

        //1. find the names of the person whose length are less than 3
        List<String> names = Arrays.asList("Aarav","Vihaan","Reyansh","Aditya","Arjun","Dev","Krishna","Ishan","Rohan","Advait","Saanvi","Anaya","Diya","Myra","Aarohi","Kiara","Ira","Navya","Tara","Meera","Harsh","Abir","Ritika","Nisha","Rehan","Samir","Arnav","Rudra","Ayaan","Ved","Om","Prisha","Avni","Kavya","Sara","Ishita","Anvi","Manya","Pari","Aanya","Trisha","Rhea","Simran","Tanish","Ritik","Ashwin","Neha","Manav","Akira","Ayush");
        System.out.println(names.stream().filter(x -> x.length() < 4).toList());

        //2. Squaring and sorted Numbers
        List<Integer> list = Arrays.asList(5,6,8,2,9,1);
        System.out.println(list.stream().map(x-> x* x).sorted().toList());

        //3.summing values
        List<Integer> integers = Arrays.asList(1,3,4,5,7,9);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        //4.Counting occurence of a character
        String words = "Hula Bula Ghula";
        System.out.println(words.chars().filter(x-> x == 'l').count());
    }
}
```

output:

```java
[Dev, Ira, Ved, Om]
[1, 4, 25, 36, 64, 81]
29
3
```

# **<mark>SET:</mark>**

## 🧩 Understanding Set in Java (Collection Framework)

### 🔹 1. What is a Set?

A **Set** in Java is part of the **Java Collections Framework** and represents a **collection of unique elements** — it **does not allow duplicates**.

* **Interface:** `java.util.Set<E>`
    
* **Key Property:** No duplicate elements.
    
* **Underlying principle:** Most `Set` implementations are based on a `Map` (especially `HashMap`).
    

**Time Complexity:**  
For most operations (add, remove, contains) → **O(1)** for `HashSet` (because it uses hashing).

---

### 🔹 2. Why Use a Set?

Use a `Set` when:

* You need **unique elements only** (like IDs, usernames, etc.).
    
* You **don’t care about insertion order** (in case of `HashSet`).
    
* You want **fast search and insertion**.
    

---

## 🔹 3. The Set Hierarchy

In Java, the `Set` interface has multiple concrete implementations:

![Java 8 - Sets in Java and how to use them](https://java8.info/images/sethierarchy.jpg align="left")

Each of these implementations has unique characteristics 👇

---

## 🔸 4. Types of Set Implementations

1. ### `HashSet`
    

* **Implements:** `Set`
    
* **Internal structure:** Uses a `HashMap` internally.
    
* **Order:** *Unordered* — elements are stored based on hash value.
    
* **Performance:** O(1) average for add, remove, contains.
    
* **Allows null?** ✅ Yes (only one `null`).
    

```java
Set<Integer> set = new HashSet<>();
set.add(12);
set.add(1);
set.add(3);
set.add(1);
System.out.println("Unordered Elements: " + set);
```

output:

```java
Unordered Elements: [1, 3, 12] (order may vary)
```

2. ### `LinkedHashSet`
    

* **Implements:** `Set`
    
* **Internal structure:** Linked list + Hash table.
    
* **Order:** *Insertion order is preserved*.
    
* **Performance:** Slightly slower than `HashSet` but predictable order.
    

**Example:**

```java
Set<Integer> linkedSet = new LinkedHashSet<>();
linkedSet.add(12);
linkedSet.add(1);
linkedSet.add(3);
System.out.println("Ordered Elements: " + linkedSet);
```

output:

```java
Ordered Elements: [12, 1, 3]
```

3. ### `TreeSet`
    

* **Implements:** `NavigableSet`
    
* **Internal structure:** Red-Black Tree (self-balancing BST).
    
* **Order:** Sorted (natural order or custom comparator).
    
* **Performance:** O(log n) for add, remove, contains.
    
* **Allows null?** ❌ No, throws `NullPointerException`.
    

**Example:**

```java
Set<Integer> treeSet = new TreeSet<>();
treeSet.add(12);
treeSet.add(1);
treeSet.add(3);
System.out.println("Sorted Elements: " + treeSet);
```

output:

```java
Sorted Elements: [1, 3, 12]
```

4. ### `EnumSet`
    

* **Implements:** `Set`
    
* **Optimized for:** Enumerations (`enum` types only).
    
* **Very fast and memory-efficient**.
    
* **Cannot store nulls.**
    

**Example:**

```java
enum Days { MON, TUE, WED, THU, FRI }
Set<Days> enumSet = EnumSet.of(Days.MON, Days.WED);
```

---

## 5\. Common Methods in Set

| Method | Description |
| --- | --- |
| `add(E e)` | Adds element if not already present |
| `remove(Object o)` | Removes specified element |
| `contains(Object o)` | Checks if element exists |
| `clear()` | Removes all elements |
| `isEmpty()` | Checks if set is empty |
| `size()` | Returns number of elements |

Example:

```java
Set<Integer> s = new TreeSet<>(List.of(1, 3, 12));
System.out.println(s.contains(12)); // true
System.out.println(s.remove(3));    // true
s.clear();
System.out.println(s.isEmpty());    // true
```

---

## 🔹 6. Iterating Through a Set

```java
for (int i : set) {
    System.out.println(i);
}
```

OR using iterator:

```java
Iterator<Integer> it = set.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

## 7\. Thread Safety in Sets

Sets are **not thread-safe** by default.  
To make them thread-safe, we have two main options:

1. ### Using `Collections.synchronizedSet()`
    

```java
Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<>());
```

However, it requires **external synchronization** during iteration.

2. ### Using `ConcurrentSkipListSet`
    

* **Implements:** `NavigableSet`
    
* **Thread-safe** and **non-blocking**.
    
* Internally uses **Skip List** data structure.
    
* **Sorted order maintained** even in concurrent access.
    

**Example:**

```java
NavigableSet<Integer> concurrentSet = new ConcurrentSkipListSet<>();
concurrentSet.add(10);
concurrentSet.add(2);
concurrentSet.add(5);
System.out.println(concurrentSet); // [2, 5, 10]
```

---

## 🔹 8. Relationship Between Map and Set

When we call `map.keySet()`, it returns a `Set` of keys — since keys in a map are always **unique**, they follow the same property as `Set`.

```java
Map<Integer, String> map = new HashMap<>();
Set<Integer> keys = map.keySet();
```

---

## 🧠 Summary Table

| Set Type | Order | Allows Duplicates | Allows Null | Thread-safe | Internal Structure |
| --- | --- | --- | --- | --- | --- |
| `HashSet` | ❌ Unordered | ❌ No | ✅ Yes | ❌ No | HashMap |
| `LinkedHashSet` | ✅ Insertion | ❌ No | ✅ Yes | ❌ No | LinkedHashMap |
| `TreeSet` | ✅ Sorted | ❌ No | ❌ No | ❌ No | Red-Black Tree |
| `EnumSet` | ✅ Natural (Enum order) | ❌ No | ❌ No | ❌ No | Bit vector |
| `ConcurrentSkipListSet` | ✅ Sorted | ❌ No | ❌ No | ✅ Yes | Skip List |

---

## 🔹 9. Key Takeaways

* Use `HashSet` for **fast, unordered** operations.
    
* Use `LinkedHashSet` when **order matters**.
    
* Use `TreeSet` when **sorting is required**.
    
* Use `EnumSet` for **enums only**.
    
* Use `ConcurrentSkipListSet` for **thread-safe, sorted** operations.
    

# <mark>4.Queue</mark>

The Queue interface is part of the [**java.util**](https://www.geeksforgeeks.org/java/java-util-package-java/) package. It extends the [**Collection interface**](https://www.geeksforgeeks.org/java/collection-interface-in-java-with-examples/).

* Elements are processed in the order determined by the queue implementation (First In First Out or FIFO for LinkedList, priority order for PriorityQueue).
    
* Elements cannot be accessed directly by index.
    
* A queue can store duplicate elements.
    

Here’s a Java Program to demonstrates :

```java
package Collection_frameworks.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //so what is Queue ? --> Its a data structure which works on FIFO concept i.e. first in first out
        //Elements are added at the end and removed from the front.
        //we can use linked list to perform both stack and queue


        //we are performing stack here which is following LIFO principle.
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addFirst(1);
        integers.addFirst(4);
        integers.addFirst(9);
        integers.addFirst(6);
        System.out.println(integers);

        //we are performing Queue here which is following FIFO principle.
        LinkedList<Integer> queueintger = new LinkedList<>();

        //enqueue
        queueintger.addLast(1);
        queueintger.addLast(4);
        queueintger.addLast(9);
        queueintger.addLast(6);
        System.out.println(queueintger);

        //dequeue
        Integer i = queueintger.removeFirst();
        System.out.println(queueintger);

        //peek
        Integer first = queueintger.getFirst();
        System.out.println(first);


        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(4);
        integerQueue.add(9);
        integerQueue.add(6);
        System.out.println("\n using queue interface");
        System.out.println("Done by queue : "+integerQueue);

        //we are performing Queue here which is following FIFO principle.
        Queue<Integer> queueinteger = new LinkedList<>();

        //enqueue
        queueinteger.add(1);
        queueinteger.add(4);
        queueinteger.add(9);
        queueinteger.add(6);
        System.out.println(queueinteger);

        //dequeue
        Integer remove = queueinteger.remove();
        System.out.println(remove);

        //peek
        Integer peek = queueinteger.peek();
        System.out.println(peek);

    }
}
```

output:

```java
[6, 9, 4, 1]
[1, 4, 9, 6]
[4, 9, 6]
4

 using queue interface
Done by queue : [1, 4, 9, 6]
[1, 4, 9, 6]
1
4
```

![Queue](https://media.geeksforgeeks.org/wp-content/uploads/20251025102440227179/Queue.webp align="left")

## Common Implementations of Queue Interface

* [**LinkedList**](https://www.geeksforgeeks.org/java/linked-list-in-java/)**:** A FIFO queue that allows null elements and implements both Queue and Deque interfaces.
    
* [**ArrayDeque**](https://www.geeksforgeeks.org/java/arraydeque-in-java/)**:** A resizable array-based queue that is faster than LinkedList and does not allow nulls.
    
* [**PriorityQueue**](https://www.geeksforgeeks.org/java/priority-queue-in-java/)**:** A queue where elements are processed according to their priority instead of insertion order.
    
* [**ConcurrentLinkedQueue**](https://www.geeksforgeeks.org/java/concurrentlinkedqueue-in-java-with-examples/)**:** A thread-safe, non-blocking queue suitable for concurrent environments.
    
* [**BlockingQueue:**](https://www.geeksforgeeks.org/java/blockingqueue-interface-in-java/) A thread-safe queue that supports blocking operations for producer-consumer scenarios.
    

we are done with java Collection Frameworks Hurray Hurray !!

![](https://cdn.hashnode.com/res/hashnode/image/upload/v1762614457800/064b7c1a-67e9-4a8e-8a1a-1eb320be2e15.gif align="center")

I will just say one thing that :

***“Successful people don't do extraordinary things; they do ordinary things extraordinarily well”***

## **Conclusion:**

The Java collection framework is a set of classes and interfaces that provide a standard way of representing and manipulating collections of objects in the Java programming language.

It allows developers/testers to work with collections of objects in a consistent and efficient manner. It provides useful methods for storing, accessing, and manipulating the elements in a collection, and makes it easy to switch between different implementations of the collections depending on the requirements of the application.

The above-shared list consists of some of the commonly used interfaces and classes in the Java Collection Framework.

Thanks for reading. Happy learning!

for more practiced code follow my github : [more program](https://github.com/Abir-Shaikh/Java-Backend/tree/master/all_file/src)

docs ref : [https://docs.oracle.com/javase/8/docs/technotes/guides/collections/](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/)

Again Thank You for reading till last… You don’t know but you are ahead of 90% coders.

**Abir Shaikh**  
Backend Developer  

[Twitter](https://x.com/Abir_Shaikh_) | [LinkedIn](https://www.linkedin.com/in/abir-shaikh-10ab29321/) | [Github](https://github.com/Abir-Shaikh)

Please Hit a Follow Onegaii si masu

![Onegai... - 9GAG](https://img-9gag-fun.9cache.com/photo/ax10r01_460s.jpg align="center")