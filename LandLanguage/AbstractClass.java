
package abstractsession;

    public abstract class abstractclass{
        abstract void tala();
           String landlanuage(){
           return "language is ";   
           }
        }
   
    class Danska extends abstractclass{
        @Override
        void tala(){
            System.out.println(landlanuage() + "Danish in Denmark" );
        };
    }
    
    class Tyska extends abstractclass{
        @Override
        void tala(){
            System.out.println( "Tyska in Germany");
        };
    }
    
    class Svenska extends abstractclass{
       @Override
        void tala()
        {
            System.out.println("Svenska in Sweden");
        };
    }
            
        
   
    
    
    

