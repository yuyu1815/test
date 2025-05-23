/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*    */ 
/*    */ import com.intellij.openapi.actionSystem.AnAction;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\026\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024J\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\007HÆ\003J'\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\036HÖ\001J\t\020\037\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/PsiActionLocation;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "name", "", "action", "Lcom/intellij/openapi/actionSystem/AnAction;", "psiElement", "Lcom/intellij/psi/PsiElement;", "<init>", "(Ljava/lang/String;Lcom/intellij/openapi/actionSystem/AnAction;Lcom/intellij/psi/PsiElement;)V", "getName", "()Ljava/lang/String;", "getAction", "()Lcom/intellij/openapi/actionSystem/AnAction;", "getPsiElement", "()Lcom/intellij/psi/PsiElement;", "runAction", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResult;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-idea"})
/*    */ public final class PsiActionLocation implements ActionLocation {
/*    */   @NotNull
/*    */   private final String name;
/*    */   
/* 16 */   public PsiActionLocation(@NotNull String name, @NotNull AnAction action, @NotNull PsiElement psiElement) { this.name = name;
/* 17 */     this.action = action;
/* 18 */     this.psiElement = psiElement; } @NotNull private final AnAction action; @NotNull private final PsiElement psiElement; @NotNull public final PsiElement getPsiElement() { return this.psiElement; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnAction getAction() {
/*    */     return this.action;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object runAction(@NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/PsiActionLocation$runAction$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/PsiActionLocation$runAction$1
/*    */     //   11: astore #8
/*    */     //   13: aload #8
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #8
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/PsiActionLocation$runAction$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/PsiActionLocation;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #8
/*    */     //   50: aload #8
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #7
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #9
/*    */     //   62: aload #8
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 193, 0 -> 88, 1 -> 158
/*    */     //   88: aload #7
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new com/intellij/ml/llm/matterhorn/ej/idea/run/RunService
/*    */     //   96: dup
/*    */     //   97: invokespecial <init> : ()V
/*    */     //   100: astore_3
/*    */     //   101: aload_3
/*    */     //   102: aload_1
/*    */     //   103: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   108: aload_0
/*    */     //   109: getfield psiElement : Lcom/intellij/psi/PsiElement;
/*    */     //   112: aload_0
/*    */     //   113: getfield action : Lcom/intellij/openapi/actionSystem/AnAction;
/*    */     //   116: aconst_null
/*    */     //   117: invokevirtual run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/actionSystem/AnAction;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)Lkotlinx/coroutines/flow/Flow;
/*    */     //   120: astore #4
/*    */     //   122: nop
/*    */     //   123: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunTestAgentAction$Companion;
/*    */     //   126: aload_0
/*    */     //   127: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   130: aload #4
/*    */     //   132: aload #8
/*    */     //   134: aload #8
/*    */     //   136: aload_3
/*    */     //   137: putfield L$0 : Ljava/lang/Object;
/*    */     //   140: aload #8
/*    */     //   142: iconst_1
/*    */     //   143: putfield label : I
/*    */     //   146: invokevirtual handleEvents : (Ljava/lang/String;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   149: dup
/*    */     //   150: aload #9
/*    */     //   152: if_acmpne -> 175
/*    */     //   155: aload #9
/*    */     //   157: areturn
/*    */     //   158: aload #8
/*    */     //   160: getfield L$0 : Ljava/lang/Object;
/*    */     //   163: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/RunService
/*    */     //   166: astore_3
/*    */     //   167: nop
/*    */     //   168: aload #7
/*    */     //   170: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   173: aload #7
/*    */     //   175: astore #5
/*    */     //   177: aload_3
/*    */     //   178: invokevirtual close : ()V
/*    */     //   181: aload #5
/*    */     //   183: areturn
/*    */     //   184: astore #6
/*    */     //   186: aload_3
/*    */     //   187: invokevirtual close : ()V
/*    */     //   190: aload #6
/*    */     //   192: athrow
/*    */     //   193: new java/lang/IllegalStateException
/*    */     //   196: dup
/*    */     //   197: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   199: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   202: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 60
/*    */     //   #21	-> 93
/*    */     //   #22	-> 101
/*    */     //   #23	-> 122
/*    */     //   #24	-> 123
/*    */     //   #20	-> 155
/*    */     //   #26	-> 177
/*    */     //   #24	-> 183
/*    */     //   #26	-> 184
/*    */     //   #20	-> 193
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	56	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/PsiActionLocation;
/*    */     //   93	29	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   101	57	3	service	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   167	14	3	service	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   184	9	3	service	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   122	27	4	flow	Lkotlinx/coroutines/flow/Flow;
/*    */     //   0	203	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	143	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	136	7	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   122	149	184	finally
/*    */     //   167	177	184	finally
/*    */     //   184	186	184	finally
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnAction component2() {
/*    */     return this.action;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PsiElement component3() {
/*    */     return this.psiElement;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PsiActionLocation copy(@NotNull String name, @NotNull AnAction action, @NotNull PsiElement psiElement) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(action, "action");
/*    */     Intrinsics.checkNotNullParameter(psiElement, "psiElement");
/*    */     return new PsiActionLocation(name, action, psiElement);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "PsiActionLocation(name=" + this.name + ", action=" + this.action + ", psiElement=" + this.psiElement + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.action.hashCode();
/*    */     return result * 31 + this.psiElement.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof PsiActionLocation))
/*    */       return false; 
/*    */     PsiActionLocation psiActionLocation = (PsiActionLocation)other;
/*    */     return !Intrinsics.areEqual(this.name, psiActionLocation.name) ? false : (!Intrinsics.areEqual(this.action, psiActionLocation.action) ? false : (!!Intrinsics.areEqual(this.psiElement, psiActionLocation.psiElement)));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ActionLocation.kt", l = {24}, i = {0}, s = {"L$0"}, n = {"service"}, m = "runAction", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.PsiActionLocation")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class PsiActionLocation$runAction$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     PsiActionLocation$runAction$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PsiActionLocation.this.runAction(null, (Continuation<? super RunResult>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\PsiActionLocation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */