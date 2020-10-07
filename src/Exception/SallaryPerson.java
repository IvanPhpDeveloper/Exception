package Exception;

public class SallaryPerson {

    public void getIncome() throws SallaryException {

        Sallary s=new Sallary();//создаем обьект Sallary
        try {
            s.setSallary(1300);//обзначаем зарплату

        } catch (SallaryException e) { //ловим исключение
            e.printStackTrace();
        }
        finally {
            s.getSallary();
        }


    }
}

