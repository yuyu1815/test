/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.Artifact;
/*     */ import com.intellij.ml.llm.matterhorn.CancelledArtifact;
/*     */ import com.intellij.ml.llm.matterhorn.FailedArtifact;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.text.html.HTMLEditorKit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\013\n\002\b\003\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\024\032\0020\rH\002J\b\020\025\032\0020\021H\002J\022\020\026\032\0020\0272\n\020\030\032\006\022\002\b\0030\031J\016\020\026\032\0020\0272\006\020\030\032\0020\032J\016\020\026\032\0020\0272\006\020\030\032\0020\033J\030\020\034\032\0020\0272\006\020\035\032\0020\0362\b\b\002\020\037\032\0020 J\016\020!\032\0020\0362\006\020\"\032\0020\036R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\022\020\023¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactPreviewPanel;", "", "project", "Lcom/intellij/openapi/project/Project;", "parent", "Lcom/intellij/openapi/Disposable;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getParent", "()Lcom/intellij/openapi/Disposable;", "htmlViewPane", "Ljavax/swing/JEditorPane;", "getHtmlViewPane", "()Ljavax/swing/JEditorPane;", "jsonEditor", "Lcom/intellij/openapi/editor/Editor;", "getJsonEditor", "()Lcom/intellij/openapi/editor/Editor;", "createHtmlPreview", "createJsonEditor", "showArtifact", "", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "showArtifactText", "text", "", "addBackticks", "", "formatTripleBackticks", "input", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nArtifactPreviewPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArtifactPreviewPanel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ArtifactPreviewPanel\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,131:1\n14#2:132\n*S KotlinDebug\n*F\n+ 1 ArtifactPreviewPanel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ArtifactPreviewPanel\n*L\n120#1:132\n*E\n"})
/*     */ public final class ArtifactPreviewPanel {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final Disposable parent;
/*     */   
/*  25 */   public ArtifactPreviewPanel(@NotNull Project project, @NotNull Disposable parent) { this.project = project; this.parent = parent;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  30 */     this.htmlViewPane = createHtmlPreview();
/*  31 */     this.jsonEditor = createJsonEditor(); }
/*     */   @NotNull private final JEditorPane htmlViewPane;
/*     */   @NotNull private final Editor jsonEditor; public static final int $stable = 8; @NotNull
/*     */   public final Project getProject() { return this.project; } @NotNull
/*  35 */   public final Disposable getParent() { return this.parent; } private final JEditorPane createHtmlPreview() { JEditorPane editorPane = new JEditorPane();
/*  36 */     editorPane.setBorder((Border)JBUI.Borders.empty());
/*     */     
/*  38 */     editorPane.setContentType("text/html");
/*  39 */     HTMLEditorKit hTMLEditorKit1 = (new HTMLEditorKitBuilder()).withViewFactoryExtensions(new kotlin.jvm.functions.Function2[0]).build(), hTMLEditorKit2 = hTMLEditorKit1; JEditorPane jEditorPane1 = editorPane; int $i$a$-apply-ArtifactPreviewPanel$createHtmlPreview$1 = 0;
/*  40 */     hTMLEditorKit2.getStyleSheet().addRule("p {margin-top: 1px}");
/*  41 */     hTMLEditorKit2.getStyleSheet().addRule("body {margin: 0; padding: 10px}");
/*     */     
/*  43 */     jEditorPane1.setEditorKit(hTMLEditorKit1);
/*     */     
/*  45 */     editorPane.setEditable(false);
/*  46 */     editorPane.setEditable(false);
/*  47 */     editorPane.setOpaque(false);
/*  48 */     editorPane.setBorder(null);
/*  49 */     editorPane.setText("");
/*     */     
/*  51 */     return editorPane; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final JEditorPane getHtmlViewPane() {
/*     */     return this.htmlViewPane;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Editor getJsonEditor() {
/*     */     return this.jsonEditor;
/*     */   }
/*     */   
/*     */   private final Editor createJsonEditor() {
/*     */     // Byte code:
/*     */     //   0: new com/intellij/testFramework/LightVirtualFile
/*     */     //   3: dup
/*     */     //   4: ldc 'artifact_content.json'
/*     */     //   6: getstatic com/intellij/json/JsonLanguage.INSTANCE : Lcom/intellij/json/JsonLanguage;
/*     */     //   9: checkcast com/intellij/lang/Language
/*     */     //   12: ldc ''
/*     */     //   14: checkcast java/lang/CharSequence
/*     */     //   17: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/lang/Language;Ljava/lang/CharSequence;)V
/*     */     //   20: astore_1
/*     */     //   21: aload_1
/*     */     //   22: invokevirtual getFileType : ()Lcom/intellij/openapi/fileTypes/FileType;
/*     */     //   25: getstatic com/intellij/openapi/fileTypes/UnknownFileType.INSTANCE : Lcom/intellij/openapi/fileTypes/FileType;
/*     */     //   28: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 44
/*     */     //   34: aload_1
/*     */     //   35: getstatic com/intellij/openapi/fileTypes/PlainTextFileType.INSTANCE : Lcom/intellij/openapi/fileTypes/PlainTextFileType;
/*     */     //   38: checkcast com/intellij/openapi/fileTypes/FileType
/*     */     //   41: invokevirtual setFileType : (Lcom/intellij/openapi/fileTypes/FileType;)V
/*     */     //   44: aload_1
/*     */     //   45: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   48: invokestatic findDocument : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/editor/Document;
/*     */     //   51: dup
/*     */     //   52: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   55: astore_2
/*     */     //   56: invokestatic getInstance : ()Lcom/intellij/openapi/editor/EditorFactory;
/*     */     //   59: astore_3
/*     */     //   60: aload_3
/*     */     //   61: aload_2
/*     */     //   62: aload_0
/*     */     //   63: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   66: invokevirtual createViewer : (Lcom/intellij/openapi/editor/Document;Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/editor/Editor;
/*     */     //   69: dup
/*     */     //   70: ldc 'null cannot be cast to non-null type com.intellij.openapi.editor.ex.EditorEx'
/*     */     //   72: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   75: checkcast com/intellij/openapi/editor/ex/EditorEx
/*     */     //   78: astore #4
/*     */     //   80: aload #4
/*     */     //   82: aload_1
/*     */     //   83: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   86: invokeinterface setFile : (Lcom/intellij/openapi/vfs/VirtualFile;)V
/*     */     //   91: getstatic com/intellij/openapi/editor/highlighter/EditorHighlighterFactory.Companion : Lcom/intellij/openapi/editor/highlighter/EditorHighlighterFactory$Companion;
/*     */     //   94: invokevirtual getInstance : ()Lcom/intellij/openapi/editor/highlighter/EditorHighlighterFactory;
/*     */     //   97: aload_0
/*     */     //   98: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   101: aload_1
/*     */     //   102: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   105: invokevirtual createEditorHighlighter : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/editor/highlighter/EditorHighlighter;
/*     */     //   108: astore #5
/*     */     //   110: aload #4
/*     */     //   112: aload #5
/*     */     //   114: invokeinterface setHighlighter : (Lcom/intellij/openapi/editor/highlighter/EditorHighlighter;)V
/*     */     //   119: aload_0
/*     */     //   120: getfield parent : Lcom/intellij/openapi/Disposable;
/*     */     //   123: aload_3
/*     */     //   124: aload #4
/*     */     //   126: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/EditorFactory;Lcom/intellij/openapi/editor/ex/EditorEx;)Lkotlin/jvm/functions/Function0;
/*     */     //   131: invokestatic whenDisposed : (Lcom/intellij/openapi/Disposable;Lkotlin/jvm/functions/Function0;)V
/*     */     //   134: aload #4
/*     */     //   136: invokeinterface getSettings : ()Lcom/intellij/openapi/editor/EditorSettings;
/*     */     //   141: astore #6
/*     */     //   143: aload #6
/*     */     //   145: astore #7
/*     */     //   147: iconst_0
/*     */     //   148: istore #8
/*     */     //   150: aload #7
/*     */     //   152: iconst_0
/*     */     //   153: invokeinterface setDndEnabled : (Z)V
/*     */     //   158: aload #7
/*     */     //   160: iconst_0
/*     */     //   161: invokeinterface setLineNumbersShown : (Z)V
/*     */     //   166: aload #7
/*     */     //   168: iconst_0
/*     */     //   169: invokeinterface setAdditionalLinesCount : (I)V
/*     */     //   174: aload #7
/*     */     //   176: iconst_0
/*     */     //   177: invokeinterface setLineMarkerAreaShown : (Z)V
/*     */     //   182: aload #7
/*     */     //   184: iconst_0
/*     */     //   185: invokeinterface setFoldingOutlineShown : (Z)V
/*     */     //   190: aload #7
/*     */     //   192: iconst_0
/*     */     //   193: invokeinterface setRightMarginShown : (Z)V
/*     */     //   198: aload #7
/*     */     //   200: iconst_0
/*     */     //   201: invokeinterface setShowIntentionBulb : (Z)V
/*     */     //   206: aload #7
/*     */     //   208: iconst_1
/*     */     //   209: invokeinterface setUseSoftWraps : (Z)V
/*     */     //   214: aload #7
/*     */     //   216: iconst_0
/*     */     //   217: invokeinterface setPaintSoftWraps : (Z)V
/*     */     //   222: aload #7
/*     */     //   224: iconst_1
/*     */     //   225: invokeinterface setRefrainFromScrolling : (Z)V
/*     */     //   230: aload #7
/*     */     //   232: iconst_0
/*     */     //   233: invokeinterface setAdditionalPageAtBottom : (Z)V
/*     */     //   238: aload #7
/*     */     //   240: iconst_0
/*     */     //   241: invokeinterface setCaretRowShown : (Z)V
/*     */     //   246: nop
/*     */     //   247: nop
/*     */     //   248: aload #4
/*     */     //   250: checkcast com/intellij/openapi/editor/Editor
/*     */     //   253: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #55	-> 0
/*     */     //   #56	-> 21
/*     */     //   #57	-> 34
/*     */     //   #59	-> 44
/*     */     //   #61	-> 56
/*     */     //   #62	-> 60
/*     */     //   #63	-> 80
/*     */     //   #65	-> 91
/*     */     //   #67	-> 110
/*     */     //   #68	-> 119
/*     */     //   #72	-> 134
/*     */     //   #73	-> 150
/*     */     //   #74	-> 158
/*     */     //   #75	-> 166
/*     */     //   #76	-> 174
/*     */     //   #77	-> 182
/*     */     //   #78	-> 190
/*     */     //   #79	-> 198
/*     */     //   #80	-> 206
/*     */     //   #81	-> 214
/*     */     //   #82	-> 222
/*     */     //   #83	-> 230
/*     */     //   #84	-> 238
/*     */     //   #85	-> 246
/*     */     //   #72	-> 247
/*     */     //   #87	-> 248
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   150	97	8	$i$a$-apply-ArtifactPreviewPanel$createJsonEditor$2	I
/*     */     //   147	100	7	$this$createJsonEditor_u24lambda_u242	Lcom/intellij/openapi/editor/EditorSettings;
/*     */     //   21	233	1	file	Lcom/intellij/testFramework/LightVirtualFile;
/*     */     //   56	198	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   60	194	3	editorFactory	Lcom/intellij/openapi/editor/EditorFactory;
/*     */     //   80	174	4	editor	Lcom/intellij/openapi/editor/ex/EditorEx;
/*     */     //   110	144	5	highlighter	Lcom/intellij/openapi/editor/highlighter/EditorHighlighter;
/*     */     //   0	254	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactPreviewPanel;
/*     */   }
/*     */   
/*     */   private static final Unit createJsonEditor$lambda$1(EditorFactory $editorFactory, EditorEx $editor) {
/*  69 */     $editorFactory.releaseEditor((Editor)$editor);
/*  70 */     return Unit.INSTANCE;
/*     */   }
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
/*     */   public final void showArtifact(@NotNull Artifact artifact) {
/*  91 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); showArtifactText$default(this, String.valueOf(artifact.getContent()), false, 2, null);
/*     */   }
/*     */   
/*     */   public final void showArtifact(@NotNull CancelledArtifact artifact) {
/*  95 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); if (artifact.getReasoning().getMessage() == null) artifact.getReasoning().getMessage();  artifact.getReasoning().getMessage().showArtifactText("Cancelled", true);
/*     */   }
/*     */   
/*     */   public final void showArtifact(@NotNull FailedArtifact artifact) {
/*  99 */     Intrinsics.checkNotNullParameter(artifact, "artifact"); showArtifactText(artifact.getReasoning().getReason().getMessage(), true);
/*     */   }
/*     */   
/*     */   public final void showArtifactText(@NotNull String text, boolean addBackticks) {
/* 103 */     Intrinsics.checkNotNullParameter(text, "text"); String processedText = addBackticks ? ("```\n" + text + "\n```\n") : formatTripleBackticks(text);
/*     */     try {
/* 105 */       String htmlContent = MarkdownToHtmlConverterKt.convertMarkdownToHtml(processedText);
/*     */       
/* 107 */       String wrappedHtml = StringsKt.isBlank(htmlContent) ? 
/* 108 */         "<html><body><p>&nbsp;</p></body></html>" : (
/*     */         
/* 110 */         !StringsKt.contains(htmlContent, "<html>", true) ? ("<html><body>" + 
/* 111 */         htmlContent + "</body></html>") : 
/*     */         
/* 113 */         htmlContent);
/*     */ 
/*     */       
/* 116 */       this.htmlViewPane.setText(wrappedHtml);
/*     */     }
/* 118 */     catch (Exception e) {
/* 119 */       this.htmlViewPane.setText("<html><body><p>Can not be displayed</p></body></html>");
/* 120 */       int $i$f$logger = 0;
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
/* 132 */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ArtifactPreviewPanel.class), "getInstance(...)"); Logger.getInstance(ArtifactPreviewPanel.class).error(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String formatTripleBackticks(@NotNull String input) {
/*     */     Intrinsics.checkNotNullParameter(input, "input");
/*     */     Regex pattern = new Regex("(?<!\n)```");
/*     */     CharSequence charSequence = input;
/*     */     Function1 function1 = ArtifactPreviewPanel::formatTripleBackticks$lambda$3;
/*     */     return pattern.replace(charSequence, function1);
/*     */   }
/*     */   
/*     */   private static final CharSequence formatTripleBackticks$lambda$3(MatchResult it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return "\n```";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ArtifactPreviewPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */