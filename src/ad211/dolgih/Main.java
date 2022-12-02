package ad211.dolgih;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int answer=0,size;

        List<Number> list1 = new List<Number>();
        LinkedList<Number> linkedList1 = new LinkedList<Number>();

        List<Number> list2 = new List<Number>();
        LinkedList<Number> linkedList2 = new LinkedList<Number>();
        while (answer!=7) {
            System.out.println("1.Generate and show first list\n2.Generate and show second list\n3.Add element in list\n4.Delete element from list.\n5.Clear list\n6.Show intersection of elements in lists\n7.Exit");
            System.out.print("Your answer: ");
            answer = console.nextInt();

            switch (answer){
                case 1:{
                    System.out.println("Enter size of list");
                    size = console.nextInt();
                    while(size<0 || size>100){
                        System.out.println("Enter normal value!!!");
                        size = console.nextInt();
                    }

                    list1.generateItems(linkedList1,size);
                    list1.setList(linkedList1);

                    System.out.println("First list: ");
                    System.out.println(list1.getList());
                    break;
                }
                case 2:{
                    System.out.println("Enter size of list");
                    size = console.nextInt();
                    while(size<0 || size>100){
                        System.out.println("Enter normal value!!!");
                        size = console.nextInt();
                    }

                    list2.generateItems(linkedList2,size);
                    list2.setList(linkedList2);

                    System.out.println("Second list: ");
                    System.out.println(list2.getList());
                    break;
                }
                case 3:{
                    addElement(linkedList1,linkedList2);

                    System.out.println("First list: ");
                    System.out.println(list1.getList());

                    System.out.println("Second list: ");
                    System.out.println(list2.getList());
                    break;
                }
                case 4:{
                    deleteElement(linkedList1,linkedList2);

                    System.out.println("First list: ");
                    System.out.println(list1.getList());

                    System.out.println("Second list: ");
                    System.out.println(list2.getList());
                    break;
                }
                case 5:{
                    clearList(linkedList1,linkedList2);

                    System.out.println("First list: ");
                    System.out.println(list1.getList());

                    System.out.println("Second list: ");
                    System.out.println(list2.getList());
                    break;
                }
                case 6:{
                    System.out.println("First list: ");
                    System.out.println(list1.getList());

                    System.out.println("Second list: ");
                    System.out.println(list2.getList());

                    System.out.println("Intersection:");
                    System.out.println(list1.intersection(list1.getList(),list2.getList()));
                    break;
                }
                case 7:{
                    break;
                }
                default:{
                    System.out.println("Error");
                }
            }
        }


    }

    public static void addElement(LinkedList<Number> list1,LinkedList<Number> list2){
        Scanner console = new Scanner(System.in);
        int answer=0;
        System.out.println("Выберите список, в который хотите добавить элемент:\n1.First list\n2.Second list");
        answer=console.nextInt();
        if(answer==1){
            System.out.println("Напишите число,которое хотите добавить:");
            Number element = console.nextInt();
            list1.add((Number)element);
        } else if (answer==2) {
            System.out.println("Напишите число,которое хотите добавить:");
            Number element = console.nextInt();
            list2.add((Number)element);
        }else {
            System.out.println("Такого у нас нет");
        }
    }

    public static void deleteElement(LinkedList<Number> list1,LinkedList<Number> list2){
        Scanner console = new Scanner(System.in);
        int answer=0;
        System.out.println("Выберите список, из которого хотите удалить элемент:\n1.First list\n2.Second list");
        answer=console.nextInt();
        if(answer==1){
            System.out.println("Напишите число,которое хотите удалить:");
            Number element = console.nextInt();
            list1.remove((Number)element);
        } else if (answer==2) {
            System.out.println("Напишите число,которое хотите удалить:");
            Number element = console.nextInt();
            list2.remove((Number)element);
        }else {
            System.out.println("Такого у нас нет");
        }
    }

    public static void clearList(LinkedList<Number> list1,LinkedList<Number> list2){
        Scanner console = new Scanner(System.in);
        int answer=0;
        System.out.println("Выберите список, который хотите очистить:\n1.First list\n2.Second list");
        answer=console.nextInt();
        if(answer==1){
            list1.clear();
        } else if (answer==2) {
            list2.clear();
        }else {
            System.out.println("Такого у нас нет");
        }
    }


}