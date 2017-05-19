
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Apr 24 21:53:32 UTC 2017
//----------------------------------------------------

package jtiger.parser;

import java.util.LinkedList;
import java.util.Arrays;
import java_cup.runtime.*;
import jtiger.ast.*;
import jtiger.util.Position;
import jtiger.util.Errors;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Apr 24 21:53:32 UTC 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\007\003\000\002\002" +
    "\003\000\002\002\003\000\002\002\003\000\002\002\003" +
    "\000\002\003\003\000\002\004\005\000\002\004\005\000" +
    "\002\004\005\000\002\004\005\000\002\004\005\000\002" +
    "\004\005\000\002\004\005\000\002\004\005\000\002\004" +
    "\005\000\002\004\005\000\002\004\005\000\002\004\005" +
    "\000\002\005\004\000\002\006\005\000\002\006\004\000" +
    "\002\010\003\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\010\007\014\017\004\056\005\001\002\000" +
    "\010\007\014\017\004\056\005\001\002\000\040\002\ufffb" +
    "\006\ufffb\010\ufffb\016\ufffb\017\ufffb\020\ufffb\021\ufffb\022" +
    "\ufffb\023\ufffb\024\ufffb\025\ufffb\026\ufffb\027\ufffb\030\ufffb" +
    "\031\ufffb\001\002\000\034\002\000\016\030\017\023\020" +
    "\034\021\025\022\031\023\027\024\035\025\032\026\033" +
    "\027\026\030\024\031\036\001\002\000\040\002\ufffc\006" +
    "\ufffc\010\ufffc\016\ufffc\017\ufffc\020\ufffc\021\ufffc\022\ufffc" +
    "\023\ufffc\024\ufffc\025\ufffc\026\ufffc\027\ufffc\030\ufffc\031" +
    "\ufffc\001\002\000\004\002\053\001\002\000\040\002\ufffd" +
    "\006\ufffd\010\ufffd\016\ufffd\017\ufffd\020\ufffd\021\ufffd\022" +
    "\ufffd\023\ufffd\024\ufffd\025\ufffd\026\ufffd\027\ufffd\030\ufffd" +
    "\031\ufffd\001\002\000\040\002\ufffe\006\ufffe\010\ufffe\016" +
    "\ufffe\017\ufffe\020\ufffe\021\ufffe\022\ufffe\023\ufffe\024\ufffe" +
    "\025\ufffe\026\ufffe\027\ufffe\030\ufffe\031\ufffe\001\002\000" +
    "\040\002\uffff\006\uffff\010\uffff\016\uffff\017\uffff\020\uffff" +
    "\021\uffff\022\uffff\023\uffff\024\uffff\025\uffff\026\uffff\027" +
    "\uffff\030\uffff\031\uffff\001\002\000\012\007\014\010\016" +
    "\017\004\056\005\001\002\000\036\006\uffeb\010\uffeb\016" +
    "\030\017\023\020\034\021\025\022\031\023\027\024\035" +
    "\025\032\026\033\027\026\030\024\031\036\001\002\000" +
    "\040\002\uffec\006\uffec\010\uffec\016\uffec\017\uffec\020\uffec" +
    "\021\uffec\022\uffec\023\uffec\024\uffec\025\uffec\026\uffec\027" +
    "\uffec\030\uffec\031\uffec\001\002\000\006\006\021\010\020" +
    "\001\002\000\040\002\uffed\006\uffed\010\uffed\016\uffed\017" +
    "\uffed\020\uffed\021\uffed\022\uffed\023\uffed\024\uffed\025\uffed" +
    "\026\uffed\027\uffed\030\uffed\031\uffed\001\002\000\010\007" +
    "\014\017\004\056\005\001\002\000\036\006\uffea\010\uffea" +
    "\016\030\017\023\020\034\021\025\022\031\023\027\024" +
    "\035\025\032\026\033\027\026\030\024\031\036\001\002" +
    "\000\010\007\014\017\004\056\005\001\002\000\010\007" +
    "\014\017\004\056\005\001\002\000\010\007\014\017\004" +
    "\056\005\001\002\000\010\007\014\017\004\056\005\001" +
    "\002\000\010\007\014\017\004\056\005\001\002\000\010" +
    "\007\014\017\004\056\005\001\002\000\010\007\014\017" +
    "\004\056\005\001\002\000\010\007\014\017\004\056\005" +
    "\001\002\000\010\007\014\017\004\056\005\001\002\000" +
    "\010\007\014\017\004\056\005\001\002\000\010\007\014" +
    "\017\004\056\005\001\002\000\010\007\014\017\004\056" +
    "\005\001\002\000\040\002\uffef\006\uffef\010\uffef\016\030" +
    "\017\023\020\034\021\025\022\031\023\027\024\035\025" +
    "\032\026\033\027\026\030\024\031\uffef\001\002\000\024" +
    "\002\ufff4\006\ufff4\010\ufff4\016\030\017\023\020\034\021" +
    "\025\030\ufff4\031\ufff4\001\002\000\040\002\ufff8\006\ufff8" +
    "\010\ufff8\016\ufff8\017\ufff8\020\ufff8\021\ufff8\022\ufff8\023" +
    "\ufff8\024\ufff8\025\ufff8\026\ufff8\027\ufff8\030\ufff8\031\ufff8" +
    "\001\002\000\024\002\ufff2\006\ufff2\010\ufff2\016\030\017" +
    "\023\020\034\021\025\030\ufff2\031\ufff2\001\002\000\024" +
    "\002\ufff3\006\ufff3\010\ufff3\016\030\017\023\020\034\021" +
    "\025\030\ufff3\031\ufff3\001\002\000\024\002\ufff6\006\ufff6" +
    "\010\ufff6\016\030\017\023\020\034\021\025\030\ufff6\031" +
    "\ufff6\001\002\000\040\002\ufffa\006\ufffa\010\ufffa\016\ufffa" +
    "\017\ufffa\020\034\021\025\022\ufffa\023\ufffa\024\ufffa\025" +
    "\ufffa\026\ufffa\027\ufffa\030\ufffa\031\ufffa\001\002\000\024" +
    "\002\ufff5\006\ufff5\010\ufff5\016\030\017\023\020\034\021" +
    "\025\030\ufff5\031\ufff5\001\002\000\024\002\ufff1\006\ufff1" +
    "\010\ufff1\016\030\017\023\020\034\021\025\030\ufff1\031" +
    "\ufff1\001\002\000\040\002\ufff7\006\ufff7\010\ufff7\016\ufff7" +
    "\017\ufff7\020\ufff7\021\ufff7\022\ufff7\023\ufff7\024\ufff7\025" +
    "\ufff7\026\ufff7\027\ufff7\030\ufff7\031\ufff7\001\002\000\040" +
    "\002\ufff0\006\ufff0\010\ufff0\016\030\017\023\020\034\021" +
    "\025\022\031\023\027\024\035\025\032\026\033\027\026" +
    "\030\ufff0\031\ufff0\001\002\000\040\002\ufff9\006\ufff9\010" +
    "\ufff9\016\ufff9\017\ufff9\020\034\021\025\022\ufff9\023\ufff9" +
    "\024\ufff9\025\ufff9\026\ufff9\027\ufff9\030\ufff9\031\ufff9\001" +
    "\002\000\004\002\001\001\002\000\040\002\uffee\006\uffee" +
    "\010\uffee\016\uffee\017\uffee\020\uffee\021\uffee\022\uffee\023" +
    "\uffee\024\uffee\025\uffee\026\uffee\027\uffee\030\uffee\031\uffee" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\016\002\005\003\012\004\011\005\010\006" +
    "\006\007\007\001\001\000\014\002\053\003\012\004\011" +
    "\005\010\006\006\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\002\014\003" +
    "\012\004\011\005\010\006\006\010\016\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\014\002\021\003\012\004\011\005\010\006\006" +
    "\001\001\000\002\001\001\000\014\002\051\003\012\004" +
    "\011\005\010\006\006\001\001\000\014\002\050\003\012" +
    "\004\011\005\010\006\006\001\001\000\014\002\047\003" +
    "\012\004\011\005\010\006\006\001\001\000\014\002\046" +
    "\003\012\004\011\005\010\006\006\001\001\000\014\002" +
    "\045\003\012\004\011\005\010\006\006\001\001\000\014" +
    "\002\044\003\012\004\011\005\010\006\006\001\001\000" +
    "\014\002\043\003\012\004\011\005\010\006\006\001\001" +
    "\000\014\002\042\003\012\004\011\005\010\006\006\001" +
    "\001\000\014\002\041\003\012\004\011\005\010\006\006" +
    "\001\001\000\014\002\040\003\012\004\011\005\010\006" +
    "\006\001\001\000\014\002\037\003\012\004\011\005\010" +
    "\006\006\001\001\000\014\002\036\003\012\004\011\005" +
    "\010\006\006\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    @Override
    public void syntax_error(Symbol s) {
        Position p = new Position(s.left, s.right);
        Errors.error(p, "Parser Error");
    }
    //private LinkedList<Exp> l = new LinkedList<Exp>();

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // exps ::= exps SEMICOLON exp 
            {
              SeqExp RESULT =null;
		int esleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int esright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		SeqExp es = (SeqExp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  es.exps.add(e); RESULT = es; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exps",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // exps ::= exp 
            {
              SeqExp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 LinkedList<Exp> l = new LinkedList<Exp>(); l.add(e); RESULT = new SeqExp(new Position(eleft,eright), l); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exps",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // seqExp ::= LPAREN RPAREN 
            {
              Exp RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		LinkedList<Exp> l = new LinkedList<Exp>(); RESULT = new SeqExp(new Position(sleft,sright), l);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("seqExp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // seqExp ::= LPAREN exps RPAREN 
            {
              Exp RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int esleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int esright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		SeqExp es = (SeqExp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object r = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=es; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("seqExp",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // negExp ::= MINUS exp 
            {
              Exp RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), new IntegerExp(new Position(pleft,pright), 0), "-", e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("negExp",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // opExp ::= exp OR exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
            RESULT = new IfExp(new Position(pleft,pright), e1, new IntegerExp(new Position(pleft,pright), 1), e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // opExp ::= exp AND exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
           RESULT = new IfExp(new Position(pleft,pright), e1, e2, new IntegerExp(new Position(pleft,pright), 0));
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // opExp ::= exp GE exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, ">=", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // opExp ::= exp GT exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, ">", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // opExp ::= exp LE exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, "<=", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // opExp ::= exp LT exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, "<", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // opExp ::= exp NEQ exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, "<>", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // opExp ::= exp EQ exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, "==", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // opExp ::= exp DIVIDE exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, "/", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // opExp ::= exp TIMES exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, "*", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // opExp ::= exp MINUS exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, "-", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // opExp ::= exp PLUS exp 
            {
              Exp RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Exp e1 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e2 = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new OpExp(new Position(pleft,pright), e1, "+", e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("opExp",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // intExp ::= INT 
            {
              Exp RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IntegerExp(new Position(nleft,nright), n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("intExp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // exp ::= seqExp 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // exp ::= negExp 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // exp ::= opExp 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // exp ::= intExp 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT=e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("exp",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= exp 
            {
              Exp RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Exp e = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
            RESULT = e;
        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Exp start_val = (Exp)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
