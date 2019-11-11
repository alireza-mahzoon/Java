
package abstractsession;


public class skapaobject {
    public static void main(String[] args){
        abstractclass[] languages = new abstractclass[3];
        languages[0] = new Danska();
        languages[1] =  new Tyska();
        languages[2] = new Svenska();

    languages[0].tala(); 
    languages[1].tala(); 
    languages[2].tala(); 
    
}
    
}
