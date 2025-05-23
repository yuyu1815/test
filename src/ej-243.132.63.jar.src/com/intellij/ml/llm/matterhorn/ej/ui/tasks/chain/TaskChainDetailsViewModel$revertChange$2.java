/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {363}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$revertChange$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class TaskChainDetailsViewModel$revertChange$2
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   TaskChainDetailsViewModel$revertChange$2(TaskChainDetailsViewModel $receiver, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #4
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 169, 0 -> 32, 1 -> 77
/*     */     //   32: aload_1
/*     */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   36: aload_0
/*     */     //   37: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*     */     //   40: invokevirtual getInitialContent : ()Ljava/lang/String;
/*     */     //   43: astore_2
/*     */     //   44: aload_2
/*     */     //   45: ifnonnull -> 86
/*     */     //   48: aload_0
/*     */     //   49: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   52: aload_0
/*     */     //   53: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*     */     //   56: aload_0
/*     */     //   57: checkcast kotlin/coroutines/Continuation
/*     */     //   60: aload_0
/*     */     //   61: iconst_1
/*     */     //   62: putfield label : I
/*     */     //   65: invokevirtual deleteFile$ej_ui : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   68: dup
/*     */     //   69: aload #4
/*     */     //   71: if_acmpne -> 82
/*     */     //   74: aload #4
/*     */     //   76: areturn
/*     */     //   77: aload_1
/*     */     //   78: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   81: aload_1
/*     */     //   82: pop
/*     */     //   83: goto -> 165
/*     */     //   86: aload_0
/*     */     //   87: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   90: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   93: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   96: dup
/*     */     //   97: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   100: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   103: aload_0
/*     */     //   104: getfield $change : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*     */     //   107: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   110: invokeinterface resolve : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
/*     */     //   115: iconst_0
/*     */     //   116: invokestatic findFile : (Ljava/nio/file/Path;Z)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   119: dup
/*     */     //   120: ifnonnull -> 128
/*     */     //   123: pop
/*     */     //   124: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   127: areturn
/*     */     //   128: astore_3
/*     */     //   129: aload_0
/*     */     //   130: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   133: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   136: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*     */     //   139: ldc 'command.revert.name'
/*     */     //   141: iconst_0
/*     */     //   142: anewarray java/lang/Object
/*     */     //   145: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   148: invokeinterface withName : (Ljava/lang/String;)Lcom/intellij/openapi/command/WriteCommandAction$Builder;
/*     */     //   153: aload_3
/*     */     //   154: aload_2
/*     */     //   155: <illegal opcode> run : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lcom/intellij/util/ThrowableRunnable;
/*     */     //   160: invokeinterface run : (Lcom/intellij/util/ThrowableRunnable;)V
/*     */     //   165: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   168: areturn
/*     */     //   169: new java/lang/IllegalStateException
/*     */     //   172: dup
/*     */     //   173: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   175: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   178: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #360	-> 3
/*     */     //   #361	-> 36
/*     */     //   #362	-> 44
/*     */     //   #363	-> 48
/*     */     //   #360	-> 74
/*     */     //   #363	-> 82
/*     */     //   #366	-> 86
/*     */     //   #365	-> 128
/*     */     //   #369	-> 129
/*     */     //   #370	-> 139
/*     */     //   #371	-> 153
/*     */     //   #375	-> 165
/*     */     //   #360	-> 169
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	4	2	initialContent	Ljava/lang/String;
/*     */     //   86	37	2	initialContent	Ljava/lang/String;
/*     */     //   128	37	2	initialContent	Ljava/lang/String;
/*     */     //   129	36	3	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	179	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$revertChange$2;
/*     */     //   36	133	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$revertChange$2> $completion) {
/*     */     return (Continuation<Unit>)new TaskChainDetailsViewModel$revertChange$2(TaskChainDetailsViewModel.this, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((TaskChainDetailsViewModel$revertChange$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final void invokeSuspend$lambda$0(VirtualFile $file, String $initialContent) {
/* 372 */     String str = $initialContent; Intrinsics.checkNotNullExpressionValue($file.getCharset(), "getCharset(...)"); Intrinsics.checkNotNullExpressionValue(str.getBytes($file.getCharset()), "getBytes(...)"); $file.setBinaryContent(str.getBytes($file.getCharset()));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainDetailsViewModel$revertChange$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */