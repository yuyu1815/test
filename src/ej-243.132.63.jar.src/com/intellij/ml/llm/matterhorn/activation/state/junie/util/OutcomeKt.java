/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.util;@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000B\n\000\n\002\030\002\n\002\020\001\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\032#\020\000\032\016\022\004\022\0020\002\022\004\022\002H\0030\001\"\004\b\000\020\003*\002H\003H\000¢\006\002\020\004\032\f\020\000\032\0020\002*\0020\005H\001\032'\020\006\032\016\022\004\022\002H\007\022\004\022\0020\0020\001\"\b\b\000\020\007*\0020\b*\002H\007H\000¢\006\002\020\t\032'\020\n\032\016\022\004\022\002H\007\022\004\022\0020\0020\001\"\b\b\000\020\007*\0020\013*\002H\007H\000¢\006\002\020\f\032'\020\r\032\016\022\004\022\002H\007\022\004\022\0020\0020\001\"\b\b\000\020\007*\0020\016*\002H\007H\000¢\006\002\020\017\032\\\020\020\032\002H\021\"\004\b\000\020\007\"\b\b\001\020\003*\002H\021\"\004\b\002\020\021*\016\022\004\022\002H\007\022\004\022\002H\0030\0012!\020\022\032\035\022\023\022\021H\007¢\006\f\b\024\022\b\b\025\022\004\b\b(\026\022\004\022\002H\0210\023H\bø\001\000¢\006\004\b\027\020\030\032Z\020\031\032\002H\021\"\004\b\000\020\007\"\b\b\001\020\003*\002H\021\"\004\b\002\020\021*\016\022\004\022\002H\007\022\004\022\002H\0030\0322!\020\022\032\035\022\023\022\021H\007¢\006\f\b\024\022\b\b\025\022\004\b\b(\026\022\004\022\002H\0210\023H\bø\001\000¢\006\002\020\033\002\007\n\005\b20\001¨\006\034"}, d2 = {"done", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;", "activationProgressing", "I", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;)Ljava/lang/Object;", "activationStalled", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled;)Ljava/lang/Object;", "activationRoadblocked", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;)Ljava/lang/Object;", "getOrElse", "R", "onIncomplete", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "incomplete", "getOrElse-G1CwGJM", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "completeOrElse", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\noutcome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/util/OutcomeKt\n+ 2 Outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/model/Outcome\n*L\n1#1,31:1\n21#1:35\n22#1:39\n16#2,3:32\n16#2,3:36\n*S KotlinDebug\n*F\n+ 1 outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/util/OutcomeKt\n*L\n30#1:35\n30#1:39\n21#1:32,3\n30#1:36,3\n*E\n"})
/*    */ public final class OutcomeKt {
/*    */   @NotNull
/*    */   public static final <T> Object done(Object $this$done) {
/*  6 */     return Outcome.Companion.ofComplete-l12Rbqo($this$done);
/*    */   }
/*    */   @Deprecated(message = "AiaActivationPending must not be treated as done()", level = DeprecationLevel.ERROR)
/*    */   @NotNull
/* 10 */   public static final Void done(@NotNull AiaActivationPending $this$done) { Intrinsics.checkNotNullParameter($this$done, "<this>"); throw new IllegalStateException(($this$done.getClass().getSimpleName() + " must not be treated as done()").toString()); }
/*    */   @NotNull
/* 12 */   public static final <I extends AiaActivationProgressing> Object activationProgressing(@NotNull AiaActivationProgressing $this$activationProgressing) { Intrinsics.checkNotNullParameter($this$activationProgressing, "<this>"); return Outcome.Companion.ofIncomplete-l12Rbqo($this$activationProgressing); } @NotNull
/* 13 */   public static final <I extends AiaActivationStalled> Object activationStalled(@NotNull AiaActivationStalled $this$activationStalled) { Intrinsics.checkNotNullParameter($this$activationStalled, "<this>"); return Outcome.Companion.ofIncomplete-l12Rbqo($this$activationStalled); } @NotNull
/* 14 */   public static final <I extends AiaActivationRoadblocked> Object activationRoadblocked(@NotNull AiaActivationRoadblocked $this$activationRoadblocked) { Intrinsics.checkNotNullParameter($this$activationRoadblocked, "<this>"); return Outcome.Companion.ofIncomplete-l12Rbqo($this$activationRoadblocked); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final <I, T extends R, R> R getOrElse-G1CwGJM(@NotNull Object $this$getOrElse_u2dG1CwGJM, @NotNull Function1 onIncomplete) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'onIncomplete'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: iconst_0
/*    */     //   7: istore_2
/*    */     //   8: iconst_0
/*    */     //   9: istore_3
/*    */     //   10: aload_0
/*    */     //   11: invokestatic isIncomplete-impl : (Ljava/lang/Object;)Z
/*    */     //   14: istore #4
/*    */     //   16: iload #4
/*    */     //   18: iconst_1
/*    */     //   19: if_icmpne -> 35
/*    */     //   22: aload_1
/*    */     //   23: aload_0
/*    */     //   24: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   27: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   32: goto -> 62
/*    */     //   35: iload #4
/*    */     //   37: ifne -> 54
/*    */     //   40: aload_0
/*    */     //   41: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   44: astore #5
/*    */     //   46: iconst_0
/*    */     //   47: istore #6
/*    */     //   49: aload #5
/*    */     //   51: goto -> 62
/*    */     //   54: new kotlin/NoWhenBranchMatchedException
/*    */     //   57: dup
/*    */     //   58: invokespecial <init> : ()V
/*    */     //   61: athrow
/*    */     //   62: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 8
/*    */     //   #32	-> 10
/*    */     //   #33	-> 16
/*    */     //   #34	-> 35
/*    */     //   #22	-> 49
/*    */     //   #34	-> 51
/*    */     //   #32	-> 54
/*    */     //   #21	-> 62
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   49	2	6	$i$a$-fold-impl-OutcomeKt$getOrElse$1	I
/*    */     //   46	5	5	it	Ljava/lang/Object;
/*    */     //   10	52	3	$i$f$fold-impl	I
/*    */     //   8	55	2	$i$f$getOrElse-G1CwGJM	I
/*    */     //   0	63	0	$this$getOrElse_u2dG1CwGJM	Ljava/lang/Object;
/*    */     //   0	63	1	onIncomplete	Lkotlin/jvm/functions/Function1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final <I, T extends R, R> R completeOrElse(@NotNull Journey $this$completeOrElse, @NotNull Function1 onIncomplete) {
/* 30 */     Intrinsics.checkNotNullParameter($this$completeOrElse, "<this>"); Intrinsics.checkNotNullParameter(onIncomplete, "onIncomplete"); int $i$f$completeOrElse = 0; Object $this$getOrElse_u2dG1CwGJM$iv = $this$completeOrElse.getOutcome-07x5Wys(); int $i$f$getOrElse-G1CwGJM = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     int $i$f$fold-impl = 0;
/* 36 */     boolean bool = Outcome.isIncomplete-impl($this$getOrElse_u2dG1CwGJM$iv);
/*    */     
/* 38 */     if (!bool) { Object it$iv = Outcome.getOrNull-impl($this$getOrElse_u2dG1CwGJM$iv); int $i$a$-fold-impl-OutcomeKt$getOrElse$1$iv = 0; }
/*    */     else
/*    */     { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (bool == true) ? (R)onIncomplete.invoke(Outcome.incompleteOrNull-impl($this$getOrElse_u2dG1CwGJM$iv)) : (R)"JD-Core does not support Kotlin";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\juni\\util\OutcomeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */