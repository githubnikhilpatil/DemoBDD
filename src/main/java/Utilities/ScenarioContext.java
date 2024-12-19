package Utilities;

import java.util.HashMap;
import java.util.Map;
public class ScenarioContext {
private Map<String, String> scenarioContext;

public ScenarioContext(){

scenarioContext = new HashMap<String, String>();
}
public void setContext(String key, String value) { scenarioContext.put(key.toString(), value);
}
public Object getContext(String key){

return scenarioContext.get(key.toString());
}
public Boolean isContains(String key){
return scenarioContext.containsKey(key.toString());

}
}