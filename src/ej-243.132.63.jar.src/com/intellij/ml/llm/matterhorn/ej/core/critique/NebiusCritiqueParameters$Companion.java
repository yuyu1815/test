/*    */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLM;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\004\032\0020\005*\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\f\020\t\032\b\022\004\022\0020\0050\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters$Companion;", "", "<init>", "()V", "setupFromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final KSerializer<NebiusCritiqueParameters> serializer() {
/* 21 */     return (KSerializer<NebiusCritiqueParameters>)NebiusCritiqueParameters.$serializer.INSTANCE;
/*    */   }
/*    */   private Companion() {}
/*    */   @Nullable
/*    */   public final Object setupFromEnvironment(@NotNull NebiusCritiqueParameters $this$setupFromEnvironment, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters$Companion$setupFromEnvironment$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters$Companion$setupFromEnvironment$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters$Companion$setupFromEnvironment$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters$Companion;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 269, 0 -> 92, 1 -> 168, 2 -> 245
/*    */     //   92: aload #5
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: new kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   100: dup
/*    */     //   101: invokespecial <init> : ()V
/*    */     //   104: astore #4
/*    */     //   106: aload #4
/*    */     //   108: aload_1
/*    */     //   109: putfield element : Ljava/lang/Object;
/*    */     //   112: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*    */     //   115: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   118: invokevirtual getNEBIUS_CRITIQUE_MODEL : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   121: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   124: invokevirtual getNEBIUS_CRITIQUE_MODEL_PROVIDER : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   127: aload_2
/*    */     //   128: aload #4
/*    */     //   130: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*    */     //   135: aload #6
/*    */     //   137: aload #6
/*    */     //   139: aload_2
/*    */     //   140: putfield L$0 : Ljava/lang/Object;
/*    */     //   143: aload #6
/*    */     //   145: aload #4
/*    */     //   147: putfield L$1 : Ljava/lang/Object;
/*    */     //   150: aload #6
/*    */     //   152: iconst_1
/*    */     //   153: putfield label : I
/*    */     //   156: invokevirtual setupModel : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   159: dup
/*    */     //   160: aload #7
/*    */     //   162: if_acmpne -> 194
/*    */     //   165: aload #7
/*    */     //   167: areturn
/*    */     //   168: aload #6
/*    */     //   170: getfield L$1 : Ljava/lang/Object;
/*    */     //   173: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   176: astore #4
/*    */     //   178: aload #6
/*    */     //   180: getfield L$0 : Ljava/lang/Object;
/*    */     //   183: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   186: astore_2
/*    */     //   187: aload #5
/*    */     //   189: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   192: aload #5
/*    */     //   194: pop
/*    */     //   195: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*    */     //   198: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*    */     //   201: invokevirtual getNEBIUS_CRITIQUE_TEMPERATURE : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   204: aload_2
/*    */     //   205: aload #4
/*    */     //   207: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*    */     //   212: aload #6
/*    */     //   214: aload #6
/*    */     //   216: aload #4
/*    */     //   218: putfield L$0 : Ljava/lang/Object;
/*    */     //   221: aload #6
/*    */     //   223: aconst_null
/*    */     //   224: putfield L$1 : Ljava/lang/Object;
/*    */     //   227: aload #6
/*    */     //   229: iconst_2
/*    */     //   230: putfield label : I
/*    */     //   233: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   236: dup
/*    */     //   237: aload #7
/*    */     //   239: if_acmpne -> 262
/*    */     //   242: aload #7
/*    */     //   244: areturn
/*    */     //   245: aload #6
/*    */     //   247: getfield L$0 : Ljava/lang/Object;
/*    */     //   250: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*    */     //   253: astore #4
/*    */     //   255: aload #5
/*    */     //   257: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   260: aload #5
/*    */     //   262: pop
/*    */     //   263: aload #4
/*    */     //   265: getfield element : Ljava/lang/Object;
/*    */     //   268: areturn
/*    */     //   269: new java/lang/IllegalStateException
/*    */     //   272: dup
/*    */     //   273: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   275: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   278: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 60
/*    */     //   #23	-> 97
/*    */     //   #24	-> 112
/*    */     //   #25	-> 115
/*    */     //   #26	-> 121
/*    */     //   #27	-> 127
/*    */     //   #24	-> 128
/*    */     //   #22	-> 165
/*    */     //   #31	-> 194
/*    */     //   #32	-> 198
/*    */     //   #33	-> 204
/*    */     //   #31	-> 205
/*    */     //   #22	-> 242
/*    */     //   #37	-> 262
/*    */     //   #22	-> 269
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	15	1	$this$setupFromEnvironment	Lcom/intellij/ml/llm/matterhorn/ej/core/critique/NebiusCritiqueParameters;
/*    */     //   97	71	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   187	18	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   106	62	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   178	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   255	14	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*    */     //   0	279	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	219	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	212	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   private static final Unit setupFromEnvironment$lambda$0(Ref.ObjectRef $result, LLM it) {
/* 29 */     Intrinsics.checkNotNullParameter(it, "it"); $result.element = ((NebiusCritiqueParameters)$result.element).copy(ModelParameters.copy$default(((NebiusCritiqueParameters)$result.element).getModelParameters(), it, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, 32766, null));
/* 30 */     return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */   
/*    */   private static final Unit setupFromEnvironment$lambda$1(Ref.ObjectRef $result, String it) {
/* 35 */     Intrinsics.checkNotNullParameter(it, "it"); $result.element = ((NebiusCritiqueParameters)$result.element).copy(ModelParameters.copy$default(((NebiusCritiqueParameters)$result.element).getModelParameters(), null, false, StringsKt.toDoubleOrNull(it), null, null, null, null, null, null, null, null, null, null, 0, null, 32763, null));
/* 36 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NebiusCritique.kt", l = {24, 31}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"propertyProvider", "result", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.NebiusCritiqueParameters$Companion")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class NebiusCritiqueParameters$Companion$setupFromEnvironment$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     NebiusCritiqueParameters$Companion$setupFromEnvironment$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NebiusCritiqueParameters.Companion.this.setupFromEnvironment(null, null, (Continuation<? super NebiusCritiqueParameters>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\NebiusCritiqueParameters$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */