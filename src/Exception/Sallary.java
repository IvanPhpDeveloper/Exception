package Exception;

public class Sallary {
    final static int COSTS = 5000;



    private int sallary;//зададим зарплату


    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) throws SallaryException { //добавляем в сигнатуру метода
        //если доход меньше 0
        if (sallary < COSTS) {


            //бросаем наше исключение
            //значит человек ничего не зарабатывает

            throw new SallaryException("Вы в долгах");
        }

        this.sallary = sallary;
    }

}


