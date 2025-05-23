/*    */ package org.jetbrains.compose.resources.vector.xmldom;
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\f\b\020\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\025\032\0020\n2\006\020\017\032\0020\nH\026R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\024\020\t\032\0020\n8VX\004¢\006\006\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\n8VX\004¢\006\006\032\004\b\020\020\fR\024\020\021\032\0020\n8VX\004¢\006\006\032\004\b\022\020\fR\026\020\023\032\004\030\0010\n8VX\004¢\006\006\032\004\b\024\020\f¨\006\026"}, d2 = {"Lorg/jetbrains/compose/resources/vector/xmldom/NodeImpl;", "Lorg/jetbrains/compose/resources/vector/xmldom/Node;", "n", "Lorg/w3c/dom/Node;", "(Lorg/w3c/dom/Node;)V", "childNodes", "Lorg/jetbrains/compose/resources/vector/xmldom/NodeList;", "getChildNodes", "()Lorg/jetbrains/compose/resources/vector/xmldom/NodeList;", "localName", "", "getLocalName", "()Ljava/lang/String;", "getN", "()Lorg/w3c/dom/Node;", "namespaceURI", "getNamespaceURI", "nodeName", "getNodeName", "textContent", "getTextContent", "lookupPrefix", "library"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public class NodeImpl implements Node { @NotNull
/*    */   private final Node n;
/*  6 */   public NodeImpl(@NotNull Node n) { this.n = n; } public static final int $stable = 8; @NotNull public final Node getN() { return this.n; } @Nullable
/*    */   public String getTextContent() {
/*  8 */     return this.n.getTextContent();
/*    */   }
/*    */   @NotNull
/* 11 */   public String getNodeName() { Intrinsics.checkNotNullExpressionValue(this.n.getNodeName(), "getNodeName(...)"); return this.n.getNodeName(); } @NotNull
/*    */   public String getLocalName() {
/* 13 */     Intrinsics.checkNotNullExpressionValue(this.n.getLocalName(), "getLocalName(...)"); return this.n.getLocalName();
/*    */   } @NotNull
/*    */   public NodeList getChildNodes() {
/* 16 */     return new NodeImpl$childNodes$1();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\006\032\0020\0072\006\020\b\032\0020\003H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005¨\006\t"}, d2 = {"org/jetbrains/compose/resources/vector/xmldom/NodeImpl$childNodes$1", "Lorg/jetbrains/compose/resources/vector/xmldom/NodeList;", "length", "", "getLength", "()I", "item", "Lorg/jetbrains/compose/resources/vector/xmldom/Node;", "i", "library"})
/*    */   public static final class NodeImpl$childNodes$1 implements NodeList { private final int length;
/*    */     
/* 22 */     NodeImpl$childNodes$1() { this.length = $receiver.getN().getChildNodes().getLength(); } @NotNull public Node item(int i) { Node child = NodeImpl.this.getN().getChildNodes().item(i); Intrinsics.checkNotNull(child); return (child instanceof Element) ? new ElementImpl((Element)child) : new NodeImpl(child); } public int getLength() { return this.length; }
/*    */      }
/*    */ 
/*    */   
/*    */   @NotNull
/* 27 */   public String getNamespaceURI() { Intrinsics.checkNotNullExpressionValue(this.n.getNamespaceURI(), "getNamespaceURI(...)"); return this.n.getNamespaceURI(); } @NotNull
/*    */   public String lookupPrefix(@NotNull String namespaceURI) {
/* 29 */     Intrinsics.checkNotNullParameter(namespaceURI, "namespaceURI"); Intrinsics.checkNotNullExpressionValue(this.n.lookupPrefix(namespaceURI), "lookupPrefix(...)"); return this.n.lookupPrefix(namespaceURI);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\vector\xmldom\NodeImpl.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */