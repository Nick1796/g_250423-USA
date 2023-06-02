package Lesson9.task2;

public class BrokenElevator {

    //сломанный лифт
   // лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.

      //      Ввод:
   // H = 200, N = 50, M = 1
   // Ответ: 5
   // Объяснение:
  //  Первый подьем: 50 - 1 = 49
   // Второй подьем: 49 + 50 - 1 = 98
   // Третий подьем: 98 + 50 - 1 = 147
  //  Четвертый подьем: 147 + 50 - 1 = 196
   // Пятый подьем: выйти за пределы H.

   // реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)


    public static void main(String[] args) {
        System.out.println(numberOfLifts(20, 50, 1));



    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown){
      int currentFloor = 1;
      int numberOflifts = 0;
      while (currentFloor < floor) {
          currentFloor += stepUp;
          numberOflifts++;

          if (currentFloor >= floor){
              break;
          }

          currentFloor -= stepDown;


      }
      return numberOflifts;

    }


}
