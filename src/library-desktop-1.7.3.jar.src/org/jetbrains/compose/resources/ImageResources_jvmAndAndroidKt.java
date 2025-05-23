/*    */ package org.jetbrains.compose.resources;
/*    */ import javax.xml.parsers.DocumentBuilderFactory;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\020\022\n\000\032\f\020\000\032\0020\001*\0020\002H\000¨\006\003"}, d2 = {"toXmlElement", "Lorg/jetbrains/compose/resources/vector/xmldom/Element;", "", "library"})
/*    */ @SourceDebugExtension({"SMAP\nImageResources.jvmAndAndroid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.jvmAndAndroid.kt\norg/jetbrains/compose/resources/ImageResources_jvmAndAndroidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
/*    */ public final class ImageResources_jvmAndAndroidKt {
/*    */   @NotNull
/*    */   public static final Element toXmlElement(@NotNull byte[] $this$toXmlElement) {
/*  9 */     Intrinsics.checkNotNullParameter($this$toXmlElement, "<this>");
/* 10 */     DocumentBuilderFactory documentBuilderFactory1 = DocumentBuilderFactory.newInstance();
/* 11 */     DocumentBuilderFactory $this$toXmlElement_u24lambda_u240 = documentBuilderFactory1;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     int $i$a$-apply-ImageResources_jvmAndAndroidKt$toXmlElement$1 = 0;
/*    */     $this$toXmlElement_u24lambda_u240.setNamespaceAware(true);
/*    */     Intrinsics.checkNotNullExpressionValue(documentBuilderFactory1.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream($this$toXmlElement))).getDocumentElement(), "getDocumentElement(...)");
/*    */     Element element = documentBuilderFactory1.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream($this$toXmlElement))).getDocumentElement();
/*    */     return (Element)new ElementImpl(element);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ImageResources_jvmAndAndroidKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */