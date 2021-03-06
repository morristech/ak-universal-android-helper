package ak.andro.kumaraakash86.akuniversalhelper.Utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ak.andro.kumaraakash86.akuniversalhelper.Log.AKLogFunctions;

/**
 * Created by AAKASH on 28-10-2016.
 */
public class AKTextUtilities {

    public static void setTypeFace(Activity _activity, View _parentView, String _fontName, int _id)
    {
        Typeface tf = Typeface.createFromAsset(_activity.getAssets(), _fontName);

        View _view = _parentView.findViewById(_id);
        if(_view instanceof TextView)
        {
            TextView tv = (TextView) _view;
            tv.setTypeface(tf);
        }
        else if(_view instanceof EditText)
        {
            EditText et = (EditText)_view;
            et.setTypeface(tf);
        }
        else if(_view instanceof Button)
        {
            Button btn = (Button)_view;
            btn.setTypeface(tf);
        }
        else{
            AKLogFunctions.ErrorMessage(_activity.getClass(), "setTypeface Error", "View is not a text container");
        }
    }

    public static void setTypeFace(Activity _activity, String _fontName, int _id)
    {
        Typeface tf = Typeface.createFromAsset(_activity.getAssets(), _fontName);

        View _view = _activity.findViewById(_id);
        if(_view instanceof TextView)
        {
            TextView tv = (TextView) _view;
            tv.setTypeface(tf);
        }
        else if(_view instanceof EditText)
        {
            EditText et = (EditText)_view;
            et.setTypeface(tf);
        }
        else if(_view instanceof Button)
        {
            Button btn = (Button)_view;
            btn.setTypeface(tf);
        }
        else{
            AKLogFunctions.ErrorMessage(_activity.getClass(), "setTypeface Error", "View "+_id+" is not a text container");
        }
    }


    public static void setTypeFace(Activity _activity, String _fontName, View _view)
    {
        Typeface tf = Typeface.createFromAsset(_activity.getAssets(), _fontName);

        if(_view instanceof TextView)
        {
            TextView tv = (TextView) _view;
            tv.setTypeface(tf);
        }
        else if(_view instanceof EditText)
        {
            EditText et = (EditText)_view;
            et.setTypeface(tf);
        }
        else if(_view instanceof Button)
        {
            Button btn = (Button)_view;
            btn.setTypeface(tf);
        }
        else{
            AKLogFunctions.ErrorMessage(_activity.getClass(), "setTypeface Error", "View "+_view+" is not a text container");
        }
    }

    public static void setTypeFace(Activity _activity, String _fontName, int... _id)
    {
        Typeface tf = Typeface.createFromAsset(_activity.getAssets(), _fontName);

        for (int id: _id) {
            setTypeFace(_activity, _fontName, id);
        }
    }

    public static void setTypeFace(Activity _activity, String _fontName, View... _view)
    {
        Typeface tf = Typeface.createFromAsset(_activity.getAssets(), _fontName);

        for (View view: _view) {
            setTypeFace(_activity, _fontName, view);
        }
    }
}
