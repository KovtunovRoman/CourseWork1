public class DataSampling {
    public static void DataSamplingFile() {
        try {
            if ( //(arrayOfCSVFile[0].equals("")) &                                   //курсы по выбору
                    (Solution.arrayOfCSVFile[1].equals("True")) &                              //бакалавр
                            (Solution.arrayOfCSVFile[2].equals("1")) &                         //курс
                            //(arrayOfCSVFile[3].equals("")) &                        //предмет
                            (Solution.arrayOfCSVFile[4].equals("False")) &                     //к/в?
                            //(arrayOfCSVFile[5].equals("")) &                        //группа
                            //(arrayOfCSVFile[7].equals("")) &                        //бюджет
                            //(arrayOfCSVFile[8].equals("")) &                        //студент
                            (Solution.arrayOfCSVFile[9].equals("17-18-summer")))               //год сезон
            {
                if ((!Solution.arrayOfCSVFile[6].equals("3")) &
                        (!Solution.arrayOfCSVFile[6].equals("4")) &
                        (!Solution.arrayOfCSVFile[6].equals("5"))) {                       //если оценка не 3 4 5

                    String[] parts = Solution.arrayOfCSVFile[6].split("/");
                    Solution.arrayOfCSVFile[6] = parts[0];                                 //делим по /, берем 1-ый элемент

                    if (Solution.arrayOfCSVFile[6].equals("зач") ||
                            Solution.arrayOfCSVFile[6].equals("зач ") ||
                            Solution.arrayOfCSVFile[6].equals("зач*")) {
                        Solution.counterOffsets++;
                    }

                    //незачеты

                    if (Solution.arrayOfCSVFile[6].equals("ня") ||
                            Solution.arrayOfCSVFile[6].equals("ня ") ||
                            Solution.arrayOfCSVFile[6].equals("неяв")) {
                        Solution.arrayOfCSVFile[6] = "2";
                    }                                                               //неявка = 2

                    switch (Solution.arrayOfCSVFile[6]) {
                        case "3*" -> Solution.arrayOfCSVFile[6] = "3";                        //убираем *
                        case "4*" -> Solution.arrayOfCSVFile[6] = "4";
                        case "5*" -> Solution.arrayOfCSVFile[6] = "5";
                    }
                }

                if ((!Solution.arrayOfCSVFile[6].equals("2")) &
                        (!Solution.arrayOfCSVFile[6].equals("3")) &
                        (!Solution.arrayOfCSVFile[6].equals("4")) &
                        (!Solution.arrayOfCSVFile[6].equals("5"))) {
                    Solution.arrayOfCSVFile[6] = null;
                } else {
                    Solution.counterStudentsGrades++;                                          //считаем кол-во студентов
                    Solution.sumOfGrades += Integer.parseInt(Solution.arrayOfCSVFile[6]);         //считаем сумму оценок
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



