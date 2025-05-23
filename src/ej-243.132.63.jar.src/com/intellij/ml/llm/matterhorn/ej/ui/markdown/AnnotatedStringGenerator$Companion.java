/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.markdown;
/*     */ 
/*     */ import androidx.compose.ui.text.SpanStyle;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.lexer.Lexer;
/*     */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*     */ import com.intellij.openapi.editor.colors.TextAttributesKey;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.openapi.fileTypes.LanguageFileType;
/*     */ import com.intellij.openapi.fileTypes.SyntaxHighlighter;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.intellij.markdown.MarkdownElementTypes;
/*     */ import org.intellij.markdown.ast.ASTNode;
/*     */ import org.intellij.markdown.ast.ASTNodeKt;
/*     */ import org.intellij.markdown.ast.ASTUtilKt;
/*     */ import org.intellij.markdown.ast.visitors.Visitor;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\034\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\0052\b\020\b\032\004\030\0010\tJ\024\020\n\032\016\022\004\022\0020\006\022\004\022\0020\0070\005H\002J\037\020\013\032\0020\0072\006\020\f\032\0020\r2\006\020\016\032\0020\017H\002¢\006\004\b\020\020\021J(\020\022\032\b\022\004\022\0020\0240\0232\006\020\025\032\0020\0262\006\020\027\032\0020\0262\b\020\b\032\004\030\0010\tH\002J\035\020\030\032\004\030\0010\0312\f\020\032\032\b\022\004\022\0020\0340\033H\002¢\006\002\020\035¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion;", "", "<init>", "()V", "createDefaultProviders", "", "Lorg/intellij/markdown/IElementType;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "project", "Lcom/intellij/openapi/project/Project;", "createHeadingProviders", "createHeadingProvider", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "createHeadingProvider-eAf_CNQ", "(JLandroidx/compose/ui/text/font/FontWeight;)Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "highlightCode", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/HighlightedSegment;", "code", "", "languageId", "getSpanStyleFromTextAttributesKeys", "Landroidx/compose/ui/text/SpanStyle;", "keys", "", "Lcom/intellij/openapi/editor/colors/TextAttributesKey;", "([Lcom/intellij/openapi/editor/colors/TextAttributesKey;)Landroidx/compose/ui/text/SpanStyle;", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nMarkdownConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownConverter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/*     */ public final class Companion {
/*     */   private Companion() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$1", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"})
/*     */   public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$1 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/*     */       Intrinsics.checkNotNullParameter(visitor, "visitor");
/*     */       Intrinsics.checkNotNullParameter(markdownText, "markdownText");
/*     */       Intrinsics.checkNotNullParameter(node, "node");
/*     */       if (!visitor.isEmpty())
/*     */         visitor.consumeText("\n\n"); 
/*     */       ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$2", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"})
/*     */   public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$2 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/*     */       Intrinsics.checkNotNullParameter(visitor, "visitor");
/*     */       Intrinsics.checkNotNullParameter(markdownText, "markdownText");
/*     */       Intrinsics.checkNotNullParameter(node, "node");
/*     */       int start = visitor.getCurrentOffset();
/*     */       ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/*     */       int end = visitor.getCurrentOffset();
/*     */       visitor.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), start, end);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$3", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"})
/*     */   public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$3 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/*     */       Intrinsics.checkNotNullParameter(visitor, "visitor");
/*     */       Intrinsics.checkNotNullParameter(markdownText, "markdownText");
/*     */       Intrinsics.checkNotNullParameter(node, "node");
/*     */       int start = visitor.getCurrentOffset();
/*     */       ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/*     */       int end = visitor.getCurrentOffset();
/*     */       visitor.addStyle(new SpanStyle(0L, 0L, null, FontStyle.box-impl(FontStyle.Companion.getItalic-_-LCdwA()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), start, end);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$4", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"})
/*     */   public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$4 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/*     */       Intrinsics.checkNotNullParameter(visitor, "visitor");
/*     */       Intrinsics.checkNotNullParameter(markdownText, "markdownText");
/*     */       Intrinsics.checkNotNullParameter(node, "node");
/*     */       char[] arrayOfChar = new char[1];
/*     */       arrayOfChar[0] = '`';
/*     */       CharSequence codeText = StringsKt.trim(ASTUtilKt.getTextInNode(node, markdownText), arrayOfChar);
/*     */       int start = visitor.getCurrentOffset();
/*     */       visitor.consumeText(codeText);
/*     */       int end = visitor.getCurrentOffset();
/*     */       visitor.addStyle(new SpanStyle(0L, 0L, null, null, null, (FontFamily)FontFamily.Companion.getMonospace(), null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), start, end);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\032\020\013\032\004\030\0010\b2\006\020\t\032\0020\n2\006\020\007\032\0020\bH\002¨\006\f"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$5", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "extractLinkDestination", "ej-ui"})
/*     */   @SourceDebugExtension({"SMAP\nMarkdownConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownConverter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/*     */   public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$5 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/*     */       Intrinsics.checkNotNullParameter(visitor, "visitor");
/*     */       Intrinsics.checkNotNullParameter(markdownText, "markdownText");
/*     */       Intrinsics.checkNotNullParameter(node, "node");
/*     */       int start = visitor.getCurrentOffset();
/*     */       ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/*     */       int end = visitor.getCurrentOffset();
/*     */       String destination = extractLinkDestination(node, markdownText);
/*     */       if (destination != null) {
/*     */         visitor.addStringAnnotation("URL", destination, start, end);
/*     */         visitor.addStyle(new SpanStyle(ColorKt.Color(4278190335L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), start, end);
/*     */       } 
/*     */     }
/*     */     
/*     */     private final String extractLinkDestination(ASTNode node, String markdownText) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: invokeinterface getChildren : ()Ljava/util/List;
/*     */       //   6: checkcast java/lang/Iterable
/*     */       //   9: astore #4
/*     */       //   11: aload #4
/*     */       //   13: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   18: astore #5
/*     */       //   20: aload #5
/*     */       //   22: invokeinterface hasNext : ()Z
/*     */       //   27: ifeq -> 70
/*     */       //   30: aload #5
/*     */       //   32: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   37: astore #6
/*     */       //   39: aload #6
/*     */       //   41: checkcast org/intellij/markdown/ast/ASTNode
/*     */       //   44: astore #7
/*     */       //   46: iconst_0
/*     */       //   47: istore #8
/*     */       //   49: aload #7
/*     */       //   51: invokeinterface getType : ()Lorg/intellij/markdown/IElementType;
/*     */       //   56: getstatic org/intellij/markdown/MarkdownElementTypes.LINK_DESTINATION : Lorg/intellij/markdown/IElementType;
/*     */       //   59: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   62: ifeq -> 20
/*     */       //   65: aload #6
/*     */       //   67: goto -> 71
/*     */       //   70: aconst_null
/*     */       //   71: checkcast org/intellij/markdown/ast/ASTNode
/*     */       //   74: astore_3
/*     */       //   75: aload_3
/*     */       //   76: dup
/*     */       //   77: ifnull -> 97
/*     */       //   80: aload_2
/*     */       //   81: checkcast java/lang/CharSequence
/*     */       //   84: invokestatic getTextInNode : (Lorg/intellij/markdown/ast/ASTNode;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   87: dup
/*     */       //   88: ifnull -> 97
/*     */       //   91: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   94: goto -> 99
/*     */       //   97: pop
/*     */       //   98: aconst_null
/*     */       //   99: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #204	-> 0
/*     */       //   #375	-> 46
/*     */       //   #204	-> 49
/*     */       //   #204	-> 62
/*     */       //   #204	-> 71
/*     */       //   #205	-> 75
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   49	13	8	$i$a$-find-AnnotatedStringGenerator$Companion$createDefaultProviders$5$extractLinkDestination$linkDestinationNode$1	I
/*     */       //   46	16	7	it	Lorg/intellij/markdown/ast/ASTNode;
/*     */       //   75	25	3	linkDestinationNode	Lorg/intellij/markdown/ast/ASTNode;
/*     */       //   0	100	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$5;
/*     */       //   0	100	1	node	Lorg/intellij/markdown/ast/ASTNode;
/*     */       //   0	100	2	markdownText	Ljava/lang/String;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$6", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"})
/*     */   public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$6 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) {
/*     */       Intrinsics.checkNotNullParameter(visitor, "visitor");
/*     */       Intrinsics.checkNotNullParameter(markdownText, "markdownText");
/*     */       Intrinsics.checkNotNullParameter(node, "node");
/*     */       CharSequence text = ASTUtilKt.getTextInNode(node, markdownText);
/*     */       visitor.consumeText(text);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/* 119 */   public final Map<IElementType, AnnotatedStringGenerator.ProcessingProvider> createDefaultProviders(@Nullable Project project) { Map<Object, Object> providers = new LinkedHashMap<>();
/*     */ 
/*     */     
/* 122 */     providers.put(MarkdownElementTypes.PARAGRAPH, new AnnotatedStringGenerator$Companion$createDefaultProviders$1());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     providers.put(MarkdownElementTypes.STRONG, new AnnotatedStringGenerator$Companion$createDefaultProviders$2());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     providers.put(MarkdownElementTypes.EMPH, new AnnotatedStringGenerator$Companion$createDefaultProviders$3());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     providers.put(MarkdownElementTypes.CODE_SPAN, new AnnotatedStringGenerator$Companion$createDefaultProviders$4());
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
/* 190 */     providers.put(MarkdownElementTypes.INLINE_LINK, new AnnotatedStringGenerator$Companion$createDefaultProviders$5());
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
/* 210 */     providers.put(MarkdownTokenTypes.TEXT, new AnnotatedStringGenerator$Companion$createDefaultProviders$6());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 218 */     providers.put(MarkdownTokenTypes.WHITE_SPACE, new AnnotatedStringGenerator$Companion$createDefaultProviders$7());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     providers.putAll(createHeadingProviders());
/*     */ 
/*     */     
/* 229 */     providers.put(MarkdownElementTypes.ORDERED_LIST, new AnnotatedStringGenerator$Companion$createDefaultProviders$8());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 238 */     providers.put(MarkdownElementTypes.UNORDERED_LIST, new AnnotatedStringGenerator$Companion$createDefaultProviders$9());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 247 */     providers.put(MarkdownElementTypes.LIST_ITEM, new AnnotatedStringGenerator$Companion$createDefaultProviders$10());
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
/* 262 */     providers.put(MarkdownElementTypes.BLOCK_QUOTE, new AnnotatedStringGenerator$Companion$createDefaultProviders$11());
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
/* 275 */     return (Map)providers; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$7", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"}) public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$7 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) { Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); CharSequence text = ASTUtilKt.getTextInNode(node, markdownText); visitor.consumeText(text); } }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$8", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"}) public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$8 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) { Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); visitor.pushListContext(MarkdownElementTypes.ORDERED_LIST); ASTNodeKt.acceptChildren(node, (Visitor)visitor); visitor.popListContext(); } }
/* 279 */   private final Map<IElementType, AnnotatedStringGenerator.ProcessingProvider> createHeadingProviders() { Map<Object, Object> headingProviders = new LinkedHashMap<>();
/*     */     
/* 281 */     headingProviders
/* 282 */       .put(MarkdownElementTypes.ATX_1, createHeadingProvider-eAf_CNQ(TextUnitKt.getSp(24), FontWeight.Companion.getBold()));
/* 283 */     headingProviders
/* 284 */       .put(MarkdownElementTypes.ATX_2, createHeadingProvider-eAf_CNQ(TextUnitKt.getSp(20), FontWeight.Companion.getBold()));
/* 285 */     headingProviders
/* 286 */       .put(MarkdownElementTypes.ATX_3, createHeadingProvider-eAf_CNQ(TextUnitKt.getSp(16), FontWeight.Companion.getBold()));
/* 287 */     headingProviders
/* 288 */       .put(MarkdownElementTypes.ATX_4, createHeadingProvider-eAf_CNQ(TextUnitKt.getSp(14), FontWeight.Companion.getBold()));
/* 289 */     headingProviders
/* 290 */       .put(MarkdownElementTypes.ATX_5, createHeadingProvider-eAf_CNQ(TextUnitKt.getSp(12), FontWeight.Companion.getBold()));
/* 291 */     headingProviders
/* 292 */       .put(MarkdownElementTypes.ATX_6, createHeadingProvider-eAf_CNQ(TextUnitKt.getSp(10), FontWeight.Companion.getBold()));
/*     */     
/* 294 */     return (Map)headingProviders; }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$9", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"}) public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$9 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) { Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); visitor.pushListContext(MarkdownElementTypes.UNORDERED_LIST);
/*     */       ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/* 298 */       visitor.popListContext(); } } private final AnnotatedStringGenerator.ProcessingProvider createHeadingProvider-eAf_CNQ(long fontSize, FontWeight fontWeight) { return new AnnotatedStringGenerator$Companion$createHeadingProvider$1(fontSize, fontWeight); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$10", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"}) public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$10 implements AnnotatedStringGenerator.ProcessingProvider {
/*     */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) { Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); ListContext context = visitor.getCurrentListContext(); if (Intrinsics.areEqual((context != null) ? context.getType() : null, MarkdownElementTypes.ORDERED_LIST)) { visitor.consumeText("" + context.getItemIndex() + ". "); int i = context.getItemIndex(); context.setItemIndex(i + 1); } else { visitor.consumeText("• "); }  ASTNodeKt.acceptChildren(node, (Visitor)visitor); visitor.consumeText("\n"); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createDefaultProviders$11", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"}) public static final class AnnotatedStringGenerator$Companion$createDefaultProviders$11 implements AnnotatedStringGenerator.ProcessingProvider {
/* 300 */     public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) { Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); visitor.consumeText("> "); int start = visitor.getCurrentOffset(); ASTNodeKt.acceptChildren(node, (Visitor)visitor); int end = visitor.getCurrentOffset(); visitor.addStyle(new SpanStyle(0L, 0L, null, FontStyle.box-impl(FontStyle.Companion.getItalic-_-LCdwA()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), start, end); visitor.consumeText("\n\n"); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J$\020\002\032\0020\0032\n\020\004\032\0060\005R\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$Companion$createHeadingProvider$1", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$ProcessingProvider;", "processNode", "", "visitor", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator$AnnotatedStringGeneratingVisitor;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/markdown/AnnotatedStringGenerator;", "markdownText", "", "node", "Lorg/intellij/markdown/ast/ASTNode;", "ej-ui"}) public static final class AnnotatedStringGenerator$Companion$createHeadingProvider$1 implements AnnotatedStringGenerator.ProcessingProvider { AnnotatedStringGenerator$Companion$createHeadingProvider$1(long $fontSize, FontWeight $fontWeight) {} public void processNode(AnnotatedStringGenerator.AnnotatedStringGeneratingVisitor visitor, String markdownText, ASTNode node) { Intrinsics.checkNotNullParameter(visitor, "visitor"); Intrinsics.checkNotNullParameter(markdownText, "markdownText"); Intrinsics.checkNotNullParameter(node, "node"); int start = visitor.getCurrentOffset();
/* 301 */       ASTNodeKt.acceptChildren(node, (Visitor)visitor);
/* 302 */       int end = visitor.getCurrentOffset();
/* 303 */       visitor.addStyle(new SpanStyle(0L, this.$fontSize, this.$fontWeight, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65529, null), start, end);
/* 304 */       visitor.consumeText("\n\n"); }
/*     */      }
/*     */ 
/*     */ 
/*     */   
/*     */   private final List<HighlightedSegment> highlightCode(String code, String languageId, Project project) {
/*     */     Language language;
/* 311 */     List<HighlightedSegment> segments = new ArrayList();
/*     */     
/* 313 */     if (Language.findLanguageByID(languageId) == null) { Language.findLanguageByID(languageId); if (Language.findLanguageByID(StringsKt.capitalize(languageId)) == null) { Language.findLanguageByID(StringsKt.capitalize(languageId));
/* 314 */         Intrinsics.checkNotNullExpressionValue(languageId.toLowerCase(Locale.ROOT), "toLowerCase(...)"); }
/*     */        }
/* 316 */      LanguageFileType fileType = (language != null) ? language.getAssociatedFileType() : null;
/*     */     
/* 318 */     SyntaxHighlighter syntaxHighlighter = 
/* 319 */       (fileType != null) ? SyntaxHighlighterFactory.getSyntaxHighlighter((FileType)fileType, project, null) : null;
/* 320 */     if (fileType != null && syntaxHighlighter != null) {
/* 321 */       Intrinsics.checkNotNullExpressionValue(syntaxHighlighter.getHighlightingLexer(), "getHighlightingLexer(...)"); Lexer lexer = syntaxHighlighter.getHighlightingLexer();
/* 322 */       lexer.start(code);
/*     */       
/* 324 */       while (lexer.getTokenType() != null) {
/* 325 */         Intrinsics.checkNotNullExpressionValue(code.substring(lexer.getTokenStart(), lexer.getTokenEnd()), "substring(...)"); String tokenText = code.substring(lexer.getTokenStart(), lexer.getTokenEnd());
/* 326 */         Intrinsics.checkNotNull(lexer.getTokenType()); Intrinsics.checkNotNullExpressionValue(syntaxHighlighter.getTokenHighlights(lexer.getTokenType()), "getTokenHighlights(...)"); TextAttributesKey[] textAttributesKeys = syntaxHighlighter.getTokenHighlights(lexer.getTokenType());
/* 327 */         SpanStyle spanStyle = getSpanStyleFromTextAttributesKeys(textAttributesKeys);
/* 328 */         segments.add(new HighlightedSegment(tokenText, spanStyle));
/* 329 */         lexer.advance();
/*     */       } 
/*     */     } else {
/*     */       
/* 333 */       segments.add(new HighlightedSegment(code, null));
/*     */     } 
/*     */     
/* 336 */     return segments;
/*     */   }
/*     */   private final SpanStyle getSpanStyleFromTextAttributesKeys(TextAttributesKey[] keys) {
/*     */     TextAttributes attributes;
/* 340 */     if ((keys.length == 0)) return null;
/*     */     
/* 342 */     Intrinsics.checkNotNullExpressionValue(EditorColorsManager.getInstance().getGlobalScheme(), "getGlobalScheme(...)"); EditorColorsScheme colorsScheme = EditorColorsManager.getInstance().getGlobalScheme();
/* 343 */     if (colorsScheme.getAttributes(keys[0]) == null) { colorsScheme.getAttributes(keys[0]); return null; }
/*     */     
/* 345 */     Color it = attributes.getForegroundColor();
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
/* 375 */     int $i$a$-let-AnnotatedStringGenerator$Companion$getSpanStyleFromTextAttributesKeys$color$1 = 0;
/*     */     attributes.getForegroundColor();
/*     */     long color = (attributes.getForegroundColor() != null) ? ColorKt.Color(it.getRGB()) : Color.Companion.getUnspecified-0d7_KjU();
/*     */     Object fontStyle = ((attributes.getFontType() & 0x1) != 0) ? FontWeight.Companion.getBold() : (((attributes.getFontType() & 0x2) != 0) ? FontStyle.box-impl(FontStyle.Companion.getItalic-_-LCdwA()) : null);
/*     */     return new SpanStyle(color, 0L, (fontStyle instanceof FontWeight) ? (FontWeight)fontStyle : null, (fontStyle instanceof FontStyle) ? (FontStyle)fontStyle : null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65522, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\markdown\AnnotatedStringGenerator$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */