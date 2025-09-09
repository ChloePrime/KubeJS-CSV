package cn.chloeprime.kubejs_csv;

import cn.chloeprime.kubejs_csv.api.CsvIO;
import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingRegistry;

public class KubeCSV implements KubeJSPlugin {
    public static final String MODID = "kubejs_csv";

    @Override
    public void registerBindings(BindingRegistry bindings) {
        bindings.add(CsvIO.class.getSimpleName(), CsvIO.class);
    }
}
