
package documenteditor;

import javax.swing.JTextArea;

public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public void executeStrategy(JTextArea s){
      strategy.doOperation(s);
   }
}