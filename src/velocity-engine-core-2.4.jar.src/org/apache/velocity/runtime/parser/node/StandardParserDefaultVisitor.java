/* Generated By:JavaCC: Do not edit this line. StandardParserDefaultVisitor.java Version 7.0.13 */
package org.apache.velocity.runtime.parser.node;

import org.apache.velocity.runtime.parser.*;

public class StandardParserDefaultVisitor implements StandardParserVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTprocess node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTText node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTEscapedDirective node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTEscape node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTComment node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTTextblock node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFloatingPointLiteral node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIntegerLiteral node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTStringLiteral node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIdentifier node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTWord node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTDirectiveAssign node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTDirective node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTBlock node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMap node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTObjectArray node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIntegerRange node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMethod node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIndex node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTReference node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTTrue node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFalse node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIfStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTElseStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTElseIfStatement node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTSetDirective node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTExpression node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAssignment node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTOrNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAndNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTEQNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNENode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLTNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTGTNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLENode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTGENode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTAddNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTSubtractNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTMulNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTDivNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTModNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNotNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTNegateNode node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=942d27e035058473766e476c2057b420 (do not edit this line) */
