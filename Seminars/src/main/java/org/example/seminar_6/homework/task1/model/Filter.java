package org.example.seminar_6.homework.task1.model;


import java.lang.reflect.Field;
import java.util.*;

public class Filter {
    Map<Integer, String> filterProperties = new HashMap<>();

    public Filter(Map<Integer, String> filterProperties) {
        this.filterProperties = filterProperties;

    }
    public Filter() {
    }

    @Override
    public String toString() {
        return "Filter{" +
                "filterProperties=" + filterProperties +
                '}';
    }

    /**
     *
     * @param className класс, из полей которого собираем фильтр
     * @return возвращает Map<Integer, String> с критериями фильтра
     */
    public Map<Integer, String> getFilterFromClass(Class className) {
        Field[] arrayFields = Notebook.class.getDeclaredFields();
        for(int i = 0; i < arrayFields.length; i++) {
            filterProperties.put(i + 1, arrayFields[i].getName());
        }

        return filterProperties;
    }

    /**
     *
     * @param filterProperties map с критериями фильтра
     * @return возвращает Map<String, String> с указанными минимальными параметрами фильтрации
     */
    public Map<String, String> getFilterValues(Map<Integer, String> filterProperties) {
        Map<String, String> filterValues = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (var entry : filterProperties.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        while (true) {
            System.out.print("Введите цифру, соответстующую необходимому критерию. Для выхода нажмите 0: ");
            int selectFilter = Integer.parseInt(sc.nextLine());
             if (selectFilter == 0) {
                System.out.println("Параметры фильтрации: " + filterValues);
                break;
            } else if (selectFilter <= filterProperties.size()) {
                System.out.print("Введите минимальное значение фильтра " + filterProperties.get(selectFilter) + " : ");
                String inputValue = sc.nextLine();
                filterValues.put(filterProperties.get(selectFilter), inputValue);
                System.out.println(filterValues);
            }
            else {
                System.out.println("Некорректное значение");
            }
        }

        return filterValues;
    }

    /**
     *
     * @param notebooks множество ноутбуков
     * @return возвращает отфильтрованное множество ноутбуков
     */
    public Set<Notebook> filterNotebooks(Set<Notebook> notebooks) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        Map<Integer, String> filterProperties = getFilterFromClass(Notebook.class);
        Map<String, String> filterValues = getFilterValues(filterProperties);

        for (Notebook item : notebooks) {
            if ((filterValues.get("ram") == null || item.ram >= Integer.parseInt(filterValues.get("ram")))
                    &&(filterValues.get("HDD") == null || item.HDD >= Integer.parseInt(filterValues.get("HDD")))
                    && (filterValues.get("os") == null || item.os.equalsIgnoreCase(filterValues.get("os")))
                    && (filterValues.get("color") == null || item.color.equalsIgnoreCase(filterValues.get("color")))) {
                filteredNotebooks.add(item);
            }
        }

        return filteredNotebooks;
    }
}
