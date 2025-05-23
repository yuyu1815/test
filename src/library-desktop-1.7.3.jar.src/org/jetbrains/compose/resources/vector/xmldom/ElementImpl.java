/*   */ package org.jetbrains.compose.resources.vector.xmldom;
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\005\b\000\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\tH\026J\030\020\013\032\0020\t2\006\020\f\032\0020\t2\006\020\r\032\0020\tH\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\016"}, d2 = {"Lorg/jetbrains/compose/resources/vector/xmldom/ElementImpl;", "Lorg/jetbrains/compose/resources/vector/xmldom/NodeImpl;", "Lorg/jetbrains/compose/resources/vector/xmldom/Element;", "element", "Lorg/w3c/dom/Element;", "(Lorg/w3c/dom/Element;)V", "getElement", "()Lorg/w3c/dom/Element;", "getAttribute", "", "name", "getAttributeNS", "nameSpaceURI", "localName", "library"})
/*   */ @StabilityInferred(parameters = 0)
/*   */ public final class ElementImpl extends NodeImpl implements Element { @NotNull
/* 5 */   private final Element element; public ElementImpl(@NotNull Element element) { super(element); this.element = element; } public static final int $stable = 8; @NotNull public final Element getElement() { return this.element; }
/*   */   @NotNull
/* 7 */   public String getAttributeNS(@NotNull String nameSpaceURI, @NotNull String localName) { Intrinsics.checkNotNullParameter(nameSpaceURI, "nameSpaceURI"); Intrinsics.checkNotNullParameter(localName, "localName"); Intrinsics.checkNotNullExpressionValue(this.element.getAttributeNS(nameSpaceURI, localName), "getAttributeNS(...)"); return this.element.getAttributeNS(nameSpaceURI, localName); } @NotNull
/*   */   public String getAttribute(@NotNull String name) {
/* 9 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullExpressionValue(this.element.getAttribute(name), "getAttribute(...)"); return this.element.getAttribute(name);
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\vector\xmldom\ElementImpl.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */