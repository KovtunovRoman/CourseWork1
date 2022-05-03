public class AllSout {
    public static void AllSoutFile() {
        try {
            System.out.println("кол-во студентов" + '\t' + Solution.counterStudentsGrades);
            System.out.println("сумма оценок" + '\t' + '\t' + Solution.sumOfGrades);
            System.out.println("кол-во зачетов" + '\t' + '\t' + Solution.counterOffsets);

            float percentOffsets = (float) Solution.counterOffsets / (float) Solution.counterStudentsGrades;             //% зачетов = кол-во зачетов / кол-во студентов
            System.out.printf("процент зачетов" + '\t' + '\t' + "%.2f", percentOffsets);
            System.out.println();

            float conclusion = (float) Solution.sumOfGrades / (float) Solution.counterStudentsGrades;              //результат = сумма оценок/кол-во студентов
            System.out.printf("средний балл" + '\t' + '\t' + "%.3f", conclusion);                            //округление до 3 знаков после запятой
            System.out.println();

            float itog = conclusion * percentOffsets;                                         //итог с * на зачеты

            System.out.printf("итоговое число" + '\t' + '\t' + "%.3f", itog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
