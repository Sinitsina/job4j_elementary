package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll(Item[] items) {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int sizeInner = 0;
        Item[] itemFoundNames = new Item[size];
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name.getName().equals(key)) {
                itemFoundNames[sizeInner] = name;
                sizeInner++;
            }
        }
        return Arrays.copyOf(itemFoundNames, sizeInner);
    }
}