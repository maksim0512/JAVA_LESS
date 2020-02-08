package homework.home3;

public class Employe //Сотрудник
{
    private int tn;//табельный номер
    private String fio;//ФИО
    private boolean married;//женат/не женат
    private double salary;//зарплата
    private String addressPropiski;//адрес прописки


    //Изменение семейного положения
    public boolean EditMaritalStatus(boolean married)
    {
        if (married == true)//женат
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    //Изменить зарплату
    public double EditSalary(double salary)
    {
        if (salary<1200.5)
        {
            salary = 1250.85;//увеличиваем до 1250.85
        }
        else
        {
            salary = 1230.85; //уменьшаем
        }

        return salary;
    }

    //Проверка заполненности адреса прописки
    public void EditProp(String addressPropiski)
    {
        if(addressPropiski.isEmpty())//прописка не заполнена
        {
            System.out.println("Заполните поле прописки");
        }
    }


}
