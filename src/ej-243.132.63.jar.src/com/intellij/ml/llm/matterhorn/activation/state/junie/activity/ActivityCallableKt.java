/*   */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*   */ import kotlin.Metadata;
/*   */ import kotlin.jvm.functions.Function1;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\032e\020\000\032\024\022\004\022\002H\002\022\004\022\002H\003\022\004\022\002H\0040\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\004*\024\022\004\022\002H\002\022\004\022\002H\003\022\004\022\002H\0040\0052\034\020\006\032\030\b\001\022\n\022\b\022\004\022\002H\0020\b\022\006\022\004\030\0010\t0\007H\000¢\006\002\020\n¨\006\013"}, d2 = {"bind", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;", "Ret", "Err", "Val", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;", "state.junie.impl"})
/*   */ public final class ActivityCallableKt {
/*   */   private static final ActivityHandle bind$lambda$0(ActivityLauncher $this_bind, Function1 $block) {
/* 9 */     return $this_bind.launchActivity($block);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static final <Ret, Err, Val> ActivityCallable<Ret, Err, Val> bind(@NotNull ActivityLauncher $this$bind, @NotNull Function1 block) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: ldc '<this>'
/*   */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   6: aload_1
/*   */     //   7: ldc 'block'
/*   */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*   */     //   12: aload_0
/*   */     //   13: aload_1
/*   */     //   14: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
/*   */     //   19: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #8	-> 12
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   0	20	0	$this$bind	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;
/*   */     //   0	20	1	block	Lkotlin/jvm/functions/Function1;
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityCallableKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */