package co.il.dmobile.myapplication_2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataPersistencyHelper {

    public static Context Context;

    public static void StoreData(List<Car> cars)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        SharedPreferences.Editor editor = sp.edit();
        String json = new Gson().toJson(cars);
        editor.putString("cars", json);
        editor.commit();
    }

    public static List<Car> LoadData()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("cars",null);
        if (json != null)
        {
            Type type = new TypeToken<List<Car>>(){}.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Car> cars = new ArrayList<Car>();
            cars.add(new Car(R.drawable.alpharomeojulieta,"Alpha Romeo","Julieta","2012", "310,900"));
            cars.add(new Car(R.drawable.audia,"Audi","A8","2021", "775,000"));
            cars.add(new Car(R.drawable.audietron,"Audi","Estron","2019", "365,000"));
            cars.add(new Car(R.drawable.audiqh,"Audi","Q5","2021", "379,900"));
            cars.add(new Car(R.drawable.audiqsh,"Audi","Q7","2019", "349,900"));
            cars.add(new Car(R.drawable.bmw,"BMW","520","2017", "160,000"));
            cars.add(new Car(R.drawable.kiaop,"Kia","optima","2020", "164,900"));
            cars.add(new Car(R.drawable.mazaratikwatroforte,"mazarati","Kwatroforte","2017", "305,000"));

            return cars;
        }
    }

}
