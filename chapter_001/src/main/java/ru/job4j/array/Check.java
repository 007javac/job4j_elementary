package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean tmp = false;
          for (int index = 0; index != data.length; index++) {
              if (index == 0) {
                  tmp = data[index];
              }
              if (tmp != data[index]) {
                  result = false;
                  break;
              }
          }
        return result;
    }
}