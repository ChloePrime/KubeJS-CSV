package cn.chloeprime.kubejs_csv;

import cn.chloeprime.kubejs_csv.api.CsvIO;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.script.BindingsEvent;

public class KubeCSV extends KubeJSPlugin {
    public static final String MODID = "kubejs_csv";

    @Override
    public void registerBindings(BindingsEvent bindings) {
        bindings.add(CsvIO.class.getSimpleName(), CsvIO.class);
    }

    /**
     * 1.18.2 support
     */
    @SuppressWarnings("unused")
    public void addBindings(BindingsEvent event) {
        registerBindings(event);
    }
}
