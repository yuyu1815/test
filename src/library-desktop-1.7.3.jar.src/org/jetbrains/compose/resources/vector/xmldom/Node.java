package org.jetbrains.compose.resources.vector.xmldom;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\n\b`\030\0002\0020\001J\020\020\020\032\0020\0072\006\020\n\032\0020\007H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\007X¦\004¢\006\006\032\004\b\013\020\tR\022\020\f\032\0020\007X¦\004¢\006\006\032\004\b\r\020\tR\024\020\016\032\004\030\0010\007X¦\004¢\006\006\032\004\b\017\020\t¨\006\021"}, d2 = {"Lorg/jetbrains/compose/resources/vector/xmldom/Node;", "", "childNodes", "Lorg/jetbrains/compose/resources/vector/xmldom/NodeList;", "getChildNodes", "()Lorg/jetbrains/compose/resources/vector/xmldom/NodeList;", "localName", "", "getLocalName", "()Ljava/lang/String;", "namespaceURI", "getNamespaceURI", "nodeName", "getNodeName", "textContent", "getTextContent", "lookupPrefix", "library"})
public interface Node {
  @Nullable
  String getTextContent();
  
  @NotNull
  String getNodeName();
  
  @NotNull
  String getLocalName();
  
  @NotNull
  NodeList getChildNodes();
  
  @NotNull
  String getNamespaceURI();
  
  @NotNull
  String lookupPrefix(@NotNull String paramString);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\vector\xmldom\Node.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */