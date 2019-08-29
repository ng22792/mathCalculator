package cordova-plugin-ng22792-math-calculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MathCalculator extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("substract")) {
            String message = args.getString(0);
            this.substract(message, callbackContext);
            return true;
        }
        else if (action.equals("add")){
            this.add(args, callbackContext);
            return true;
        }
        return false;
    }

    private void substract(JSONArray args, CallbackContext callback){
        if(args!= null){
            try {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString('param1'));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString('param2'));

                callback.success(""+(p1-p2));

            } catch(Exception e){
                callback.erro("Something went wrong "+ e);
            }
        }else{
            callback.error("Please do not pass null values");
        }
    }

    private void add(JSONArray args, CallbackContext callback){
        if(args!= null){
            try {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString('param1'));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString('param2'));

                callback.success(""+(p1+p2));

            } catch(Exception e){
                callback.erro("Something went wrong "+ e);
            }
        }else{
            callback.error("Please do not pass null values");
        }
    }
}