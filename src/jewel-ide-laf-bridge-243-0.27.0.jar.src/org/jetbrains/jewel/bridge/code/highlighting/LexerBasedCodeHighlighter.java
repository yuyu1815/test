/*     */ package org.jetbrains.jewel.bridge.code.highlighting;
/*     */ 
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.lexer.Lexer;
/*     */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*     */ import com.intellij.openapi.editor.colors.TextAttributesKey;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.openapi.fileTypes.SyntaxHighlighter;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineDispatcher;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\b\001\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\b\b\002\020\007\032\0020\b¢\006\004\b\t\020\nJ%\020\013\032\b\022\004\022\0020\f0\0052\006\020\r\032\0020\0162\006\020\017\032\0020\020H\026¢\006\004\b\021\020\022J0\020\023\032\0020\006*\b\022\004\022\0020\f0\0242\006\020\025\032\0020\0262\006\020\r\032\0020\0162\006\020\027\032\0020\030H@¢\006\002\020\031J \020\032\032\0020\f2\006\020\025\032\0020\0262\006\020\r\032\0020\0162\006\020\027\032\0020\030H\002J\025\020\033\032\004\030\0010\034*\0020\020H\002¢\006\004\b\035\020\036J/\020\037\032\0020\006*\0020 2\b\020!\032\004\030\0010\"2\027\020#\032\023\022\004\022\0020 \022\004\022\0020\0060$¢\006\002\b%H\002J\f\020&\032\0020'*\0020\"H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006("}, d2 = {"Lorg/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter;", "Lorg/jetbrains/jewel/foundation/code/highlighting/CodeHighlighter;", "project", "Lcom/intellij/openapi/project/Project;", "reHighlightingRequests", "Lkotlinx/coroutines/flow/Flow;", "", "highlightDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/intellij/openapi/project/Project;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineDispatcher;)V", "highlight", "Landroidx/compose/ui/text/AnnotatedString;", "code", "", "mimeType", "Lorg/jetbrains/jewel/foundation/code/MimeType;", "highlight-C7ITchA", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "highlightAndEmit", "Lkotlinx/coroutines/flow/FlowCollector;", "highlighter", "Lcom/intellij/openapi/fileTypes/SyntaxHighlighter;", "colorScheme", "Lcom/intellij/openapi/editor/colors/EditorColorsScheme;", "(Lkotlinx/coroutines/flow/FlowCollector;Lcom/intellij/openapi/fileTypes/SyntaxHighlighter;Ljava/lang/String;Lcom/intellij/openapi/editor/colors/EditorColorsScheme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doHighlight", "toLanguageOrNull", "Lcom/intellij/lang/Language;", "toLanguageOrNull-9QlrTNA", "(Ljava/lang/String;)Lcom/intellij/lang/Language;", "withTextAttributes", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "textAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "toSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "ide-laf-bridge"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nLexerBasedCodeHighlighter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LexerBasedCodeHighlighter.kt\norg/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,105:1\n1241#2:106\n1040#2,6:107\n*S KotlinDebug\n*F\n+ 1 LexerBasedCodeHighlighter.kt\norg/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter\n*L\n64#1:106\n88#1:107,6\n*E\n"})
/*     */ public final class LexerBasedCodeHighlighter implements CodeHighlighter {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final Flow<Unit> reHighlightingRequests;
/*     */   @NotNull
/*     */   private final CoroutineDispatcher highlightDispatcher;
/*     */   public static final int $stable = 8;
/*     */   
/*  33 */   public LexerBasedCodeHighlighter(@NotNull Project project, @NotNull Flow<Unit> reHighlightingRequests, @NotNull CoroutineDispatcher highlightDispatcher) { this.project = project;
/*  34 */     this.reHighlightingRequests = reHighlightingRequests;
/*  35 */     this.highlightDispatcher = highlightDispatcher; } @NotNull public Flow<AnnotatedString> highlight-C7ITchA(@NotNull String code, @NotNull String mimeType) { Language language;
/*     */     String fileExtension;
/*     */     SyntaxHighlighter highlighter;
/*  38 */     Intrinsics.checkNotNullParameter(code, "code"); Intrinsics.checkNotNullParameter(mimeType, "mimeType"); if (toLanguageOrNull-9QlrTNA(mimeType) == null) { toLanguageOrNull-9QlrTNA(mimeType); return FlowKt.flowOf(new AnnotatedString(code, null, null, 6, null)); }
/*  39 */      if (language.getAssociatedFileType() == null || language.getAssociatedFileType().getDefaultExtension() == null) { language.getAssociatedFileType().getDefaultExtension(); return FlowKt.flowOf(new AnnotatedString(code, null, null, 6, null)); }
/*  40 */      LightVirtualFile virtualFile = new LightVirtualFile("markdown_code_block_" + code.hashCode() + "." + fileExtension, language, code);
/*  41 */     Intrinsics.checkNotNullExpressionValue(EditorColorsManager.getInstance().getGlobalScheme(), "getGlobalScheme(...)"); EditorColorsScheme colorScheme = EditorColorsManager.getInstance().getGlobalScheme();
/*     */     
/*  43 */     if (SyntaxHighlighterFactory.getSyntaxHighlighter(language, this.project, (VirtualFile)virtualFile) == null) { SyntaxHighlighterFactory.getSyntaxHighlighter(language, this.project, (VirtualFile)virtualFile);
/*  44 */       return FlowKt.flowOf(new AnnotatedString(code, null, null, 6, null)); }
/*     */     
/*  46 */     return FlowKt.flow(new LexerBasedCodeHighlighter$highlight$1(highlighter, code, colorScheme, null)); } @DebugMetadata(f = "LexerBasedCodeHighlighter.kt", l = {47, 48}, i = {0}, s = {"L$0"}, n = {"$this$flow"}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.code.highlighting.LexerBasedCodeHighlighter$highlight$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/compose/ui/text/AnnotatedString;"}) static final class LexerBasedCodeHighlighter$highlight$1 extends SuspendLambda implements Function2<FlowCollector<? super AnnotatedString>, Continuation<? super Unit>, Object> { int label; LexerBasedCodeHighlighter$highlight$1(SyntaxHighlighter $highlighter, String $code, EditorColorsScheme $colorScheme, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FlowCollector<? super AnnotatedString> flowCollector1, $this$flow; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); flowCollector1 = (FlowCollector)this.L$0;
/*  47 */           this.L$0 = flowCollector1; this.label = 1; if (LexerBasedCodeHighlighter.this.highlightAndEmit(flowCollector1, this.$highlighter, this.$code, this.$colorScheme, (Continuation)this) == object) return object;  LexerBasedCodeHighlighter.this.highlightAndEmit(flowCollector1, this.$highlighter, this.$code, this.$colorScheme, (Continuation)this);
/*  48 */           this.L$0 = null; this.label = 2; if (LexerBasedCodeHighlighter.this.reHighlightingRequests.collect(new FlowCollector(flowCollector1, this.$highlighter, this.$code, this.$colorScheme) { public final Object emit(Unit it, Continuation $completion) { if (LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  LexerBasedCodeHighlighter.this.reHighlightingRequests.collect(new FlowCollector(flowCollector1, this.$highlighter, this.$code, this.$colorScheme) { public final Object emit(Unit it, Continuation $completion) { if (LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE; } }(Continuation)this);
/*  49 */           return Unit.INSTANCE;case 1: $this$flow = (FlowCollector)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.L$0 = null; this.label = 2; if (LexerBasedCodeHighlighter.this.reHighlightingRequests.collect(new FlowCollector($this$flow, this.$highlighter, this.$code, this.$colorScheme) { public final Object emit(Unit it, Continuation $completion) { if (LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  LexerBasedCodeHighlighter.this.reHighlightingRequests.collect(new FlowCollector($this$flow, this.$highlighter, this.$code, this.$colorScheme) { public final Object emit(Unit it, Continuation $completion) { if (LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion);  LexerBasedCodeHighlighter.this.highlightAndEmit(this.$$this$flow, this.$highlighter, this.$code, this.$colorScheme, $completion); return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super LexerBasedCodeHighlighter$highlight$1> $completion) { LexerBasedCodeHighlighter$highlight$1 lexerBasedCodeHighlighter$highlight$1 = new LexerBasedCodeHighlighter$highlight$1(this.$highlighter, this.$code, this.$colorScheme, $completion); lexerBasedCodeHighlighter$highlight$1.L$0 = value; return (Continuation<Unit>)lexerBasedCodeHighlighter$highlight$1; }
/*     */     public final Object invoke(FlowCollector p1, Continuation<?> p2) { return ((LexerBasedCodeHighlighter$highlight$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */    private final Object highlightAndEmit(FlowCollector $this$highlightAndEmit, SyntaxHighlighter highlighter, String code, EditorColorsScheme colorScheme, Continuation $completion) { // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof org/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter$highlightAndEmit$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast org/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter$highlightAndEmit$1
/*     */     //   13: astore #8
/*     */     //   15: aload #8
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #8
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new org/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter$highlightAndEmit$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lorg/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #8
/*     */     //   53: aload #8
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #7
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #9
/*     */     //   65: aload #8
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 214, 0 -> 96, 1 -> 154, 2 -> 202
/*     */     //   96: aload #7
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_1
/*     */     //   102: astore #6
/*     */     //   104: aload_0
/*     */     //   105: getfield highlightDispatcher : Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   108: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   111: new org/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter$highlightAndEmit$2
/*     */     //   114: dup
/*     */     //   115: aload_0
/*     */     //   116: aload_2
/*     */     //   117: aload_3
/*     */     //   118: aload #4
/*     */     //   120: aconst_null
/*     */     //   121: invokespecial <init> : (Lorg/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter;Lcom/intellij/openapi/fileTypes/SyntaxHighlighter;Ljava/lang/String;Lcom/intellij/openapi/editor/colors/EditorColorsScheme;Lkotlin/coroutines/Continuation;)V
/*     */     //   124: checkcast kotlin/jvm/functions/Function2
/*     */     //   127: aload #8
/*     */     //   129: aload #8
/*     */     //   131: aload #6
/*     */     //   133: putfield L$0 : Ljava/lang/Object;
/*     */     //   136: aload #8
/*     */     //   138: iconst_1
/*     */     //   139: putfield label : I
/*     */     //   142: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   145: dup
/*     */     //   146: aload #9
/*     */     //   148: if_acmpne -> 171
/*     */     //   151: aload #9
/*     */     //   153: areturn
/*     */     //   154: aload #8
/*     */     //   156: getfield L$0 : Ljava/lang/Object;
/*     */     //   159: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */     //   162: astore #6
/*     */     //   164: aload #7
/*     */     //   166: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   169: aload #7
/*     */     //   171: aload #6
/*     */     //   173: swap
/*     */     //   174: aload #8
/*     */     //   176: aload #8
/*     */     //   178: aconst_null
/*     */     //   179: putfield L$0 : Ljava/lang/Object;
/*     */     //   182: aload #8
/*     */     //   184: iconst_2
/*     */     //   185: putfield label : I
/*     */     //   188: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   193: dup
/*     */     //   194: aload #9
/*     */     //   196: if_acmpne -> 209
/*     */     //   199: aload #9
/*     */     //   201: areturn
/*     */     //   202: aload #7
/*     */     //   204: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   207: aload #7
/*     */     //   209: pop
/*     */     //   210: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   213: areturn
/*     */     //   214: new java/lang/IllegalStateException
/*     */     //   217: dup
/*     */     //   218: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   220: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   223: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 63
/*     */     //   #57	-> 101
/*     */     //   #52	-> 151
/*     */     //   #57	-> 171
/*     */     //   #52	-> 199
/*     */     //   #58	-> 209
/*     */     //   #52	-> 214
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	44	0	this	Lorg/jetbrains/jewel/bridge/code/highlighting/LexerBasedCodeHighlighter;
/*     */     //   101	44	1	$this$highlightAndEmit	Lkotlinx/coroutines/flow/FlowCollector;
/*     */     //   101	44	2	highlighter	Lcom/intellij/openapi/fileTypes/SyntaxHighlighter;
/*     */     //   101	44	3	code	Ljava/lang/String;
/*     */     //   101	44	4	colorScheme	Lcom/intellij/openapi/editor/colors/EditorColorsScheme;
/*     */     //   0	224	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	161	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	154	7	$result	Ljava/lang/Object; } @DebugMetadata(f = "LexerBasedCodeHighlighter.kt", l = {57, 57}, i = {}, s = {}, n = {}, m = "highlightAndEmit", c = "org.jetbrains.jewel.bridge.code.highlighting.LexerBasedCodeHighlighter") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class LexerBasedCodeHighlighter$highlightAndEmit$1 extends ContinuationImpl {
/*     */     Object L$0; int label; LexerBasedCodeHighlighter$highlightAndEmit$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE;
/*     */       return LexerBasedCodeHighlighter.this.highlightAndEmit(null, null, null, null, (Continuation)this); }
/*     */   } @DebugMetadata(f = "LexerBasedCodeHighlighter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.code.highlighting.LexerBasedCodeHighlighter$highlightAndEmit$2") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class LexerBasedCodeHighlighter$highlightAndEmit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnnotatedString>, Object> {
/*  57 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return LexerBasedCodeHighlighter.this.doHighlight(this.$highlighter, this.$code, this.$colorScheme); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } int label; LexerBasedCodeHighlighter$highlightAndEmit$2(SyntaxHighlighter $highlighter, String $code, EditorColorsScheme $colorScheme, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     } public final Continuation<Unit> create(Object value, Continuation<? super LexerBasedCodeHighlighter$highlightAndEmit$2> $completion) {
/*     */       return (Continuation<Unit>)new LexerBasedCodeHighlighter$highlightAndEmit$2(this.$highlighter, this.$code, this.$colorScheme, $completion);
/*     */     } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((LexerBasedCodeHighlighter$highlightAndEmit$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } } private final AnnotatedString doHighlight(SyntaxHighlighter highlighter, String code, EditorColorsScheme colorScheme) {
/*  64 */     int $i$f$buildAnnotatedString = 0;
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
/* 106 */     AnnotatedString.Builder builder1 = new AnnotatedString.Builder(0, 1, null), $this$doHighlight_u24lambda_u243 = builder1; int $i$a$-buildAnnotatedString-LexerBasedCodeHighlighter$doHighlight$1 = 0; Lexer $this$doHighlight_u24lambda_u243_u24lambda_u242 = highlighter.getHighlightingLexer(); int $i$a$-with-LexerBasedCodeHighlighter$doHighlight$1$1 = 0; $this$doHighlight_u24lambda_u243_u24lambda_u242.start(code); while ($this$doHighlight_u24lambda_u243_u24lambda_u242.getTokenType() != null) { TextAttributesKey attrKey; Lexer $this$doHighlight_u24lambda_u243_u24lambda_u242_u24lambda_u240 = $this$doHighlight_u24lambda_u243_u24lambda_u242; int $i$a$-run-LexerBasedCodeHighlighter$doHighlight$1$1$attributes$1 = 0; Intrinsics.checkNotNullExpressionValue(highlighter.getTokenHighlights($this$doHighlight_u24lambda_u243_u24lambda_u242_u24lambda_u240.getTokenType()), "getTokenHighlights(...)"); (TextAttributesKey)ArraysKt.lastOrNull((Object[])highlighter.getTokenHighlights($this$doHighlight_u24lambda_u243_u24lambda_u242_u24lambda_u240.getTokenType())); if (colorScheme.getAttributes(attrKey) == null) colorScheme.getAttributes(attrKey);  TextAttributes attributes = ((TextAttributesKey)ArraysKt.lastOrNull((Object[])highlighter.getTokenHighlights($this$doHighlight_u24lambda_u243_u24lambda_u242_u24lambda_u240.getTokenType())) == null) ? null : attrKey.getDefaultAttributes(); withTextAttributes($this$doHighlight_u24lambda_u243, attributes, $this$doHighlight_u24lambda_u243_u24lambda_u242::doHighlight$lambda$3$lambda$2$lambda$1); $this$doHighlight_u24lambda_u243_u24lambda_u242.advance(); }  return builder1.toAnnotatedString(); } private static final Unit doHighlight$lambda$3$lambda$2$lambda$1(Lexer $this_with, AnnotatedString.Builder $this$withTextAttributes) { Intrinsics.checkNotNullParameter($this$withTextAttributes, "$this$withTextAttributes"); Intrinsics.checkNotNullExpressionValue($this_with.getTokenText(), "getTokenText(...)"); $this$withTextAttributes.append($this_with.getTokenText()); return Unit.INSTANCE; } private final Language toLanguageOrNull-9QlrTNA(String $this$toLanguageOrNull_u2d9QlrTNA) { Intrinsics.checkNotNullExpressionValue(MimeType.displayName-impl($this$toLanguageOrNull_u2d9QlrTNA).toLowerCase(Locale.ROOT), "toLowerCase(...)"); return LanguageUtil.findRegisteredLanguage(MimeType.displayName-impl($this$toLanguageOrNull_u2d9QlrTNA).toLowerCase(Locale.ROOT)); }
/* 107 */   private final void withTextAttributes(AnnotatedString.Builder $this$withTextAttributes, TextAttributes textAttributes, Function1 block) { if (textAttributes == null) { block.invoke($this$withTextAttributes); return; }  AnnotatedString.Builder builder = $this$withTextAttributes; SpanStyle style$iv = toSpanStyle(textAttributes); int $i$f$withStyle = 0; int index$iv = builder.pushStyle(style$iv);
/*     */     
/* 109 */     try { Object object = block.invoke(builder);
/*     */       
/* 111 */       builder.pop(index$iv); } finally { builder.pop(index$iv); }
/*     */      }
/*     */ 
/*     */   
/*     */   private final SpanStyle toSpanStyle(TextAttributes $this$toSpanStyle) {
/*     */     $this$toSpanStyle.getEffectType();
/*     */     switch (($this$toSpanStyle.getEffectType() == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[$this$toSpanStyle.getEffectType().ordinal()]) {
/*     */       case true:
/*     */       
/*     */       case true:
/*     */       
/*     */     } 
/*     */     super((($this$toSpanStyle.getFontType() & 0x1) != 0) ? FontWeight.Companion.getBold() : null, (($this$toSpanStyle.getFontType() & 0x2) != 0) ? FontStyle.box-impl(FontStyle.Companion.getItalic-_-LCdwA()) : null, null, null, null, 0L, null, null, null, BridgeUtilsKt.toComposeColorOrUnspecified($this$toSpanStyle.getBackgroundColor()), (LocaleList)$this$toSpanStyle.getEffectType(), TextDecoration.Companion.getLineThrough(), null, null, null, null, 59378, null);
/*     */     return BridgeUtilsKt.toComposeColorOrUnspecified($this$toSpanStyle.getForegroundColor());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\code\highlighting\LexerBasedCodeHighlighter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */