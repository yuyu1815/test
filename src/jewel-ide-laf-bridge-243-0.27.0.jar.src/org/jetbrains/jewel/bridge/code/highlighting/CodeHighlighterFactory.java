/*    */ package org.jetbrains.jewel.bridge.code.highlighting;
/*    */ 
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\000 \r2\0020\001:\001\rB\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\006\020\013\032\0020\fR\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory;", "", "project", "Lcom/intellij/openapi/project/Project;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/intellij/openapi/project/Project;Lkotlinx/coroutines/CoroutineScope;)V", "reHighlightingRequests", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "createHighlighter", "Lorg/jetbrains/jewel/foundation/code/highlighting/CodeHighlighter;", "Companion", "ide-laf-bridge"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class CodeHighlighterFactory {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Project project;
/*    */   
/* 14 */   public CodeHighlighterFactory(@NotNull Project project, @NotNull CoroutineScope coroutineScope) { this.project = project; this.coroutineScope = coroutineScope;
/* 15 */     this.reHighlightingRequests = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     Intrinsics.checkNotNullExpressionValue(EditorColorsManager.TOPIC, "TOPIC"); this.project.getMessageBus().connect(this.coroutineScope).subscribe(EditorColorsManager.TOPIC, this::_init_$lambda$0); } @NotNull private final CoroutineScope coroutineScope; @NotNull
/* 22 */   private final MutableSharedFlow<Unit> reHighlightingRequests; public static final int $stable = 8; private static final void _init_$lambda$0(CodeHighlighterFactory this$0, EditorColorsScheme it) { BuildersKt.launch$default(this$0.coroutineScope, null, null, new CodeHighlighterFactory$1$1(null), 3, null); }
/*    */ 
/*    */   
/*    */   @NotNull
/* 26 */   public final CodeHighlighter createHighlighter() { return new LexerBasedCodeHighlighter(this.project, (Flow)this.reHighlightingRequests, null, 4, null); } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory$Companion;", "", "<init>", "()V", "getInstance", "Lorg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory;", "project", "Lcom/intellij/openapi/project/Project;", "ide-laf-bridge"})
/*    */   @SourceDebugExtension({"SMAP\nCodeHighlighterFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeHighlighterFactory.kt\norg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,32:1\n31#2,2:33\n*S KotlinDebug\n*F\n+ 1 CodeHighlighterFactory.kt\norg/jetbrains/jewel/bridge/code/highlighting/CodeHighlighterFactory$Companion\n*L\n29#1:33,2\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 29 */     public final CodeHighlighterFactory getInstance(@NotNull Project project) { Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */       
/* 33 */       Class<CodeHighlighterFactory> serviceClass$iv = CodeHighlighterFactory.class;
/* 34 */       if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (CodeHighlighterFactory)$this$service$iv.getService(serviceClass$iv); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\code\highlighting\CodeHighlighterFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */