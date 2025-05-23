/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.markdown;
/*     */ 
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.text.SpanStyle;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.intellij.markdown.ast.ASTNode;
/*     */ import org.intellij.markdown.ast.ASTNodeKt;
/*     */ import org.intellij.markdown.ast.visitors.Visitor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\032\020\013\032\004\030\0010\b2\006\020\t\032\0020\n2\006\020\007\032\0020\bH\002¨\006\f"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$5", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "extractLinkDestination", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nMarkdownConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownConverter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/*     */ public final class AnnotatedStringGenerator$Companion$createDefaultProviders$5
/*     */   implements AnnotatedStringGenerator.ProcessingProvider
/*     */ {
/*     */   public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/* 192 */     Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); int start = visitor.getCurrentOffset();
/* 193 */     ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/* 194 */     int end = visitor.getCurrentOffset();
/* 195 */     String destination = extractLinkDestination(node, markdownText);
/* 196 */     if (destination != null) {
/* 197 */       visitor.addStringAnnotation("URL", destination, start, end);
/*     */       
/* 199 */       visitor.addStyle(new SpanStyle(ColorKt.Color(4278190335L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), start, end);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final String extractLinkDestination(ASTNode node, String markdownText) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface getChildren : ()Ljava/util/List;
/*     */     //   6: checkcast java/lang/Iterable
/*     */     //   9: astore #4
/*     */     //   11: aload #4
/*     */     //   13: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   18: astore #5
/*     */     //   20: aload #5
/*     */     //   22: invokeinterface hasNext : ()Z
/*     */     //   27: ifeq -> 70
/*     */     //   30: aload #5
/*     */     //   32: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   37: astore #6
/*     */     //   39: aload #6
/*     */     //   41: checkcast org/intellij/markdown/ast/ASTNode
/*     */     //   44: astore #7
/*     */     //   46: iconst_0
/*     */     //   47: istore #8
/*     */     //   49: aload #7
/*     */     //   51: invokeinterface getType : ()Lorg/intellij/markdown/IElementType;
/*     */     //   56: getstatic org/intellij/markdown/MarkdownElementTypes.LINK_DESTINATION : Lorg/intellij/markdown/IElementType;
/*     */     //   59: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 20
/*     */     //   65: aload #6
/*     */     //   67: goto -> 71
/*     */     //   70: aconst_null
/*     */     //   71: checkcast org/intellij/markdown/ast/ASTNode
/*     */     //   74: astore_3
/*     */     //   75: aload_3
/*     */     //   76: dup
/*     */     //   77: ifnull -> 97
/*     */     //   80: aload_2
/*     */     //   81: checkcast java/lang/CharSequence
/*     */     //   84: invokestatic getTextInNode : (Lorg/intellij/markdown/ast/ASTNode;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   87: dup
/*     */     //   88: ifnull -> 97
/*     */     //   91: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   94: goto -> 99
/*     */     //   97: pop
/*     */     //   98: aconst_null
/*     */     //   99: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #204	-> 0
/*     */     //   #375	-> 46
/*     */     //   #204	-> 49
/*     */     //   #204	-> 62
/*     */     //   #204	-> 71
/*     */     //   #205	-> 75
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	13	8	$i$a$-find-AnnotatedStringGenerator$Companion$createDefaultProviders$5$extractLinkDestination$linkDestinationNode$1	I
/*     */     //   46	16	7	it	Lorg/intellij/markdown/ast/ASTNode;
/*     */     //   75	25	3	linkDestinationNode	Lorg/intellij/markdown/ast/ASTNode;
/*     */     //   0	100	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$5;
/*     */     //   0	100	1	node	Lorg/intellij/markdown/ast/ASTNode;
/*     */     //   0	100	2	markdownText	Ljava/lang/String;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\markdown\AnnotatedStringGenerator$Companion$createDefaultProviders$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */