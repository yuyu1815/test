/*    */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLM;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\004\032\0020\005*\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\f\020\t\032\b\022\004\022\0020\0050\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters$Companion;", "", "<init>", "()V", "setupFromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<TaskReportCritiqueParameters> serializer() {
/* 37 */     return (KSerializer<TaskReportCritiqueParameters>)TaskReportCritiqueParameters.$serializer.INSTANCE;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object setupFromEnvironment(@NotNull TaskReportCritiqueParameters $this$setupFromEnvironment, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters$Companion$setupFromEnvironment$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters$Companion$setupFromEnvironment$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters$Companion$setupFromEnvironment$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters$Companion;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 182, 0 -> 88, 1 -> 158
/*    */     //   88: aload #5
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   96: dup
/*    */     //   97: invokespecial <init> : ()V
/*    */     //   100: astore #4
/*    */     //   102: aload #4
/*    */     //   104: aload_1
/*    */     //   105: putfield element : Ljava/lang/Object;
/*    */     //   108: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*    */     //   111: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   114: invokevirtual getTASK_REPORT_CRITIQUE_MODEL : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   117: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   120: invokevirtual getTASK_REPORT_CRITIQUE_MODEL_PROVIDER : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   123: aload_2
/*    */     //   124: aload #4
/*    */     //   126: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*    */     //   131: aload #6
/*    */     //   133: aload #6
/*    */     //   135: aload #4
/*    */     //   137: putfield L$0 : Ljava/lang/Object;
/*    */     //   140: aload #6
/*    */     //   142: iconst_1
/*    */     //   143: putfield label : I
/*    */     //   146: invokevirtual setupModel : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   149: dup
/*    */     //   150: aload #7
/*    */     //   152: if_acmpne -> 175
/*    */     //   155: aload #7
/*    */     //   157: areturn
/*    */     //   158: aload #6
/*    */     //   160: getfield L$0 : Ljava/lang/Object;
/*    */     //   163: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   166: astore #4
/*    */     //   168: aload #5
/*    */     //   170: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   173: aload #5
/*    */     //   175: pop
/*    */     //   176: aload #4
/*    */     //   178: getfield element : Ljava/lang/Object;
/*    */     //   181: areturn
/*    */     //   182: new java/lang/IllegalStateException
/*    */     //   185: dup
/*    */     //   186: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   188: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   191: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 60
/*    */     //   #39	-> 93
/*    */     //   #41	-> 108
/*    */     //   #42	-> 111
/*    */     //   #43	-> 117
/*    */     //   #44	-> 123
/*    */     //   #41	-> 124
/*    */     //   #38	-> 155
/*    */     //   #49	-> 175
/*    */     //   #38	-> 182
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	15	1	$this$setupFromEnvironment	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueParameters;
/*    */     //   93	31	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   102	56	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   168	14	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   0	192	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	132	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	125	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Unit setupFromEnvironment$lambda$0(Ref.ObjectRef $result, LLM it) {
/* 46 */     Intrinsics.checkNotNullParameter(it, "it"); $result.element = ((TaskReportCritiqueParameters)$result.element).copy(ModelParameters.copy$default(((TaskReportCritiqueParameters)$result.element).getModelParameters(), it, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, 32766, null));
/* 47 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AgentReportCritique.kt", l = {41}, i = {0}, s = {"L$0"}, n = {"result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.TaskReportCritiqueParameters$Companion")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class TaskReportCritiqueParameters$Companion$setupFromEnvironment$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     TaskReportCritiqueParameters$Companion$setupFromEnvironment$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return TaskReportCritiqueParameters.Companion.this.setupFromEnvironment(null, null, (Continuation<? super TaskReportCritiqueParameters>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\TaskReportCritiqueParameters$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */