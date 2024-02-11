package db;

import model.Tasks;

import java.util.ArrayList;
//
//import models.Item;
//
//import java.util.ArrayList;
//
//public class DBManager {
//    public static ArrayList<Item> itemArrayList = new ArrayList<>();
//
//    static {
//        itemArrayList.add(new Item(1L, "Iphone 13Pro Max", 300000, 20));
//        itemArrayList.add(new Item(2L, "Iphone 14Pro Max", 400000, 24));
//        itemArrayList.add(new Item(3L, "Iphone 15Pro Max", 500000, 40));
//    }
//
//    public static ArrayList<Item> getAllItems() {
//        return itemArrayList;
//    }
//
//    public static Item getItemById(Long id) {
//        for (Item item : itemArrayList) {
//            if (item.getId() == id) {
//                return item;
//            }
//        }
//        return null;
//    }
//
//    public static void deleteItem(Long id) {
//        for (int i = 0; i < itemArrayList.size(); i++) {
//            if (itemArrayList.get(i).getId() == id) {
//                itemArrayList.remove(i);
//                break;
//            }
//        }
//    }
//
//    public static Item updateItem(Item item) {
//        for (int i = 0; i < itemArrayList.size(); i++) {
//            if (item.getId() == itemArrayList.get(i).getId()) {
//                itemArrayList.set(i, item);
//                return item;
//            }
//        }
//        return null;
//    }
//public static void updateItem(Item item) {
//}
//}
//}


public class DBManager {
    public static ArrayList<Tasks> tasksArrayList = new ArrayList<>();
    public static  long id = 2L;

    static {
        tasksArrayList.add(new Tasks(1L, "Создать веб приложение на Java EE", "Нужно будет создать собственное приложение на Java EE для себя", "23.10.2021", true));
    }

    public static ArrayList<Tasks> getAllTasks(){
        return tasksArrayList;

    }

    public static void addTask(Tasks task){
        task.setId(id);
        task.setStatus(false);
        tasksArrayList.add(task);
        id++;
    }

    public static Tasks getTask(Long id){
        for (Tasks task : tasksArrayList){
            if (task.getId()==id){
                return task;
            }
        }
        return null;
    }

    public static void updateTask(Tasks task) {
    }


    public void deleteTask(Long id){
        tasksArrayList.removeIf(task -> task.getId().equals(id));
    }
}




