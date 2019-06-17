package ru.sharafan.lesson21.lesson21_1;

import java.util.Map;
import java.util.HashMap;

public class Filter {
    /**
     * Проверяем множество на уникальность фамилий
     * @param map
     * @return
     */
    public boolean isUnique(Map<String, String> map)
    {
        Map<String, Integer> counter = this.getCounter(map);
        for (Map.Entry<String, Integer> item : counter.entrySet())
        {
            if (item.getValue() > 1)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Преобразуем текущее множество в множество вида фамилия = количество, для подсчета одинаковых фамилий
     * @param map
     * @return
     */
    private Map<String, Integer> getCounter(Map<String, String> map)
    {
        HashMap<String, Integer> counter = new HashMap<>();
        for (Map.Entry<String, String> item : map.entrySet())
        {
            String surname = item.getValue();
            if (!counter.containsKey(surname))
            {
                counter.put(surname, 1);
            }
            else
            {
                counter.compute(item.getValue(), (surnameKey, surnameCount) -> surnameCount + 1);
            }
        }
        return counter;
    }
}