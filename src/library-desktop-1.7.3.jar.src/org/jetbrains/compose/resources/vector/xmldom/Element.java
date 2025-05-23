package org.jetbrains.compose.resources.vector.xmldom;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b`\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\003H&J\030\020\005\032\0020\0032\006\020\006\032\0020\0032\006\020\007\032\0020\003H&¨\006\b"}, d2 = {"Lorg/jetbrains/compose/resources/vector/xmldom/Element;", "Lorg/jetbrains/compose/resources/vector/xmldom/Node;", "getAttribute", "", "name", "getAttributeNS", "nameSpaceURI", "localName", "library"})
public interface Element extends Node {
  @NotNull
  String getAttributeNS(@NotNull String paramString1, @NotNull String paramString2);
  
  @NotNull
  String getAttribute(@NotNull String paramString);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\vector\xmldom\Element.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */