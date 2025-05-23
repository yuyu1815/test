/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.JuniePluginLLMProxyProvider;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.components.ServicesKt;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @DebugMetadata(f = "MatterhornToolWindowPanel.kt", l = {107, 110}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.MatterhornToolWindowPanel$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   null(Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #4
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 171, 0 -> 36, 1 -> 72, 2 -> 146
/*     */     //   36: aload_1
/*     */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */     //   44: invokestatic access$getCurrentContext$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   47: dup
/*     */     //   48: ifnull -> 81
/*     */     //   51: aload_0
/*     */     //   52: checkcast kotlin/coroutines/Continuation
/*     */     //   55: aload_0
/*     */     //   56: iconst_1
/*     */     //   57: putfield label : I
/*     */     //   60: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   63: dup
/*     */     //   64: aload #4
/*     */     //   66: if_acmpne -> 77
/*     */     //   69: aload #4
/*     */     //   71: areturn
/*     */     //   72: aload_1
/*     */     //   73: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   76: aload_1
/*     */     //   77: pop
/*     */     //   78: goto -> 82
/*     */     //   81: pop
/*     */     //   82: aload_0
/*     */     //   83: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */     //   86: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   89: invokestatic obtainAIIgnoreChecker : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function1;
/*     */     //   92: astore_2
/*     */     //   93: aload_0
/*     */     //   94: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */     //   97: astore_3
/*     */     //   98: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   101: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   104: new com/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$2$1
/*     */     //   107: dup
/*     */     //   108: aload_0
/*     */     //   109: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */     //   112: aload_2
/*     */     //   113: aconst_null
/*     */     //   114: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   117: checkcast kotlin/jvm/functions/Function2
/*     */     //   120: aload_0
/*     */     //   121: checkcast kotlin/coroutines/Continuation
/*     */     //   124: aload_0
/*     */     //   125: aload_3
/*     */     //   126: putfield L$0 : Ljava/lang/Object;
/*     */     //   129: aload_0
/*     */     //   130: iconst_2
/*     */     //   131: putfield label : I
/*     */     //   134: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   137: dup
/*     */     //   138: aload #4
/*     */     //   140: if_acmpne -> 159
/*     */     //   143: aload #4
/*     */     //   145: areturn
/*     */     //   146: aload_0
/*     */     //   147: getfield L$0 : Ljava/lang/Object;
/*     */     //   150: checkcast com/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel
/*     */     //   153: astore_3
/*     */     //   154: aload_1
/*     */     //   155: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   158: aload_1
/*     */     //   159: aload_3
/*     */     //   160: swap
/*     */     //   161: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   164: invokestatic access$setCurrentContext$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;)V
/*     */     //   167: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   170: areturn
/*     */     //   171: new java/lang/IllegalStateException
/*     */     //   174: dup
/*     */     //   175: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   177: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   180: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #105	-> 3
/*     */     //   #107	-> 40
/*     */     //   #105	-> 69
/*     */     //   #107	-> 77
/*     */     //   #109	-> 82
/*     */     //   #110	-> 93
/*     */     //   #105	-> 143
/*     */     //   #110	-> 159
/*     */     //   #123	-> 167
/*     */     //   #105	-> 171
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	44	2	checker	Lkotlin/jvm/functions/Function1;
/*     */     //   0	181	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$2;
/*     */     //   40	131	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */     return (Continuation<Unit>)new Object(MatterhornToolWindowPanel.this, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornToolWindowPanel$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */