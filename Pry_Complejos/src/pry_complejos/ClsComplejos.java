
package pry_complejos;

public class ClsComplejos {
    
    private float _r, _i;
public ClsComplejos (){
    _r = 0;
    _i = 0;
    
}
public ClsComplejos (float r, float i){
    _r = r; 
    _i = i;
}

public ClsComplejos (ClsComplejos z){
    _r = z._r;
    _i = z._i;
}

public float r(){
    return _r;
}

public float i(){
    return _i;
}
public void r(float r){
    _r=r;
}
public void i(float i){
    _i=i;
}
public ClsComplejos suma(ClsComplejos b){
    ClsComplejos resp = new ClsComplejos();
    resp._r = b._r + this._r;
    resp._i = b._i + this._i;
    return resp;
}

public ClsComplejos resta(ClsComplejos b){
    ClsComplejos resp = new ClsComplejos();
    resp._r = b._r - this._r;
    resp._i = b._i - this._i;
    return resp;
}

public ClsComplejos por(ClsComplejos b){
    ClsComplejos resp = new ClsComplejos();
    resp._r =(b._r*this._r) - (b._i*this._i);
    resp._i =(b._r*this._i)+(b._i*this._r);
    return resp;
}
public ClsComplejos para (ClsComplejos b) {
   ClsComplejos resp = new ClsComplejos();
    resp._r =((b._r*this._r)+(b._i*this._i))/(b._r*b._r+ b._i* b._i);
    resp._i =((b._i*this._r)-(b._r*this._r))/(b._r*b._r+ b._i* b._i);
    
   return resp;
}

public ClsComplejos ala (int n) {
    ClsComplejos t= new ClsComplejos ();
    
    return t;
}

public String ver () {
    if (_i < 0){
        return _r + "  " + _i+ "i";
        }
    else{
    }    
    return _r+ " " + " + " + _i + "i";
}
}
