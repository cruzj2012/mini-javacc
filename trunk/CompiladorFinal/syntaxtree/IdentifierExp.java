package syntaxtree; //arvore abstrata
import visitor.IRVisitor;
import visitor.Visitor;

import visitor.TypeVisitor;

public class IdentifierExp extends Exp {
  public String s;
  public IdentifierExp(String as) { //um identificador � o nome 's' associado a uma vari�vel
    s=as;
  }

  public void accept(Visitor v) { //� chamado se v � objeto do tipo Visitor e visita passando como tipo de objeto identifierExp
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {// chama m�todo se TypeVisitor estiver sendo usado
    return v.visit(this);
  }

  public Tree.exp.Exp accept(IRVisitor v) 
  {
	 return v.visit(this);
  }
}
