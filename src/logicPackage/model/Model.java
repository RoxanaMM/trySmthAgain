package logicPackage.model;

import logicPackage.enums.AlgoName;
import logicPackage.enums.AlgorithmConstants;
import logicPackage.enums.TypesOfSet;

import java.util.HashMap;
import java.util.Map;

public class Model {

    static Map<Integer, AlgoName> algoNameMap = new HashMap<Integer, AlgoName>();
    static Map<Integer, TypesOfSet> typeOfSet = new HashMap<Integer, TypesOfSet>();


    public static Map<Integer, AlgoName> getAlgoNameMap() {
        buildNameMaps();
        return algoNameMap;
    }

    public static void buildNameMaps() {
        int z = 0;
        for (AlgoName algoName : AlgoName.values()) {
            algoNameMap.put(z, algoName);
            z++;
        }

        int t = 0;
        for (TypesOfSet type : TypesOfSet.values()) {
            typeOfSet.put(t, type);
            t++;
        }
    }
}
