import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class VolcanoAnalyzer {

    public List<Volcano> volcanoes;

    public VolcanoAnalyzer() throws FileNotFoundException {
        String path = new File("").getAbsolutePath();
        path.concat("\\resources\\volcanoes.json");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        volcanoes = new Gson().fromJson(bufferedReader, new TypeToken<ArrayList<Volcano>>() {
        }.getType());
    }

    public void displayVolcanoes(){
        volcanoes.forEach(volcano -> System.out.println(volcano.getName()));
    }

}
